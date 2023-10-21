package interfaces;

public class SavingsAccount implements Accounts {
    int balance = 10000;
    static int AccID=0;
    SavingsAccount(){
        ++AccID;
        System.out.println("You're new savings account is created :)");
    }
    public void deposit(int deposit)
        {

            balance +=deposit;
            System.out.println("adding money to your wallet... :)");
            System.out.println("The balance of the savings account is updated");
        }
    public void withdraw(int withdrawl_amt)
        {

            if(withdrawl_amt> balance)
            {
                System.out.println("Insufficient balance :(");
            }
            else {
                balance -= withdrawl_amt;
                System.out.println("withdrawing money from your wallet....");
                System.out.println(withdrawl_amt + " is withdrawed from the savings account ");
                System.out.println("The balance of the savings account is updated to " + balance);
            }
        }
    public double calculate_interest()
        {
            double interest;
            interest = balance*0.10;
            return interest;
        }
    public void view_balance()
        {

            System.out.println("___________________");
            System.out.println("The account balance of the Savings account is " + balance );
            System.out.println("___________________");
        }


}
