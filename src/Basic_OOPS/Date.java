package Basic_OOPS;

public class Date {
    private int dd;
    private int mm;
    private int yy;
    private static int count;

    static
    {
        count =0;
    }
    public Date(){
        dd = 21;
        mm = 5;
        yy =  2021;
        count ++;
    }



    public Date(int dd, int mm, int yy){

        while(mm < 12) {
            this.dd = dd;
            this.mm = mm;
            this.yy = yy;
            count++;
        }
    }

    public Date(int n)
        {
            dd=mm=yy=n;
            count++;
        }
    public void showDate()
        {
            System.out.println(dd+"/"+mm+"/"+yy );
        }

    public void showDate(char ch)
    {
        System.out.println(dd+ch+mm+ch+yy );
    }



}
