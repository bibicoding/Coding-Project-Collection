/**
 * This class encapsulates Counters
 *
 * @author: Chiang Peng-Yi
 * @version: CS2030S AY24/25 Semester 2
 */
public class Counter {
  private int id;
  private boolean isAvailable;
  private Queue queue;

  /**
   * Constructor of Counter
   * includes Counter ID and isAvailable
   */
  public Counter(int id, boolean isAvailable) {
    this.id = id;
    this.isAvailable = isAvailable;
  }

  public int getID() {
    return this.id;
  }

  public boolean getAvail() {
    return this.isAvailable;
  }

  public void setAvail(boolean avail) {
    this.isAvailable = avail;
  }

  @Override
  public String toString() {
    return "S" + this.id;
  }
}
