package Bank_OOPS;
//3. Create class Bank, write methods savings(),withdrawal(),fixedDeposit()
//        rate of interest are diffrent for savings and fixed deposits. Once rate of intereset in changed should be applied to respective accounts.
public class Bank {
    private double amt;


    public double saving(double savings)
    {
        return amt + (savings*8.9);
    }
    
    public double withdrawl(double withdrawlamt)
        {
            return amt-withdrawlamt;
        }






}
