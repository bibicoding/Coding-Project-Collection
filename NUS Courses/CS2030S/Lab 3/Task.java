abstract class Task {

  private int money;
  private String type;

  public Task(int money, String type) {
    this.money = money;
    this.type = type;
  }

  public int getMoney() {
    return this.money;
  }

  @Override
  public String toString() {
    return this.type + " $" + this.money;
  }
}
