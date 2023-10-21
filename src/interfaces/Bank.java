package interfaces;

// Write a Java programming to create a banking system with three / four  classes - Bank, Account, SavingsAccount, and CurrentAccount. The bank should have a list of accounts and methods for adding them. Accounts should be an interface with methods to deposit, withdraw, calculate interest, and view balances. SavingsAccount and CurrentAccount should implement the Account interface and have their own unique methods

public class Bank  {

 public static void main(String[] args) {
// Savings account object
  SavingsAccount acc1 = new SavingsAccount();
  acc1.view_balance();
  acc1.deposit(500);
  acc1.view_balance();
  acc1.withdraw(1000);
  acc1.view_balance();
  acc1.deposit(47343);
  acc1.view_balance();
  System.out.println(acc1.calculate_interest());


// Current Account object
  Accounts acc2 = new CurrentAccount();
  acc2.view_balance();
  acc2.deposit(500);
  acc2.view_balance();
  acc2.withdraw(1000);
  acc2.view_balance();
  acc2.deposit(47343);
  acc2.view_balance();
  System.out.println(acc2.calculate_interest());


 }
 //Accounts acc1 = new SavingsAccount();




}
