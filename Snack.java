package Snack;

public abstract class Snack{

    String id;
    Character size;

    double price;

    Snack(String id, Character size){
        this.id = id;
        this.size = size;
        if(size == 'S')
            {
                this.price = 19.99;
            }
        if(size == 'M')
        {
            this.price = 29.99;
        }
        if(size == 'L')
        {
            this.price = 39.99;
        }

    }

    abstract void getter();
    abstract void setter();

}
