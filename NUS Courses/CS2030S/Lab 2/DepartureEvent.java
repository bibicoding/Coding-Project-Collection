/**
 * This class encapsulates the Departure
 *
 * @author Chiang Peng-Yi
 * @version CS2030S AY24/25 Semester 2
 */
public class DepartureEvent extends Event {

  private Customer customer;

  public DepartureEvent(Customer customer) {
    super(customer.getServiceEnd());
    this.customer = customer;
  }

  @Override
  public String toString() {
    return super.toString() + ": " + this.customer + " departs";
  }

  @Override
  public Event[] simulate() {
    return new Event[] {};
  }
}
