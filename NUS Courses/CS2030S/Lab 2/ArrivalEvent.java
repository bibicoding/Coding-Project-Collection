/**
 * This class encapsulates the arrival event
 *
 * @author Chiang Peng-Yi
 * @version CS2030S AY24/25 Semester 2
 */
public class ArrivalEvent extends Event {

  private Customer customer;
  private Bank bank;

  public ArrivalEvent(Customer customer, Bank bank) {
    super(customer.getArrivalTime());
    this.customer = customer;
    this.bank = bank;
  }

  @Override
  public String toString() {
    return super.toString() + ": " + this.customer + " arrives " + this.bank.getQueue();
  }

  @Override
  public Event[] simulate() {

    Counter c = this.bank.getAvailableCounter();

    if (c != null) {
      this.customer.updateServiceBeginTime(this.customer.getArrivalTime());
      return new Event[] {new ServiceBeginEvent(this.customer, c, this.bank)};
    } else if (!this.bank.getQueue().isFull()) {
      return new Event[] {new QueueEvent(this.customer, this.bank)};
    } else {
      this.customer.updateServiceEndTime(this.customer.getArrivalTime());
      return new Event[] {new DepartureEvent(this.customer)};
    }
  }
}
