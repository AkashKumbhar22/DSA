public class Caru{
		Enginu e1 = new Enginu(1250 , "Petrol");

	String model;
	String color;
	
	Caru(String model , String color)
	{
				System.out.println("This is the Caru() Constructor");
		this.model = model;
		this.color = color;	
	}
	
	public static void main(String[] args)
	{
		Caru c1 = new Caru("BMW" , "RED");
		System.out.println("This is Car class var " + c1.color);
		System.out.println("This is Car class var " + c1.e1.cc);
		
		
		
	}

}