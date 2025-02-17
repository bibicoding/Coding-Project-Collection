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
  private String result;

  public ServiceEndEvent(Customer customer, Counter counter, Bank bank) {
    super(customer.getServiceBegin() + customer.getServiceDuration());
    this.customer = customer;
    this.counter = counter;
    this.bank = bank;
    this.result = this.counter.getTaskStatus();
  }

  @Override
  public String toString() {
    return super.toString()
        + String.format(
            ": %s %s (at %s) ends: %s",
            this.customer, this.customer.getTask(), this.counter, this.result);
  }

  @Override
  public Event[] simulate() {

    double time = this.customer.getServiceBegin() + this.customer.getServiceDuration();
    this.customer.updateServiceEndTime(time);
    this.counter.setAvail(true);

    Queue<Customer> counterQ = this.counter.getQueue();
    Queue<Customer> bankQ = this.bank.getQueue();

    if (!this.counter.isEmpty()) {
      Customer c1 = counterQ.deq();
      c1.updateServiceBeginTime(time);

      if (!this.bank.isEmpty()) {
        Customer c2 = bankQ.deq();
        c2.updateQTime(time + 0.01);

        return new Event[] {
          new DepartureEvent(this.customer),
          new ServiceBeginEvent(c1, this.counter, this.bank),
          new QueueEvent(c2, counterQ, this.counter)
        };
      } else {
        return new Event[] {
          new DepartureEvent(this.customer), new ServiceBeginEvent(c1, this.counter, this.bank)
        };
      }
    } else if (!this.bank.isEmpty()) {
      Customer c1 = bankQ.deq();
      c1.updateServiceBeginTime(time);

      return new Event[] {
        new DepartureEvent(this.customer), new ServiceBeginEvent(c1, this.counter, this.bank)
      };
    } else {
      return new Event[] {new DepartureEvent(this.customer)};
    }
  }
}
