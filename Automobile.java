public class Automobile {
	
	private int year;
	private String make;
	private String model;
	private String color;
	private String name;
	private int numOfGears;
	private int currentGear=1;
	private int operatingCycle=0;
	private int currentSpeed=0;
	private double distanceTraveled=0.0;

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
	
	public void drive(int opCycle)
	{
		setOperatingCycle(opCycle);
		if (currentGear < numOfGears)
		{
			currentGear++;
		}
		currentSpeed = currentGear*10;
		distanceTraveled= distanceTraveled + currentSpeed/60.0;
	}

	public double getDistanceTravel()
	{
		return distanceTraveled;
	
	}
		
	public int getGear()
	{
		return currentGear;
	}
	
	
	public String toString()
	{
		return String.format("\n-Automobile Attributes- Year: %d Make: %s Model: %s Color: %s Name: %s Gears: %d  Current OpSycle: %d Current Gear: %d Current Speed: %d Distance Traveled: %s", 
				year, make, model, color, name, numOfGears, operatingCycle, currentGear, currentSpeed, String.format("%1$,.2f", distanceTraveled)  );
 	}

}
