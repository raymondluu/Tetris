/*
 * Raymond Luu
 * 
 * TCSS 305 - Winter 2012
 * Tetris Project - part 3
 */
package gui;

import actions.AboutAction;

import java.awt.event.KeyEvent;

import javax.swing.Action;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

/**
 * Tetris Menu bar.
 * 
 * @author Raymond Luu
 * @version March 2, 2012
 */
public class TetrisMenuBar extends JMenuBar
{
  
  /**
   * Game menu.
   */
  private final JMenu my_game = new JMenu("Game");
  
  /**
   * Help menu.
   */
  private final JMenu my_help = new JMenu("Help");
  
  /**
   * Constructs menu bar.
   */
  public TetrisMenuBar()
  {
    super();
    addMenus();
    setMnemonics();
  }
  
  /**
   * Private constructor helper method to add menus.
   */
  private void addMenus()
  {
    add(my_game);
    add(my_help);
  }
  
  /**
   * Private constructor helper method to set mnemonics.
   */
  private void setMnemonics()
  {
    my_game.setMnemonic(KeyEvent.VK_G);
    my_help.setMnemonic(KeyEvent.VK_H);
  }
  
  /**
   * Creates game menu buttons.
   * 
   * @param the_action action.
   */
  public void createGameMenuButtons(final Action the_action)
  {
    final JMenuItem game_button = new JMenuItem(the_action);
    
    my_game.add(game_button);
  }
  /**
   * Creates Help menu items.
   */
  public void createHelpMenuButtons()
  {
    final JMenuItem about_button = new JMenuItem(new AboutAction());
    
    my_help.add(about_button);
  }
}
