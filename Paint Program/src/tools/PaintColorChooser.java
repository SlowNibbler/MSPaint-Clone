// TCSS 305 Assignment 5 - Paint
package tools;

import java.awt.Color;
import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;
import javax.swing.JColorChooser;
import view.PaintGUIPanel;

/**
 * 
 * @author jamesm47
 * @version 11/23/18
 */
@SuppressWarnings("serial")
public class PaintColorChooser extends AbstractAction {


    
    /**
     * Constructor for the color chooser.
     * @param theName the title of the chooser.
     */
    public PaintColorChooser(final String theName) {
        super(theName);
    }
    
    /**
     * listens for the color button to be clicked and displays a color chooser.
     * @param theEvent the button click.
     */
    public void actionPerformed(final ActionEvent theEvent) {
        final Color result = JColorChooser.showDialog(null, "Color Chooser", 
                                                      PaintGUIPanel.getCurrentColor());
        if (result != null) {
            PaintGUIPanel.setCurrentColor(result);
        }

    }
    
}
