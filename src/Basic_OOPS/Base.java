package Basic_OOPS;

public class Base {

    private int x;
    Base(){
            x =50;
        }

    Base(int x){
        this.x=x;
    }

    void set_x(int x)
        {
            this.x=x;
        }

    void get_x()
        {
            System.out.println(x);
        }
}


