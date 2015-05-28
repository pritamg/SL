package snake_ladder;

import static org.junit.Assert.*;
import java.util.Scanner;
import org.junit.Test;

public class Newsnakeladdertest {

 
	String nameT1,nameT2,rollT = "";
	int positnT1 = 0;
	int positnT2 = 0;

	int dice1T,dice2T = 0;
	int ladders1[]   = {4,8,15,21,28,51,66};
	int laddersEnd1[] = {14,31,97,42,84,68,87};
	int snakes1[]    = {17,24,55,62,71,88,99};
	int snakesEnd1[] = {7,1,13,29,19,67,6};
	
	Scanner input = new Scanner (System.in);
	
	Newsnakeladder snake_ladder = new Newsnakeladder(ladders1 ,laddersEnd1 ,snakes1 ,snakesEnd1);
	
	@Test
	public void test_get_player_1() {
		snake_ladder.input = new Scanner ("Test1");
		snake_ladder.player_cnt = 0;
		 
		String nameT11 = snake_ladder.get_player();
		
		assertNotNull(nameT11);
		assertEquals("Test1",nameT11);
		
	}
	
	@Test
	public void test_get_player_2() {
		snake_ladder.input = new Scanner ("Test2");
		snake_ladder.player_cnt = 1;
		String nameT22 = snake_ladder.get_player();

		assertNotNull(nameT22);
		assertEquals("Test2",nameT22);
		
	}

	@Test
	public void text_getrandom_1() {
		dice1T = snake_ladder.get_random();
		
		assertTrue(dice1T>0 && dice1T<13);

	}

	@Test
	public void text_getrandom_2() {

		dice2T = snake_ladder.get_random();
		
		assertTrue(dice2T>0 && dice2T<13);

	}
	
	@Test
	public void text_positn1(){
		snake_ladder.input = new Scanner ("\n");
		snake_ladder.name1 = "Test1";
		snake_ladder.positn1 = 97;
		snake_ladder.dice1 = 3;
		int new_pos11 = snake_ladder.positn1();
		assertEquals(new_pos11,100);

	}
	
	@Test
	public void text_positn1_1(){
		snake_ladder.input = new Scanner ("\n");
		snake_ladder.name1 = "Test1";
		snake_ladder.positn1 = 97;
		snake_ladder.dice1 = 4;
		int new_pos12 = snake_ladder.positn1();
		assertEquals(new_pos12,97);
	}
	
	@Test
	public void text_positn2(){
		snake_ladder.input = new Scanner ("\n");
		snake_ladder.name2 = "Test2";
		snake_ladder.positn2 = 97;
		snake_ladder.dice2 = 3;
		int new_pos21 = snake_ladder.positn2();
		assertEquals(new_pos21,100);
				
	}

	@Test
	public void text_positn2_1(){
		snake_ladder.input = new Scanner ("\n");
		snake_ladder.name2 = "Test2";
		snake_ladder.positn2 = 97;
		snake_ladder.dice2 = 8;
		int new_pos22 = snake_ladder.positn2();
		assertEquals(new_pos22,97);
				
	}
	
	@Test
	public void test_player1Ladders(){
		snake_ladder.ladders = ladders1;
		snake_ladder.laddersEnd = laddersEnd1;
		snake_ladder.positn1 = 4;
		int newPos = snake_ladder.player1Ladders();
		assertEquals(14, newPos);
	}

	@Test
	public void test_player2Ladders(){
		snake_ladder.ladders = ladders1;
		snake_ladder.laddersEnd = laddersEnd1;
		snake_ladder.positn2 = 15;
		int newPos = snake_ladder.player2Ladders();
		assertEquals(97, newPos);
	}
	
	@Test
	public void test_player1Snakes(){
		snake_ladder.snakes = snakes1;
		snake_ladder.snakesEnd = snakesEnd1;
		snake_ladder.positn1 = 17;
		int newPos = snake_ladder.player1Snakes();
		assertEquals(7, newPos);
	}
	
	@Test
	public void test_player2Snakes(){
		snake_ladder.snakes = snakes1;
		snake_ladder.snakesEnd = snakesEnd1;
		snake_ladder.positn2 = 24;
		int newPos = snake_ladder.player2Snakes();
		assertEquals(1, newPos);
	}
	
	@Test
	public void test_winner_1(){

		snake_ladder.name1 = "Test1";
		snake_ladder.positn2 = 99;
		snake_ladder.positn1 = 100;
		snake_ladder.winner();
		
	}
	
	@Test
	public void test_winner_2(){
		
		snake_ladder.name2 = "Test2";
		snake_ladder.positn1 = 99;
		snake_ladder.positn2 = 100;
		snake_ladder.winner();
		
	}
	
}
