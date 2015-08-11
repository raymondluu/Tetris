/*
 * Raymond Luu
 * 
 * TCSS 305 - Winter 2012
 * Tetris Project - part 3
 */
package gui;

import actions.EndGameAction;
import actions.NewGameAction;
import actions.PauseAction;
import board.Board;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.Action;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * TetrisGUI object class.
 * 
 * @author Raymond Luu
 * @version February 28, 2012
 */
public class TetrisGUI
{
  
  /**
   * Top and bottom vertical strut for box layout.
   */
  private static final int OUTSIDE_VERTICAL_STRUT = 50;
  
  /**
   * Middle vertical strut for box layout.
   */
  private static final int MIDDLE_VERTICAL_STRUT = 225;
  
  /**
   * Tetris Dimensions.
   */
  private static final Dimension TETRIS_DIMENSION = new Dimension(425, 700);
  
  /**
   * Tetris board.
   */
  private final Board my_board = new Board();
  
  /**
   * Center panel.
   */
  private final JPanel my_center_panel = new JPanel();
  
  /**
   * East panel.
   */
  private final JPanel my_east_panel = new JPanel();
  
  /**
   * Tetris panel.
   */
  private TetrisPanel my_tetris_panel;
  
  /**
   * Next piece panel.
   */
  private NextPiecePanel my_next_panel;
  
  /**
   * Info panel.
   */
  private InfoPanel my_info_panel;
  
  /**
   * Setup Tetris GUI.
   */
  public void setup()
  {
    final JFrame frame = new JFrame("Tetris");
    final TetrisMenuBar menus = new TetrisMenuBar();
    final JPanel main_panel = new JPanel();
    
    my_tetris_panel = new TetrisPanel(my_board);
    
    my_next_panel = new NextPiecePanel(my_board);
    my_next_panel.setBackground(Color.WHITE);
    
    my_info_panel = new InfoPanel(my_board, my_tetris_panel);
    my_info_panel.setBackground(Color.WHITE);
    
    setupEastPanel();
    setupCenterPanel();
    
    final PauseAction pause_game = new PauseAction(my_tetris_panel);
    menus.createGameMenuButtons(pause_game);
    
    final NewGameAction new_game = new NewGameAction(my_tetris_panel,
                                        my_next_panel,
                                        my_info_panel,
                                        pause_game);
    menus.createGameMenuButtons(new_game);
    
    final EndGameAction end_game = new EndGameAction(my_tetris_panel, pause_game);
    menus.createGameMenuButtons(end_game);
    
    menus.createHelpMenuButtons();
    
    main_panel.add(my_center_panel, BorderLayout.CENTER);
    main_panel.add(my_east_panel, BorderLayout.EAST);

    
    frame.setJMenuBar(menus);
    frame.add(main_panel, BorderLayout.CENTER);
    
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setPreferredSize(TETRIS_DIMENSION);
    frame.setResizable(false);
    frame.pack();
    frame.setLocationRelativeTo(null);
    frame.setVisible(true);
    my_tetris_panel.start();
  }
  
  /**
   * Setup east panel.
   */
  private void setupEastPanel()
  {
    my_east_panel.setBackground(Color.BLACK);
    
    final Box east_box = new Box(BoxLayout.PAGE_AXIS);
    east_box.add(Box.createVerticalStrut(OUTSIDE_VERTICAL_STRUT));
    east_box.add(my_next_panel);
    east_box.add(Box.createVerticalStrut(MIDDLE_VERTICAL_STRUT));
    east_box.add(my_info_panel);
    east_box.add(Box.createVerticalStrut(OUTSIDE_VERTICAL_STRUT));
    
    my_east_panel.add(east_box);
  }
  
  /**
   * Setup center panel.
   */
  private void setupCenterPanel()
  {
    my_center_panel.setBackground(Color.GREEN);
    
    my_center_panel.add(my_tetris_panel);
  }
}
