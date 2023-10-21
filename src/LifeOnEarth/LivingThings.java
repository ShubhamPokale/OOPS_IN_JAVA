package LifeOnEarth;

import java.security.spec.RSAOtherPrimeInfo;

public class LivingThings {
    static int count;
    static{
        count =0;
    }

    String species;
    String name;
    boolean isAlive;
    int id;

    LivingThings(){

        new LivingThings(true,"Not defined", "Alien");
    }

    LivingThings(boolean x, String species, String name){
        isAlive=x;
        this.species= species;
        this.name = name;
        id=++count;

    }

    void setter(boolean isAlive, String species, String name)
        {
            this.isAlive = isAlive;
             this.species = species;
             this.name = name;

        }

    void getter()
        {
            System.out.println("The given life form is of the Species : " + species + " named as " + name);
        }

        void speices()
        {

        }

}
