package org.example.panels;

import javax.swing.*;
import java.awt.*;

public class ReviewPanel extends JPanel {
    //draws from array

    private JButton jcomp4;
    private JPanel contentPane;
    private JComboBox choiceBox;

    JTextField reviewTextv;
    JButton submitReview, up, down;
    public ReviewPanel(PanelManager panelManager){
        this.setBackground(Color.YELLOW);
        this.setDoubleBuffered(true);
        this.setFocusable(true);
    }
}
