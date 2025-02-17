class Deposit extends Task {

  public Deposit(int money) {
    super(money, "deposit");
  }

  @Override
  public void execute(Counter counter) {
    counter.deposit(money);
  }

}
