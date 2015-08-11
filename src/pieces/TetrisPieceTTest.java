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
 * JUnit Test for T Piece.
 * 
 * @author Raymond Luu
 * @version February 2 2012
 */
public class TetrisPieceTTest
{
  
  /**
   * Constant for rotation state one.
   */
  private static final int[][] STATE_ONE = {{0, 1, 0, 0},
                                            {1, 1, 1, 0},
                                            {0, 0, 0, 0},
                                            {0, 0, 0, 11}};
  
  /**
   * Constant for rotation state two.
   */
  private static final int[][] STATE_TWO = {{1, 0, 0, 0},
                                            {1, 1, 0, 0},
                                            {1, 0, 0, 0},
                                            {0, 0, 0, 12}};

  /**
   * Constant for rotation state three.
   */
  private static final int[][] STATE_THREE = {{1, 1, 1, 0},
                                              {0, 1, 0, 0},
                                              {0, 0, 0, 0},
                                              {0, 0, 0, 13}};

  /**
   * Constant for rotation state four.
   */
  private static final int[][] STATE_FOUR = {{0, 1, 0, 0},
                                             {1, 1, 0, 0},
                                             {0, 1, 0, 0},
                                             {0, 0, 0, 14}};
  
  /**
   * Constant for state one print view.
   */
  private static final String STATE_ONE_PRINT = "  []    \n[][][]  \n        \n        \n";
  
  /**
   * Tetris Piece T.
   */
  private TetrisPieceT my_t;
  
  /**
   * Initializes the test subject.
   */
  @Before
  public void setUp()
  {
    my_t = new TetrisPieceT(0, 0);
  }

  /**
   * Test method for TetrisPieceT.
   */
  @Test
  public void testTetrisPieceT()
  {
    assertEquals("The x coordinate should be 0", 0, my_t.getX());
    assertEquals("The y coordinate should be 0", 0, my_t.getY());
    assertArrayEquals(STATE_ONE, my_t.getPieces());
  }

  /**
   * Test method for Rotate.
   */
  @Test
  public void testRotate()
  {
    assertArrayEquals(STATE_TWO, my_t.rotate().getPieces());
    assertArrayEquals(STATE_THREE, my_t.rotate().rotate().getPieces());
    assertArrayEquals(STATE_FOUR, my_t.rotate().rotate().rotate().getPieces());
    assertArrayEquals(STATE_ONE, my_t.rotate().rotate().rotate().rotate().getPieces());
  }

  /**
   * Test method for MoveDown.
   */
  @Test
  public void testMoveDown()
  {
    assertEquals("The y position should minus 1", 1, my_t.moveDown().getX());
  }

  /**
   * Test method for MoveLeft.
   */
  @Test
  public void testMoveLeft()
  {
    assertEquals("The x position should minus 1", -1, my_t.moveLeft().getY());
  }

  /**
   * Test method for MoveRight.
   */
  @Test
  public void testMoveRight()
  {
    assertEquals("The x position should plus 1", 1, my_t.moveRight().getY());
  }

  /**
   * Test method for ToString.
   */
  @Test
  public void testToString()
  {
    assertEquals("Strings should match", STATE_ONE_PRINT, my_t.toString());
  }

}
