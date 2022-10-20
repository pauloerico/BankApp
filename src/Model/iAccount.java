package Model;

public interface iAccount {
    void withdraw(double value);
    void deposit(double value);
    void transfer(double value, Account destinationAccount);
    void printBalance();
}
