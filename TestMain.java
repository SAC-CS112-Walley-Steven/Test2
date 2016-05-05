import java.util.Scanner;

public class TestMain {

	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		
		int nextGear = 0;
		int gear = 0;
		
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
		System.out.println();
		
		System.out.print("Enter Car Make: ");
		userCar.setMake(input.nextLine());
		
		System.out.print("\nEnter Car Model: ");
		userCar.setModel(input.nextLine());
		
		System.out.print("\nEnter Car Color: ");
		userCar.setColor(input.nextLine());
		
		System.out.print("\nEnter Car Name: ");
		userCar.setName(input.nextLine());
		
		System.out.print("\nEnter Car Number of Gears: ");
		userCar.setNumOfGears(input.nextInt());
		
		System.out.println("\nYou created the follow Automobile:"+userCar);
		
		System.out.printf("\nPress 1 to take %s for a test drive: ", userCar.getName());
		
		do
		{
			gear++;
			Automobile.setGear(gear);
			
			System.out.print("\nEnter the number of dices: ");
			int numOfDices = input.nextInt(); 
			int diceNum = Dice.Throw(numOfDices);
		
			System.out.println("Dice number is " + diceNum);
			
			System.out.print("Press 1 to increase gears, or 2 to turn off car: ");
			nextGear = input.nextInt();
		
		}
		while (nextGear ==1);
	}

}
