/**
 * This class encapsulates the Event
 * when Service Ends
 *
 * @author Chiang Peng-Yi
 * @version CS2030S AY24/25 Semester 2
 */
public class ServiceEndEvent extends Event {

  private Customer customer;
  private Counter counter;
  private Bank bank;

  public ServiceEndEvent(Customer customer, Counter counter, Bank bank) {
    super(customer.getServiceBegin() + customer.getServeTime());
    this.customer = customer;
    this.counter = counter;
    this.bank = bank;
  }

  @Override
  public String toString() {
    return super.toString()
        + String.format(
            ": %s %s (at %s) ends", this.customer, this.customer.getTask(), this.counter);
  }

  @Override
  public Event[] simulate() {

    double time = this.customer.getServiceBegin() + this.customer.getServeTime();
    this.customer.updateServiceEndTime(time);

    this.counter.setAvail(true);
    if (!this.bank.getQueue().isEmpty()) {
      Customer c = (Customer) this.bank.getQueue().deq();
      c.updateServiceBeginTime(time);

      return new Event[] {
        new DepartureEvent(this.customer), new ServiceBeginEvent(c, this.counter, this.bank)
      };
    } else {
      return new Event[] {new DepartureEvent(this.customer)};
    }
  }
}
