/*
 * Raymond Luu
 * 
 * TCSS 305 - Winter 2012
 * Tetris Project - Part 2
 */
package board;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * JUnit Test class for tetris board.
 * 
 * @author Raymond Luu
 * @version February 16 2012
 */
public class BoardTest
{
  /**
   * Constant for board when it starts.
   */
  private final static int[][] MY_BOARD_START = {{0, 0, 0, 0, 0, 1, 0, 0, 0, 0},
                                                 {0, 0, 0, 0, 0, 1, 0, 0, 0, 0},
                                                 {0, 0, 0, 0, 0, 1, 0, 0, 0, 0},
                                                 {0, 0, 0, 0, 0, 1, 0, 0, 0, 0},
                                                 {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                                                 {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                                                 {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                                                 {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                                                 {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                                                 {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                                                 {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                                                 {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                                                 {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                                                 {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                                                 {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                                                 {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                                                 {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                                                 {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                                                 {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                                                 {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                                                 {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                                                 {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                                                 {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                                                 {0, 0, 0, 0, 0, 0, 0, 0, 0, 0}};
  
  /**
   * Constant for when a piece is frozen and a new pieces appears.
   */
  private final static int[][] MY_BOARD_FREEZE = {{0, 0, 0, 0, 0, 1, 0, 0, 0, 0},
                                                  {0, 0, 0, 0, 0, 1, 0, 0, 0, 0},
                                                  {0, 0, 0, 0, 0, 1, 0, 0, 0, 0},
                                                  {0, 0, 0, 0, 0, 1, 0, 0, 0, 0},
                                                  {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                                                  {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                                                  {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                                                  {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                                                  {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                                                  {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                                                  {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                                                  {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                                                  {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                                                  {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                                                  {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                                                  {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                                                  {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                                                  {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                                                  {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                                                  {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                                                  {2, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                                                  {2, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                                                  {2, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                                                  {2, 0, 0, 0, 0, 0, 0, 0, 0, 0}};
  
  /**
   * Constant for when 3 rows are removed.
   */
  private final static int[][] MY_BOARD_THREE_REMOVE = {{0, 0, 0, 0, 0, 1, 0, 0, 0, 0},
                                                        {0, 0, 0, 0, 0, 1, 0, 0, 0, 0},
                                                        {0, 0, 0, 0, 0, 1, 0, 0, 0, 0},
                                                        {0, 0, 0, 0, 0, 1, 0, 0, 0, 0},
                                                        {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                                                        {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                                                        {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                                                        {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                                                        {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                                                        {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                                                        {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                                                        {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                                                        {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                                                        {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                                                        {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                                                        {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                                                        {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                                                        {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                                                        {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                                                        {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                                                        {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                                                        {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                                                        {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                                                        {0, 0, 0, 0, 2, 0, 0, 0, 0, 2}};
  
  /**
   * Constant for when 2 rows are removed.
   */
  private final static int[][] MY_BOARD_TWO_REMOVE = {{0, 0, 0, 0, 0, 1, 0, 0, 0, 0},
                                                      {0, 0, 0, 0, 0, 1, 0, 0, 0, 0},
                                                      {0, 0, 0, 0, 0, 1, 0, 0, 0, 0},
                                                      {0, 0, 0, 0, 0, 1, 0, 0, 0, 0},
                                                      {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                                                      {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                                                      {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                                                      {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                                                      {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                                                      {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                                                      {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                                                      {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                                                      {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                                                      {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                                                      {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                                                      {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                                                      {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                                                      {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                                                      {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                                                      {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                                                      {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                                                      {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                                                      {2, 2, 0, 0, 0, 0, 0, 0, 0, 0},
                                                      {2, 2, 0, 0, 2, 0, 0, 0, 0, 2}};

/**
 * Constant for when a piece is all the way at the bottom.
 */
private final static int[][] MY_BOARD_ONE_REMOVE = {{0, 0, 0, 0, 0, 1, 0, 0, 0, 0},
                                                    {0, 0, 0, 0, 0, 1, 0, 0, 0, 0},
                                                    {0, 0, 0, 0, 0, 1, 0, 0, 0, 0},
                                                    {0, 0, 0, 0, 0, 1, 0, 0, 0, 0},
                                                    {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                                                    {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                                                    {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                                                    {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                                                    {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                                                    {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                                                    {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                                                    {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                                                    {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                                                    {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                                                    {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                                                    {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                                                    {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                                                    {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                                                    {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                                                    {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                                                    {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                                                    {2, 2, 0, 0, 0, 2, 0, 0, 0, 2},
                                                    {2, 2, 0, 0, 2, 2, 0, 0, 0, 2},
                                                    {2, 2, 2, 2, 2, 2, 0, 0, 0, 2}};
  
  /**
   * Constant for when a piece is rotated.
   */
  private final static int[][] MY_BOARD_TWO_NON_ADJACENT_REMOVE = 
                                                      {{0, 0, 0, 0, 0, 1, 0, 0, 0, 0},
                                                       {0, 0, 0, 0, 0, 1, 0, 0, 0, 0},
                                                       {0, 0, 0, 0, 0, 1, 0, 0, 0, 0},
                                                       {0, 0, 0, 0, 0, 1, 0, 0, 0, 0},
                                                       {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                                                       {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                                                       {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                                                       {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                                                       {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                                                       {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                                                       {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                                                       {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                                                       {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                                                       {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                                                       {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                                                       {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                                                       {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                                                       {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                                                       {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                                                       {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                                                       {2, 2, 0, 0, 0, 2, 0, 0, 0, 0},
                                                       {2, 2, 0, 0, 2, 2, 0, 0, 0, 0},
                                                       {2, 2, 2, 2, 2, 2, 0, 0, 0, 0},
                                                       {2, 2, 2, 2, 2, 2, 2, 2, 2, 0}};
  
  private final static String MY_BOARD_STRING = ("[ ][ ][ ][ ][ ][ ][ ][ ][ ][ ]\n" +
                                             		 "[ ][ ][ ][ ][ ][ ][ ][ ][ ][ ]\n" +
                                             		 "[ ][ ][ ][ ][ ][ ][ ][ ][ ][ ]\n" +
                                            		 "[ ][ ][ ][ ][ ][ ][ ][ ][ ][ ]\n" +
                                            		 "[ ][ ][ ][ ][ ][ ][ ][ ][ ][ ]\n" +
                                            		 "[ ][ ][ ][ ][ ][ ][ ][ ][ ][ ]\n" +
                                            		 "[ ][ ][ ][ ][ ][ ][ ][ ][ ][ ]\n" +
                                            		 "[ ][ ][ ][ ][ ][ ][ ][ ][ ][ ]\n" +
                                            		 "[ ][ ][ ][ ][ ][ ][ ][ ][ ][ ]\n" +
                                            		 "[ ][ ][ ][ ][ ][ ][ ][ ][ ][ ]\n" +
                                            		 "[ ][ ][ ][ ][ ][ ][ ][ ][ ][ ]\n" +
                                            		 "[ ][ ][ ][ ][ ][ ][ ][ ][ ][ ]\n" +
                                            		 "[ ][ ][ ][ ][ ][ ][ ][ ][ ][ ]\n" +
                                            		 "[ ][ ][ ][ ][ ][ ][ ][ ][ ][ ]\n" +
                                            		 "[ ][ ][ ][ ][ ][ ][ ][ ][ ][ ]\n" +
                                            		 "[ ][ ][ ][ ][ ][ ][ ][ ][ ][ ]\n" +
                                            		 "[ ][ ][ ][ ][ ][ ][ ][ ][ ][ ]\n" +
                                            		 "[ ][ ][ ][ ][ ][ ][ ][ ][ ][ ]\n" +
                                            		 "[ ][ ][ ][ ][ ][ ][ ][ ][ ][ ]\n" +
                                            		 "[ ][ ][ ][ ][ ][ ][ ][ ][ ][ ]\n");
  
  /**
   * My Board.
   */
  private Board my_b;
  
  /**
   * Setup for the JUnit testing.
   */
  @Before
  public void setUp()
  {
    my_b = new Board();
  }
  
  /**
   * Test board constructor.
   */
  @Test
  public void testBoard()
  {
    assertArrayEquals(MY_BOARD_START, my_b.getBoard());
  }

  @Test
  public void testStep()
  {
    // piece 1
    my_b.moveLeft();
    my_b.moveLeft();
    my_b.moveLeft();
    my_b.moveLeft();
    my_b.moveLeft();
    my_b.step();
    assertArrayEquals(MY_BOARD_FREEZE, my_b.getBoard());
    
    // piece 2
    my_b.moveLeft();
    my_b.moveLeft();
    my_b.moveLeft();
    my_b.moveLeft();
    my_b.step();
    
    // piece 3
    my_b.moveLeft();
    my_b.moveLeft();
    my_b.moveLeft();
    my_b.step();
    
    // piece 4
    my_b.moveLeft();
    my_b.moveLeft();
    my_b.step();
    
    // piece 5
    my_b.moveLeft();
    my_b.step();
    
    // piece 6
    my_b.step();
    
    // piece 7
    my_b.moveRight();
    my_b.step();
    
    // piece 8
    my_b.moveRight();
    my_b.moveRight();
    my_b.step();
    
    // piece 9
    my_b.moveRight();
    my_b.moveRight();
    my_b.moveRight();
    my_b.step();
    
    // piece 10
    my_b.moveRight();
    my_b.moveRight();
    my_b.moveRight();
    my_b.moveRight();
    my_b.step();
    assertArrayEquals(MY_BOARD_START, my_b.getBoard());
    
    // piece 11
    my_b.rotate();
    my_b.step();
    
    // piece 12
    my_b.rotate();
    my_b.moveLeft();
    my_b.moveLeft();
    my_b.moveLeft();
    my_b.moveLeft();
    my_b.moveLeft();
    my_b.step();
    
    // piece 13
    my_b.rotate();
    my_b.step();
    
    // piece 14
    my_b.rotate();
    my_b.moveLeft();
    my_b.moveLeft();
    my_b.moveLeft();
    my_b.moveLeft();
    my_b.moveLeft();
    my_b.step();
    
    // piece 15
    my_b.rotate();
    my_b.step();
    
    // piece 16
    my_b.rotate();
    my_b.moveLeft();
    my_b.moveLeft();
    my_b.moveLeft();
    my_b.moveLeft();
    my_b.moveLeft();
    my_b.step();
    
    // piece 17
    my_b.moveLeft();
    my_b.step();
    
    // piece 18
    my_b.moveRight();
    my_b.moveRight();
    my_b.moveRight();
    my_b.moveRight();
    my_b.step();
    assertArrayEquals(MY_BOARD_THREE_REMOVE, my_b.getBoard());
    
    // piece 19
    my_b.rotate();
    my_b.moveRight();
    my_b.step();
    
    // piece 20
    my_b.moveLeft();
    my_b.moveLeft();
    my_b.moveLeft();
    my_b.rotate();
    my_b.step();
    
    // piece 21
    my_b.moveLeft();
    my_b.moveLeft();
    my_b.moveLeft();
    my_b.moveLeft();
    my_b.moveLeft();
    my_b.step();
    
    // piece 22
    my_b.rotate();
    my_b.moveRight();
    my_b.step();
    
    // piece 23
    my_b.moveLeft();
    my_b.moveLeft();
    my_b.moveLeft();
    my_b.rotate();
    my_b.step();
    
    // piece 24
    my_b.moveLeft();
    my_b.moveLeft();
    my_b.moveLeft();
    my_b.moveLeft();
    my_b.step();
    assertArrayEquals(MY_BOARD_TWO_REMOVE, my_b.getBoard());
    
    // piece 25
    my_b.rotate();
    my_b.step();
    
    // piece 26
    my_b.rotate();
    my_b.step();
    
    // piece 27
    my_b.moveRight();
    my_b.rotate();
    my_b.step();
    
    // piece 28
    my_b.step();
    
    // piece 29
    my_b.moveLeft();
    my_b.step();
    
    // piece 30
    my_b.moveLeft();
    my_b.moveLeft();
    my_b.moveLeft();
    my_b.moveLeft();
    my_b.moveLeft();
    my_b.step();
    
    // piece 31
    my_b.moveLeft();
    my_b.moveLeft();
    my_b.moveLeft();
    my_b.moveLeft();
    my_b.step();
    
    // piece 32
    my_b.moveLeft();
    my_b.moveLeft();
    my_b.moveLeft();
    my_b.step();
    
    // piece 33
    my_b.moveLeft();
    my_b.moveLeft();
    my_b.step();
    assertArrayEquals(MY_BOARD_TWO_NON_ADJACENT_REMOVE, my_b.getBoard());
    
    // piece 34
    my_b.moveRight();
    my_b.moveRight();
    my_b.moveRight();
    my_b.moveRight();
    my_b.step();
    assertArrayEquals(MY_BOARD_ONE_REMOVE, my_b.getBoard());
  }

  @Test
  public void testToString()
  {
    assertEquals(MY_BOARD_STRING, my_b.toString());
  }

}
