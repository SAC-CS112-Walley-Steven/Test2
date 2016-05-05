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
		
		System.out.print("\nEnter the number of dices: ");
		int numOfDices = input.nextInt(); 
		int diceNum = Dice.Throw(numOfDices);
		
		System.out.println("Dice number is " + diceNum);
		
	}

}
