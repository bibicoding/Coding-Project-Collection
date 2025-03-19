import cs2030s.fp.Maybe;
import cs2030s.fp.Transformer;
import java.util.Map;

class Ex5 {
  public static String getGradeOld(
      String student,
      String module,
      String assessment,
      Map<String, Map<String, Map<String, String>>> db) {
    Map<String, Map<String, String>> std = db.get(student);
    if (std == null) {
      return "No such entry";
    } else {
      Map<String, String> mod = std.get(module);
      if (mod == null) {
        return "No such entry";
      } else {
        String grade = mod.get(assessment);
        if (grade == null) {
          return "No such entry";
        }
        return grade;
      }
    }
  }

  /*
   * Use this skeleton to replace getGrade
   */
  public static String getGrade(
      String student,
      String module,
      String assessment,
      Map<String, Map<String, Map<String, String>>> map) {

    Transformer<Map<String, Map<String, String>>, Maybe<Map<String, String>>> getModule =
        new Transformer<>() {
          public Maybe<Map<String, String>> transform(Map<String, Map<String, String>> m) {
            return Maybe.of(m.get(module));
          }
        };

    Transformer<Map<String, String>, Maybe<String>> getAssessment =
        new Transformer<>() {
          public Maybe<String> transform(Map<String, String> m) {
            return Maybe.of(m.get(assessment));
          }
        };

    return Maybe.of(map.get(student))
        .flatMap(getModule)
        .flatMap(getAssessment)
        .orElse("No Such Entry")
        .toString();
  }

  public static void main(String[] args) {
    Map<String, Map<String, Map<String, String>>> students =
        Map.of(
            "Steve",
            Map.of(
                "CS2030S",
                Map.of(
                    "ex1", "A",
                    "ex2", "A-",
                    "ex3", "A+",
                    "ex4", "B",
                    "pe1", "C"),
                "CS2040S",
                Map.of(
                    "ex1", "A",
                    "ex2", "A+",
                    "ex3", "A+",
                    "ex4", "A",
                    "midterm", "A+")),
            "Tony",
            Map.of(
                "CS2030S",
                Map.of(
                    "ex1", "C",
                    "ex2", "C",
                    "ex3", "B-",
                    "ex4", "B+",
                    "pe1", "A")));

    System.out.println(getGrade("Steve", "CS2030S", "ex1", students));
    System.out.println(getGrade("Steve", "CS2030S", "ex2", students));
    System.out.println(getGrade("Steve", "CS2040S", "ex3", students));
    System.out.println(getGrade("Steve", "CS2040S", "ex4", students));
    System.out.println(getGrade("Tony", "CS2030S", "ex1", students));
    System.out.println(getGrade("Tony", "CS2030S", "midterm", students));
    System.out.println(getGrade("Tony", "CS2040S", "ex4", students));
    System.out.println(getGrade("Bruce", "CS2040S", "ex4", students));
  }
}
