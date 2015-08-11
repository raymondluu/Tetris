/*
 * Raymond Luu
 * 
 * TCSS 305 - Winter 2012
 * Tetris Project - Part 3
 */
package gui;

import sounds.SoundPlayer;

/**
 * Tetris main class for GUI.
 * 
 * @author Raymond Luu
 * @version February 28, 2012
 */
public final class TetrisMain
{
  
  /**
   * Private Constructor.
   */
  private TetrisMain()
  {
    // do nothing.
  }
  
  /**
   * @param the_args the argument.
   */
  public static void main(final String[] the_args)
  {
    new TetrisGUI().setup();
    
    new SoundPlayer().loop("tetris/audio/TETRISB.MID");
  }

}
