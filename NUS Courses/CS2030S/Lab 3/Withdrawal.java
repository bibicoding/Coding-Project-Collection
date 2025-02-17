class Withdrawal extends Task {

  public Withdrawal(int money) {
    super(money, "withdrawal");
  }

  @Override
  public void execute(Counter counter) {
    counter.withdraw(money);
  }

}
