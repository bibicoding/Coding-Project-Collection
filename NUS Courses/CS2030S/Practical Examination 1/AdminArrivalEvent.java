// @author A0310635N
//

class AdminArrivalEvent extends Event {

  private Admin a;
  private RTSystem rtsys;
  public static final double PROCESSTIME = 0.2;


  public AdminArrivalEvent(double time, RTSystem rtsys, Admin a) {
    super(time);
    this.rtsys = rtsys;
    this.a = a;
  }

  public Event[] simulate() {
    return new Event[] {
      new TicketPickupEvent(this.getTime() + PROCESSTIME, this.a, this.rtsys)
    };
  }

  @Override
  public String toString() {
    return super.toString() + " " + this.a + " arrived " + this.rtsys;
  }

}
