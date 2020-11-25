// TCSS 305 Assignment 5 - Paint
package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.HashMap;
import java.util.Map;
import javax.swing.Action;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.JSlider;
import javax.swing.SwingConstants;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import tools.PaintColorChooser;

/**
 * 
 * @author jamesm47
 * @version 11/23/18
 */
@SuppressWarnings("serial")
public class PaintGUIMenuBar extends JMenuBar implements PropertyChangeListener {

    /***Initializes the slider for thickness.*/
    private JSlider myThickSlider;
    /***Initializes the options menu.*/
    private final JMenu myOptionsMenu;
    /***Initializes the tools menu.*/
    private final JMenu myToolsMenu;
    /***Initializes the help menu.*/
    private final JMenu myHelpMenu;
    /***Initializes the subMenu for the thickness slider.*/
    private JMenu myThickSliderMenu;
    /***Initializes the clear item.*/
    private JMenuItem myClear;
    /***Initializes the button group for the brushes.*/
    private final ButtonGroup myBrushes;
    /***Initializes the color chooser.*/
    private final PaintColorChooser myColorChooser;
    /***Creates a map of the brushes and their names.*/
    private final Map<String, JRadioButtonMenuItem> myBrushMap = 
                    new HashMap<String, JRadioButtonMenuItem>();
    

    /**
     * creates a menu bar for the PaintGUI.
     * @param theColorChooser the passed in color chooser.
     * @param theBrushes the list of brushes actions.
     * @param theFrame the JFrame for the application.
     */
    public PaintGUIMenuBar(final PaintColorChooser theColorChooser, 
                           final Action[] theBrushes, final JFrame theFrame) {
        super();

        myOptionsMenu = new JMenu("Options");
        myToolsMenu = new JMenu("Tools");
        myHelpMenu = new JMenu("Help");
        myBrushes = new ButtonGroup();
        myColorChooser = theColorChooser;
        for (final Action action : theBrushes) {
            myToolsMenu.add(createMenuButton(action));
        }
        setup();
    }
    
    /**
     * sets up the sub menus and items for the menu bar. 
     */
    private void setup() {
        
        //sets up the thickness slider.
        myThickSlider = new JSlider(SwingConstants.HORIZONTAL, 0, 15, 5);
        myThickSliderMenu = new JMenu("Thickness");
        myThickSlider.setMajorTickSpacing(5);
        myThickSlider.setMinorTickSpacing(1);
        myThickSlider.setPaintLabels(true);
        myThickSlider.setPaintTicks(true);
        myThickSlider.setValue(2);
        myThickSlider.addChangeListener(new ThickListener());
        myOptionsMenu.add(myThickSliderMenu);
        myThickSliderMenu.add(myThickSlider);
        myOptionsMenu.addSeparator();
        
        //sets up the color chooser.
        final JMenuItem color = new JMenuItem("Color...");
        color.setAction(myColorChooser);
        myOptionsMenu.add(color);
        myOptionsMenu.addSeparator();

        
        //sets up the clear option.
        myClear = new JMenuItem("Clear");
        myClear.addActionListener(new ClearListener());
        myClear.setEnabled(false);
        myOptionsMenu.add(myClear);
        
        //sets up the about option.
        final JMenuItem about = new JMenuItem("About...");
        about.addActionListener(new AboutListener());
        myHelpMenu.add(about);
        
        //adds everything to the menu bar.
        this.add(myOptionsMenu);
        this.add(myToolsMenu);
        this.add(myHelpMenu);
    }
    
    /**
     * Method to create the menu buttons for the brushes in a loop.
     * @param theAction is the passed brush.
     * @return a JRadioButtonMenuItem for a brush.
     */
    public JRadioButtonMenuItem createMenuButton(final Action theAction) {
        final JRadioButtonMenuItem createdButton = new JRadioButtonMenuItem(theAction);
        myBrushes.add(createdButton);
        myBrushMap.put(theAction.toString(), createdButton);
        return createdButton;
    }
    
    /**
     * Property change listener for the menu bar.
     * Listens for brush changes and painting.
     * @param theEvent is a property change.
     */
    public void propertyChange(final PropertyChangeEvent theEvent) {
        // Synchronizes the selected brush with the toolbar.
        if ("brush".equals(theEvent.getPropertyName())) {
            theEvent.getNewValue().getClass().getSimpleName();
            myBrushes.setSelected(myBrushMap.get(theEvent.getNewValue().
                                  getClass().getSimpleName()).getModel(), true); 
        // Toggles the clear button based on whether there is drawings on the panel.
        } else if ("draw".equals(theEvent.getPropertyName())) {
            myClear.setEnabled(true);
        }
    }
    
    /**
     * listener for the thickness slider.
     * @author jamesm47
     *
     */
    class ThickListener implements ChangeListener {
        /**
         * stateChanged for the thickness slider.
         * @param theEvent the change in the slider.
         */
        public void stateChanged(final ChangeEvent theEvent) {
            PaintGUIPanel.setThickness((int) myThickSlider.getValue());
        }
    }
    

    /**
     * listener for the clear button.
     * @author jamesm47
     *
     */
    
    class ClearListener implements ActionListener {
        /**
         * actionPerformed for the clear button.
         * @param theEvent the button being pressed.
         */
        public void actionPerformed(final ActionEvent theEvent) {
            myClear.setEnabled(false);
            firePropertyChange("clear", null, null);            
        }
    }
    
    /**
     * listener for the about button.
     * @author jamesm47
     *
     */
    class AboutListener implements ActionListener {
        /**
         * actionPerformed for the about button.
         * @param theEvent the button being pressed.
         */
        public void actionPerformed(final ActionEvent theEvent) {  
            JOptionPane.showMessageDialog(null, "Autmn 2018 \nJames McHugh",
                                          "TCSS 3013 - Paint Program", 
                                          JOptionPane.INFORMATION_MESSAGE, 
                                          new ImageIcon("resources//uw_paint_icon.jpg"));
                                       
        }
    }
}
