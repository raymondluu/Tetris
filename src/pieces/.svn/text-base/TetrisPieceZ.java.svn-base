/*
 * Raymond Luu
 * 
 * TCSS 305 - Winter 2012
 * Tetris Project - Part 1
 */
package pieces;
/**
 *  Object Tetris Z Piece.
 *  
 * @author Raymond Luu
 * @version January 30 2012
 */
public class TetrisPieceZ extends TetrisPiece
{
  
  /**
   * Constant for rotation state one.
   */
  private static final int[][] STATE_ONE = {{1, 1, 0, 0},
                                            {0, 1, 1, 0},
                                            {0, 0, 0, 0},
                                            {0, 0, 0, 11}};

  /**
   * Constant for rotation state two.
   */
  private static final int[][] STATE_TWO = {{0, 1, 0, 0},
                                            {1, 1, 0, 0},
                                            {1, 0, 0, 0},
                                            {0, 0, 0, 12}};
  
  /**
   * Creates Z piece at origin.
   */
  public TetrisPieceZ()
  {
    this(0, 0);
  }
  
  /**
   * Creates Z piece.
   * 
   * @param the_x the x coordinate.
   * @param the_y the y coordinate.
   */
  public TetrisPieceZ(final int the_x, final int the_y)
  {
    super(the_x, the_y, STATE_ONE, STATE_TWO, STATE_ONE, STATE_TWO);

  }
  
}
