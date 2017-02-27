
public class MakeMoney {

	
	public MakeMoney(){
		
	}
	
	public static void makeMoney(){
		System.out.println("Here, you will make money.");
		if(Main.money <= 10){
			Main.money = Main.money + 10;
			System.out.println(Main.money);
			Main.Intro();
		}
	}
	
}
