package snake_ladder;

import java.util.Random;
import java.util.Scanner;


public class Newsnakeladder {

	public int dice1;
	public int dice2;
	public int positn1;
	public int positn2;
	public int ladders[]   = {4,8,15,21,28,51,66};
	public int laddersEnd[] = {14,31,97,42,84,68,87};
	public int snakes[]    = {17,24,55,62,71,88,99};
	public int snakesEnd[] = {7,1,13,29,19,67,6};
	public String name1;
	public String name2;
	public Scanner input = new Scanner (System.in);  
	public String play_again = "";
	  
	public int player_cnt = 0;

	public void slintialize ()
	{
		  player_cnt = 0;
		  name1 = get_player();
		  name2 = get_player();
		  dice1 = get_random();
		  dice2 = get_random();
		  game_start();
	}
	
	  public void game_start()
	  {
	    while (positn1 < 100 && positn2 < 100)
	    {
	      get_random();
	      positn1();
	      player1Ladders();
	      player1Snakes();
	      positn2();
	      player2Ladders();
	      player2Snakes();
	      winner();
	     
	    }
	  }
	  
	  public  int get_random()
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
	      System.out.println("THE WINNER IS " + name1 + ".");
	    }
	    if (positn2 == 100){
		      System.out.println("THE WINNER IS " + name2 + ".");
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
