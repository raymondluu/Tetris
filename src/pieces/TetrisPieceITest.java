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
 * JUnit Test for I Piece.
 * 
 * @author Raymond Luu
 * @version February 2 2012
 */
public class TetrisPieceITest
{
  
  /**
   * Constant for rotation state one.
   */
  private static final int[][] STATE_ONE = {{1, 0, 0, 0},
                                            {1, 0, 0, 0},
                                            {1, 0, 0, 0},
                                            {1, 0, 0, 11}};

  /**
   * Constant for rotation state two.
   */
  private static final int[][] STATE_TWO = {{1, 1, 1, 1},
                                            {0, 0, 0, 0},
                                            {0, 0, 0, 0},
                                            {0, 0, 0, 12}};
  
  /**
   * Constant for state one print view.
   */
  private static final String STATE_ONE_PRINT = "[]      \n[]      \n[]      \n[]      \n";

  /**
   * Tetris Piece I.
   */
  private TetrisPieceI my_i;
  
  /**
   * Initializes the test subject.
   */
  @Before
  public void setUp()
  {
    my_i = new TetrisPieceI(0, 0);
  }

  /**
   * Test method for TetrisPieceI.
   */
  @Test
  public void testTetrisPieceI()
  {
    assertEquals("The x coordinate should be 0", 0, my_i.getX());
    assertEquals("The y coordinate should be 0", 0, my_i.getY());
    assertArrayEquals(STATE_ONE, my_i.getPieces());
  }

  /**
   * Test method for Rotate.
   */
  @Test
  public void testRotate()
  {
    assertArrayEquals(STATE_TWO, my_i.rotate().getPieces());
    assertArrayEquals(STATE_ONE, my_i.rotate().rotate().getPieces());
  }

  /**
   * Test method for MoveDown.
   */
  @Test
  public void testMoveDown()
  {
    assertEquals("The y position should minus 1", 1, my_i.moveDown().getX());
  }

  /**
   * Test method for MoveLeft.
   */
  @Test
  public void testMoveLeft()
  {
    assertEquals("The x position should minus 1", -1, my_i.moveLeft().getY());
  }

  /**
   * Test method for MoveRight.
   */
  @Test
  public void testMoveRight()
  {
    assertEquals("The x position should plus 1", 1, my_i.moveRight().getY());
  }
  
  /**
   * Test method for ToString.
   */
  @Test
  public void testToString()
  {
    assertEquals("Strings should match", STATE_ONE_PRINT, my_i.toString());
  }

}
