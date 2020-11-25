// TCSS 305 Assignment 5 - Paint
package tools;

import java.awt.Shape;
import java.awt.event.ActionEvent;
import java.awt.geom.Ellipse2D;
import javax.swing.ImageIcon;
import view.PaintGUIPanel;


/**
 * 
 * @author jamesm47
 * @version 11/23/18
 */
@SuppressWarnings("serial")
public class EllipseBrush extends AbstractBrush {
    /***Initializes the ellipse icon.*/
    private static ImageIcon ellipseIcon = new ImageIcon("resources//ellipse.gif");
    /***Initializes the panel to paint on.*/
    private final PaintGUIPanel myPanel;
    
    /**
     * constructor for ellipse brush.
     * @param thePanel the panel that it will draw on.
     */
    public EllipseBrush(final PaintGUIPanel thePanel) {
        super("Ellipse", ellipseIcon, thePanel);
        myPanel = thePanel;
    }
    
    
    /**
     * get shape returns an ellipse based on the start and end points.
     * @return an ellipse shape
     */
    public Shape getShape() {
        final Ellipse2D ellipseShape;
        final int ellipX = Math.min(super.getStart().x, super.getEnd().x);
        final int ellipY = Math.min(super.getStart().y, super.getEnd().y);
        final int ellipWidth = Math.abs(super.getStart().x - super.getEnd().x);
        final int ellipHeight = Math.abs(super.getStart().y - super.getEnd().y);
        ellipseShape = new Ellipse2D.Double(ellipX, ellipY, ellipWidth, ellipHeight);
        return ellipseShape;
    }
    /**
     * Sets the current brush to ellipse.
     * @Override
     * @param theEvent the button click.
     */
    public void actionPerformed(final ActionEvent theEvent) {
        myPanel.setCurrentBrush(this);
    }


}
