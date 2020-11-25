// TCSS 305 Assignment 5 - Paint
package tools;

import java.awt.Point;
import java.awt.Shape;
import java.awt.geom.Line2D;
import javax.swing.AbstractAction;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

/**
 * 
 * @author jamesm47
 * @version 11/23/18
 */
@SuppressWarnings("serial")
public abstract class AbstractBrush extends AbstractAction implements BrushInterface {
    
    /***Initializes a start point for the shapes.*/
    protected Point myStart;
    /***Initializes an end point for the shapes.*/
    protected Point myEnd;
    /***Initializes a panel for the shapes.*/
    protected JPanel myPanel;
    
    /**
     * constructor for brushes.
     * @param theString the brush name.
     * @param theIcon the brush icon.
     * @param thePanel the panel to draw on.
     */
    public AbstractBrush(final String theString, 
                         final ImageIcon theIcon, 
                         final JPanel thePanel) {
        super(theString, theIcon);
        myPanel = thePanel;
    }
    
    /**
     * getShape acts like a line if for some reason it isn't implemented.
     * @return line a line shape.
     */
    public Shape getShape() {
        final Line2D line = new Line2D.Double(myStart.x, myStart.y, myEnd.x, myEnd.y);
        return line;
    }
    
    /**
     * toString method for brushes, returns the class name.
     * @return the class name.
     */
    public String toString() {
        return getClass().getSimpleName();
    }
    
    /**
     * sets the start point for brushes.
     * @param theNewStart the updated start point.
     */
    public void setStart(final Point theNewStart) {
        myStart = theNewStart;
    }
    
    /**
     * returns the start point.
     * @return the start point.
     */
    public Point getStart() {
        return myStart;
    }
    
    /** returns the end point.
     * @return the end point.
     */
    public Point getEnd() {
        return myEnd;
    }
    /**
     * sets the end point to the updated end point.
     * @param theNewEnd the updated end point.
     */
    public void setEnd(final Point theNewEnd) {
        myEnd = theNewEnd;
    }

    

}
