// TCSS 305 Assignment 5 - Paint
package tools;

import java.awt.Rectangle;
import java.awt.Shape;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import view.PaintGUIPanel;


/**
 * 
 * @author jamesm47
 * @version 11/23/18
 */
@SuppressWarnings("serial")
public class RectangleBrush extends AbstractBrush {
    /***Initializes the rectangle icon.*/
    private static ImageIcon rectangleIcon = new ImageIcon("resources//rectangle.gif");
    /***Initializes the panel to paint on.*/
    private final PaintGUIPanel myPanel;
    
    /**
     * Constructor for rectangle brush.
     * @param thePanel the panel to draw on.
     */
    public RectangleBrush(final PaintGUIPanel thePanel) {
        super("Rectangle", rectangleIcon, thePanel);
        myPanel = thePanel;
    }
    
    
    /**
     * get shape returns a rectangle based on the start and end points.
     * @return an rectangle shape
     */
    public Shape getShape() {
        final Rectangle rectangleShape;
        final int rectX = Math.min(super.getStart().x, super.getEnd().x);
        final int rectY = Math.min(super.getStart().y, super.getEnd().y);
        final int rectWidth = Math.abs(super.getStart().x - super.getEnd().x);
        final int rectHeight = Math.abs(super.getStart().y - super.getEnd().y);
        rectangleShape = new Rectangle(rectX, rectY, rectWidth, rectHeight);
        return rectangleShape;
    }
    
 


    /**
     * Sets the current brush to rectangle.
     * @Override
     * @param theEvent the button click.
     */
    public void actionPerformed(final ActionEvent theEvent) {
        myPanel.setCurrentBrush(this);
    }


}
