// TCSS 305 Assignment 5 - Paint
package view;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import javax.swing.Action;
import javax.swing.JPanel;
import tools.AbstractBrush;
import tools.EllipseBrush;
import tools.LineBrush;
import tools.PencilBrush;
import tools.RectangleBrush;

/**
 * 
 * @author jamesm47
 * @version 11/23/18
 */
@SuppressWarnings("serial")
public class PaintGUIPanel extends JPanel implements PropertyChangeListener {
    /***Initializes the current color to UW purple.*/
    private static Color currentColor = Color.decode("#4b2e83");
    /***Initializes the current thickness to 2.*/
    private static int currentThickness = 2;
    /***Initializes a pencil brush to the panel.*/
    protected PencilBrush myPencilTool = new PencilBrush(this);
    /***Initializes a line brush to the panel.*/
    protected LineBrush myLineTool = new LineBrush(this);
    /***Initializes a rectangle brush to the panel.*/
    protected RectangleBrush myRectangleTool = new RectangleBrush(this);
    /***Initializes an ellipse brush to the panel.*/
    protected EllipseBrush myEllipseTool = new EllipseBrush(this);
    /***Initializes the currentBrush variable.*/
    protected Action myCurrentBrush;

    /**
     * Sets up the JPannel to draw on.
     */
    public PaintGUIPanel() {
        super();
        setBackground(Color.WHITE);
        addMouseListener(new MyMouseListener());
        addMouseMotionListener(new MyMouseListener());
    }
    /**
     * Paints the shapes that have been saved in PaintShapes.
     * @Override
     * @param theGraphics default parameter.
     */
    public void paintComponent(final Graphics theGraphics) {
        super.paintComponent(theGraphics);
        final Graphics2D g2d = (Graphics2D) theGraphics;
        g2d.setColor(currentColor);
        g2d.setStroke(new BasicStroke(currentThickness));
        if (((AbstractBrush) myCurrentBrush).getStart() != null) {
            firePropertyChange("draw", null, null);
            g2d.draw(((AbstractBrush) myCurrentBrush).getShape());
        }
        for (int i = 0; i < PaintShapes.getShapeArray().size(); i++) {
            g2d.setColor(PaintShapes.getColorArray().get(i));
            g2d.setStroke(new BasicStroke(PaintShapes.getThicknessArray().get(i)));
            g2d.draw(PaintShapes.getShapeArray().get(i));
        }
        


    }
    
    /**
     * returns the current color.
     * @return the current color.
     */
    public static Color getCurrentColor() {
        return currentColor;
    }
    /**
     * sets the current color to the new color.
     * @param theNewColor color that was chosen.
     */
    public static void setCurrentColor(final Color theNewColor) {
        currentColor = theNewColor;
    }
    /**
     * sets the current thickness value.
     * @param theNewThick the chosen value from the thickness slider.
     */
    public static void setThickness(final int theNewThick) {
        currentThickness = theNewThick;
    }
    /**
     * sets the current brush.
     * @param theNewBrush the selected brush action.
     */
    public void setCurrentBrush(final Action theNewBrush) {
        firePropertyChange("brush", null, theNewBrush);
        myCurrentBrush = theNewBrush;
    }
    
    /**
     * Listens for the clear button, and clears the panel.
     * @param theEvent is the clear button click.
     */
    public void propertyChange(final PropertyChangeEvent theEvent) {
        if ("clear".equals(theEvent.getPropertyName())) {
            PaintShapes.clearLists();
            repaint();
        }
    }
    
    /**
     * Custom mouse listeners for the JPannel.
     * @author jamesm47
     *
     */
    class MyMouseListener extends MouseAdapter {
        
        @Override
        public void mousePressed(final MouseEvent theClick) {
            ((AbstractBrush) myCurrentBrush).setStart(theClick.getPoint());
        }
        @Override
        public void mouseReleased(final MouseEvent theRelease) {
            ((AbstractBrush) myCurrentBrush).setEnd(theRelease.getPoint());
            PaintShapes.addShape(((AbstractBrush) myCurrentBrush).getShape());
            PaintShapes.addColor(currentColor);
            PaintShapes.addThickness(currentThickness);
            ((AbstractBrush) myCurrentBrush).setStart(null);
            ((AbstractBrush) myCurrentBrush).setEnd(null);

            repaint();
            

        }

        @Override
        public void mouseDragged(final MouseEvent theDrag) {
            ((AbstractBrush) myCurrentBrush).setEnd(theDrag.getPoint());
            repaint();
        }
        @Override
        public void mouseEntered(final MouseEvent theEntered) {
            setCursor(Cursor.getPredefinedCursor(Cursor.CROSSHAIR_CURSOR));
        }
    }
}
