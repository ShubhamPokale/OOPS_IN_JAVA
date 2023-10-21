package Basic_OOPS;

public class Square extends Shape {

    Square(){
        super();
    }

    Square(int r1){
        super(r1);
    }

    Square(int r1,int r2){
        super(r1,r2);
    }

    double area()
        {   System.out.println("This is from Square class");
            return r1*r1;
        }
}
