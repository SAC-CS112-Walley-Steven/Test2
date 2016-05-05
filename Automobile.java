
public class Automobile {
	
	private int year;
	private String make;
	private String model;
	private String color;
	private String name;
	private int numOfGears;
	private int currentGear;
	
	public Automobile (int year, String make, String model, String color, String name, int numOfGears)
	{
		this.year = year;
		this.make = make;
		this.model = model;
		this.color = color;
		this.name = name;
		this.numOfGears = numOfGears;
	}
	public void setYear(int year)
	{
		this.year = year;
	}
	public void setMake(String make)
	{
		this.make = make;
	}
	public void setModel(String model)
	{
		this.model = model;
	}
	public void setColor(String color)
	{
		this.color = color;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public String getName()
	{
		return name;
	}
	public void setNumOfGears (int numOfGears)
	{
		this.numOfGears = numOfGears;
	}
	public int getNumOfGears()
	{
		return numOfGears;
	}
	
	public void setGear(int gear)
	{
		currentGear++;
	}
	public int getCurrentGear()
	{
		return currentGear;
	}
	
	public int getSpeed()
	{
		int maxSpeed = 0;
		if (currentGear ==1)
			maxSpeed = 10;
		else if (currentGear ==2)
			maxSpeed = 20;
		else if (currentGear ==3)
			maxSpeed = 30;
		else if (currentGear ==4)
			maxSpeed = 40;
		else if (currentGear ==5)
			maxSpeed = 50;
		else if (currentGear ==6)
			maxSpeed = 60;
		
		return maxSpeed;	
	}
	
	public String getCurrentStatus()
	{
		return String.format("\nCurrent Gear: %d\nCurrent Speed: %d", getCurrentGear(), getSpeed());
	}
	
	public String toString()
	{
		return String.format("\n-Automobile Attributes-\nYear: %d\nMake: %s\nModel: %s\nColor: %s\nName: %s\nNumber of Gears: %d", 
				year, make, model, color, name, numOfGears);
	}
	

}
