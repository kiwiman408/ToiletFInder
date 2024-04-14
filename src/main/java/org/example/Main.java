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
    }
}