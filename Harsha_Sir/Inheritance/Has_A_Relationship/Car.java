public class Car{
    String Model;
    String fuelType;
    String color ;
    Engine engine;

    Car(String Model,String fuelType,String color){
        System.out.println("Parent Class");
        this.Model = Model;
        this.fuelType = fuelType;
        this.color = color;
    }

public static void main(String[] args)
{
	    Engine e1 = new Engine(350 , 2);
		System.out.println(e1.cc);
	
}
}