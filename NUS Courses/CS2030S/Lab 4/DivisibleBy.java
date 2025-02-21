/**
 * A boolean condition with an integer parameter y that can be
 * apply to another integer x.  Returns true if x is divisible
 * by y, false otherwise.
 * CS2030S Exercise 4
 * AY23/24 Semester 2
 *
 * @author Chiang Peng-Yi (16K)
 */
class DivisibleBy implements BooleanCondition<Integer> {

  private int src;

  public DivisibleBy(int src) {
    this.src = src;
  }

  @Override
  public boolean test(Integer tgt) {
    int t = tgt;
    return t % this.src == 0;
  }
}
