package Views;

import Controllers.TicTacToeController;
import Models.Token;
import javafx.event.EventHandler;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import wheelsFX.users.Shapes.Rectangle;

/**
 * This class is the graphical representation of the TicTacToe board
 *
 * @author Tyler Sherry
 */
public class Board
{
    private TicTacToeController ticTacToeController;

    //Tic tac toe squares to be selected by players
    public Rectangle topLeft;
    public Rectangle topMiddle;
    public Rectangle topRight;
    public Rectangle midLeft;
    public Rectangle midMiddle;
    public Rectangle midRight;
    public Rectangle bottomLeft;
    public Rectangle bottomMiddle;
    public Rectangle bottomRight;

    public Board()
    {
        this.ticTacToeController = new TicTacToeController(this);

        //Visual representation of the top row of the TicTacToe board
        topLeft = new Rectangle(100, 100);
        topLeft.setColor(Color.BLACK);
        topMiddle = new Rectangle(160, 100);
        topMiddle.setColor(Color.BLACK);
        topRight = new Rectangle(220, 100);
        topRight.setColor(Color.BLACK);

        //Visual representation of the middle row of the TicTacToe board
        midLeft = new Rectangle(100, 160);
        midLeft.setColor(Color.BLACK);
        midMiddle = new Rectangle(160, 160);
        midMiddle.setColor(Color.BLACK);
        midRight = new Rectangle(220, 160);
        midRight.setColor(Color.BLACK);

        //Visual representation of the bottom row of the TicTacToe board
        bottomLeft = new Rectangle(100, 220);
        bottomLeft.setColor(Color.BLACK);;
        bottomMiddle = new Rectangle(160, 220);
        bottomMiddle.setColor(Color.BLACK);
        bottomRight = new Rectangle(220, 220);
        bottomRight.setColor(Color.BLACK);


        /*
        Board squares calling the setOnMouseClicked methods to call ticToeController logic
        to color the Tic Tac Toe board squares appropriately.
         */
        topLeft.setOnMouseClicked(new EventHandler<MouseEvent>()
        {
            @Override
            public void handle(MouseEvent event)
            {
                ticTacToeController.playerSelectedSquare(topLeft);
            }
        });

        topMiddle.setOnMouseClicked(new EventHandler<MouseEvent>()
        {
            @Override
            public void handle(MouseEvent event)
            {
                ticTacToeController.playerSelectedSquare(topMiddle);
            }
        });

        topRight.setOnMouseClicked(new EventHandler<MouseEvent>()
        {
            @Override
            public void handle(MouseEvent event)
            {
                ticTacToeController.playerSelectedSquare(topRight);
            }
        });

        midLeft.setOnMouseClicked(new EventHandler<MouseEvent>()
        {
            @Override
            public void handle(MouseEvent event)
            {
                ticTacToeController.playerSelectedSquare(midLeft);
            }
        });

        midMiddle.setOnMouseClicked(new EventHandler<MouseEvent>()
        {
            @Override
            public void handle(MouseEvent event)
            {
                ticTacToeController.playerSelectedSquare(midMiddle);
            }
        });

        midRight.setOnMouseClicked(new EventHandler<MouseEvent>()
        {
            @Override
            public void handle(MouseEvent event)
            {
                ticTacToeController.playerSelectedSquare(midRight);
            }
        });

        bottomLeft.setOnMouseClicked(new EventHandler<MouseEvent>()
        {
            @Override
            public void handle(MouseEvent event)
            {
                ticTacToeController.playerSelectedSquare(bottomLeft);
            }
        });

        bottomMiddle.setOnMouseClicked(new EventHandler<MouseEvent>()
        {
            @Override
            public void handle(MouseEvent event)
            {
                ticTacToeController.playerSelectedSquare(bottomMiddle);
            }
        });

        bottomRight.setOnMouseClicked(new EventHandler<MouseEvent>()
        {
            @Override
            public void handle(MouseEvent event)
            {
                ticTacToeController.playerSelectedSquare(bottomRight);
            }
        });
    }

    /**
     * Method to reset the board once a player has won or draw
     */
    public void resetBoard()
    {
        //Change all the rectangles back to black
        topLeft.setColor(Color.BLACK);
        topMiddle.setColor(Color.BLACK);
        topRight.setColor(Color.BLACK);

        midLeft.setColor(Color.BLACK);
        midMiddle.setColor(Color.BLACK);
        midRight.setColor(Color.BLACK);

        bottomLeft.setColor(Color.BLACK);
        bottomMiddle.setColor(Color.BLACK);
        bottomRight.setColor(Color.BLACK);
    }
}
