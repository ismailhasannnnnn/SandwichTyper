package SandwichTyper;
import java.util.Scanner;

public class buy {
	public static int money = 0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public static void buy() {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int peanutbutter = 0;
		int jelly = 0;
		int bread = 0;
		
		System.out.println("You currently have $" + money);
		if(money == 0){
			System.out.println("In order to get money, you need to go into money making mode. Would you like to do so?");
			if(scanner.next().equals("y")){
				money();
			}else{
				System.out.println("Well you're done for now!");
			}
		
		}
	}
	
	
	public static void money(){
		System.out.println("In this mode, you will be able to make money every second. It's pretty great. Let's get started!");
		boolean afk = true;
		while (afk == true){
			money = money + 1;
			try {
				Thread.sleep(0);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("$"+money);
			if(money == 10){
				shop.shop();
			}
			
		}
		
		
	}

}
