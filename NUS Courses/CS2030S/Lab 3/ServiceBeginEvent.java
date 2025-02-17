/**
 * This class encapsulates Event after
 * Service Begins
 *
 * @author Chiang Peng-Yi
 * @version CS2030S AY24/25 Semester 2
 */
public class ServiceBeginEvent extends Event {

  private Customer customer;
  private Counter counter;
  private Bank bank;

  public ServiceBeginEvent(Customer customer, Counter counter, Bank bank) {
    super(customer.getServiceBegin());
    this.customer = customer;
    this.counter = counter;
    this.bank = bank;
  }

  @Override
  public String toString() {
    return super.toString()
        + String.format(
            ": %s %s (at %s) begins", this.customer, this.customer.getTask(), this.counter);
  }

  @Override
  public Event[] simulate() {
    this.counter.setAvail(false);
    this.customer.performTask(this.counter);
    return new Event[] {new ServiceEndEvent(this.customer, this.counter, this.bank)};
  }
}
