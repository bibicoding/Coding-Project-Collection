// @author A0310635N

public class TicketProcessedEvent extends Event {
  
  private Ticket t;
  private RTSystem rtsys;
  private Admin a;

  public TicketProcessedEvent(double time, Admin a, Ticket t, RTSystem rtsys) {
    super(time);
    this.t = t;
    this.rtsys = rtsys;
    this.a = a;
  }

  @Override
  public Event[] simulate() {
    return new Event[] {
      new TicketPickupEvent(this.getTime() + 0.2, this.a, this.rtsys)
    };
  }

  @Override
  public String toString() {
    return super.toString() + " " + this.t + " processed " + this.rtsys;
  }
  

}
