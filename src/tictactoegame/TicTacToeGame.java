package tictactoegame;
import java.util.*;
public class TicTacToeGame {
	Scanner sc=new Scanner(System.in);
	char player,computer;
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
		System.out.println("Enter player choice");
		player=sc.next().charAt(0); //Accepting letter from plyer	
		if(player=='x')
		{
			player='x';
			computer='0';
		}
		else 
		{
			player='0';
			computer='x';
		}
		return player;
	}
	public void showBoard() //ShowBoard Method 
	{
		System.out.println(board[1]+"|"+board[2]+"|"+board[3]);
		System.out.println("-+-+-");
		System.out.println(board[4]+"|"+board[5]+"|"+board[6]);
		System.out.println("-+-+-");
		System.out.println(board[7]+"|"+board[8]+"|"+board[9]);	
	}
	public void moveToDesiredLocation() //desired location method
	{
		System.out.println("Enter desired location ");
		int location=sc.nextInt(); //take input from user for desired location
		switch(location)
		{
		case 1:
			board[1]=player;
			break;
		case 2:
			board[2]=player;
			break;
		case 3:
			board[3]=player;
			break;
		case 4:
			board[4]=player;
			break;
		case 5:
			board[5]=player;
			break;
		case 6:
			board[6]=player;
			break;
		case 7:
			board[7]=player;
			break;
		case 8:
			board[8]=player;
			break;
		case 9:
			board[9]=player;
			break;
			default :
				System.out.println("Enetr valid place");
		}
		showBoard();
	}
	
	public static void main(String[] args) {
		TicTacToeGame tictactoe=new TicTacToeGame();//object creation
		tictactoe.createBoard();//method call
		tictactoe.playerChoice(); // method call
		tictactoe.showBoard(); // showBoard Method call
		tictactoe.moveToDesiredLocation(); //desired Location method call
		
	}

}
