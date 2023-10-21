package Basic_OOPS;

public class Derived extends Base {

    int y;
    Derived(){
        super();
        y =50;
    }

    Derived(int x,int y) {
            super(x);
            this.y=y;
        }


    void set_xy(int x, int y)
        {
            new Derived(x,y);

        }
    void display()
        {   get_x();
            System.out.print(" ");
            System.out.print(y);
        }
//
//    Derived(int x,int y) {
//        super();
//        this.y=y;
//    }


}
