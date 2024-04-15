package org.example.panels;


import javafx.embed.swing.JFXPanel;
import org.example.panels.subpanels.InfoPanelMiniature;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class MapPanel extends JPanel{

    JPanel infoPanel;
    JPanel mapGraphicPanel;

    JFXPanel jfxPanel = new JFXPanel();

    //these imageicons are for tests
    ImageIcon testIcons;

    private BufferedImage image;

    private InfoPanelMiniature infoPanelMiniature;

    private JButton getReviewPanel;
    private JButton extendInformationPanel;
    private JButton changeLocation;


    public MapPanel(PanelManager panelManager){

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

//        add(image);
//        add(extendInformationPanel);
//        add(changeLocation);
//        add(infoPanelMiniature );

        add(infoPanelMiniature, BorderLayout.SOUTH);

//        this.add(getReviewPanel);
//        this.add(extendInformationPanel);
//        this.add(changeLocation);

        this.setBackground(Color.LIGHT_GRAY);
        this.setDoubleBuffered(true);
        this.setFocusable(true);
    }
}
