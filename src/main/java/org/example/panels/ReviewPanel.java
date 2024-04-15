package org.example.panels;

import org.example.entities.Review;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

public class ReviewPanel extends JPanel {
    //draws from array
    private List<Review> toiletRestrooms;

    //place holder
    private String currentRestroom = "No Restroom Selected";

    JTextField reviewTextv;

    private JButton returnToMap;
    private TextField textField;
    JButton submitReview, up, down;
    public ReviewPanel(PanelManager panelManager){
        JLabel jlabel = new JLabel("Current Restroom: " + currentRestroom);
        returnToMap = new JButton("Return to Map");

        this.setBackground(Color.gray);
        this.setDoubleBuffered(true);
        this.setFocusable(true);

        this.add(returnToMap);

        returnToMap.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                //maybe to late to mention this but appearently visibilty also toggles other components as off
                System.out.println("Guest Button clicked");
                setVisible(false);
                panelManager.getMapPanel().setVisible(true);
            }
        });
    }
}
