import java.util.*;

public class tictactoe
{
    public static void main(String[] args)
    {
       char[][] board;
       int winLength;
       Scanner sc = new Scanner(System.in);

       System.out.println("choose a map size:");
       System.out.println("3");
       System.out.println("4");
       System.out.println("5");
       int choice = sc.nextInt();
       board = new char[choice][choice];
       
       
       System.out.println("choose a win length:");
       System.out.println("3");
       System.out.println("4");
       System.out.println("5");
       winLength = sc.nextInt();

       for(int r = 0; r < board.length; r++)
       {
            for(int c = 0; c < board.length; c++)
            {
                board[r][c] = ' ';
            }
       }

       printBoard(board);

       boolean Xwon = false;
       boolean Owon = false;
       int row, col;

       while(!Xwon && !Owon)
       {
            System.out.println("X's turn");
            System.out.println("enter row:");
            row = sc.nextInt();
            System.out.println("enter column:");
            col = sc.nextInt();
            
            board[row][col] = 'X';

            printBoard(board);
            
            Xwon = wonGame(board, winLength, 'X', row, col);
            if(Xwon)
            {
                displayWinner('X');
                break;
            }
            
            System.out.println("O's turn");
            
            System.out.println("enter row:");
            row = sc.nextInt();
            System.out.println("enter column:");
            col = sc.nextInt();
            
            board[row][col] = 'O';
            
            printBoard(board);
            Owon = wonGame(board, winLength, 'O', row, col);
            if(Owon)
            {
                displayWinner('O');
                break;
            }
       }

       sc.close();
        
    }

    private static void displayWinner(char player)
    {
        System.out.println(player + " is the winner!");
    }

    private static void printBoard(char[][] board)
    {
        String border = "* ".repeat(board.length+2);

        System.out.println(border);
        for(int r = 0; r < board.length; r++)
        {
            System.out.print("*" + " ");
            for(int c = 0; c < board.length; c++)
            {
                System.out.print(board[r][c] + " ");
            }
            System.out.print("*");
            
            System.out.print("\n");
        }
        System.out.println(border);
    }

    private static boolean wonGame(char[][] board, int winLength, char player, int pRow, int pCol)
    {
        for(int r = 0; r < board.length; r++)
        {
            for(int c = 0; c < board.length; c++)
            {
                if(board[r][c] == player)
                {
                    if(checkForWinningLine(board, winLength, player, r, c))
                    {
                        return true;
                    }
                }
            }
        }

        return false;
    }

    private static boolean checkForWinningLine(char[][] board, int winLength, char player, int pRow, int pCol)
    {
        int lineLength, r, c;

        //Check up
        r = pRow-1; c = pCol; lineLength = 1;
        // Keep iterating until win length is reached or line is no longer continuous
        while(lineLength < winLength && (continueLoop(board, player, r, c)))
        {
            r--; // move up
            lineLength++;
            if(lineLength == winLength)
                return true;
        }

        //Check down
        r = pRow+1; c = pCol; lineLength = 1;
        while(lineLength < winLength && (continueLoop(board, player, r, c)))
        {
            r++; // move down
            lineLength++; 
            if(lineLength == winLength)
                return true;
        }

        //Check right
        r = pRow; c = pCol+1; lineLength = 1;
        while(lineLength < winLength && (continueLoop(board, player, r, c)))
        {
            c++; // move right
            lineLength++;
            if(lineLength == winLength)
                return true;
        }

        //Check left
        r = pRow; c = pCol-1; lineLength = 1;
        while(lineLength < winLength)
        {
            c--; // move left
            lineLength++;
            if(lineLength == winLength)
                return true;
        }

        //Check down-right diagonal
        r = pRow+1; c = pCol+1; lineLength = 1;
        while(lineLength < winLength)
        {
            r++; // move down
            c++; // move right
            lineLength++;
            if(lineLength == winLength)
                return true;
        }

        //Check down-left diagonal
        r = pRow+1; c = pCol-1; lineLength = 1;
        while(lineLength < winLength && (continueLoop(board, player, r, c)))
        {
            r++; // move down
            c--; // move left
            lineLength++;
            if(lineLength == winLength) 
                return true;
        }

        //Check up-left diagonal
        r = pRow-1; c = pCol-1; lineLength = 1;
        while(lineLength < winLength && (continueLoop(board, player, r, c)))
        {
            r--; // move up
            c--; // move left
            lineLength++;
            if(lineLength == winLength) 
                return true;
        }

        //Check up-right diagonal
        r = pRow-1; c = pCol+1; lineLength = 1;
        while((lineLength < winLength) && (continueLoop(board, player, r, c)))
        {
            r--; // move up 
            c++; // move right
            lineLength++;
            if(lineLength == winLength) 
                return true;
        }

        return false; // if none of the checks succeeded then player hasn't won
    }

    // checks if line is continuous
    private static boolean continueLoop(char[][] board, char player, int r, int c)
    {
        try 
        {
            if(board[r][c] == player)
            {
                return true;
            }
            else 
            { 
                return false; 
            }
        } 
        catch (IndexOutOfBoundsException e) 
        {
            return false;
        }
    }

}