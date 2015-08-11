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
 * JUnit Test for L Piece.
 * 
 * @author Raymond Luu
 * @version February 2 2012
 */
public class TetrisPieceLTest
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
   * Constant for state one print view.
   */
  private static final String STATE_ONE_PRINT = "[]      \n[]      \n[][]    \n        \n";

  /**
   * Tetris Piece L.
   */
  private TetrisPieceL my_l;
  
  /**
   * Initializes the test subject.
   */
  @Before
  public void setUp()
  {
    my_l = new TetrisPieceL(0, 0);
  }

  /**
   * Test method for TetrisPieceL.
   */
  @Test
  public void testTetrisPieceL()
  {
    assertEquals("The x coordinate should be 0", 0, my_l.getX());
    assertEquals("The y coordinate should be 0", 0, my_l.getY());
    assertArrayEquals(STATE_ONE, my_l.getPieces());
  }

  /**
   * Test method for Rotate.
   */
  @Test
  public void testRotate()
  {
    assertArrayEquals(STATE_TWO, my_l.rotate().getPieces());
    assertArrayEquals(STATE_THREE, my_l.rotate().rotate().getPieces());
    assertArrayEquals(STATE_FOUR, my_l.rotate().rotate().rotate().getPieces());
    assertArrayEquals(STATE_ONE, my_l.rotate().rotate().rotate().rotate().getPieces());
  }

  /**
   * Test method for MoveDown.
   */
  @Test
  public void testMoveDown()
  {
    assertEquals("The y position should minus 1", 1, my_l.moveDown().getX());
  }

  /**
   * Test method for MoveLeft.
   */
  @Test
  public void testMoveLeft()
  {
    assertEquals("The x position should minus 1", -1, my_l.moveLeft().getY());
  }

  /**
   * Test method for MoveRight.
   */
  @Test
  public void testMoveRight()
  {
    assertEquals("The x position should plus 1", 1, my_l.moveRight().getY());
  }

  /**
   * Test method for ToString.
   */
  @Test
  public void testToString()
  {
    assertEquals("Strings should match", STATE_ONE_PRINT, my_l.toString());
  }

}
