package tictactoegame;
import java.util.*;
public class TicTacToeGame {
	static Scanner sc=new Scanner(System.in);
	static int location,indexCount;
	static boolean userPlay;
	static char player,computer;
	static char[]board=new char[10];//Array
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
	public static void showBoard() //ShowBoard Method 
	{
		System.out.println(board[1]+"|"+board[2]+"|"+board[3]);
		System.out.println("-+-+-");
		System.out.println(board[4]+"|"+board[5]+"|"+board[6]);
		System.out.println("-+-+-");
		System.out.println(board[7]+"|"+board[8]+"|"+board[9]);	
	}
	public static void moveToDesiredLocation() //desired location method
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
	public static void makeUserMove() //desired location method
	{
		if (indexCount == 9)
		{
			System.out.println("played all turns");
			System.exit(0);
		}
		else
		{
			if (userPlay)
			{
				System.out.println("Enter the position between 1-9 number where you want to play" );
        		location=sc.nextInt(); //take input from user for desired location
        		if(board[location]==' ')
        		{
        			board[location]=player;
                    userPlay = false;
                    indexCount++;
                }
        		else
        		{
                	System.out.println("this position is not Empty");
                }
			}
			else
			{
				 Random randomNum = new Random();
	                int computerInput = randomNum.nextInt(9);
	                if (board[computerInput] == ' ') {
	                    board[computerInput] = computer;
	                    userPlay = true;
	                    indexCount++;
	                }
	                else
	    			{
	    				System.out.println("this position is not Empty");
	    			}
			}
		}
	}
	public static void checkToss(){
        System.out.println("Enter user choice for Toss");
        int tossCall=sc.nextInt();
        Random randomNum = new Random();
        int coinToss = randomNum.nextInt(2);
        if (tossCall== coinToss)
        {
        	System.out.println("User play first");
        	userPlay=true;
        }
        else
        {
            System.out.println("Computer play first");
            userPlay=false;
        }
    }
	public static void winnerOrTie()
	{
		if (board[1] == 'x' && board[2] == 'x' && board[3] == 'x' ||
                board[4] == 'x' && board[5] == 'x' && board[6] == 'x' ||
                board[7] == 'x' && board[8] == 'x' && board[9] == 'x' ||
                board[1] == 'x' && board[4] == 'x' && board[7] == 'x' ||
                board[2] == 'x' && board[5] == 'x' && board[8] == 'x' ||
                board[3] == 'x' && board[6] == 'x' && board[9] == 'x' ||
                board[1] == 'x' && board[5] == 'x' && board[9] == 'x' ||
                board[3] == 'x' && board[5] == 'x' && board[7] == 'x')
		{
            if (player== 'x')
            {
                System.out.println("Congrats you win the match.........");
                System.exit(0);
            }
            else
            {
                System.out.println("Computer wins the match..........");
                System.exit(0);
            }

        }
		else if(board[1] == 'o' && board[2] == 'o' && board[3] == 'o' ||
                board[4] == 'o' && board[5] == 'o' && board[6] == 'o' ||
                board[7] == 'o' && board[8] == 'o' && board[9] == 'o' ||
                board[1] == 'o' && board[4] == 'o' && board[7] == 'o' ||
                board[2] == 'o' && board[5] == 'o' && board[8] == 'o' ||
                board[3] == 'o' && board[6] == 'o' && board[9] == 'o' ||
                board[1] == 'o' && board[5] == 'o' && board[9] == 'o' ||
                board[3] == 'o' && board[5] == 'o' && board[7] == 'o')
		{
			 if (player == 'o')
	            {
	                System.out.println("Congrats you win the match.........");
	                System.exit(0);
	            }
	            else
	            {
	            	System.out.println("Computer wins the match..........");
	                System.exit(0);
	            }
	                
		}
		else if(indexCount == 9)
		{
            System.out.println("match is tie");
            System.exit(0);
        }
    }
	
	public static void main(String[] args) {
		TicTacToeGame tictactoe=new TicTacToeGame();//object creation
		tictactoe.createBoard();//method call
		tictactoe.playerChoice(); // method call
		tictactoe.showBoard(); // showBoard Method call
		tictactoe.checkToss();
		while(indexCount < 9)
		{
			tictactoe.makeUserMove();
			tictactoe.showBoard();
			tictactoe.winnerOrTie();
		}
		
	}

}
