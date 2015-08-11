/*
 * Raymond Luu
 * 
 * TCSS 305 - Winter 2012
 * Tetris Project - Part 2
 */
package board;

import java.util.Observable;
import java.util.Random;

import pieces.TetrisPiece;
import pieces.TetrisPieceI;
import pieces.TetrisPieceJ;
import pieces.TetrisPieceL;
import pieces.TetrisPieceO;
import pieces.TetrisPieceS;
import pieces.TetrisPieceT;
import pieces.TetrisPieceZ;

/**
 * Object class for tetris board.
 * 
 * @author Raymond Luu
 * @version February 13 2012
 */
public class Board extends Observable
{
  
  /**
   * Easy switch for me to change from creating random pieces and just an I piece.
   */
  private static final Boolean EASY_SWITCH = false;
  
  /**
   * Constant for board width.
   */
  private static final int WIDTH = 10;
  
  /**
   * Constant for board height. Board is 20 but 5 extra lines at top to hide piece at start.
   */
  private static final int HEIGHT = 25;
  
  /**
   * Constant for top middle of board.
   */
  private static final int MIDDLE = 5;
  
  /**
   * Constant for top threshold.
   */
  private static final int TOP_THRESHOLD = 5;
  
  /**
   * Constant for bottom threshold.
   */
  private static final int BOTTOM_THRESHOLD = 24;
  
  /**
   * Constant for right side threshold.
   */
  private static final int RIGHT_THRESHOLD = 9;
  
  /**
   * Constant for number of blocks in a row.
   */
  private static final int BLOCKS_IN_ROW = 10;
  
  /**
   * Constant for selecting a random piece.
   */
  private static final int RANDOM_PIECE = 7;
  
  /**
   * Lines left.
   */
  private static final int LINES_LEFT = 10;
  
  /**
   * Tetris board.
   */
  private final int[][] my_board;
  
  /**
   * Current piece.
   */
  private TetrisPiece my_current_piece;
  
  /**
   * Next piece.
   */
  private TetrisPiece my_next_piece;
  
  /**
   * Boolean for checking if a piece has collided with another or bottom of board.
   */
  private Boolean my_collision_check = false;
  
  /**
   * Lines to clear.
   */
  private int my_lines_to_clear;
  
  /**
   * Constructs Tetris Board.
   */
  public Board()
  {
    super();
    my_board = new int[HEIGHT][WIDTH];
    my_lines_to_clear = LINES_LEFT;
    
    if (EASY_SWITCH)
    {
      my_current_piece = new TetrisPieceI(0, MIDDLE);
      my_next_piece = new TetrisPieceI(0, MIDDLE);
    }
    else
    {
      my_current_piece = createNewRandomPiece();
      my_next_piece = createNewRandomPiece();
    }
    
    addPieceToBoard();
  }
  
  /**
   * Method to move pieces left on the board.
   */
  public void moveLeft()
  {
    if (!collide(my_current_piece.moveLeft()))
    {
      for (int i = 0; i < my_board.length; i++)
      {
        for (int j = 0; j < my_board[i].length; j++)
        {
          if (my_board[i][j] == 1)
          {
            my_board[i][j] = 0;
          }
        }
      }
      my_current_piece = my_current_piece.moveLeft();
      for (int i = 0; i < my_current_piece.getPieces().length; i++)
      {
        for (int j = 0; j < my_current_piece.getPieces()[i].length; j++)
        {
          if (my_current_piece.getPieces()[i][j] == 1)
          {
            my_board[i + my_current_piece.getX()][j + my_current_piece.getY()] = 
              my_current_piece.getPieces()[i][j];
          }
        }
      }
      setChanged();
      notifyObservers(my_board);
    }
  }
  
  /**
   * Method to move pieces right on the board.
   */
  public void moveRight()
  {
    if (!collide(my_current_piece.moveRight()))
    {
      for (int i = 0; i < my_board.length; i++)
      {
        for (int j = 0; j < my_board[i].length; j++)
        {
          if (my_board[i][j] == 1)
          {
            my_board[i][j] = 0;
          }
        }
      }

      my_current_piece = my_current_piece.moveRight();
      for (int i = 0; i < my_current_piece.getPieces().length; i++)
      {
        for (int j = 0; j < my_current_piece.getPieces()[i].length; j++)
        {
          if (my_current_piece.getPieces()[i][j] == 1)
          {
            my_board[i + my_current_piece.getX()][j + my_current_piece.getY()] =
              my_current_piece.getPieces()[i][j];
          }
        }
      }
      setChanged();
      notifyObservers(my_board);
    }
  }
  
  /**
   * Method to move pieces down on the board.
   */
  public void moveDown()
  {
    if (collide(my_current_piece.moveDown()))
    {
      if (my_collision_check)
      {
        clearLines();
        my_current_piece = my_next_piece;
        my_next_piece = createNewRandomPiece();
        addPieceToBoard();
        my_collision_check = false;
      }
      setChanged();
      notifyObservers(my_next_piece.getPieces());
    }
    else
    {
      for (int i = 0; i < my_board.length; i++)
      {
        for (int j = 0; j < my_board[i].length; j++)
        {
          if (my_board[i][j] == 1)
          {
            my_board[i][j] = 0;
          }
        }
      }

      my_current_piece = my_current_piece.moveDown();
      for (int i = 0; i < my_current_piece.getPieces().length; i++)
      {
        for (int j = 0; j < my_current_piece.getPieces()[i].length; j++)
        {
          if (my_current_piece.getPieces()[i][j] == 1)
          {
            my_board[i + my_current_piece.getX()][j + my_current_piece.getY()] =
                my_current_piece.getPieces()[i][j];
          }
        }
      }
      setChanged();
      notifyObservers(my_board);
    }
  }
  
  /**
   * Method to rotate pieces on the board.
   */
  public void rotate()
  {
    if (!collide(my_current_piece.rotate()))
    {
      for (int i = 0; i < my_board.length; i++)
      {
        for (int j = 0; j < my_board[i].length; j++)
        {
          if (my_board[i][j] == 1)
          {
            my_board[i][j] = 0;
          }
        }
      }

      my_current_piece = my_current_piece.rotate();
      for (int i = 0; i < my_current_piece.getPieces().length; i++)
      {
        for (int j = 0; j < my_current_piece.getPieces()[i].length; j++)
        {
          if (my_current_piece.getPieces()[i][j] == 1)
          {
            my_board[i + my_current_piece.getX()][j + my_current_piece.getY()] =
                my_current_piece.getPieces()[i][j];
          }
        }
      }
      setChanged();
      notifyObservers(my_board);
    }
  }
  
  /**
   * Hard drop method.
   */
  public void hardDrop()
  {
    while (!collide(my_current_piece.moveDown()))
    {
      moveDown();
    }
    if (my_collision_check)
    {
      clearLines();
      my_current_piece = my_next_piece;
      my_next_piece = createNewRandomPiece();
      addPieceToBoard();
      setChanged();
      notifyObservers(my_next_piece.getPieces());
    }
    my_collision_check = false;
    setChanged();
    notifyObservers(my_board);
  }
  
  /**
   * Method to check collision.
   * 
   * @param the_piece the next position piece.
   * @return true or false for collision.
   */
  public Boolean collide(final TetrisPiece the_piece)
  {
    Boolean valid = false;
    for (int i = 0; i < the_piece.getPieces().length; i++)
    {
      for (int j = 0; j < the_piece.getPieces()[i].length; j++)
      {
        if (the_piece.getPieces()[i][j] == 1)
        {
          //boundary checks
          if (i + the_piece.getX() > BOTTOM_THRESHOLD)
          {
            valid = true;
            collideHelper1();
            my_collision_check = true;
          }
          else if (j + the_piece.getY() > RIGHT_THRESHOLD)
          {
            valid = true;
          }
          else if (j + the_piece.getY() < 0)
          {
            valid = true;
          }
          else
          {
            //checks if the bottom of current piece touches the top of another.
            if (my_board[i + the_piece.getX()][j + my_current_piece.getY()] == 2)
            {
              valid = true;
              collideHelper1();
              my_collision_check = true;
            }
            //checks if the piece touches another piece.
            else if (my_board[i + the_piece.getX()][j + the_piece.getY()] == 2)
            {
              valid = true;
            }
          }
        }
      }
    }
    return valid;
  }
  
  /**
   * Collision helper method to freeze pieces onto board.
   */
  private void collideHelper1()
  {
    //freeze piece with board
    for (int i = 0; i < my_current_piece.getPieces().length; i++)
    {
      for (int j = 0; j < my_current_piece.getPieces().length; j++)
      {
        if (my_current_piece.getPieces()[i][j] == 1 &&
            my_board[i + my_current_piece.getX()][j + my_current_piece.getY()] == 1)
        {
          my_board[i + my_current_piece.getX()][j + my_current_piece.getY()] = 2;
        }
      }
    }
  }
  
  /**
   * Tick method for board.
   */
  public void step()
  {
    moveDown();
    
    if (my_collision_check)
    {
      clearLines();
      my_current_piece = my_next_piece;
      my_next_piece = createNewRandomPiece();
      addPieceToBoard();
    }
    my_collision_check = false;
    setChanged();
    notifyObservers(my_next_piece.getPieces());
    setChanged();
    notifyObservers(my_board);
  }
  
  /**
   * Checks to see if game is over.
   * 
   * @return true of game is over.
   */
  public boolean gameOver()
  {
    boolean valid = false;
    
    for (int i = 0; i < TOP_THRESHOLD; i++)
    {
      for (int j = 0; j < my_board[i].length; j++)
      {
        if (my_board[i][j] == 2)
        {
          valid = true;
        }
      }
    }
    
    return valid;
  }
  
  /**
   * Method to clear lines(used by step method).
   */
  private void clearLines()
  {
    for (int i = 0; i <= BOTTOM_THRESHOLD; i++)
    {
      int valid_blocks = 0;
      for (int j = 0; j < my_board[i].length; j++)
      {
        if (my_board[i][j] == 2)
        {
          valid_blocks++;
        }
      }
      if (valid_blocks == BLOCKS_IN_ROW)
      {
        my_lines_to_clear--;
        setChanged();
        notifyObservers(my_lines_to_clear);
        if (my_lines_to_clear == 0)
        {
          my_lines_to_clear = LINES_LEFT;
        }
        
        for (int k = 0; k < my_board[i].length; k++)
        {
          my_board[i][k] = 0;
        }
        moveLinesDown(i);
      }
    }
  }
  
  /**
   * Method to move lines down(used by clearLines method).
   * 
   * @param the_removed_line the index to the removed line.
   */
  private void moveLinesDown(final int the_removed_line)
  {
    for (int i = the_removed_line; i > 0; i--)
    {
      for (int j = 0; j < my_board[i].length; j++)
      {
        my_board[i][j] = my_board[i - 1][j];
      }
    }
  }
  
  /**
   * Creates a new random tetris piece.
   * 
   * @return Tetris Piece
   */
  private TetrisPiece createNewRandomPiece()
  {
    final Random rand = new Random();
    TetrisPiece random_piece = null;
    
    switch (rand.nextInt(RANDOM_PIECE))
    {
      case 0:
        random_piece = new TetrisPieceI(1, MIDDLE);
        break;
        
      case 1:
        random_piece = new TetrisPieceJ(1, MIDDLE);
        break;
        
      case 2:
        random_piece = new TetrisPieceL(1, MIDDLE);
        break;
        
      case 3:
        random_piece = new TetrisPieceS(1, MIDDLE);
        break;
        
      case 4:
        random_piece = new TetrisPieceZ(1, MIDDLE);
        break;
        
      case 5:
        random_piece = new TetrisPieceT(1, MIDDLE);
        break;
        
      case 6:
        random_piece = new TetrisPieceO(1, MIDDLE);
        break;
        
      default:
        break;
    }
    return random_piece;
  }
  
  /**
   * Adds the piece onto the board.
   */
  private void addPieceToBoard()
  {
    for (int i = 0; i < my_current_piece.getPieces().length; i++)
    {
      for (int j = 0; j < my_current_piece.getPieces()[i].length; j++)
      {
        if (my_current_piece.getPieces()[i][j] == 1)
        {
          my_board[i + my_current_piece.getX()][j + MIDDLE] =
              my_current_piece.getPieces()[i][j];
        }
      }
    }
  }
  
  /**
   * For the purpose of the JUnit Test this method is used to see if the board has the
   * expected output.
   * 
   * @return the board
   */
  public int[][] getBoard()
  {
    return my_board.clone();
  }
  
  /**
   * {@inheritDoc}
   */
  @Override
  public String toString()
  {
    final StringBuilder sb = new StringBuilder();
    for (int i = TOP_THRESHOLD; i < BOTTOM_THRESHOLD + 1; i++)
    {
      for (int j = 0; j < my_board[i].length; j++)
      {
        if (my_board[i][j] == 0)
        {
          sb.append("[ ]");
        } 
        if (my_board[i][j] == 1)
        {
          sb.append("[1]");
        }
        if (my_board[i][j] == 2)
        {
          sb.append("[2]");
        }
      }
      sb.append("\n");
    }
    return sb.toString();
  }
}
