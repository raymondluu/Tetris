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
 * JUnit Test for J Piece.
 * 
 * @author Raymond Luu
 * @version February 2 2012
 */
public class TetrisPieceJTest
{
  
  /**
   * Constant for rotation state one.
   */
  private static final int[][] STATE_ONE = {{0, 1, 0, 0},
                                            {0, 1, 0, 0},
                                            {1, 1, 0, 0},
                                            {0, 0, 0, 11}};
  
  /**
   * Constant for rotation state two.
   */
  private static final int[][] STATE_TWO = {{1, 0, 0, 0},
                                            {1, 1, 1, 0},
                                            {0, 0, 0, 0},
                                            {0, 0, 0, 12}};

  /**
   * Constant for rotation state three.
   */
  private static final int[][] STATE_THREE = {{1, 1, 0, 0},
                                              {1, 0, 0, 0},
                                              {1, 0, 0, 0},
                                              {0, 0, 0, 13}};

  /**
   * Constant for rotation state four.
   */
  private static final int[][] STATE_FOUR = {{1, 1, 1, 0},
                                             {0, 0, 1, 0},
                                             {0, 0, 0, 0},
                                             {0, 0, 0, 14}};

  /**
   * Constant for state one print view.
   */
  private static final String STATE_ONE_PRINT = "  []    \n  []    \n[][]    \n        \n";

  /**
   * Tetris Piece J.
   */
  private TetrisPieceJ my_j;

  /**
   * Initializes the test subject.
   */
  @Before
  public void setUp()
  {
    my_j = new TetrisPieceJ(0, 0);
  }

  /**
   * Test method for TetrisPieceJ.
   */
  @Test
  public void testTetrisPieceJ()
  {
    assertEquals("The x coordinate should be 0", 0, my_j.getX());
    assertEquals("The y coordinate should be 0", 0, my_j.getY());
    assertArrayEquals(STATE_ONE, my_j.getPieces());
  }

  /**
   * Test method for Rotate.
   */
  @Test
  public void testRotate()
  {
    assertArrayEquals(STATE_TWO, my_j.rotate().getPieces());
    assertArrayEquals(STATE_THREE, my_j.rotate().rotate().getPieces());
    assertArrayEquals(STATE_FOUR, my_j.rotate().rotate().rotate().getPieces());
    assertArrayEquals(STATE_ONE, my_j.rotate().rotate().rotate().rotate().getPieces());
  }

  /**
   * Test method for MoveDown.
   */
  @Test
  public void testMoveDown()
  {
    assertEquals("The y position should minus 1", 1, my_j.moveDown().getX());
  }

  /**
   * Test method for MoveLeft.
   */
  @Test
  public void testMoveLeft()
  {
    assertEquals("The x position should minus 1", -1, my_j.moveLeft().getY());
  }

  /**
   * Test method for MoveRight.
   */
  @Test
  public void testMoveRight()
  {
    assertEquals("The x position should plus 1", 1, my_j.moveRight().getY());
  }

  /**
   * Test method for ToString.
   */
  @Test
  public void testToString()
  {
    assertEquals("Strings should match", STATE_ONE_PRINT, my_j.toString());
  }

}
