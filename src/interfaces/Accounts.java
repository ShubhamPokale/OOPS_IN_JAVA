package interfaces;

public interface Accounts {

    int id =0;

    void deposit(int deposit);
    void withdraw(int withdrawl_amt);
    double calculate_interest();
    void view_balance();



}
