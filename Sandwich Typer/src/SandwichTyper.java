import java.util.*;

public class SandwichTyper {
	

	private static final String[] String = null;


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		
		//Introduction to the game.
		System.out.println("Welcome to Sandwich Typer!");
		System.out.println("In this game, you will be able to make the sandwich of your liking!");
		System.out.println("What sandwich would you like to make?");
		String sandwichchoice = scanner.next();
		
		
		//This is where the real fun begins.
		switch(sandwichchoice){
			
		case "pbj": sandwichchoice = "pbj";
		System.out.println("You have chosen to make a Peanut Butter and Jelly sandwich.");
		System.out.println("You will need to visit the shop in order to obtain the ingredients to make the sandwich.");
		System.out.println("Would you like to visit the shop? (y/n)");
		}
			if(scanner.next().equals("y")){
				shop.shop();
			}
			else{
				System.out.println("Thanks!");
			}
			
			
		}	
		
}
