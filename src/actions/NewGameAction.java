/*
 * Raymond Luu
 * 
 * TCSS 305 - Winter 2012
 * Tetris Project - part 4
 */
package actions;

import gui.InfoPanel;
import gui.NextPiecePanel;
import gui.TetrisPanel;

import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;

import javax.swing.AbstractAction;
import javax.swing.Action;

/**
 * New Game Action.
 * 
 * @author Raymond Luu
 * @version March 8, 2012
 */
public class NewGameAction extends AbstractAction
{
  
  /**
   * String representation of new game.
   */
  private static final String NEWGAME = "New Game";
  
  /**
   * Tetris panel.
   */
  private final TetrisPanel my_panel;
  
  /**
   * Next Piece panel.
   */
  private final NextPiecePanel my_next_piece_panel;
  
  /**
   * Info panel.
   */
  private final InfoPanel my_info_panel;
  
  /**
   * Pause action.
   */
  private final PauseAction my_pause_action;
  
  /**
   * Constructs new game action.
   * 
   * @param the_panel panel.
   * @param the_next_piece_panel next piece panel.
   * @param the_info_panel info panel.
   * @param the_pause_action the pause action.
   */
  public NewGameAction(final TetrisPanel the_panel,
                       final NextPiecePanel the_next_piece_panel,
                       final InfoPanel the_info_panel,
                       final PauseAction the_pause_action)
  {
    super(NEWGAME);
    my_panel = the_panel;
    my_next_piece_panel = the_next_piece_panel;
    my_info_panel = the_info_panel;
    my_pause_action = the_pause_action;
    putValue(Action.MNEMONIC_KEY, KeyEvent.VK_N);
  }
  
  /**
   * {@inheritDoc}
   */
  @Override
  public void actionPerformed(final ActionEvent the_action)
  {
    my_panel.newGame();
    my_next_piece_panel.newGame(my_panel.getBoard());
    my_info_panel.newGame(my_panel.getBoard());
    my_pause_action.setEnabled(true);
    my_pause_action.changeButton();
  }
}
