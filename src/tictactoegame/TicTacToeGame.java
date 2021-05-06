package tictactoegame;
import java.util.*;
public class TicTacToeGame {
	Scanner sc=new Scanner(System.in);
	char player,computer;
	static int location;
	static boolean isUserPlay;
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
		/*if(player=='x')
		{
			player='x';
			computer='0';
		}
		else if(player=='0')
		{
			player='0';
			computer='x';
		}*/
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
	public int moveToDesiredLocation() //desired location method
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
		return location;
	}
	public int checkDesiredLocationIsFree() //desired location method
	{
		System.out.println("Enter desired location ");
		int location=sc.nextInt(); //take input from user for desired location
		switch(location)
		{
		case 1:
		    if(board[1]==' ')
		    {
			board[1]=player;
		    }
		    else{
		        System.out.println("Enetr at valid place");
		    }
			break;
		case 2:
		    if(board[2]==' ')
		    {
			board[2]=player;
		    }
		    else{
		        System.out.println("Enetr at valid place");
		    }
			break;
		case 3:
		    if(board[3]==' ')
		    {
			board[3]=player;
		    }
		    else{
		        System.out.println("Enetr at valid place");
		    }
			break;
		case 4:
		    if(board[4]==' ')
		    {
			board[4]=player;
		    }
		    else{
		        System.out.println("Enetr at valid place");
		    }
			break;
		case 5:
		    if(board[5]==' ')
		    {
			board[5]=player;
		    }
		    else{
		        System.out.println("Enetr at valid place");
		    }
			break;
		case 6:
		    if(board[6]==' ')
		    {
			board[6]=player;
		    }
		    else{
		        System.out.println("Enetr at valid place");
		    }
			break;
		case 7:
		    if(board[7]==' ')
		    {
			board[7]=player;
		    }
		    else{
		        System.out.println("Enetr at valid place");
		    }
			break;
		case 8:
		    if(board[8]==' ')
		    {
			board[8]=player;
		    }
		    else{
		        System.out.println("Enetr at valid place");
		    }
			break;
		case 9:
		    if(board[9]==' ')
		    {
			board[9]=player;
		    }
		    else{
		        System.out.println("Enetr at valid place");
		    }
			default :
				System.out.println("Enetr valid place");
		}
		
		showBoard();
		return location;
		}
		
	public int checkToss() //checkToss to who play first
	{
	    Random random=new Random();
	    int checktoss=random.nextInt(2)+1;
	    if(checktoss==1)
	    {
	        System.out.println("User Start First");
	        isUserPlay=true;  
	    }
	    else{
	        System.out.println("Computer Start First");
	    }
	    return checktoss;
	}
	
	public static void main(String[] args) {
		TicTacToeGame tictactoe=new TicTacToeGame();//object creation
		tictactoe.createBoard();//method call
		tictactoe.playerChoice(); // method call
		tictactoe.showBoard(); // showBoard Method call
		tictactoe.moveToDesiredLocation(); //desired Location method call
		while(location<10)
		{
		tictactoe.checkDesiredLocationIsFree(); //desired location method
		}
	}
}

