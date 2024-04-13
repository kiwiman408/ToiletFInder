package org.example.panels;


import javafx.embed.swing.JFXPanel;
import org.example.panels.subpanels.InfoPanelMiniature;

import javax.swing.*;
import java.awt.*;

public class MapPanel extends JPanel{

    JPanel infoPanel;
    JPanel mapGraphicPanel;

    JFXPanel jfxPanel = new JFXPanel();

    //these imageicons are for tests
    ImageIcon testIcons;

    private InfoPanelMiniature infoPanelMiniature;

    private JButton getReviewPanel;
    private JButton extendInformationPanel;
    private JButton changeLocation;


    public MapPanel(PanelManager panelManager){
        setLayout(new BorderLayout());
        setPreferredSize(new Dimension(800, 600));


        getReviewPanel = new JButton("Check Reviews");
        extendInformationPanel = new JButton("Get Extended Information");
        changeLocation = new JButton("Switch Map");
        infoPanelMiniature = new InfoPanelMiniature();

        this.add(infoPanelMiniature);
//        this.add(getReviewPanel);
//        this.add(extendInformationPanel);
//        this.add(changeLocation);

        this.setBackground(Color.LIGHT_GRAY);
        this.setDoubleBuffered(true);
        this.setFocusable(true);
    }
}
