/**
 * This class encapsulates the arrival event
 *
 * @author Chiang Peng-Yi
 * @version CS2030S AY24/25 Semester 2
 */
public class ArrivalEvent extends Event {

  private Customer customer;
  private Counter[] counter;

  public ArrivalEvent(Customer customer, Counter[] counter) {
    super(customer.getArrivalTime());
    this.customer = customer;
    this.counter = counter;
  }

  @Override
  public String toString() {
    return super.toString() + String.format(": Customer %d arrives", this.customer.getID());
  }

  @Override
  public Event[] simulate() {

    /**
     * Checking if any counter
     * in counter array is available
     */
    for (Counter c : this.counter) {
      if (c.getAvail()) {
        return new Event[] {new ServiceBeginEvent(this.customer, c)};
      }
    }

    /**
     * If none of the counters are available
     * Depart
     */
    return new Event[] {new DepartureEvent(this.customer, (this.customer.getArrivalTime()))};
  }
}
