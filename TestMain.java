import java.util.Scanner;

public class TestMain {

	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		
		Automobile truck = new Automobile (2016,"Dodge","Ram","Grey","Big Boy", 3);
		Automobile van = new Automobile (2016,"Toyota","Van","Green","Soccer Mom", 4);
		Automobile sportCar = new Automobile (2016,"Dodge","Dart","Red","Speedy", 6);
		
		System.out.println(truck);
		System.out.println(van);
		System.out.println(sportCar);
		
		Automobile userCar = new Automobile (2016,"Honda","Civic","Blue","Sally", 6);
		
		System.out.println("\nMake your own car..");
		System.out.print("Enter Car Year: ");
		userCar.setYear(input.nextInt());
		
		System.out.print("Enter Car Make: ");
		input.nextLine();
		userCar.setMake(input.nextLine());
		
		System.out.print("Enter Car Model: ");
		userCar.setModel(input.nextLine());
		
		System.out.print("Enter Car Color: ");
		userCar.setColor(input.nextLine());
		
		System.out.print("Enter Car Name: ");
		userCar.setName(input.nextLine());
		
		System.out.print("Enter Car Number of Gears: ");
		userCar.setNumOfGears(input.nextInt());
		
		System.out.println("\nYou created the follow Automobile:"+userCar);
		
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
