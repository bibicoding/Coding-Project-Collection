/**
 * This class encapsulates a Bank
 *
 * @author Chiang Peng-Yi
 * @version CS2030S AY24/25 Semester 2
 */
public class Bank {

  private Seq<Counter> counters;
  private Queue<Customer> queue;

  public Bank(int numOfCounters, int qLength, int qCounterLength) {

    Seq<Counter> counters = new Seq<Counter>(numOfCounters);
    for (int i = 0; i < numOfCounters; i++) {
      counters.set(i, new Counter(i, true, qCounterLength));
    }

    this.counters = counters;
    this.queue = new Queue<Customer>(qLength);
    this.queue.changeQType();
  }

  public Counter getAvailableCounter() {
    return this.counters.min();
  }

  public Queue<Customer> getQueue() {
    return this.queue;
  }

  public boolean isQueueFull() {
    return this.queue.isFull();
  }

  public boolean isEmpty() {
    return this.queue.isEmpty();
  }
}
