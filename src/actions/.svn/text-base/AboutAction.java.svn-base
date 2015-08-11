/*
 * Raymond Luu
 * 
 * TCSS 305 - Winter 2012
 * Tetris Project - part 3
 */
package actions;

import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;

import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.JOptionPane;
/**
 * About Action.
 * 
 * @author Raymond Luu
 * @version March 2, 2012
 */
public class AboutAction extends AbstractAction
{
  
  /**
   * Constant for About string.
   */
  private static final String ABOUT = "About";
  
  /**
   * Constructs an About Action.
   */
  public AboutAction()
  {
    super(ABOUT);
    putValue(Action.MNEMONIC_KEY, KeyEvent.VK_A);
  }
  
  /**
   * {@inheritDoc}
   */
  @Override
  public void actionPerformed(final ActionEvent the_action)
  {
    JOptionPane.showMessageDialog(null,
                                  "TCSS 305 Tetris, Winter 2012\n" +
                                  "by Raymond Luu\n\n" +
                                  "Controls:\n" +
                                  "Left - Move piece left\n" +
                                  "Right - Move piece right\n" +
                                  "Up - Rotate piece\n" +
                                  "Spacebar - Hard drop",
                                  ABOUT,
                                  JOptionPane.INFORMATION_MESSAGE);
  }
  
}
