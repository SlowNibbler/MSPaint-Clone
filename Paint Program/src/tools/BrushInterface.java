// TCSS 305 Assignment 5 - Paint
package tools;

import java.awt.Point;
import java.awt.Shape;

/**
 * 
 * @author jamesm47
 * @version 11/23/18
 */
public interface BrushInterface {
    /**
     * empty method for get shape.
     * @return the brushes shape.
     */
    Shape getShape();
    
    /**
     * empty method for set start.
     * @param theNewStart the new start point.
     */
    void setStart(Point theNewStart);
    
    /**
     * empty method for get start.
     * @return the start point.
     */
    Point getStart();
    
    /**
     * empty method for get end.
     * @return the end point.
     */
    Point getEnd(); 
    
    /**
     * empty method for set end.
     * @param theNewEnd the new end point.
     */
    void setEnd(Point theNewEnd);
    
}
