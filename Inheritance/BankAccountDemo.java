package Inheritance;

class BankAccount {
    private String accountNumber;
    private double balance;

    // Constructor
    public BankAccount() {
        this.balance = 0;
    }

    public BankAccount(String accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }

    // Deposit method
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited Amount:" + amount+" RS");
        } else {
            System.out.println("Invalid deposit amount!");
        }
    }

    // View balance
    public void viewBalance() {
        System.out.println("Account: " + accountNumber);
        System.out.println("Remaining Balance:" + balance+" RS");
    }

    // Gette rs and sette rs
    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    protected void setBalance(double balance) {
        this.balance = balance;
    }
}

class SavingsAccount extends BankAccount {
    private float interestRate = 0.05f;

    // Constructor
    public SavingsAccount(String accountNumber, double initialBalance) {
        super(accountNumber, initialBalance);
    }

    public void addInterest() {
        double interest = getBalance() * interestRate;
        setBalance(getBalance() + interest);
        System.out.println("Interest Added:" + interest+" RS");
        System.out.println("New Balance:" + getBalance()+" RS");
    }

    public void setInterestRate(float rate) {
        this.interestRate = rate;
    }
}

class CurrentAccount extends BankAccount {
    private double overdraftLimit = 5000;

    // Constructor
    public CurrentAccount(String accountNumber, double initialBalance) {
        super(accountNumber, initialBalance);
    }

    public void withdraw(double amount) {
        
        if (amount <= getBalance() + overdraftLimit) {
            setBalance(getBalance() - amount);
            System.out.println("Withdrawn:" + amount+" RS");
            System.out.println("Remaining Balance:" + getBalance()+" RS");
            
            if (getBalance() < 0) {
                System.out.println("Overdraft used: " + (getBalance())+" RS");
            }
        } else {
            System.out.println("Withdrawal failed! Insufficient funds.");
            System.out.println("Available:" + (getBalance() + overdraftLimit)+" RS");
        }
    }

    public void setOverdraftLimit(double limit) {
        this.overdraftLimit = limit;
    }

    public double getOverdraftLimit() {
        return overdraftLimit;
    }
}

public class BankAccountDemo {
    public static void main(String[] args) {
        System.out.println("=== Regular Bank Account ===");
        BankAccount ba = new BankAccount("ACC001", 1000);
        ba.deposit(3000);
        ba.viewBalance();

        System.out.println("\n=== Savings Account ===");
        SavingsAccount sa = new SavingsAccount("SAV123", 10000);
        sa.viewBalance();
        sa.addInterest();

        System.out.println("\n=== Current Account ===");
        CurrentAccount ca = new CurrentAccount("CUR456", 5000);
        ca.viewBalance();
        
        // Normal withdrawal
        ca.withdraw(2000);
        
        // Withdrawal using overdraft
        ca.withdraw(4000);
        
        // Exceeding overdraft limit
        ca.withdraw(10000);
    }
}
