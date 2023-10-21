package interfaces;

public class CurrentAccount implements Accounts   {
    double balance=5000;

    static int AccountID=0;
    CurrentAccount(){
        System.out.println("Your new Current account is created :) ");
        ++AccountID;
    }
    @Override
    public void deposit(int deposit) {
        System.out.println("adding money to your wallet ... ");
        balance += deposit;
        System.out.println("The updated Balance after deposit of " + deposit + " in the Current account is " + balance);
    }

    public void withdraw(int withdrawl_amt)
        {
            if(withdrawl_amt> balance)
            {
                System.out.println("Insufficient balance :(");
            }
            else {
                balance -= withdrawl_amt;
                System.out.println("withdrawing money from your wallet ... ");
                System.out.println(withdrawl_amt + " is withdrawed from the current account ");
                System.out.println("The balance of the current account is updated to " + balance);
            }



//            balance-= withdrawl_amt;
//            System.out.println("The updated Balance after withdrawl of " + withdrawl_amt + " in the Current account is " + balance);
        }
    public double calculate_interest()
        { double interest;
            interest = (balance)*0.08;
            return interest ;
        }
    public void view_balance()
        { System.out.println("___________________");
            System.out.println("The Account balance of this current account is " + balance);
            System.out.println("___________________");
        }

}
