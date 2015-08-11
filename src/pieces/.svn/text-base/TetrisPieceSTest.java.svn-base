/*
 * Raymond Luu
 * 
 * TCSS 305 - Winter 2012
 * Tetris Project - Part 1
 */
package pieces;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
/**
 * JUnit Test for S Piece.
 * 
 * @author Raymond Luu
 * @version February 2 2012
 */
public class TetrisPieceSTest
{
  
  /**
   * Constant for rotation state one.
   */
  private static final int[][] STATE_ONE = {{0, 1, 1, 0},
                                            {1, 1, 0, 0},
                                            {0, 0, 0, 0},
                                            {0, 0, 0, 11}};

  /**
   * Constant for rotation state two.
   */
  private static final int[][] STATE_TWO = {{1, 0, 0, 0},
                                            {1, 1, 0, 0},
                                            {0, 1, 0, 0},
                                            {0, 0, 0, 12}};
  
  /**
   * Constant for state one print view.
   */
  private static final String STATE_ONE_PRINT = "  [][]  \n[][]    \n        \n        \n";
  
  /**
   * Tetris Piece S.
   */
  private TetrisPieceS my_s;
  
  /**
   * Initializes the test subject.
   */
  @Before
  public void setUp()
  {
    my_s = new TetrisPieceS(0, 0);
  }

  /**
   * Test method for TetrisPieceS.
   */
  @Test
  public void testTetrisPieceS()
  {
    assertEquals("The x coordinate should be 0", 0, my_s.getX());
    assertEquals("The y coordinate should be 0", 0, my_s.getY());
    assertArrayEquals(STATE_ONE, my_s.getPieces());
  }

  /**
   * Test method for Rotate.
   */
  @Test
  public void testRotate()
  {
    assertArrayEquals(STATE_TWO, my_s.rotate().getPieces());
    assertArrayEquals(STATE_ONE, my_s.rotate().rotate().getPieces());
  }

  /**
   * Test method for MoveDown.
   */
  @Test
  public void testMoveDown()
  {
    assertEquals("The y position should minus 1", 1, my_s.moveDown().getX());
  }

  /**
   * Test method for MoveLeft.
   */
  @Test
  public void testMoveLeft()
  {
    assertEquals("The x position should minus 1", -1, my_s.moveLeft().getY());
  }

  /**
   * Test method for MoveRight.
   */
  @Test
  public void testMoveRight()
  {
    assertEquals("The x position should plus 1", 1, my_s.moveRight().getY());
  }

  /**
   * Test method for ToString.
   */
  @Test
  public void testToString()
  {
    assertEquals("Strings should match", STATE_ONE_PRINT, my_s.toString());
  }

}
