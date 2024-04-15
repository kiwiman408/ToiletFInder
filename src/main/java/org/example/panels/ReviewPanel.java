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

        //will be here forever if we try to consider dyanmic movement of gui
        this.setLayout(null);
        this.setBackground(Color.lightGray);

        JButton returnButton = new JButton("Return To Map");
        returnButton.setBounds(1600, 10, 145, 41);
        this.add(returnButton);

        JLabel toiletNameLabel = new JLabel("Toilet Name:");
        toiletNameLabel.setHorizontalAlignment(SwingConstants.CENTER);
        toiletNameLabel.setFont(new Font("Tahoma", Font.PLAIN, 34));
        toiletNameLabel.setBounds(0, 0, 331, 69);
        this.add(toiletNameLabel);

        JLabel ratingLabel = new JLabel("Rating:");
        ratingLabel.setFont(new Font("Tahoma", Font.PLAIN, 17));
        ratingLabel.setHorizontalAlignment(SwingConstants.CENTER);
        ratingLabel.setBounds(10, 76, 93, 31);
        this.add(ratingLabel);

        JButton oneStarButton = new JButton("1");
        oneStarButton.setFont(new Font("Tahoma", Font.PLAIN, 17));
        oneStarButton.setBounds(113, 83, 89, 23);
        this.add(oneStarButton);

        JButton twoStarButton = new JButton("2");
        twoStarButton.setFont(new Font("Tahoma", Font.PLAIN, 17));
        twoStarButton.setBounds(233, 83, 89, 23);
        this.add(twoStarButton);

        JButton threeStarButton = new JButton("3");
        threeStarButton.setFont(new Font("Tahoma", Font.PLAIN, 17));
        threeStarButton.setBounds(362, 83, 89, 23);
        this.add(threeStarButton);

        JButton fourStarButton = new JButton("4");
        fourStarButton.setFont(new Font("Tahoma", Font.PLAIN, 17));
        fourStarButton.setBounds(475, 83, 89, 23);
        this.add(fourStarButton);

        JButton fiveStarButton = new JButton("5");
        fiveStarButton.setFont(new Font("Tahoma", Font.PLAIN, 17));
        fiveStarButton.setBounds(590, 83, 89, 23);
        this.add(fiveStarButton);

        JLabel commentLabel = new JLabel("Put Comment Here:");
        commentLabel.setFont(new Font("Tahoma", Font.PLAIN, 17));
        commentLabel.setHorizontalAlignment(SwingConstants.CENTER);
        commentLabel.setBounds(32, 131, 179, 31);
        this.add(commentLabel);

        JTextArea commentTextArea = new JTextArea();
        commentTextArea.setBounds(32, 161, 481, 142);
        this.add(commentTextArea);

        JButton submitCommentButton = new JButton("Submit");
        submitCommentButton.setFont(new Font("Tahoma", Font.PLAIN, 15));
        submitCommentButton.setBounds(32, 306, 99, 31);
        this.add(submitCommentButton);

        JLabel reviewLabel = new JLabel("Reviews:");
        reviewLabel.setHorizontalAlignment(SwingConstants.CENTER);
        reviewLabel.setFont(new Font("Tahoma", Font.PLAIN, 17));
        reviewLabel.setBounds(32, 393, 99, 31);
        this.add(reviewLabel);

        JLabel ratingsLabel = new JLabel("Ratings:");
        ratingsLabel.setFont(new Font("Tahoma", Font.PLAIN, 17));
        ratingsLabel.setHorizontalAlignment(SwingConstants.CENTER);
        ratingsLabel.setBounds(32, 348, 99, 34);
        this.add(ratingsLabel);

        returnButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                //maybe to late to mention this but appearently visibilty also toggles other components as off
                System.out.println("Guest Button clicked");
                setVisible(false);
                panelManager.getMapPanel().setVisible(true);
            }
        });


    }
}
