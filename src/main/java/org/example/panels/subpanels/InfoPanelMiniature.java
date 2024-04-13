package org.example.panels.subpanels;

import javax.swing.*;
import java.awt.*;

public class InfoPanelMiniature extends JPanel{
    private JLabel toiletName;
    private JLabel rating;
    private JLabel occupancy;


    private JPanel backgoundColorPanel;

    //no good solution here i can come up
    private JButton invisibleButtons;

    //this will need to be updated continuously
    public InfoPanelMiniature(){

        backgoundColorPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));

        backgoundColorPanel.setBackground(Color.PINK);
        backgoundColorPanel.setPreferredSize(new Dimension(200,100));
        this.add(backgoundColorPanel);

        toiletName = new JLabel("Restroom Name: ");
        rating = new JLabel("Average Rating: ");
        occupancy = new JLabel("Occupancy level:");
        rating = new JLabel("Rating: ");

        backgoundColorPanel.add(toiletName);
        backgoundColorPanel.add(rating);
        backgoundColorPanel.add(occupancy);
        backgoundColorPanel.add(rating);
    }



}
