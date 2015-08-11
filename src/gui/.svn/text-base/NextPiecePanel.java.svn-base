/*
 * Raymond Luu
 * 
 * TCSS 305 - Winter 2012
 * Tetris Project - part 3
 */
package gui;

import board.Board;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Shape;
import java.awt.geom.RoundRectangle2D;
import java.util.Observable;
import java.util.Observer;

import javax.swing.JPanel;

/**
 * Next piece panel.
 * 
 * @author Raymond Luu
 * @version February 29, 2012
 */
public class NextPiecePanel extends JPanel implements Observer
{
  
  /**
   * Block dimensions 25x25.
   */
  private static final int BLOCK_DIMENSION = 25;
  
  /**
   * Piece height.
   */
  private static final int PIECE_HEIGHT = 4;
  
  /**
   * Panel size.
   */
  private static final Dimension NEXT_PANEL_SIZE = new Dimension(125, 150);
  
  /**
   * The board.
   */
  private Board my_board;
  
  /**
   * The next piece.
   */
  private int[][] my_next_piece;
  
  /**
   * Constructs Next piece panel.
   * 
   * @param the_board board.
   */
  public NextPiecePanel(final Board the_board)
  {
    super();
    my_board = the_board;
    my_next_piece = new int[0][0];
    nextPiecePanelAddObserver();
    setPreferredSize(NEXT_PANEL_SIZE);
    setBackground(Color.WHITE);
  }
  
  /**
   * Private helper method to add observer.
   */
  private void nextPiecePanelAddObserver()
  {
    my_board.addObserver(this);
  }
  
  /**
   * {@inheritDoc}
   */
  @Override
  public void paintComponent(final Graphics the_graphics)
  {
    super.paintComponent(the_graphics);
    final Graphics2D g2d = (Graphics2D) the_graphics;
    
    for (int i = 0; i < my_next_piece.length; i++)
    {
      for (int j = 0; j < my_next_piece[i].length; j++)
      {
        if (my_next_piece[i][j] == 1)
        {
          final Shape tetris_block = 
              new RoundRectangle2D.Double(j * BLOCK_DIMENSION + BLOCK_DIMENSION,
                                          i * BLOCK_DIMENSION + BLOCK_DIMENSION,
                                          BLOCK_DIMENSION,
                                          BLOCK_DIMENSION,
                                          10,
                                          10);
          g2d.setPaint(Color.BLUE);
          g2d.fill(tetris_block);
          g2d.setPaint(Color.BLACK);
          g2d.draw(tetris_block);
        }
      }
    }
  }
  
  /**
   * {@inheritDoc}
   */
  @Override
  public void update(final Observable the_obj, final Object the_arg)
  {
    if (the_arg.getClass() == int[][].class)
    {
      final int[][] piece = (int[][]) the_arg;
      if (piece.length == PIECE_HEIGHT)
      {
        my_next_piece = piece;
      }
    }
    repaint();
  }
  
  /**
   * Resets panel.
   * 
   * @param the_board tetris board.
   */
  public void newGame(final Board the_board)
  {
    my_board = the_board;
    my_next_piece = new int[0][0];
    nextPiecePanelAddObserver();
  }
  
}
