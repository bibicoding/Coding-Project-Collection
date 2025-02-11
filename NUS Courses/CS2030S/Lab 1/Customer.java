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

  /**
   * Constructor of Customer
   * tagged with id, service time, and arrival time
   */
  public Customer(int id, double arvtime, double svtime) {
    this.id = id;
    this.arvtime = arvtime;
    this.svtime = svtime;
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
}
