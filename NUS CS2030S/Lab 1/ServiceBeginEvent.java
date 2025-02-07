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

  public ServiceBeginEvent(Customer customer, Counter counter) {
    super(customer.getArrivalTime());
    this.customer = customer;
    this.counter = counter;
  }

  @Override
  public String toString() {
    return super.toString()
        + String.format(
            ": Customer %d service begin (by Counter %d)",
            this.customer.getID(), this.counter.getID());
  }

  @Override
  public Event[] simulate() {
    this.counter.setAvail(false);
    double endTime = this.customer.getArrivalTime() + this.customer.getServeTime();
    return new Event[] {new ServiceEndEvent(this.customer, this.counter, endTime)};
  }
}
