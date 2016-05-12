import java.util.Scanner;

public class TestMain {

	public static void main(String[] args) {
Scanner input = new Scanner (System.in);
		
		Automobile truck = new Automobile (2016,"Dodge","Ram","Grey","Big Boy", 3);
		Automobile van = new Automobile (2016,"Toyota","Van","Green","Soccer Mom", 4);
		Automobile sportCar = new Automobile (2016,"Dodge","Dart","Red","Speedy", 6);
		Automobile userCar = new Automobile (2016,"Honda","Civic","Blue","Sally", 5);
		
		System.out.println(truck);
		System.out.println(van);
		System.out.println(sportCar);
		System.out.println(userCar);
		
		
		System.out.print("\nEnter the number of dices to determine Operating Cycles: "); 
		int operatingCycle = Dice.Throw(input.nextInt());
		
		
		for (int count=1; count <= operatingCycle; count++)
		{
			System.out.println("Operating Cycles = " + count);
			truck.drive(count);
			van.drive(count);
			sportCar.drive(count);
			userCar.drive(count);
			
			System.out.println(truck);
			System.out.println(van);
			System.out.println(sportCar);
			System.out.println(userCar);
		}
				
	
	}

}
