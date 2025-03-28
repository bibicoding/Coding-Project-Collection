// @author A0310635N

class RTSystem {
  
  private int numOfQ;
  private int qCap;
  private Seq<TicketQueue> seq;

  public RTSystem(int num, int cap) {
    this.numOfQ = num;
    this.qCap = cap;
    this.seq = new Seq<TicketQueue>(num);
    for (int i = 0; i < num; i++) {
      seq.set(i, new TicketQueue(i, cap));
    }
  }

  public RTSystem fileTicket(Ticket t) throws CongestionException {
    int pri = t.getPriority();
    boolean flag = seq.get(pri).enq(t);
    if (!flag) {
      throw new CongestionException(pri);
    } else {
      return this;
    }
  }

  public Ticket nextTicket() {
    for (int i = numOfQ - 1; i >= 0; i--) {
      if (seq.get(i).isEmpty()) {
        continue;
      } else {
        return seq.get(i).deq(); 
      }
    }
    return null;
  }

  @Override
  public String toString() {
    return "RT: " + this.seq;
  }
}
