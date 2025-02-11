/**
 * This class encapsulates the Departure
 *
 * @author Chiang Peng-Yi
 * @version CS2030S AY24/25 Semester 2
 */
public class DepartureEvent extends Event {

  private Customer customer;
  private double endTime;

  public DepartureEvent(Customer customer, double endTime) {
    super(endTime);
    this.customer = customer;
    this.endTime = endTime;
  }

  @Override
  public String toString() {
    return super.toString() + String.format(": Customer %d departed", this.customer.getID());
  }

  @Override
  public Event[] simulate() {
    return new Event[] {};
  }
}
