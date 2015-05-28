package snake_ladder;

import java.util.Random;
import java.util.Scanner;

public class Newsnakeladder {

	int dice1,dice2,positn1,positn2,player_cnt;
	int[] ladders;
	int[] laddersEnd;
	int[] snakes;
	int[] snakesEnd;
	String name1,name2,play_again;
	Scanner input = new Scanner (System.in);
	
	public Newsnakeladder(int [] ladders ,int []laddersEnd ,int [] snakes ,int [] snakesEnd){
		
		this.ladders = ladders;
		this.laddersEnd = laddersEnd;
		this.snakes = snakes;
		this.snakesEnd = snakesEnd;
	}

	public static void main(String args[]){
		
		int [] ladders   = new int[] {4,8,15,21,28,51,66};
		int [] laddersEnd = new int[] {14,31,97,42,84,68,87};
		int [] snakes = new int[] {17,24,55,62,71,88,99};
		int [] snakesEnd = new int[] {7,1,13,29,19,67,6};
		Newsnakeladder sladder = new Newsnakeladder(ladders ,laddersEnd ,snakes , snakesEnd);
		sladder.game_start();
		
	}

	  public void game_start()
	  {
		    System.out.println("*******SNAKES AND LADDERS**********");
		    player_cnt = 0;
		    name1 = get_player();
		    name2 = get_player();
		  
		    while (positn1 < 100 && positn2 < 100)
		    {
		      dice1 = get_random();
		      positn1();
		      player1Ladders();
		      player1Snakes();
		      dice2 = get_random(); 
		      positn2();
		      player2Ladders();
		      player2Snakes();
		      winner();
		    }
		   
	  }
	  
	  public int get_random()
	  {
	    Random rand_num = new Random();
	    return 1 + rand_num.nextInt(12);
	  }
	  
	  public   String get_player()
	  {
		  player_cnt = player_cnt + 1;
		  System.out.println("Enter player " + player_cnt +" 's name");
	      String get_name = input.nextLine();
		  return  get_name;
	  }
	  	  
	  public  int positn1()
	  {
		  System.out.println(name1 + ": Press Enter to continue");	
		  input.nextLine();		  
		  
	    System.out.println(name1 + ": rolled " + dice1);
	    if (positn1 + dice1 <= 100){
	    	positn1 = positn1 + dice1;
	    } else 
	    { 
	    	System.out.println("To win game you require  " + (100 - positn1));
	    }
	    System.out.println(name1 + ": is at " + positn1);
	    return positn1;
	  }
	  
	  public  int positn2()
	  {
		  System.out.println(name2 + ": Press Enter to continue");		  
		  input.nextLine();
		 
	    System.out.println(name2 + ": rolled " + dice2);
	    if (positn2 + dice2 <= 100){
	    	positn2 = positn2 + dice2;
	    } else {
	    	System.out.println("To win game you require  " + (100 - positn2));
	    }
	    System.out.println(name2 + ":  is at " + positn2);
	    return positn2;
	  }
	  
	  
	  public  void winner()
	  {
	    if (positn1 == 100){
	      System.out.println("THE WINNER IS " + name1 + ". Game Over !!");
	    }
	    if (positn2 == 100){
		      System.out.println("THE WINNER IS " + name2 + ". Game Over !!");
	    }
	
	  }
	  
	  public  int player1Ladders() {
	    for (int i = 0; i < ladders.length; i++) {
	      if (positn1 == ladders[i]) {
	        System.out.println("You climbed ladder! you are on " + laddersEnd[i]);
	        positn1 = laddersEnd[i];
	      }
	    }
	    return positn1;
	  }
	  
	  public  int player1Snakes()
	  {
	    for(int i = 0; i < snakes.length; i++) {
	      if (positn1 == snakes[i]) {
	        System.out.println("You got Snake bit! you are on " + snakesEnd[i]);
	        positn1 = snakesEnd[i];
	      }
	    }
	    return positn1;
	  }
	  
	  public  int player2Ladders()
	  {
	    for(int i = 0; i < ladders.length; i++) {
	      if (positn2 == ladders[i]) {
	        System.out.println("You climbed ladder! you are on " + laddersEnd[i]);
	        positn2 = laddersEnd[i];
	      }
	    }
	    // invalid move
	    return positn2;
	  }
	  
	  public  int player2Snakes()
	  {
	    for(int i = 0; i < snakes.length; i++) {
	      if (positn2 == snakes[i]) {
	        System.out.println("You got Snake bit! you are on " + snakesEnd[i]);
	        positn2 = snakesEnd[i];
	      }
	    }
	    return positn2;
	  }
	  
	  
}
