package org.example.panels;

import org.example.databases.UserDatabase;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginPanel extends JPanel implements Runnable{
    Thread thread1;

    JTextField userNameText;
    JPasswordField passwordText;
    JButton submit, guest, newUser;

    private final int screenWidth = 1000;
    private final int screenHeight = 1000;

    //login panel will need acess to the database for it to do things

    public LoginPanel(PanelManager panelManager,UserDatabase userDatabase) {
        setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.insets = new Insets(10, 80, 10, 10);

        JPanel headerPanel = new JPanel(new FlowLayout());
        headerPanel.setBackground(Color.LIGHT_GRAY);

        JLabel loginHeader = new JLabel("Login Page",SwingConstants.CENTER);
        headerPanel.add(loginHeader,SwingConstants.CENTER);
        add(headerPanel, gbc);

        JLabel loginUser = new JLabel("Username:");
        JLabel loginPassword = new JLabel("Password");

        userNameText = new JTextField(30);
        passwordText = new JPasswordField(30);

        submit = new JButton("Submit");
        newUser = new JButton("New User");
        guest = new JButton("Guest");

        gbc.gridy++;
        add(loginUser, gbc);
        gbc.gridy++;
        add(loginPassword, gbc);

        gbc.gridx = 1;
        gbc.gridy = 1;
        add(userNameText, gbc);

        gbc.gridy++;
        add(passwordText, gbc);

        JPanel buttonPanel = new JPanel(new FlowLayout()); // Button panel with FlowLayout
        buttonPanel.add(submit);
        buttonPanel.add(newUser);
        buttonPanel.add(guest);

        gbc.gridy++;
        gbc.gridx = 1;
        gbc.gridwidth = 1; // Reset grid width
        add(buttonPanel, gbc);

        this.setBackground(Color.ORANGE);
        this.setDoubleBuffered(true);
        this.setFocusable(true);

        JLabel messageLabel = new JLabel();
        add(messageLabel);

        //This is for the buttons
        guest.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                //do all your things here
                System.out.println("Guest Button clicked");
                clearPanelOff();
                panelManager.switchPanelMethod(panelManager, "map");
//                messageLabel.setText("User not found");
            }
        });

        submit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                //do all your things here
                System.out.println("Submit Button clicked");
                //check database if username AND password is found or IS there with the textfield
                if(userDatabase.userExists(userNameText.getText())){
                    clearPanelOff();
                    panelManager.switchPanelMethod(panelManager, "map");
                }

                else if(userNameText.getText().length() <= 0 || passwordText.getText().length() <= 0){
                    messageLabel.setText("Text Fields cannot be empty");
                }


                else{
//                    JLabel byeLabel = new JLabel("Could not find user");
//                    add(byeLabel);
//                    revalidate();
                    messageLabel.setText("User not found");
                }
            }
        });

        newUser.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                clearPanelOff();
                panelManager.switchPanelMethod(panelManager, "map");


            }
        });
    }

    private void clearPanelOff(){
        Container parent = getParent();
        parent.remove(LoginPanel.this);
        parent.revalidate();
    }

    //used to swap into map panel
    //maybe pass map panel into and then set using this class instead of the main

    @Override
    public void run() {
    }


}
////        loginHeader.setBounds((int) (screenWidth/2)-(75/2), , 100, 100);
//        loginUser.setBounds((int) (screenWidth/3),  (screenHeight/5), 150, 25);
//        loginPassword.setBounds((int) (screenWidth/3), screenHeight/4, 150, 25);
//
//        userNameText.setBounds(screenWidth/2,  (screenHeight/5), 150, 25);
//        passwordText.setBounds((int) (screenWidth/2), screenHeight/4, 150, 25);
//
//        submit.setBounds((int) (screenWidth/2.5), screenHeight/3, 80, 30);
//        guest.setBounds((int) (screenWidth/2), screenHeight/3, 80, 30);
