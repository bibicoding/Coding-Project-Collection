/**
 * A transformer with a parameter k that takes in an object x
 * and outputs the last k digits of the hash value of x.
 * CS2030S Exercise 4
 * AY23/24 Semester 2
 *
 * @author Chiang Peng-Yi (16K)
 */
class LastDigitsOfHashCode implements Transformer<Object, Integer> {

  private int digits;

  public LastDigitsOfHashCode(int digits) {
    this.digits = digits;
  }

  @Override
  public Integer transform(Object item) {
    return (int) Math.abs(item.hashCode() % Math.pow(10, this.digits));
  }
}
