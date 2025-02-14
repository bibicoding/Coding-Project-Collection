/**
 * This Class encapsulates the queue event in the bank
 *
 * @author Chiang Peng-Yi
 * @version CS2030S AY24/25 Semester 2
 */
public class QueueEvent extends Event {
  private Customer customer;
  private Counter counter;
  private Queue<Customer> queue;

  public QueueEvent(Customer customer, Queue<Customer> queue, Counter counter) {
    super(customer.getQueueTime());
    this.customer = customer;
    this.queue = queue;
    this.counter = counter;
  }

  @Override
  public String toString() {
    if (queue.isCounterQueue()) {
      return super.toString()
          + String.format(": %s joins counter queue (at %s)", this.customer, this.counter);
    } else {
      return super.toString()
          + String.format(": %s joins bank queue %s", this.customer, this.queue);
    }
  }

  @Override
  public Event[] simulate() {
    this.queue.enq(this.customer);
    return new Event[] {};
  }
}
