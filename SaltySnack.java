package Snack;

public class SaltySnack extends Snack{

    boolean isNutSnack;

    SaltySnack(String id, Character size, boolean isNutSnack){

        super(id,size);
        if(isNutSnack)
            {
                price = price + 4.50;

            }

    }

    public void getter()
        {
            System.out.println("The id of this Fruit snack is " + id + " and it size is " + size + " and its " + isNutSnack + " that its a Snack containing Nuts ");
        }

    public void setter(String id, Character size,boolean isNutSnack)
        {
//            new SaltySnack(id, size, isNutSnack);
            this.id = id;
            this.size = size;
            this.isNutSnack = isNutSnack;
        }

}
