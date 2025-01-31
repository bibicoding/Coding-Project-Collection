import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.net.URI;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.function.Supplier;
import java.util.stream.Stream;
import javax.tools.DiagnosticCollector;
import javax.tools.SimpleJavaFileObject;
import javax.tools.ToolProvider;

/** A helper class to test CS2030S labs. */
class CS2030STest {

  private static final String ANSI_RESET = "\u001B[0m";
  private static final String ANSI_RED = "\u001B[31m";
  private static final String ANSI_GREEN = "\u001B[32m";

  public static Class<?> kelas(String name) {
    try {
      return Class.forName(name);
    } catch (ClassNotFoundException e) {
      return null;
    }
  }

  public static Object newInstance(String className, double i) {
    try {
      return Class.forName(className).getConstructor(double.class).newInstance(i);
    } catch (ClassNotFoundException e) {
      System.err.println("No such class: " + className);
      return null;
    } catch (ReflectiveOperationException e) {
      System.err.println(e);
      return null;
    }
  }

  public static Object newInstance(String className) {
    try {
      return Class.forName(className).getConstructor().newInstance();
    } catch (ClassNotFoundException e) {
      System.err.println("No such class: " + className);
      return null;
    } catch (ReflectiveOperationException e) {
      System.err.println(e);
      return null;
    }
  }

  public static Object newInstance(String name, int i) {
    try {
      return Class.forName(name).getConstructor(int.class).newInstance(i);
    } catch (ReflectiveOperationException e) {
      return null;
    }
  }

  public static Method method(String className, String methodName, Class<?>... parameterTypes) {
    try {
      return Class.forName(className).getDeclaredMethod(methodName, parameterTypes);
    } catch (ClassNotFoundException e) {
      return null;
    } catch (NoSuchMethodException e) {
      return null;
    }
  }

  public static Stream<Method> methods(String className) {
    try {
      return Arrays.stream(Class.forName(className).getDeclaredMethods());
    } catch (ClassNotFoundException e) {
      return Stream.of();
    }
  }

  public static Constructor<?> constructor(String className, Class<?>... parameterTypes) {
    try {
      return Class.forName(className).getDeclaredConstructor(parameterTypes);
    } catch (ClassNotFoundException e) {
      return null;
    } catch (NoSuchMethodException e) {
      return null;
    }
  }

  public static Stream<Constructor<?>> constructors(String className) {
    try {
      return Arrays.stream(Class.forName(className).getDeclaredConstructors());
    } catch (ClassNotFoundException e) {
      return Stream.of();
    }
  }

  public static Stream<Field> fields(String className) {
    try {
      return Arrays.stream(Class.forName(className).getDeclaredFields());
    } catch (ClassNotFoundException e) {
      return Stream.of();
    }
  }

  public static Field field(String className, String fieldName) {
    try {
      return Class.forName(className).getDeclaredField(fieldName);
    } catch (ClassNotFoundException e) {
      System.err.println("No such class: " + className);
      return null;
    } catch (NoSuchFieldException e) {
      System.err.println("No such field " + className + "." + fieldName);
      return null;
    }
  }

  private static void print_ok() {
    System.out.println(".. " + ANSI_GREEN + "ok" + ANSI_RESET);
  }

  private static void print_failure() {
    System.out.println(".. " + ANSI_RED + "failed" + ANSI_RESET);
  }

  /**
   * Test if two objects are equals.
   *
   * @param test A description of the test.
   * @param output The output from an expression.
   * @param expect The expected output from that expression.
   * @return this object.
   */
  public CS2030STest expect(String test, Object output, Object expect) {
    System.out.print(test);
    if ((expect == null && output != null) || (expect != null && output == null)) {
      print_failure();
      System.out.println("  expected: " + expect);
      System.out.println("  got this: " + output);
      return this;
    }

    if ((expect == null && output == null) || output.equals(expect)) {
      print_ok();
    } else {
      print_failure();
      System.out.println("  expected: " + expect);
      System.out.println("  got this: " + output);
    }
    return this;
  }

  public CS2030STest expect(String test, String output, String expect) {
    System.out.print(test);
    if ((expect == null && output == null)
        || output.replaceAll("\\s+", "").compareToIgnoreCase(expect.replaceAll("\\s+", "")) == 0) {
      print_ok();
    } else {
      print_failure();
      System.out.println("  expected: " + expect);
      System.out.println("  got this: " + output);
    }
    return this;
  }

  /**
   * @param <T> The type of object the given task will produce.
   * @param test A description of the test.
   * @param task The task to run.
   * @param expect The expected output from that expression.
   * @return this object.
   */
  public <T> CS2030STest expect(String test, Supplier<String> task, String expect) {
    try {
      String output = CompletableFuture.supplyAsync(task).get(5, TimeUnit.SECONDS);
      System.out.print(test);
      if ((expect == null && output != null) || (expect != null && output == null)) {
        print_failure();
        System.out.println("  expected: " + expect);
        System.out.println("  got this: " + output);
        return this;
      }

      if ((expect == null && output == null)
          || output.replaceAll("\\s+", "").compareToIgnoreCase(expect.replaceAll("\\s+", ""))
              == 0) {
        print_ok();
      } else {
        print_failure();
        System.out.println("  expected: " + expect);
        System.out.println("  got this: " + output);
      }
    } catch (Exception e) {
      System.out.print(test);
      print_failure();
      System.out.println("  with exception: " + e.getMessage());
      e.printStackTrace();
    }
    return this;
  }

  /**
   * @param <T> The type of object the given task will produce.
   * @param test A description of the test.
   * @param task The task to run.
   * @param expect The expected output from that expression.
   * @return this object.
   */
  public <T> CS2030STest expect(String test, Supplier<T> task, Object expect) {
    try {
      T output = CompletableFuture.supplyAsync(task).get(5, TimeUnit.SECONDS);
      System.out.print(test);
      if ((expect == null && output != null) || (expect != null && output == null)) {
        print_failure();
        System.out.println("  expected: " + expect);
        System.out.println("  got this: " + output);
        return this;
      }

      if ((expect == null && output == null) || output.equals(expect)) {
        print_ok();
      } else {
        print_failure();
        System.out.println("  expected: " + expect);
        System.out.println("  got this: " + output);
      }
    } catch (Exception e) {
      System.out.print(test);
      print_failure();
      System.out.println("  with exception: " + e.getMessage());
      e.printStackTrace();
    }
    return this;
  }

  public CS2030STest expectPrint(String test, Runnable task, String expect) {
    try {
      ByteArrayOutputStream baos = new ByteArrayOutputStream();
      final PrintStream old = System.out;
      System.setOut(new PrintStream(baos));
      CompletableFuture.runAsync(task).get(5, TimeUnit.SECONDS);
      System.out.flush();
      System.setOut(old);
      String output = baos.toString();

      System.out.print(test);
      if ((expect == null && output != null) || (expect != null && output == null)) {
        print_failure();
        System.out.println("  expected: " + expect);
        System.out.println("  got this: " + output);
        return this;
      }

      if ((expect == null && output == null) || output.equals(expect)) {
        print_ok();
      } else {
        print_failure();
        System.out.println("  expected: " + expect);
        System.out.println("  got this: " + output);
      }
    } catch (Exception e) {
      System.out.print(test);
      print_failure();
      System.out.println("  with exception: " + e.getMessage());
      e.printStackTrace();
    }
    return this;
  }

  /**
   * Test if a given producer returns a value. Wrapper around expect(..) to simplify caller.
   *
   * @param <T> The type of object the given task will produce.
   * @param test A description of the test.
   * @param task The task to run.
   * @param expect The expected output from that expression.
   * @return this object.
   */
  public <T> CS2030STest expectReturn(String test, Supplier<T> task, Object expect) {
    return this.expect(test + " returns " + expect, task, expect);
  }

  /**
   * Test if an expression throws an exception.
   *
   * @param test A description of the test.
   * @param task A lambda expression of the expression.
   * @param expectedE A exception instance of the same type as the expected one.
   * @return this object.
   */
  public CS2030STest expectException(String test, Runnable task, Exception expectedE) {
    boolean gotException = false;
    try {
      CompletableFuture.runAsync(task).get(5, TimeUnit.SECONDS);
    } catch (Exception e) {
      if (e.getClass().equals(expectedE.getClass())) {
        gotException = true;
      }
    }
    System.out.print(test);
    if (gotException) {
      print_ok();
    } else {
      print_failure();
    }
    return this;
  }

  @FunctionalInterface
  interface TryRunnable<E extends Throwable> {
    void run() throws E;
  }

  public CS2030STest expectCheckedException(String test, Runnable task, Object expectedE) {
    boolean gotException = false;
    try {
      CompletableFuture.runAsync(task).get(5, TimeUnit.SECONDS);
    } catch (ExecutionException e) {
      if (e.getCause().getClass().equals(expectedE.getClass())) {
        gotException = true;
      }
    } catch (Throwable e) {
      // do nothing
    }
    System.out.print(test);
    if (gotException) {
      print_ok();
    } else {
      print_failure();
    }
    return this;
  }

  public CS2030STest expectCheckedExceptionMessage(
      String test, Runnable task, Exception expectedE) {
    boolean gotException = false;
    try {
      CompletableFuture.runAsync(task).get(5, TimeUnit.SECONDS);
    } catch (ExecutionException e) {
      if (e.getCause().getClass().equals(expectedE.getClass())
          && e.getCause().getMessage().equals(expectedE.getMessage())) {
        gotException = true;
      }
    } catch (Throwable e) {
      // do nothing
    }
    System.out.print(test);
    if (gotException) {
      print_ok();
    } else {
      print_failure();
      System.out.println("  did not catch expected exception " + expectedE.getClass());
      System.out.println("  did not match message " + expectedE.getMessage());
    }
    return this;
  }

  /**
   * Test if an expression compiles with/without error.
   *
   * @param test A description of the test.
   * @param statement The java statement to compile
   * @param success Whether the statement is expected to compile or not (true if yes; false
   *     otherwise)
   * @return this object.
   */
  public CS2030STest expectCompile(String test, String statement, boolean success) {
    System.out.print(test);

    class JavaSourceFromString extends SimpleJavaFileObject {
      private final String code;

      public JavaSourceFromString(String code) {
        super(URI.create("string:///TempClass.java"), Kind.SOURCE);
        this.code = "class TempClass {void foo(){" + code + ";}}";
      }

      @Override
      public CharSequence getCharContent(boolean ignoreEncodingErrors) {
        return code;
      }
    }

    boolean noError =
        ToolProvider.getSystemJavaCompiler()
            .getTask(
                null,
                null,
                new DiagnosticCollector<>(),
                null,
                null,
                List.of(new JavaSourceFromString(statement)))
            .call();

    if (noError != success) {
      print_failure();
      if (!success) {
        System.out.println("  expected compilation error but it compiles fine.");
      } else {
        System.out.println("  expected the statement to compile without errors but it does not.");
      }
    } else {
      print_ok();
    }
    return this;
  }
}
