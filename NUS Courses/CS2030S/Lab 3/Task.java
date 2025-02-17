abstract class Task {

  protected final int money;
  private String type;

  public Task(int money, String type) {
    this.money = money;
    this.type = type;
  }

  public abstract void execute(Counter counter);

  @Override
  public String toString() {
    return this.type + " $" + this.money;
  }
}
