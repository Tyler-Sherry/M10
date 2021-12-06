import Views.Board;
import wheelsFX.users.Frame.Frame;

/**
 * Main driver for the TicTacToe game
 *
 * @author Tyler Sherry
 */
public class TicTacToe
{
    public static void main(String[] args)
    {
        Board b = new Board();
        System.out.println("Welcome to TicTacToe!");
        System.out.println("Player 1: Enter your first move");
        Frame.createFrame();
    }
}
