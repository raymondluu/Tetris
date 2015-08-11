/*
 * Raymond Luu
 * 
 * TCSS 305 - Winter 2012
 * Tetris Project - part 4
 */
package gui;

import board.Board;

import java.awt.Color;
import java.awt.Dimension;
import java.util.Observable;
import java.util.Observer;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 * Info Panel object class.
 * 
 * @author Raymond Luu
 * @version March 9, 2012
 */
public class InfoPanel extends JPanel implements Observer
{
  
  /**
   * Panel size.
   */
  private static final Dimension PANEL_SIZE = new Dimension(125, 150);
  
  /**
   * Lines left to clear.
   */
  private static final int LINES_LEFT = 10;
  
  /**
   * Max level.
   */
  private static final int MAX_LEVEL = 10; //also used for max lines.
  
  /**
   * Score multiplier.
   */
  private static final int SCORE_MULTIPLIER = 100;
  
  /**
   * Tetris Board.
   */
  private Board my_board;
  
  /**
   * Tetris panel.
   */
  private final TetrisPanel my_tetris_panel;
  
  /**
   * Current level.
   */
  private int my_current_level;
  
  /**
   * Current score.
   */
  private int my_current_score;
  
  /**
   * Label for current level.
   */
  private final JLabel my_level_number_label;
  
  /**
   * Label for lines left to clear.
   */
  private final JLabel my_lines_left_label;
  
  /**
   * Label for score.
   */
  private final JLabel my_score_label;
  
  /**
   * Constructs the Info Panel.
   * 
   * @param the_board tetris board.
   * @param the_tetris_panel tetris panel.
   */
  public InfoPanel(final Board the_board, final TetrisPanel the_tetris_panel)
  {
    super();
    my_board = the_board;
    my_tetris_panel = the_tetris_panel;
    infoPanelHelperMethod();
    my_level_number_label = new JLabel(Integer.toString(my_current_level));
    my_lines_left_label = new JLabel(Integer.toString(LINES_LEFT));
    my_score_label = new JLabel(Integer.toString(my_current_score));
    
    setPreferredSize(PANEL_SIZE);
    setBackground(Color.WHITE);
    setupPanel();
  }
  
  /**
   * Private helper method for constructor.
   */
  private void infoPanelHelperMethod()
  {
    my_board.addObserver(this);
    my_current_level = 1;
    my_current_score = 0;
  }
  
  /**
   * Set up info panel.
   */
  private void setupPanel()
  {
    final Box panel_box = new Box(BoxLayout.PAGE_AXIS);
    
    final JLabel level_label = new JLabel("Level:");
    final JLabel lines_to_clear_label = new JLabel("Lines to clear:");
    final JLabel score_label = new JLabel("Score:");
    
    panel_box.add(level_label);
    panel_box.add(my_level_number_label);
    panel_box.add(lines_to_clear_label);
    panel_box.add(my_lines_left_label);
    panel_box.add(score_label);
    panel_box.add(my_score_label);
    add(panel_box);
  }
  
  /**
   * {@inheritDoc}
   */
  @Override
  public void update(final Observable the_obj, final Object the_arg)
  {
    if (the_arg.getClass() == Integer.class)
    {
      final int lines_left = (Integer) the_arg;
      
      my_current_score += SCORE_MULTIPLIER * my_current_level;

      my_lines_left_label.setText(Integer.toString(lines_left));
      my_score_label.setText(Integer.toString(my_current_score));
      
      if (lines_left == 0 && my_current_level != MAX_LEVEL)
      {
        my_current_level++;
        my_level_number_label.setText(Integer.toString(my_current_level));
        my_lines_left_label.setText(Integer.toString(LINES_LEFT));
        my_tetris_panel.setTimerDelay(my_current_level);
      }
    }
  }
  
  /**
   * Resets items on panel.
   * 
   * @param the_board tetris board.
   */
  public void newGame(final Board the_board)
  {
    my_board = the_board;
    my_board.addObserver(this);
    my_lines_left_label.setText(Integer.toString(LINES_LEFT));
    my_current_level = 1;
    my_level_number_label.setText(Integer.toString(my_current_level));
    my_current_score = 0;
    my_score_label.setText(Integer.toString(my_current_score));
  }
}
