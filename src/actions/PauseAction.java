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
 * Pause Action.
 * 
 * @author Raymond Luu
 * @version March 8, 2012
 */
public class PauseAction extends AbstractAction
{
  
  /**
   * String representation for Pause.
   */
  private static final String PAUSE = "Pause";
  
  /**
   * String representation for Resume.
   */
  private static final String RESUME = "Resume";
  
  /**
   * Tetris panel.
   */
  private final TetrisPanel my_panel;
  
  /**
   * Switch for pause/resume.
   */
  private Boolean my_switch = false;
  
  /**
   * Constructs a Pause action.
   * 
   * @param the_panel panel.
   */
  public PauseAction(final TetrisPanel the_panel)
  {
    super(PAUSE);
    my_panel = the_panel;
    putValue(Action.MNEMONIC_KEY, KeyEvent.VK_P);
  }
  
  /**
   * {@inheritDoc}
   */
  @Override
  public void actionPerformed(final ActionEvent the_action)
  {
    if (my_switch)
    {
      my_panel.start();
      my_panel.addKeyListener();
      putValue(Action.NAME, PAUSE);
      putValue(Action.MNEMONIC_KEY, KeyEvent.VK_P);
      my_switch = false;
    }
    else if (!my_switch)
    {
      my_panel.stop();
      my_panel.removeKeyListener();
      putValue(Action.NAME, RESUME);
      putValue(Action.MNEMONIC_KEY, KeyEvent.VK_R);
      my_switch = true;
    }
  }
  
  /**
   * Change button from resume to pause.
   */
  public void changeButton()
  {
    putValue(Action.NAME, PAUSE);
    putValue(Action.MNEMONIC_KEY, KeyEvent.VK_P);
    my_switch = false;
  }
}
