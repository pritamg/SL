package snake_ladder;

public class Snaklad {

	public Snaklad(){		
		
		System.out.println("*******SNAKES AND LADDERS**********");
		Newsnakeladder ladder = new Newsnakeladder();
		ladder.slintialize();
		
	}
	
	public static void main(String args[]){
		
		Snaklad sln1 = new Snaklad();
		sln1.end();
		 
	}

	public void end() {
		System.out.println("Game Over !!");
	}
}
