// @author A0310635N

class TicketSubmittedEvent extends Event {
  
  private RTSystem rtsys;
  private Ticket t;
    
  public TicketSubmittedEvent(double time, RTSystem rtsys, Ticket t) {
    super(time);
    this.rtsys = rtsys;
    this.t = t;
  }

  @Override
  public Event[] simulate() {
    try {
    this.rtsys.fileTicket(this.t);
    return new Event[] {};
    } catch (CongestionException e) {
      return new Event[] {};
    }
  }

  @Override
  public String toString() {
    return super.toString() + " " + this.t + " submitted " + this.rtsys;
  }

}
