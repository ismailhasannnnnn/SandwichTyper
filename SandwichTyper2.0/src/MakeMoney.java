import java.util.Timer;

public class MakeMoney {

	
	public MakeMoney(){
		
	}
	
	public static void makeMoney(){
        boolean money = true;
	    System.out.println("Here, you will make money.");
        while(money){
		    Main.money = Main.money + 1;
		    System.out.println(Main.money);
            if(Main.money == 20){
                System.out.println(Main.money);
                Main.Intro();
            }
        }
	}
	
}
