package Basic_OOPS;
import java.util.*;
public class Test extends Zoo
{
    public static void main(String[] args){

//        Base b1 = new Base();
//        Base b2 = new Base(50);
//        b1.get_x();
//        b2.get_x();
//        b1.set_x(100);
//        b1.get_x();
//        Derived d1 = new Derived(10,20);
//        d1.display();

//        Scanner sc = new Scanner(System.in);
//        int a, b;
//        a = sc.nextInt();
//        sc.nextLine();
//        b = sc.nextInt();
//        Shape s1 = new Shape();
//        s1.get_details();
//        s1.set_r1(0);
//        s1.get_details();
//        Shape s2 = new Shape(a,b);
//        s2.get_details();
//        System.out.println(s2.area());
//
//        Circle c1 = new Circle();
//        System.out.println(c1.area() + " unit^2");
//        System.out.println(s1.area());
//
//        Square sq1 = new Square();
//        Square sq2 = new Square(25);
//        System.out.println(sq2.area());
//        Shape newton = new Square();
//        System.out.println(newton.area());

        //Zoo a1 = new Animal();
        //a1.show('A','A');
//        a1.show('A',100);

//        Zoo a2 = new Bird();
//        a2.show('B','A');
//     System.out.println("_______________________________________________________________________________");
//        Point p1 = new Point();
//        Point p2 = new Point(100,200);
//        Point p3 = new Point();
//        Point p4 = new Point(2304,2493);
//        System.out.println("P ID : " +p1.get_id());
//        p1.get_x_y();
//        System.out.println("__________________________");
//        System.out.println("P ID : " + p2.get_id());
//        p2.get_x_y();
//        System.out.println("__________________________");
//        System.out.println("P ID : " +p3.get_id());
//        p3.get_x_y();
//        System.out.println("__________________________");
//        System.out.println("P ID : " +p4.get_id());
//        p4.get_x_y();
//        System.out.println("__________________________");
//        System.out.println(Point.get_count());
//        Point.set_count(5000);
//        System.out.println(Point.get_count());

        HillStations destination1 = new Manali();
        destination1.famousFor();
        destination1.location();


        System.out.println("___________________________");
        HillStations destination2 = new Gulmarg();
        destination2.famousFor();
        destination2.location();
        System.out.println("___________________________");
        HillStations destination3 = new Mussiori();
        destination3.famousFor();
        destination3.location();

    }


}
