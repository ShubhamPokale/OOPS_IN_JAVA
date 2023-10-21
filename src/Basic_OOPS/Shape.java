package Basic_OOPS;

public class Shape {
    protected int r1;
    protected int r2;
    protected int r3;
    protected int r4;




    Shape(){
        r1=1;
        r2=1;
        r3=1;
        r4=1;
    }

    protected Shape(int r1){
        this.r1=r1;
    }

    Shape(int r1,int r2){
        this.r1=r1;
        this.r2=r2;
    }

    Shape(int r1,int r2, int r3){
        this.r1=r1;
        this.r2=r2;
        this.r3=r3;
    }

    Shape(int r1,int r2, int r3, int r4){
        this.r1=r1;
        this.r2=r2;
        this.r3=r3;
        this.r4=r4;
    }
    void set_r1(int r1){
        //new Shape(x);
        this.r1 = r1 ;

    }

    void set_r2(int r2){
        //new Shape(x);
        this.r2 = r2 ;

    }

    void set_r3(int r3){
        //new Shape(x);
        this.r3 = r3 ;

    }

    void set_r4(int r4){
        //new Shape(x);
        this.r4 = r4 ;

    }

    void get_details()
        {
            System.out.println(r1  +" " + r2 + " " +r3 + " " + r4);
        }

    double perimeter()
        {
            return r1 + r2 + r3 + r4;
        }

    double area()
        {   System.out.println("This is from Shape class");
            return r1*r2;
        }


    private void veryprivate()
        {
            System.out.println("This is a pirvate method");
        }
}
