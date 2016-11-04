package SandwichTyper;
import java.util.Scanner;

public class buy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public static void buy() {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int money = 0;
		int peanutbutter = 0;
		int jelly = 0;
		int bread = 0;
		
		System.out.println("You currently have $" + money);
		System.out.println("In order to get money, you need to go into money making mode. Would you like to do so?");
		if(scanner.next().equals("y")){
			money();
		}
	}
	
	public static void money(){
		int money = 0;
		System.out.println("In this mode, you will be able to make money every second. It's pretty great. Let's get started!");
		boolean afk = true;
		while(afk == true);
		money = money + 1;
		
		
	}

}
