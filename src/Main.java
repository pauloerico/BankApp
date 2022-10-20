import Model.Account;
import Model.CheckingAccount;
import Model.Client;
import Model.SavingsAccount;

public class Main {
    public static void main(String[] args) {
        Client paulo = new Client("Paulo");

        Account checkingAccount = new CheckingAccount(paulo);
        Account savingsAccount = new SavingsAccount(paulo);

        checkingAccount.printBalance();
        savingsAccount.printBalance();

        checkingAccount.deposit(100);

        checkingAccount.printBalance();
        savingsAccount.printBalance();

        checkingAccount.transfer(100, savingsAccount);

        checkingAccount.printBalance();
        savingsAccount.printBalance();

    }
}
