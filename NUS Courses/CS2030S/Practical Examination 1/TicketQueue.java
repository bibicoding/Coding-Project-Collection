// @author A0310635N

class TicketQueue extends Queue<Ticket> implements Comparable<TicketQueue> {

  private final int priority;
  private int size;

  public TicketQueue(int priority, int size) {
    super(size);
    this.priority = priority;
  }

  @Override
  public boolean enq(Ticket t) {
    if (t.getPriority() == this.priority && !this.isFull()) {
      super.enq(t);
      return true;
    }
    return false;
  }

  @Override
  public int compareTo(TicketQueue tq) {
    if (this.isEmpty() && tq.isEmpty()) {
      return -1;
    } else if (tq.isEmpty()) {
      return 1;
    } else if (this.isEmpty()) {
      return -1;
    } else if (this.priority != tq.priority) {
      return this.priority - tq.priority;
    } else if (this.length() != tq.length()) {
      return this.length() - tq.length();
    } else {
      return -1;
    }
  }

  @Override
  public String toString() {
    return "Q" + this.priority + " " + super.toString();
  }

}
