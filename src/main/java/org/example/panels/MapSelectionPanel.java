package org.example.panels;

import javax.swing.*;
import java.awt.*;

//let's not do this
public class MapSelectionPanel extends JPanel{

    JLabel jabel = new JLabel("SELECT NEW MAP");
    JButton map1, map2, map3;
    public MapSelectionPanel(){

        map1 = new JButton("STANISLAUS STATE");
        map2 = new JButton("LOS BANOS");
        map3 = new JButton("SOMEWHERE");

        this.setBackground(Color.WHITE);
        this.setDoubleBuffered(true);
        this.setFocusable(true);
    }
}
