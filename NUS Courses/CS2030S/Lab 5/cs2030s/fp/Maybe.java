/**
 * CS2030S Lab 5
 * AY23/24 Semester 2
 *
 * @author Chiang Peng-Yi (16K)
 */
package cs2030s.fp;

public abstract class Maybe<T> {

  private static final None NONE = new None();

  public abstract <U extends T> T orElse(U value);

  public abstract <U extends T> T orElseGet(Producer<U> p);

  public Maybe<T> ifPresent(Consumer<? super T> c) {
    return Maybe.none();
  }

  protected abstract T get();

  public static <T> Maybe<T> of(T item) {
    if (item != null) {
      return Maybe.some(item);
    } else {
      return Maybe.none();
    }
  }

  public static <T> Maybe<T> none() {
    @SuppressWarnings("unchecked")
    Maybe<T> none = (Maybe<T>) NONE;
    return none;
  }

  public static <T> Maybe<T> some(T t) {
    return new Some<T>(t);
  }

  public Maybe<T> filter(BooleanCondition<? super T> bc) {
    if (this.equals(Maybe.none())) {
      return Maybe.none();
    } else if ((this.get() != null) && !(bc.test(this.get()))) {
      return Maybe.of(null);
    } else {
      return this;
    }
  }

  public <U> Maybe<U> map(Transformer<? super T, ? extends U> t) {
    if (this.equals(Maybe.none())) {
      return Maybe.none();
    } else {
      return Maybe.some(t.transform(this.get()));
    }
  }

  public <U> Maybe<U> flatMap(Transformer<? super T, ? extends Maybe<? extends U>> t) {
    if (this.equals(Maybe.none())) {
      return Maybe.none();
    } else {
      @SuppressWarnings("unchecked")
      Maybe<U> out = (Maybe<U>) t.transform(this.get());
      return out;
    }
  }

  static final class Some<T> extends Maybe<T> {

    private T value;

    public Some(T item) {
      this.value = item;
    }

    @Override
    protected T get() {
      return this.value;
    }

    @Override
    public <U extends T> T orElse(U value) {
      return this.value;
    }

    @Override
    public <U extends T> T orElseGet(Producer<U> p) {
      return this.value;
    }

    @Override
    public Maybe<T> ifPresent(Consumer<? super T> c) {
      c.consume(this.value);
      return this;
    }

    @Override
    public boolean equals(Object obj) {
      if (obj instanceof Some) {
        @SuppressWarnings("unchecked")
        Some<?> s = (Some<?>) obj;
        if ((s.get() == null) && (this.value == null)) {
          return true;
        } else if ((s.get() != null) && (this.value == null)) {
          return false;
        } else {
          return this.value.equals(s.get());
        }

      } else {
        return false;
      }
    }

    @Override
    public String toString() {
      return "[" + this.value + "]";
    }
  }

  static final class None extends Maybe<Object> {

    @Override
    protected Object get() {
      throw new java.util.NoSuchElementException();
    }

    @Override
    public Object orElse(Object value) {
      return value;
    }

    @Override
    public <U> U orElseGet(Producer<U> p) {
      return p.produce();
    }

    @Override
    public boolean equals(Object obj) {
      return (obj instanceof None);
    }

    @Override
    public String toString() {
      return "[]";
    }
  }
}
