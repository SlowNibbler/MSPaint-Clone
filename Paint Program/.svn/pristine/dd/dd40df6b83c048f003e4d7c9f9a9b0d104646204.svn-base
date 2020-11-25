// TCSS 305 Assignment 5 - Paint
package tools;

import java.awt.Shape;
import java.awt.event.ActionEvent;
import java.awt.geom.Line2D;
import javax.swing.ImageIcon;
import view.PaintGUIPanel;


/**
 * 
 * @author jamesm47
 * @version 11/23/18
 */
@SuppressWarnings("serial")
public class LineBrush extends AbstractBrush {
    /***Initializes the line icon.*/
    private static ImageIcon lineIcon = new ImageIcon("resources//line.gif");
    /***Initializes the panel to paint on.*/
    private final PaintGUIPanel myPanel;
    
    /**
     * constructor for line brush.
     * @param thePanel the panel that it will draw on.
     */
    public LineBrush(final PaintGUIPanel thePanel) {
        super("Line", lineIcon, thePanel);
        myPanel = thePanel;
    }
    /**
     * get shape returns a line based on the start and end points.
     * @return a line.
     */
    public Shape getShape() {
        final Line2D line = new Line2D.Double(super.getStart().x, 
                            super.getStart().y, super.getEnd().x, super.getEnd().y);
        return line;
    }
    
    /**
     * Sets the current brush to line.
     * @Override
     * @param theEvent the button click.
     */
    public void actionPerformed(final ActionEvent theEvent) {
        myPanel.setCurrentBrush(this);
    }


}
