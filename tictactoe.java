import java.util.*;

public class tictactoe
{
    public static void main(String[] args)
    {
       char[][] board;
       int winLength;
       Scanner sc = new Scanner(System.in);

       System.out.println("choose a map size:");
       System.out.println("3x3");
       System.out.println("4x4");
       System.out.println("5x5");
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

       doGame(board, winLength, sc);

       sc.close();
        
    }







    private static void doGame(char[][] board, int winLength, Scanner sc) 
    {
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







    private static boolean wonGame(char[][] board, 
                            int winLength, char player, int pRow, int pCol)
    {
        boolean won = false;
        // Go theought every board element
        for(int r = 0; r < board.length; r++)
        {
            for(int c = 0; c < board.length; c++)
            {
                if(board[r][c] == player)
                {
                    // method that checks all directions for a winning line
                    if(checkForWinningLine(board, winLength, player, r, c))
                    {
                        won = true;
                    }
                }
            }
        }
        // No winning line was found
        return won;
    }







    private static boolean checkForWinningLine(char[][] board, 
                            int winLength, char player, int pRow, int pCol)
    {
        int lineLength, r, c;
        boolean won = false;

        //Check up
        r = pRow - 1; c = pCol; lineLength = 1;

        // iterate until win length is reached or line is no longer continuous
        while((lineLength < winLength) && (continueLoop(board, player, r, c)))
        {
            r--; // move up
            lineLength++;
            if(lineLength == winLength)
                won =  true;
        }

        //Check down
        r = pRow + 1; c = pCol; lineLength = 1;
        while((lineLength < winLength) && (continueLoop(board, player, r, c)))
        {
            r++; // move down
            lineLength++; 
            if(lineLength == winLength)
                won =  true;
        }

        //Check right
        r = pRow; c = pCol + 1; lineLength = 1;
        while((lineLength < winLength) && (continueLoop(board, player, r, c)))
        {
            c++; // move right
            lineLength++;
            if(lineLength == winLength)
                won =  true;
        }

        //Check left
        r = pRow; c = pCol - 1; lineLength = 1;
        while((lineLength < winLength) && (continueLoop(board, player, r, c)))
        {
            c--; // move left
            lineLength++;
            if(lineLength == winLength)
                won =  true;
        }

        //Check down-right diagonal
        r = pRow + 1; c = pCol + 1; lineLength = 1;
        while((lineLength < winLength) && (continueLoop(board, player, r, c)))
        {
            r++; // move down
            c++; // move right
            lineLength++;
            if(lineLength == winLength)
                won =  true;
        }

        //Check down-left diagonal
        r = pRow + 1; c = pCol - 1; lineLength = 1;
        while((lineLength < winLength) && (continueLoop(board, player, r, c)))
        {
            r++; // move down
            c--; // move left
            lineLength++;
            if(lineLength == winLength) 
                won =  true;
        }

        //Check up-left diagonal
        r = pRow - 1; c = pCol - 1; lineLength = 1;
        while((lineLength < winLength) && (continueLoop(board, player, r, c)))
        {
            r--; // move up
            c--; // move left
            lineLength++;
            if(lineLength == winLength) 
                won =  true;
        }

        //Check up-right diagonal
        r = pRow - 1; c = pCol + 1; lineLength = 1;
        while((lineLength < winLength) && (continueLoop(board, player, r, c)))
        {
            r--; // move up 
            c++; // move right
            lineLength++;
            if(lineLength == winLength) 
                won =  true;
        }

        // if none of the checks succeeded then won was never reassigned
        return won; 
    }







    // checks if line is continuous
    private static boolean continueLoop(char[][] board, 
                                            char player, int r, int c)
    {
        boolean continuous = false;
        try 
        {
            if(board[r][c] == player)
            {
                continuous =  true;
            }
            else 
            { 
                continuous = false; 
            }
        } 
        // If the check can't move further in the line direction
        catch (IndexOutOfBoundsException e)
        { 
            // Then they haven't won
            continuous = false;
        }

        return continuous;
    }
}