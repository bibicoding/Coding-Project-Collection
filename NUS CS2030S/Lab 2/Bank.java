/**
 * This class encapsulates a Bank
 *
 * @author Chiang Peng-Yi
 * @version CS2030S AY24/25 Semester 2
 */
public class Bank {

  private Counter[] counters;
  private Queue queue;

  public Bank(int numOfCounters, int qLength) {

    Counter[] counters = new Counter[numOfCounters];

    for (int i = 0; i < numOfCounters; i++) {
      counters[i] = new Counter(i, true);
    }

    this.counters = counters;
    this.queue = new Queue(qLength);
  }

  public Counter getAvailableCounter() {
    for (Counter c : this.counters) {
      if (c.getAvail()) {
        return c;
      }
    }
    return null;
  }

  public Queue getQueue() {
    return this.queue;
  }
}
