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
			board[1]='x';
			break;
		case 2:
			board[2]='x';
			break;
		case 3:
			board[3]='x';
			break;
		case 4:
			board[4]='x';
			break;
		case 5:
			board[5]='x';
			break;
		case 6:
			board[6]='x';
			break;
		case 7:
			board[7]='x';
			break;
		case 8:
			board[8]='x';
			break;
		case 9:
			board[9]='x';
			break;
			default :
				System.out.println("Enetr valid place");
		}
	}
	public void checkDesiredLocationIsFree() //desired location method
	{
		System.out.println("Enter desired location ");
		int location=sc.nextInt(); //take input from user for desired location
		switch(location)
		{
		case 1:
		    if(board[1]==' ')
		    {
			board[1]='x';
		    }
		    else{
		        System.out.println("Enetr at valid place");
		    }
			break;
		case 2:
		    if(board[2]==' ')
		    {
			board[2]='x';
		    }
		    else{
		        System.out.println("Enetr at valid place");
		    }
			break;
		case 3:
		    if(board[3]==' ')
		    {
			board[3]='x';
		    }
		    else{
		        System.out.println("Enetr at valid place");
		    }
			break;
		case 4:
		    if(board[4]==' ')
		    {
			board[4]='x';
		    }
		    else{
		        System.out.println("Enetr at valid place");
		    }
			break;
		case 5:
		    if(board[5]==' ')
		    {
			board[5]='x';
		    }
		    else{
		        System.out.println("Enetr at valid place");
		    }
			break;
		case 6:
		    if(board[6]==' ')
		    {
			board[6]='x';
		    }
		    else{
		        System.out.println("Enetr at valid place");
		    }
			break;
		case 7:
		    if(board[7]==' ')
		    {
			board[7]='x';
		    }
		    else{
		        System.out.println("Enetr at valid place");
		    }
			break;
		case 8:
		    if(board[8]==' ')
		    {
			board[8]='x';
		    }
		    else{
		        System.out.println("Enetr at valid place");
		    }
			break;
		case 9:
		    if(board[9]==' ')
		    {
			board[9]='x';
		    }
		    else{
		        System.out.println("Enetr at valid place");
		    }
			default :
				System.out.println("Enetr valid place");
		}
		
	}
	
	public static void main(String[] args) {
		TicTacToeGame tictactoe=new TicTacToeGame();//object creation
		tictactoe.createBoard();//method call
		tictactoe.playerChoice(); // method call
		tictactoe.showBoard(); // showBoard Method call
		tictactoe.moveToDesiredLocation(); //desired Location method call
		tictactoe.checkDesiredLocationIsFree(); // method call to check Location is free 
		
	}

}
