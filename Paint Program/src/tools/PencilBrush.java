// TCSS 305 Assignment 5 - Paint
package tools;

import java.awt.Point;
import java.awt.Shape;
import java.awt.event.ActionEvent;
import java.awt.geom.Line2D;
import java.awt.geom.Path2D;
import javax.swing.ImageIcon;
import view.PaintGUIPanel;

/**
 * 
 * @author jamesm47
 * @version 11/23/18
 */
@SuppressWarnings("serial")
public class PencilBrush extends AbstractBrush {
    /***Initializes the pencil icon.*/
    private static ImageIcon pencilIcon = new ImageIcon("resources//pencil.gif");
    /***Initializes the panel to paint on.*/
    private final PaintGUIPanel myPanel;
    /***Initializes the last x value.*/
    private int myLastEndx;
    /***Initializes the last y value.*/
    private int myLastEndy;
    /***Initializes a path to be added to.*/
    private Path2D myPath = new Path2D.Double();
    
    /**
     * Constructor for the pencil brush.
     * @param thePanel the panel that will be drawn on.
     */
    public PencilBrush(final PaintGUIPanel thePanel) {
        super("Pencil", pencilIcon, thePanel);
        myPanel = thePanel;
    }
    
    
    /**
     * returns a path according to the start and end points.
     * @return the drawn path.
     */
    public Shape getShape() {
        final Path2D newPath = new Path2D.Double();
        if (myLastEndx == 0) {
            newPath.moveTo(super.getStart().x, super.getStart().y);
            myLastEndx = super.getStart().x;
            myLastEndy = super.getStart().y;
            myPath = newPath;    
            return newPath;
        } else {
            newPath.append(myPath, true);
            newPath.append(new Line2D.Double(myLastEndx, myLastEndy, 
                           super.getEnd().x, super.getEnd().y), true);
            myLastEndx = super.getEnd().x;
            myLastEndy = super.getEnd().y;
            myPath = newPath;
            return newPath;
        }
    }
    
    /**
     * sets the start point the same way abstract brush does, 
     * but also resets the last end x and y.
     * @param theNewStart the new start point.
     */
    public void setStart(final Point theNewStart) {
        super.setStart(theNewStart);
        if (theNewStart == null) {
            myLastEndx = 0;
            myLastEndy = 0;
        }        
    }
    

    /**
     * Sets the current brush to pencil.
     * @Override
     * @param theEvent the button click.
     */
    public void actionPerformed(final ActionEvent theEvent) {
        myPanel.setCurrentBrush(this);
    }


}
