package Encapsulation;
class BankAccount {
    private double balance;

    public BankAccount(double initialBalance){
        this.balance=initialBalance;
    }

    public void deposite(double amount){
        if(amount>0){
            balance+=amount;
            System.out.println("Deposit Amount "+ amount +"RS" + " ** Current Balance "+balance+"RS" );
        }else{
            System.out.println("Enter Positive Value...!");
        }
    }

    public void withdraw(double amount){
        if(amount>0){
            if(amount<=balance){
                balance-=amount;
                System.out.println("Withdraw Amount "+ amount +"RS" + " ** Current Balance "+balance+"RS" );
            }else{
                System.out.println("Please Enter Valid Amount....!");
            }
        }else{
            System.out.println("Enter Positive Value");
        }
    }

    public double getbalance(){
        return balance;
    }
}

public class Main {
    public static void main(String[] args) {
            BankAccount myAccount=new BankAccount(1000.0);

            myAccount.deposite(300.0);
            myAccount.withdraw(200.0);

        System.out.println("*Final Balance* "+myAccount.getbalance()+"RS");
    }
}