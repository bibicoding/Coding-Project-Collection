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
  private double endTime;

  public ServiceEndEvent(Customer customer, Counter counter, double endTime) {
    super(endTime);
    this.customer = customer;
    this.counter = counter;
    this.endTime = endTime;
  }

  @Override
  public String toString() {
    return super.toString()
        + String.format(
            ": Customer %d service done (by Counter %d)",
            this.customer.getID(), this.counter.getID());
  }

  @Override
  public Event[] simulate() {
    this.counter.setAvail(true);
    return new Event[] {new DepartureEvent(this.customer, this.endTime)};
  }
}
