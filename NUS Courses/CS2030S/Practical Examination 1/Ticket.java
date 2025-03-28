// @author A0310635N

class Ticket {
  
  private static int next = 100;
  private final int id;
  private int priority;
  private double time;

  public Ticket(int priority, double time) {
    this.id = next;
    next++;
    this.priority = priority;
    this.time = time;
  }

  public int getPriority() {
    return this.priority; 
  }

  public int getId() {
    return this.id;
  }

  public double getProcessingTime() {
    return this.time;
  }

  @Override
  public String toString() {
    if (this != null) {
      return "T" + this.id;
    } else {
      return "";
    }
  }

}
