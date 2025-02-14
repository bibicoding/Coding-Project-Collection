/**
 * The Seq<T> class for CS2030S
 *
 * @author Chiang Peng-Yi
 * @version CS2030S AY23/24 Semester 2
 */
class Seq<T extends Comparable<T>> {
  private T[] seq;
  private int size;

  public Seq(int size) {
    this.size = size;
    @SuppressWarnings("unchecked")
    T[] mySeq = (T[]) new Comparable[size];
    this.seq = mySeq;
  }

  public void set(int index, T item) {
    this.seq[index] = item;
  }

  public T get(int index) {
    return this.seq[index];
  }

  public T min() {
    T minItem = this.seq[0];
    for (T item : this.seq) {
      if (item.compareTo(minItem) == -1) {
        minItem = item;
      }
    }
    return minItem;
  }

  @Override
  public String toString() {
    StringBuilder s = new StringBuilder("[ ");
    for (int i = 0; i < this.seq.length; i++) {
      s.append(i + ":" + this.seq[i]);
      if (i != this.seq.length - 1) {
        s.append(", ");
      }
    }
    return s.append(" ]").toString();
  }
}
