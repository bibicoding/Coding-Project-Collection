// @author A0310635N

public class TicketPickupEvent extends Event {

  private Admin a;
  private RTSystem rtsys;
  private Ticket t;

  public TicketPickupEvent(double time, Admin a, RTSystem rtsys) {
    super(time);
    this.a = a;
    this.rtsys = rtsys;
  }

  @Override
  public Event[] simulate() {
    this.t = this.rtsys.nextTicket();
    return new Event[] {
      new TicketProcessedEvent(this.getTime(), this.a, this.t, this.rtsys)
    };
  }

  @Override
  public String toString() {
    return super.toString() + " " + this.a + " picked up " + this.t + " " + this.rtsys;
  }

}
