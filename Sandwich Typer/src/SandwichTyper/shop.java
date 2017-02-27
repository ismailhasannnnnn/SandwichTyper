package SandwichTyper;
import java.util.Scanner;


public class shop {

	public static void shop() {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int money = buy.money;
		
		System.out.println("Welcome to the shop!");
		System.out.println("Here you will find all the ingredients you need to create your sandwich!");
		System.out.println("You currently have $" + money);
		System.out.println("What would you like to do? (buy or ingredients?)");
		if(scanner.next().equals("buy")){
			buy.buy();
		}
		else if(scanner.next().equals("ingredients")){
			ingredients.ingredients();
		}
		
		
		
		}
		
		
	}



