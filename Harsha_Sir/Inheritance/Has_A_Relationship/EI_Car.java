public class EI_Car{
	String model;
	String color;
	private EI_Engine engine;
	
	EI_Car(String model,String color)
	{
		this.color = color;
		this.model = model;
	}
	
	public EI_Engine getEngine()
	{
			return engine;
	}
	
	//IIB
	{
	engine = new EI_Engine(1200);
	}
	
}