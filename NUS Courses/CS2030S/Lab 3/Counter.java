/**
 * This class encapsulates Counters
 *
 * @author: Chiang Peng-Yi
 * @version: CS2030S AY24/25 Semester 2
 */
public class Counter implements Comparable<Counter> {
  private int id;
  private boolean isAvailable;
  private Queue<Customer> queue;
  private int money = 100;
  private String taskStatus = "success";
  
  /**
   * Constructor of Counter
   * includes Counter ID and isAvailable
   */
  public Counter(int id, boolean isAvailable, int qLength) {
    this.id = id;
    this.isAvailable = isAvailable;
    this.queue = new Queue<Customer>(qLength);
  }

  public int getID() {
    return this.id;
  }

  public boolean isAvail() {
    return this.isAvailable;
  }

  public void setAvail(boolean avail) {
    this.isAvailable = avail;
  }

  public Queue<Customer> getQueue() {
    return this.queue;
  }

  public boolean isQueueFull() {
    return this.queue.isFull();
  }

  public boolean isEmpty() {
    return this.queue.isEmpty();
  }

  public void deposit(int amount) {
    this.money += amount;
  }
  public void withdraw(int amount) {
    if (amount > this.money) {
      this.taskStatus = "fail";
    } else {
      this.money -= amount;
    }
  }

  public String getTaskStatus() {
    return this.taskStatus;
  }


  @Override
  public int compareTo(Counter c) {
    if (c.isAvail()) {
      return 1;
    } else if (this.isAvail()) {
      return -1;
    } else {
      return Integer.compare(this.queue.length(), c.queue.length());
    }
  }

  @Override
  public String toString() {
    return "S" + this.id + " $" + this.money + " " + this.queue;
  }
}
