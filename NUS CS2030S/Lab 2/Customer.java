/**
 * This class encapsulates Customers
 *
 * @author: Chiang Peng-Yi
 * @version: CS2030S AY24/25 Semester 2
 */
public class Customer {
  private int id;
  private double arvtime;
  private double svDuration;
  private double svBeginTime;
  private double svEndTime;
  private Task task;

   /**
   * Constructor of Customer
   * @param id The Customer ID
   * @param arvtime The Arrival Time of the customer
   * @param svDuration The Service Duation of the customer
   * @param svBeginTime The Service Begin Time of the customer
   * @param svEndTime The Service End Time of the customer
   * @param taskType Type of task (either deposit or withdrawal)
   */

  public Customer(
      int id, double arvtime, double svDuration, double svBeginTime, double svEndTime, int taskType) {
    this.id = id;
    this.arvtime = arvtime;
    this.svDuration = svDuration;
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

  public double getServiceDuration() {
    return this.svDuration;
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
