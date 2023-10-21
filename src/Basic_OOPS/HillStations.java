package Basic_OOPS;

 /* 1.Create one superclass Hillstations and three subclasses Manali,Mussoorie,Gulmarg.Subclasses extend the superclass and override its location()and famousfor()method.call the location()and famousfor()method by the Parent classâ€™,i.e.Hillstations class.invoke the base class method at runtime */


public class HillStations {
    String location;
    String Speciality;

    HillStations(){
        new HillStations("Null","NA");

    }

    HillStations(String location, String Speciality){
        this.Speciality= Speciality;
        this.location= location;

    }
    void location(){
        System.out.println("This is the Base Class method ");

    }

    void famousFor(){
        this.Speciality= Speciality;
    }


    void setter(String location, String Speciality)
        {
            this.location=location;
            this.Speciality=Speciality;

        }

    void getter()
        {
            System.out.println(location + " ");
            System.out.print(Speciality);

        }
}
