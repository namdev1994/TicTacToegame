package tictactoegame;
import java.util.*;
public class TicTacToeGame {
	Scanner sc=new Scanner(System.in);
	char[]board=new char[10];//Array
	public char[] createBoard()   //method Implementation
	{
		for(int i=1;i<board.length;i++)
		{
			board[i]=' ';
		}
		return board;
	}
	public char playerChoice() //method creation
	{
		char player,computer;
		System.out.println("Enter player choice");
		player=sc.next().charAt(0); //Accepting letter from plyer	
		if(player=='x')
		{
			player='x';
			computer='0';
		}
		else if(player=='0')
		{
			player='0';
			computer='x';
		}
		return player;
	}
	public static void main(String[] args) {
		TicTacToeGame tictactoe=new TicTacToeGame();//object creation
		tictactoe.createBoard();//method call
		tictactoe.playerChoice(); // method call
	}

}
