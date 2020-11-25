// TCSS 305 Assignment 5 - Paint

package view;

import java.awt.EventQueue;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;


/**
 * 
 * @author jamesm47
 * @version 11/23/18
 */
public final class PaintMain {
    /**
     * Empty constructor for PaintMain.
     */
    private PaintMain() {
        
    }
    /**
     * Sets the look and feel to metal.
     */
    private static void setLookAndFeel() {
        
        try {
            UIManager.setLookAndFeel("javax.swing.plaf.metal.MetalLookAndFeel");
        
        } catch (final UnsupportedLookAndFeelException e) {
            System.out.println("UnsupportedLookAndFeelException");
        } catch (final ClassNotFoundException e) {
            System.out.println("ClassNotFoundException");
        } catch (final InstantiationException e) {
            System.out.println("InstantiationException");
        } catch (final IllegalAccessException e) {
            System.out.println("IllegalAccessException");
        }
        
    }

    /**
     * Main method for the Paint application, starts a GUI.
     * @param theArgs default argument.
     */
    public static void main(final String[] theArgs) {
        EventQueue.invokeLater(new Runnable() {
            @Override
              public void run() {
                setLookAndFeel();
                new PaintGUI().start();
            }
        });
    }
}
