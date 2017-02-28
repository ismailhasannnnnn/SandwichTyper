import java.util.Scanner;

public class Main{
	
	 static Shop shop = new Shop();
	
	public static double money = 10;
	public static int cookies = 10;
	
	public void SandwichTyper(){
		
	}
	
	public static void main(String[] args){
		Intro();
	}
	
	public static void Intro(){
		
		Scanner scanner = new Scanner(System.in);
		
		//Introduction to the game.
		char again = 'y';
		while(again == 'y'){
		System.out.println("Welcome to Sandwich Typer!");
		System.out.println("In this game, you will be able to make the sandwich of your liking!");
		System.out.println("As of right now, you have " + cookies + " Cookies, and $" + money + "!");
		System.out.println("Would you like to make money, or choose a sandwich? (1 or 2?)");
		
		
		
		//This is where the real fun begins.
		switch(scanner.next()){
			
		case "pbj":
		System.out.println("You have chosen to make a Peanut Butter and Jelly sandwich.");
		System.out.println("You will need to visit the shop in order to obtain the ingredients to make the sandwich.");
		System.out.println("Would you like to visit the shop? (y/n)");
			if(scanner.next().equals("y")){
				shop.shop();
			}
			if(scanner.next().equals("n")){
				break;
			
			}
			System.out.println("Thanks for playin!");
			
		
			
		}
		}
	}
	
}

