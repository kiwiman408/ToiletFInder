package org.example.panels.subpanels;

import org.example.panels.PanelManager;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class InfoPanelMiniature extends JPanel{
    private JLabel toiletStatus;

    private JPanel backgoundColorPanel;

    //no good solution here i can come up
    private JButton invisibleButtons;
    private JButton reviewButtonPanel;
    private JButton nearbyToiletList;
    private JButton returnToLoginScreen;

    //this will need to have toilet information be updated continuously
    //will need a toilet name and then search database for said toilet and then update itself if toilet info changes
    public InfoPanelMiniature(PanelManager panelManager){
        this.setBackground(Color.darkGray);

        backgoundColorPanel = new JPanel();
        backgoundColorPanel.setBackground(Color.PINK);
        backgoundColorPanel.setPreferredSize(new Dimension(900, 100));
        add(backgoundColorPanel);
        backgoundColorPanel.setLayout(new BoxLayout(backgoundColorPanel, BoxLayout.Y_AXIS));

        reviewButtonPanel = new JButton("See Reviews");
        nearbyToiletList = new JButton("See List of Nearby Toilets");
        returnToLoginScreen = new JButton("Return to Login Screen");

        this.add(backgoundColorPanel);

        reviewButtonPanel.setPreferredSize(new Dimension(200,40));
        nearbyToiletList.setPreferredSize(new Dimension(200,40));
        returnToLoginScreen.setPreferredSize(new Dimension(200,40));

        this.add(reviewButtonPanel);
        this.add(nearbyToiletList);
        this.add(returnToLoginScreen);

        int something = 2;

        toiletStatus = new JLabel("<html>*Toilet Name: "+something+ "<br/> *Rating: ."+something+"<br/>*Occupied Status: "+something);

        Font font = toiletStatus.getFont();
        toiletStatus.setFont(font.deriveFont(15f));

        backgoundColorPanel.add(toiletStatus);
        toiletStatus.setBounds(0,0,0,0 );

        reviewButtonPanel.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                //do all your things here
                System.out.println("Review Button clicked");
                panelManager.switchPanelMethod(panelManager, "review");
                panelManager.getMapPanel().setVisible(false);
                panelManager.getReviewPanel().setVisible(true);
            }
        });

        nearbyToiletList.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

            }
        });

        returnToLoginScreen.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {


            }
        });
    }
}
