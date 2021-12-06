package Controllers;

import Models.Token;
import Views.Board;
import javafx.scene.paint.Color;
import wheelsFX.users.Shapes.Rectangle;

import java.util.Locale;
import java.util.Scanner;

/**
 * TicTacToeController class handles all the gameplay logic for the TicTacToe game
 *
 * @author Tyler Sherry
 */

public class TicTacToeController
{
    private Board ticTacToeBoard;
    private Token[][] board;
    private Token playerOneToken = new Token(1);
    private Token playerTwoToken = new Token(0);

    private int turn = 1;
    private String userContinueGame;
    private boolean repeatQuestion = true;
    Scanner scanner = new Scanner(System.in);

    public TicTacToeController(Board ticTacToeBoard)
    {
        this.board = new Token [3][3];
        this.ticTacToeBoard = ticTacToeBoard;
    }

    public void playerSelectedSquare(Rectangle playerSelectedRectangle)
    {
        if(playerSelectedRectangle.getFillColor() == Color.BLACK)
        {
            if (turn % 2 == 0)
            {
                playerSelectedRectangle.setColor(Color.RED);
                //Enter logic about Player 2 token
                updatePlayerTwoBoard(playerSelectedRectangle);
                checkIfPlayerTwoHasWonTheGame();
                System.out.println("Player 1, make your next move.");
                updateTurn();
            }
            else
            {
                playerSelectedRectangle.setColor(Color.GREEN);
                //Enter logic about Player 1 token
                updatePlayerOneBoard(playerSelectedRectangle);
                //Check if Player 1 has won the game
                checkIfPlayerOneHasWonTheGame();
                System.out.println("Player 2, make your next move.");
                updateTurn();
            }
        }
        else
        {
            System.out.println("Square taken!  Please select another TicTacToe square.");
        }
    }

    //Update the game turn
    public void updateTurn()
    {
        ++turn;
        System.out.println("It is turn# " + turn);
    }

    //Ask the players if they want to play again
    public void doYouWantToPlayAgain()
    {
        while (repeatQuestion)
        {
            System.out.println("Would you like to restart the game?: y/n");
            userContinueGame = scanner.nextLine().trim().toLowerCase();

            switch (userContinueGame)
            {
                case "y":
                    ticTacToeBoard.resetBoard();
                    resetTokensOnBoard();
                    repeatQuestion = false;
                    break;

                case "n":
                    repeatQuestion = false;
                    System.out.println("Thank you for playing TicTacToe!");
                    break;

                default:
                    System.out.println("Invalid input - Please enter y/n");
                    repeatQuestion = true;
            }
        }
    }

    /**
     * Update the Tic Tac Toe board with Player 1's tokens.
     * @param playerOneSelectedRectangle
     */
    public void updatePlayerOneBoard(Rectangle playerOneSelectedRectangle)
    {
        if (playerOneSelectedRectangle.equals(ticTacToeBoard.topLeft))
        {
            System.out.println("Top left selected");
            //update board [][] with a Token
            board[0][0] = playerOneToken;
        }

        if (playerOneSelectedRectangle.equals(ticTacToeBoard.topMiddle))
        {
            System.out.println("Top middle selected");
            //update board [][] with a Token
            board[0][1] = playerOneToken;
        }

        if (playerOneSelectedRectangle.equals(ticTacToeBoard.topRight))
        {
            System.out.println("Top right selected");
            //update board [][] with a Token
            board[0][2] = playerOneToken;
        }

        if (playerOneSelectedRectangle.equals(ticTacToeBoard.midLeft))
        {
            System.out.println("Middle left selected");
            //update board [][] with a Token
            board[1][0] = playerOneToken;
        }

        if (playerOneSelectedRectangle.equals(ticTacToeBoard.midMiddle))
        {
            System.out.println("Middle middle selected");
            //update board [][] with a Token
            board[1][1] = playerOneToken;
        }

        if (playerOneSelectedRectangle.equals(ticTacToeBoard.midRight))
        {
            System.out.println("Middle right selected");
            //update board [][] with a Token
            board[1][2] = playerOneToken;
        }

        if (playerOneSelectedRectangle.equals(ticTacToeBoard.bottomLeft))
        {
            System.out.println("Bottom left selected");
            //update board [][] with a Token
            board[2][0] = playerOneToken;
        }

        if (playerOneSelectedRectangle.equals(ticTacToeBoard.bottomMiddle))
        {
            System.out.println("Bottom middle selected");
            //update board [][] with a Token
            board[2][1] = playerOneToken;
        }

        if (playerOneSelectedRectangle.equals(ticTacToeBoard.bottomRight))
        {
            System.out.println("Bottom right selected");
            //update board [][] with a Token
            board[2][2] = playerOneToken;
        }
    }

    /**
     * Update the Tic Tac Toe board with Player 2's tokens.
     * @param playerTwoSelectedRectangle
     */
    public void updatePlayerTwoBoard(Rectangle playerTwoSelectedRectangle)
    {
        if (playerTwoSelectedRectangle.equals(ticTacToeBoard.topLeft))
        {
            System.out.println("Top left selected");
            //update board [][] with a Token
            board[0][0] = playerTwoToken;
        }

        if (playerTwoSelectedRectangle.equals(ticTacToeBoard.topMiddle))
        {
            System.out.println("Top middle selected");
            //update board [][] with a Token
            board[0][1] = playerTwoToken;
        }

        if (playerTwoSelectedRectangle.equals(ticTacToeBoard.topRight))
        {
            System.out.println("Top right selected");
            //update board [][] with a Token
            board[0][2] = playerTwoToken;
        }

        if (playerTwoSelectedRectangle.equals(ticTacToeBoard.midLeft))
        {
            System.out.println("Middle left selected");
            //update board [][] with a Token
            board[1][0] = playerTwoToken;
        }

        if (playerTwoSelectedRectangle.equals(ticTacToeBoard.midMiddle))
        {
            System.out.println("Middle middle selected");
            //update board [][] with a Token
            board[1][1] = playerTwoToken;
        }

        if (playerTwoSelectedRectangle.equals(ticTacToeBoard.midRight))
        {
            System.out.println("Middle right selected");
            //update board [][] with a Token
            board[1][2] = playerTwoToken;
        }

        if (playerTwoSelectedRectangle.equals(ticTacToeBoard.bottomLeft))
        {
            System.out.println("Bottom left selected");
            //update board [][] with a Token
            board[2][0] = playerTwoToken;
        }

        if (playerTwoSelectedRectangle.equals(ticTacToeBoard.bottomMiddle))
        {
            System.out.println("Bottom middle selected");
            //update board [][] with a Token
            board[2][1] = playerTwoToken;
        }

        if (playerTwoSelectedRectangle.equals(ticTacToeBoard.bottomRight))
        {
            System.out.println("Bottom right selected");
            //update board [][] with a Token
            board[2][2] = playerTwoToken;
        }
    }

    /**
     * Method to check the board tokens to determine if Player 1 has won the game
     */
    public void checkIfPlayerOneHasWonTheGame()
    {
        //Check across top row
        if (board[0][0] != null && board[0][1] != null && board[0][2] != null)
        {
            if (board[0][0].getValue() == 1 && board[0][1].getValue() == 1 && board[0][2].getValue() == 1)
            {
                System.out.println("Player 1 has won");
                doYouWantToPlayAgain();
            }
        }

        //Check middle row
        if (board[1][0] != null && board[1][1] != null && board[1][2] != null)
        {
            if (board[1][0].getValue() == 1 && board[1][1].getValue() == 1 && board[1][2].getValue() == 1)
            {
                System.out.println("Player 1 has won");
                doYouWantToPlayAgain();
            }
        }

        //Check bottom row
        if (board[2][0] != null && board[2][1] != null && board[2][2] != null)
        {
            if (board[2][0].getValue() == 1 && board[2][1].getValue() == 1 && board[2][2].getValue() == 1)
            {
                System.out.println("Player 1 has won");
                doYouWantToPlayAgain();
            }
        }

        //Check first column
        if (board[0][0] != null && board[1][0] != null && board[2][0] != null)
        {
            if (board[0][0].getValue() == 1 && board[1][0].getValue() == 1 && board[2][0].getValue() == 1)
            {
                System.out.println("Player 1 has won");
                doYouWantToPlayAgain();
            }
        }

        //Check second column
        if (board[1][0] != null && board[1][1] != null && board[1][2] != null)
        {
            if (board[1][0].getValue() == 1 && board[1][1].getValue() == 1 && board[2][1].getValue() == 1)
            {
                System.out.println("Player 1 has won");
                doYouWantToPlayAgain();
            }
        }

        //Check third column
        if (board[2][0] != null && board[2][1] != null && board[2][2] != null)
        {
            if (board[2][0].getValue() == 1 && board[2][1].getValue() == 1 && board[2][2].getValue() == 1)
            {
                System.out.println("Player 1 has won");
                doYouWantToPlayAgain();
            }
        }

        //Diagonal left to right starting at top left
        if (board[0][0] != null && board[1][1] != null && board[2][2] != null)
        {
            if (board[0][0].getValue() == 1 && board[1][1].getValue() == 1 && board[2][2].getValue() == 1)
            {
                System.out.println("Player 1 has won");
                doYouWantToPlayAgain();
            }
        }

        //Diagonal left to right starting at bottom left
        if (board[2][0] != null && board[1][1] != null && board[0][2] != null)
        {
            if (board[2][0].getValue() == 1 && board[1][1].getValue() == 1 && board[0][2].getValue() == 1)
            {
                System.out.println("Player 1 has won");
                doYouWantToPlayAgain();
            }
        }
    }

    /**
     * Method to check the board tokens to determine if Player 2 has won the game
     */
    public void checkIfPlayerTwoHasWonTheGame()
    {
        //Check across top row
        if (board[0][0] != null && board[0][1] != null && board[0][2] != null)
        {
            if (board[0][0].getValue() == 0 && board[0][1].getValue() == 0 && board[0][2].getValue() == 0)
            {
                System.out.println("Player 2 has won");
                doYouWantToPlayAgain();
            }
        }

        //Check middle row
        if (board[1][0] != null && board[1][1] != null && board[1][2] != null)
        {
            if (board[1][0].getValue() == 0 && board[1][1].getValue() == 0 && board[1][2].getValue() == 0)
            {
                System.out.println("Player 2 has won");
                doYouWantToPlayAgain();
            }
        }

        //Check bottom row
        if (board[2][0] != null && board[2][1] != null && board[2][2] != null)
        {
            if (board[2][0].getValue() == 0 && board[2][1].getValue() == 0 && board[2][2].getValue() == 0)
            {
                System.out.println("Player 2 has won");
                doYouWantToPlayAgain();
            }
        }

        //Check first column
        if (board[0][0] != null && board[1][0] != null && board[2][0] != null)
        {
            if (board[0][0].getValue() == 0 && board[1][0].getValue() == 0 && board[2][0].getValue() == 0)
            {
                System.out.println("Player 2 has won");
                doYouWantToPlayAgain();
            }
        }

        //Check second column
        if (board[1][0] != null && board[1][1] != null && board[1][2] != null)
        {
            if (board[1][0].getValue() == 0 && board[1][1].getValue() == 0 && board[2][1].getValue() == 0)
            {
                System.out.println("Player 2 has won");
                doYouWantToPlayAgain();
            }
        }

        //Check third column
        if (board[2][0] != null && board[2][1] != null && board[2][2] != null)
        {
            if (board[2][0].getValue() == 0 && board[2][1].getValue() == 0 && board[2][2].getValue() == 0)
            {
                System.out.println("Player 2 has won");
                doYouWantToPlayAgain();
            }
        }

        //Diagonal left to right starting at top left
        if (board[0][0] != null && board[1][1] != null && board[2][2] != null)
        {
            if (board[0][0].getValue() == 0 && board[1][1].getValue() == 0 && board[2][2].getValue() == 0)
            {
                System.out.println("Player 2 has won");
                doYouWantToPlayAgain();
            }
        }

        //Diagonal left to right starting at bottom left
        if (board[2][0] != null && board[1][1] != null && board[0][2] != null)
        {
            if (board[2][0].getValue() == 0 && board[1][1].getValue() == 0 && board[0][2].getValue() == 0)
            {
                System.out.println("Player 2 has won");
                doYouWantToPlayAgain();
            }
        }
    }

    /**
     * Method to reset the board when a player has won
     */
    public void resetTokensOnBoard()
    {
        //Reset tokens in top row
        board[0][0] = null;
        board[0][1] = null;
        board[0][2] = null;

        //Reset tokens in middle row
        board[1][0] = null;
        board[1][1] = null;
        board[1][2] = null;

        //Reset tokens in bottom row
        board[2][0] = null;
        board[2][1] = null;
        board[2][2] = null;
    }
}
