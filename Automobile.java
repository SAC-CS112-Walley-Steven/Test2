
public class Automobile {
	
	private int year;
	private String make;
	private String model;
	private String color;
	private String name;
	private int numOfGears;
	
	public Automobile (int year, String make, String model, String color, String name, int numOfGears)
	{
		this.year = year;
		this.make = make;
		this.model = model;
		this.color = color;
		this.name = name;
		this.numOfGears = numOfGears;
	}
	
	
	
	public String toString()
	{
		return String.format("\n-Automobile Attributes-\nYear: %d\nMake: %s\nModel: %s\nColor: %s\nName: %s\nNumber of Gears: %d", 
				year, make, model, color, name, numOfGears);
	}
	

}
