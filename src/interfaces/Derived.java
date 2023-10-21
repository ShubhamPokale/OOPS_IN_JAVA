package interfaces;

public class Derived implements Base{

    int a;
    int b;
    Derived(int a,int b){
        this.a = a;
        this.b = b;
        System.out.println("This is the derived constructor with a " +a +  " and b " + b );


    }

    public int add(int a, int b)    // defining th eabstarct method
        {
            Derived add1 = new Derived(a,b);
            return a+b;

        }

    // Overriding the default method

    public void method()
        {
            System.out.println("We're overriding ");
        }


}
