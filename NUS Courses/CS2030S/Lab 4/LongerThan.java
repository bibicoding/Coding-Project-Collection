/**
 * A boolean condition with parameter x that can be applied to
 * a string.  Returns true if the string is longer than x; false
 * otherwise.
 * CS2030S Exercise 4
 * AY23/24 Semester 2
 *
 * @author Chiang Peng-Yi (16K)
 */
class LongerThan implements BooleanCondition<String> {

  private int limit;

  public LongerThan(int limit) {
    this.limit = limit;
  }

  @Override
  public boolean test(String tgt) {
    return tgt.length() > limit;
  }
}
