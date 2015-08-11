/*
 * Raymond Luu
 * 
 * TCSS 305 - Winter 2012
 * Tetris Project - part 4
 */
package actions;

import gui.TetrisPanel;

import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;

import javax.swing.AbstractAction;
import javax.swing.Action;

/**
 * End game Action.
 * 
 * @author Raymond Luu
 * @version March 9, 2012
 */
public class EndGameAction extends AbstractAction
{
  
  /**
   * String representation for End game.
   */
  private static final String END_GAME = "End Game";
  
  /**
   * Tetris panel.
   */
  private final TetrisPanel my_panel;
  
  /**
   * Pause action.
   */
  private final Action my_pause_action;
  
  /**
   * Constructs a End game action.
   * 
   * @param the_panel panel.
   * @param the_pause_action pause action.
   */
  public EndGameAction(final TetrisPanel the_panel,
                       final Action the_pause_action)
  {
    super(END_GAME);
    my_panel = the_panel;
    my_pause_action = the_pause_action;
    putValue(Action.MNEMONIC_KEY, KeyEvent.VK_E);
  }
  
  /**
   * {@inheritDoc}
   */
  @Override
  public void actionPerformed(final ActionEvent the_action)
  {
    my_panel.stop();
    my_panel.removeKeyListener();
    my_pause_action.setEnabled(false);
  }
}
