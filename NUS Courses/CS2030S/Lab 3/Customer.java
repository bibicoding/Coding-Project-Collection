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
  private double queueTime;
  private Task task;
  private int tasktype;
  private int money;

  /**
   * Constructor of Customer
   * @param id The Customer ID
   * @param arvtime The Arrival Time of the customer
   * @param svDuration The Service Duation of the customer
   * @param svBeginTime The Service Begin Time of the customer
   * @param svEndTime The Service End Time of the customer
   * @param queueTime The time customer join a new queue
   * @param tasktype Type of task (either deposit or withdrawal)
   * @param money The amount of money concerned
   */
  public Customer(
      int id,
      double arvtime,
      double svDuration,
      double svBeginTime,
      double svEndTime,
      double qTime,
      int tasktype,
      int money) {
    this.id = id;
    this.arvtime = arvtime;
    this.svDuration = svDuration;
    this.svBeginTime = svBeginTime;
    this.svEndTime = svEndTime;
    this.queueTime = qTime;
    this.tasktype = tasktype;

    if (tasktype == 0) {
      this.task = new Deposit(money);
    } else if (tasktype == 1) {
      this.task = new Withdrawal(money);
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

  public double getQueueTime() {
    return this.queueTime;
  }

  public void updateQTime(double time) {
    this.queueTime = time;
  }

  public Task getTask() {
    return this.task;
  }

  public void performTask(Counter counter) {
    this.task.execute(counter);
  }


  @Override
  public String toString() {
    return String.format("C%d", this.id);
  }
}
