/**
 * This Class encapsulates the queue event in the bank
 *
 * @author Chiang Peng-Yi
 * @version CS2030S AY24/25 Semester 2
 */
public class QueueEvent extends Event {
  private Customer customer;
  private Bank bank;

  public QueueEvent(Customer customer, Bank bank) {
    super(customer.getArrivalTime());
    this.customer = customer;
    this.bank = bank;
  }

  @Override
  public String toString() {
    return super.toString()
        + String.format(": %s joins queue %s", this.customer, this.bank.getQueue());
  }

  @Override
  public Event[] simulate() {
    this.bank.getQueue().enq(this.customer);
    return new Event[] {};
  }
}
