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
 * JUnit Test for O Piece.
 * 
 * @author Raymond Luu
 * @version February 2 2012
 */
public class TetrisPieceOTest
{
  
  /**
   * Constant for rotation state one.
   */
  private static final int[][] STATE_ONE = {{1, 1, 0, 0},
                                            {1, 1, 0, 0},
                                            {0, 0, 0, 0},
                                            {0, 0, 0, 11}};
  
  /**
   * Constant for state one print view.
   */
  private static final String STATE_ONE_PRINT = "[][]    \n[][]    \n        \n        \n";
  
  /**
   * Tetris Piece O.
   */
  private TetrisPieceO my_o;
  
  /**
   * Initializes the test subject.
   */
  @Before
  public void setUp()
  {
    my_o = new TetrisPieceO(0, 0);
  }

  /**
   * Test method for TetrisPieceO.
   */
  @Test
  public void testTetrisPieceO()
  {
    assertEquals("The initial x position should be 0", 0, my_o.getX());
    assertEquals("The initial y position should be 0", 0, my_o.getY());
    assertArrayEquals(STATE_ONE, my_o.getPieces());
  }

  /**
   * Test method for Rotate.
   */
  @Test
  public void testRotate()
  {
    assertArrayEquals(STATE_ONE, my_o.rotate().getPieces());
  }

  /**
   * Test method for MoveDown.
   */
  @Test
  public void testMoveDown()
  {
    assertEquals("The y position should minus 1", 1, my_o.moveDown().getX());
  }

  /**
   * Test method for MoveLeft.
   */
  @Test
  public void testMoveLeft()
  {
    assertEquals("The x position should minus 1", -1, my_o.moveLeft().getY());
  }

  /**
   * Test method for MoveRight.
   */
  @Test
  public void testMoveRight()
  {
    assertEquals("The x position should plus 1", 1, my_o.moveRight().getY());
  }
  
  /**
   * Test method for ToString.
   */
  @Test
  public void testToString()
  {
    assertEquals("Strings should match", STATE_ONE_PRINT, my_o.toString());
  }

}
