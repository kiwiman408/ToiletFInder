package org.example;

import com.google.maps.GeoApiContext;
import com.google.maps.GeocodingApi;
import com.google.maps.GeocodingApiRequest;
import com.google.maps.model.GeocodingResult;
import com.google.maps.model.LatLng;
import org.example.databases.ReviewDatabase;
import org.example.databases.UserDatabase;
import org.example.panels.LoginPanel;
import org.example.panels.MapPanel;
import org.example.panels.PanelManager;
import org.example.panels.ReviewPanel;

import javax.swing.*;


public class Main{

//     GeocodingApiRequest req = GeocodingApi.newRequest(context).address("Sydney");

    public static void main(String[] args) {
        //going to add the database stuff here for now
        UserDatabase userdatabase = new UserDatabase();
        ReviewDatabase reviewDatabase = new ReviewDatabase();

        //panelManager holds panel stuff including switch cases had them here before
        PanelManager panelManager = new PanelManager();

//        System.out.println("Hello world!");
//
//        JFrame window = new JFrame();
//        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        window.setResizable(true);
//        window.setTitle("Toilet Finder");
//
//        //set true to make panel close
//        window.setUndecorated(false);
//
//        JComboBox jComboBox = new JComboBox();
//
//        //pass username off a database too
//        LoginPanel loginPanel = new LoginPanel(userdatabase);
//        MapPanel mapPanel = new MapPanel();
//        ReviewPanel reviewPanel = new ReviewPanel();
//
////        LoginPanel panel1 = new LoginPanel();
////        LoginPanel panel2 = new LoginPanel();
//
//        String panelStateName = "something???";
//
//        //never worked with switch statements funnily enough
//        //defaul
//        switch (panelStateName) {
//            case "map":
//                window.getContentPane().add("Center", mapPanel);
//            case "review":
//                window.getContentPane().add("Center", reviewPanel);
//            case "map select":
//                window.getContentPane().add("Center", reviewPanel);
//            default:
//                window.getContentPane().add("Center", loginPanel);
//        }
//
//        window.getContentPane().add("Center", loginPanel);
////        window.getContentPane().add("Center", mapPanel);
////        window.getContentPane().add("Center", reviewPanel);
//
//
//        //use pack when ready
//        window.setSize(1000,1000);
////
////        window.pack();
//
//        window.setLocationRelativeTo(null);
//        window.setVisible(true);

//        add(newPanel, BorderLayout.CENTER);
//        window.setLayout(null);
    }
}