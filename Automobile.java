public class Automobile {
	
	private int year;
	private String make;
	private String model;
	private String color;
	private String name;
	private int numOfGears;
	private int currentGear=1;
	private int operatingCycle;
	
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
	public void setOperatingCycle(int cycle)
	{
		operatingCycle = cycle;
	}
	public int getOperatingCycle()
	{
		return operatingCycle;
	}
	public void drive()
	{
		if (currentGear < numOfGears)
		{
			currentGear++;
		}
	}
	public double getDistanceTravel()
	{
		double distanceTravel = getSpeed()/60;
		return distanceTravel;
	
	}
		
	public int getGear()
	{
		return currentGear;
	}
	public int getSpeed()
	{
		int speed = currentGear * 10;
		return speed;	
	}
	public String getPerformance()
	{
		return String.format("\nCurrent Gear: %d\nCurrent Speed: %d\nDistance Traveled: %.2f\n", getGear(), getSpeed(), getDistanceTravel());
	}
	
	public String toString()
	{
		return String.format("\n-Automobile Attributes-\nYear: %d\nMake: %s\nModel: %s\nColor: %s\nName: %s\nNumber of Gears: %d", 
				year, make, model, color, name, numOfGears);
	}
	

}
