/*
 * Raymond Luu
 * 
 * TCSS 305 - Winter 2012
 * Tetris Project - Part 1
 */
package pieces;
/**
 *  Object Tetris L Piece.
 *  
 * @author Raymond Luu
 * @version January 30 2012
 */
public class TetrisPieceL extends TetrisPiece
{
  
  /**
   * Constant for rotation state one.
   */
  private static final int[][] STATE_ONE = {{1, 0, 0, 0},
                                            {1, 0, 0, 0},
                                            {1, 1, 0, 0},
                                            {0, 0, 0, 11}};
  
  /**
   * Constant for rotation state two.
   */
  private static final int[][] STATE_TWO = {{1, 1, 1, 0},
                                            {1, 0, 0, 0},
                                            {0, 0, 0, 0},
                                            {0, 0, 0, 12}};
  
  /**
   * Constant for rotation state three.
   */
  private static final int[][] STATE_THREE = {{1, 1, 0, 0},
                                              {0, 1, 0, 0},
                                              {0, 1, 0, 0},
                                              {0, 0, 0, 13}};
  /**
   * Constant for rotation state four.
   */
  private static final int[][] STATE_FOUR = {{0, 0, 1, 0},
                                             {1, 1, 1, 0},
                                             {0, 0, 0, 0},
                                             {0, 0, 0, 14}};
  
  /**
   * Creates L piece at origin.
   */
  public TetrisPieceL()
  {
    this(0, 0);
  }
  
  /**
   * Creates L piece.
   * 
   * @param the_x the x coordinate.
   * @param the_y the y coordinate.
   */
  public TetrisPieceL(final int the_x, final int the_y)
  {
    super(the_x, the_y, STATE_ONE, STATE_TWO, STATE_THREE, STATE_FOUR);
  }
  
}