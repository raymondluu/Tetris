/*
 * Raymond Luu
 * 
 * TCSS 305 - Winter 2012
 * Tetris Project - Part 1
 */
package pieces;
/**
 *  Object Tetris Pieces.
 *  
 * @author Raymond Luu
 * @version January 30 2012
 */
public abstract class TetrisPiece implements Cloneable
{
  
  /**
   * Constant for array index with dimensions 4x4.
   */
  private static final int INDEX = 4;
  
  /**
   * The x coordinate on local board.
   */
  private int my_x;
  
  /**
   * The y coordinate on local board.
   */
  private int my_y;
  
  /**
   * Rotation piece one.
   */
  private final int[][] my_rotation_one;
  
  /**
   * Rotation piece two.
   */
  private final int[][] my_rotation_two;
  
  /**
   * Rotation piece three.
   */
  private final int[][] my_rotation_three;
  
  /**
   * Rotation piece four.
   */
  private final int[][] my_rotation_four;
  
  /**
   * Current rotation.
   */
  private int my_current_state;
  
  /**
   * Creates an Object Tetris Piece.
   * 
   * @param the_x the x coordinate.
   * @param the_y the y coordinate.
   * @param the_state_one_piece the starting rotation piece.
   * @param the_state_two_piece the second rotation piece.
   * @param the_state_three_piece the third rotation piece.
   * @param the_state_four_piece the fourth rotation piece.
   */
  public TetrisPiece(final int the_x,
                              final int the_y,
                              final int[][] the_state_one_piece,
                              final int[][] the_state_two_piece,
                              final int[][] the_state_three_piece,
                              final int[][] the_state_four_piece)
  {
    my_x = the_x;
    my_y = the_y;
    my_current_state = 0;
    my_rotation_one = arrayTetrisPieceClone(the_state_one_piece);
    my_rotation_two = arrayTetrisPieceClone(the_state_two_piece);
    my_rotation_three = arrayTetrisPieceClone(the_state_three_piece);
    my_rotation_four = arrayTetrisPieceClone(the_state_four_piece);
  }
  
  /**
   * Private helper method to clone pieces.
   * 
   * @param the_start_piece the rotation piece.
   * @return a copy of 2d array with appropriate rotation piece.
   */
  private int[][] arrayTetrisPieceClone(final int[][] the_start_piece)
  {
    final int[][] copy_piece = new int[INDEX][INDEX];
    
    for (int i = 0; i < the_start_piece.length; i++)
    {
      for (int j = 0; j < the_start_piece[i].length; j++)
      {
        copy_piece[i][j] = the_start_piece[i][j];
      }
    }
    return copy_piece;
  }
  
  /**
   * @return copy of an object rotated 180 degrees clockwise.
   */
  public TetrisPiece rotate()
  {
    TetrisPiece result = null;
    try
    {
      result = (TetrisPiece) clone();
      result.my_current_state = (my_current_state + 1) % INDEX;
    }
    catch (final CloneNotSupportedException e)
    {
      // this should never happen
      assert false;
    }
    return result;
  }
  
  /**
   * @return copy of an object moved down.
   */
  public TetrisPiece moveDown()
  {
    TetrisPiece result = null;
    try
    {
      result = (TetrisPiece) clone();
      result.my_x++;
    }
    catch (final CloneNotSupportedException e)
    {
      // this should never happen
      assert false;
    }
    return result;
  }
  
  /**
   * @return copy of an object moved left.
   */
  public TetrisPiece moveLeft()
  {
    TetrisPiece result = null;
    try
    {
      result = (TetrisPiece) clone();
      result.my_y--;
    }
    catch (final CloneNotSupportedException e)
    {
      // this should never happen
      assert false;
    }
    return result;
  }
  
  /**
   * @return copy of an object moved right.
   */
  public TetrisPiece moveRight()
  {
    TetrisPiece result = null;
    try
    {
      result = (TetrisPiece) clone();
      result.my_y++;
    }
    catch (final CloneNotSupportedException e)
    {
      // this should never happen
      assert false;
    }
    return result;
  }
  
  /**
   * @return x coordinate.
   */
  public int getX()
  {
    return my_x;
  }
  
  /**
   * @return y coordinate.
   */
  public int getY()
  {
    return my_y;
  }
  
  /**
   * @return a copy of 2d array with appropriate rotation piece.
   */
  public int[][] getPieces()
  {
    int[][] copy_pieces = new int[INDEX][INDEX];
    
    switch (my_current_state)
    {
      case 0: 
        copy_pieces = arrayTetrisPieceClone(my_rotation_one);
        break;

      case 1: 
        copy_pieces = arrayTetrisPieceClone(my_rotation_two);
        break;

      case 2: 
        copy_pieces = arrayTetrisPieceClone(my_rotation_three);
        break;

      case 3: 
        copy_pieces = arrayTetrisPieceClone(my_rotation_four);
        break;

      default: 
        break;
    }
    
    return copy_pieces;
  }
  
  /**
   * {@inheritDoc}
   */
  @Override
  public Object clone() throws CloneNotSupportedException
  {
    return (TetrisPiece) super.clone();
  }
  
  /**
   * {@inheritDoc}
   */
  @Override
  public String toString()
  {
    final StringBuilder sb = new StringBuilder();
    
    for (int i = 0; i < getPieces().length; i++)
    {
      for (int j = 0; j < getPieces()[i].length; j++)
      {
        if (getPieces()[i][j] == 1)
        {
          sb.append("[]");
        } 
        else
        {
          sb.append("  ");
        }
      }
      sb.append("\n");
    }
    return sb.toString();
  }
  
}
