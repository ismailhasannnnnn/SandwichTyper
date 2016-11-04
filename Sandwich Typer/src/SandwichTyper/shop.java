package SandwichTyper;
import java.util.Scanner;

public class shop {

	public static void shop() {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Welcome to the shop!");
		System.out.println("Here you will find all the ingredients you need to create your sandwich!");
		System.out.println("What would you like to do? (buy or ingredients?)");
		if(scanner.next().equals("buy")){
			buy.buy();
		}else{
			System.exit(0);
		}
		System.out.println("What type of sandwich are you trying to make?");
		String sandwichchoice = scanner.next();
		
		switch(sandwichchoice){
		
		case "pbj": sandwichchoice.equals("pbj");
		System.out.println("Are you sure you'd like to choose PBJ?");
		if(scanner.next().equals("y")){
			System.out.println("The ingredients you will need to make a Peanut Butter and Jelly Sandwich are:");
			System.out.println("Peanut Butter");
			System.out.println("Jelly");
			System.out.println("Bread");
			
		}
		}
		
		
	}


}


