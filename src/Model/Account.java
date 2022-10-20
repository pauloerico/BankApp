package Model;

public abstract class Account implements iAccount {

    private static final int DEFAULT_BRANCH = 1;
    protected static int SEQUENCIAL = 1;

    protected int branch;
    protected int number;
    protected double balance;
    private Client client;

    public Account(Client client) {
        this.branch = DEFAULT_BRANCH;
        this.number = SEQUENCIAL++;
        this.client = client;
    }

    public int getBranch() {
        return branch;
    }

    public int getNumber() {
        return number;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public void withdraw(double value) {
        balance -= value;
    }

    @Override
    public void deposit(double value) {
        balance += value;
    }

    @Override
    public void transfer(double value, Account destinationAccount) {
        this.withdraw(value);
        destinationAccount.deposit(value);
    }

    protected void printAccountInfo() {
        System.out.println(String.format("Account holder: %s", this.client.getName()));
        System.out.println(String.format("Branch: %d", this.branch));
        System.out.println(String.format("Account number: %d", this.number));
        System.out.println(String.format("Balance: %.2f", this.balance));
    }
}
