package interfaces;

public interface Base {




    default void method(){
        System.out.println("This is a default method in the interface ;)");
    }

    int add(int a,int b);

    static void method2()
        {
            System.out.println("This is a static method");
        }






}

