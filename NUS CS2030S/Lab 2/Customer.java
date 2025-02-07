/**
 * This class encapsulates Customers
 *
 * @author: Chiang Peng-Yi
 * @version: CS2030S AY24/25 Semester 2
 */
public class Customer {
  private int id;
  private double arvtime;
  private double svtime;
  private double svBeginTime;
  private double svEndTime;
  private Task task;

  /**
   * Constructor of Customer
   * tagged with id, service time, and arrival time
   */
  public Customer(
      int id, double arvtime, double svtime, double svBeginTime, double svEndTime, int taskType) {
    this.id = id;
    this.arvtime = arvtime;
    this.svtime = svtime;
    this.svBeginTime = svBeginTime;
    this.svEndTime = svEndTime;

    if (taskType == 0) {
      this.task = new Deposit();
    } else if (taskType == 1) {
      this.task = new Withdrawal();
    }
  }

  public int getID() {
    return this.id;
  }

  public double getArrivalTime() {
    return this.arvtime;
  }

  public double getServeTime() {
    return this.svtime;
  }

  public double getServiceBegin() {
    return this.svBeginTime;
  }

  public double getServiceEnd() {
    return this.svEndTime;
  }

  public void updateServiceBeginTime(double time) {
    this.svBeginTime = time;
  }

  public void updateServiceEndTime(double time) {
    this.svEndTime = time;
  }

  public Task getTask() {
    return this.task;
  }

  @Override
  public String toString() {
    return String.format("C%d", this.id);
  }
}
