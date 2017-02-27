import java.util.Scanner;

public class Shop {
	
	static MakeMoney makemoney = new MakeMoney();
	
	public Shop(){
		
	}
	
	public static void shop(){
		Scanner in = new Scanner(System.in);
		
		System.out.println("Welcome to the shop!");
		System.out.println("Currently, you have $" + Main.money  );
		System.out.println("Would you like to get more money?");
		
		if(in.nextLine().equals("y")){
			MakeMoney.makeMoney();
		}
		
		
	}
	

}
