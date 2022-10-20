package Model;

import java.util.List;

public class Bank {

    private String name;

    public void setAccounts(List<Account> accounts) {
        this.accounts = accounts;
    }

    private List<Account> accounts;

    public Bank(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public List<Account> getAccounts() {
        return accounts;
    }
}
