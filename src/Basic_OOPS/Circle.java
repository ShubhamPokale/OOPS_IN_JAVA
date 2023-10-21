package Basic_OOPS;

public class Circle extends Shape {

    Circle(){
        super();
    }

    Circle(int r1){
        super(r1);

    }

    double area()
        {
            return 3.14*r1*r1;
        }
}
