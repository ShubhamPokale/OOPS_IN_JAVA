package Snack;

public class FruitSnack extends Snack{

    boolean isCitrus;


    FruitSnack(String id, Character size,boolean isCitrus){

        super(id,size);
        if(isCitrus)
            {
                price = price + 5.99;

            }

    }

    void getter()
    {
        System.out.println("The id of this Fruit snack is " + id + " and it size is " + size + " and its " + isCitrus + " that its Citrus ");

    }

    void setter(String id, Character size,boolean isCitrus)
    {
//            new SaltySnack(id, size, isNutSnack);
        this.id = id;
        this.size = size;
        this.isCitrus = isCitrus;
    }
}
