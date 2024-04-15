package org.example.panels;


import javafx.embed.swing.JFXPanel;
import org.example.panels.subpanels.InfoPanelMiniature;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class MapPanel extends JPanel{

    JPanel infoPanel;
    JPanel mapGraphicPanel;

    //these imageicons are for tests


    private BufferedImage image;

    private InfoPanelMiniature infoPanelMiniature;

    private JButton getReviewPanel;
    private JButton extendInformationPanel;
    private JButton changeLocation;


    ImageIcon icon = new ImageIcon("Assets/images/pixil-frame-0.png"); // Replace "icon.png" with the path to your icon image file

    // Create a list array to hold the icons
//    List<> iconList = new ArrayList<>();

    // Add 50 icons to the list array using a for loop
    public MapPanel(PanelManager panelManager){
//        List<JLabel> iconList = new ArrayList<>();
//
//        JLabel mainLabel = new JLabel(mainImageIcon);

        ////////////////////////////////////////////////////////////////////
        //Map Image Stuff
        try {
            image = ImageIO.read(new File("Assets/images/campus-2021.png"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        JLabel label = new JLabel(new ImageIcon(image));
        label.setBounds(this.getWidth()/2, this.getWidth()/2, image.getWidth(), image.getHeight());
        this.add(label);

        ////////////////////////////////////////////////////////////////////

//        setLayout(new BorderLayout());
//        setPreferredSize(new Dimension(800, 600));

        getReviewPanel = new JButton("Check Reviews");
        extendInformationPanel = new JButton("Get Extended Information");
        changeLocation = new JButton("Switch Map");
        infoPanelMiniature = new InfoPanelMiniature(panelManager);

        add(infoPanelMiniature, BorderLayout.SOUTH);

        this.setBackground(Color.LIGHT_GRAY);
        this.setDoubleBuffered(true);
        this.setFocusable(true);
    }
}
