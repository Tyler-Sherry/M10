package Models;

/**
 * Token class to represent tokens being placed on the board by player 1 and player 2
 * when they claim Tic Tac Toe squares.
 *
 * @author Tyler Sherry
 */
public class Token
{
    private int value;

    public Token(int value)
    {
        this.value = value;
    }

    public int getValue()
    {
        return value;
    }
}
