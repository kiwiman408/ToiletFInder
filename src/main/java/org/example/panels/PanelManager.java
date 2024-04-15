package org.example.panels;

import org.example.databases.UserDatabase;

import javax.swing.*;

public class PanelManager {

    //this class mostly just holds the frame that holds panels and how they switch
    private String panelStateName;
    private JFrame window;

    //notes on jpanels
    //they can have the sub components including more panels as you would with a Jframe
    private LoginPanel loginPanel;
    private MapPanel mapPanel;
    private ReviewPanel reviewPanel;

    public PanelManager(){


        //may have to make a database manager or else deal with this mess
        UserDatabase userdatabase = new UserDatabase();
        userdatabase.writeUsersToCSV("Assets/databaseCSVs/User CSV - Sheet1.csv");
        userdatabase.readUsersFromCSV("Assets/databaseCSVs/User CSV - Sheet1.csv");
        userdatabase.addUser("something","something");
        userdatabase.printAllUsers();
        userdatabase.rewriteUsersToCSV("Assets/databaseCSVs/User CSV - Sheet1.csv");

        window = new JFrame();
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //lets not
//        window.setResizable(true);
        window.setTitle("Toilet Finder");

        //set true to make panel close
        window.setUndecorated(false);

        //sorry but you need to pass of panel manager for it to work
        loginPanel = new LoginPanel(this, userdatabase);
        mapPanel = new MapPanel(this);
        reviewPanel = new ReviewPanel(this);

        switchPanelMethod(this,"something");

        System.out.println(panelStateName);
        window.getContentPane().add("Center", loginPanel);

        //use pack when ready
        window.setSize(1000,1000);
//
//        window.pack();

        window.setExtendedState(JFrame.MAXIMIZED_BOTH);
        window.setLocationRelativeTo(null);
        window.setVisible(true);

        panelStateName = "login";
    }

    //never worked with switch statements funnily enough
    //default state is the login but that's fine i think for now, still making another case for it specifically
    //struggled a bit on this one but since the constructor doesn't up date itself continously i decided on making it like this
    //a bit messy on the parameter passing but it works on the instance if needed just don't forget to bring the panel manager
    //if someone can learn how to do transitions properly just mention it

    public void switchPanelMethod(PanelManager panelManager, String panelStateName){
        switch (panelStateName) {
            case "login":
                panelManager.getWindow().getContentPane().add("Center", mapPanel);
                break;
            case "map":
                panelManager.getWindow().getContentPane().add("Center", mapPanel);
                break;
            case "review":
                panelManager.getWindow().getContentPane().add("Center", reviewPanel);
                break;
            case "map select":
                panelManager.getWindow().getContentPane().add("Center", reviewPanel);
                break;
            default:
                panelManager.getWindow().getContentPane().add("Center", loginPanel);
                break;
        }
    }

    public JFrame getWindow() {
        return window;
    }

    public void setWindow(JFrame window) {
        this.window = window;
    }

    public String getPanelStateName() {
        return panelStateName;
    }

    public void setPanelStateName(String panelStateName) {
        this.panelStateName = panelStateName;
    }

    public LoginPanel getLoginPanel() {
        return loginPanel;
    }

    public void setLoginPanel(LoginPanel loginPanel) {
        this.loginPanel = loginPanel;
    }

    public MapPanel getMapPanel() {
        return mapPanel;
    }

    public void setMapPanel(MapPanel mapPanel) {
        this.mapPanel = mapPanel;
    }

    public ReviewPanel getReviewPanel() {
        return reviewPanel;
    }

    public void setReviewPanel(ReviewPanel reviewPanel) {
        this.reviewPanel = reviewPanel;
    }

}
