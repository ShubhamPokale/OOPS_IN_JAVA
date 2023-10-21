package interfaces;

import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) {
        MyCalculator a = new MyCalculator();
        System.out.println("Sum = "+a.divisor_sum(5));

        Animal aa = new Dog();
        aa.bark();


        Playable Sport1 = new Football();
        Sport1.play();
        System.out.println("___________________");
        Playable Sport2 = new Basketball();
        Sport2.play();
        System.out.println("___________________");
        Playable Sport3 = new Volleyball();
        Sport3.play();
        System.out.println("______________________");
        System.out.println("______________________________");
        SubClass Object1 = new SubClass();
        Object1.a_method();
        Object1.na_method();

        System.out.println("-----------------------------------------------____________--------------------------------");

        Base aaa = new Derived(10,20);
        aaa.add(50,100); // calling abstract method
        aaa.method(); // calling overridden default method
        Base.method2(); // calling the static method

    }



}
