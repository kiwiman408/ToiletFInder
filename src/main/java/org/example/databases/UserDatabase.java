package org.example.databases;

import org.example.entities.User;

import java.io.*;
import java.util.*;

//makes new CSV
public class UserDatabase {
    //Why list array? It's easier for me to deal with
    private List<User> users; // List to hold users


    // Constructor
    public UserDatabase() {
        users = new ArrayList<>();
    }

    // Method to add a user
    public void addUser(String username, String password){
        //add user to array list
        users.add(new User(username, password));
        //rewrite
    }

    // Method to read users from a CSV file and toss them into list array
    public void readUsersFromCSV(String csvFile) {
        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");
                if (data.length == 2) {
                    String username = data[0].trim();
                    String password = data[1].trim();
                    addUser(username, password);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // method for writing filler names into csv
    // should not be used it is used
    public void writeUsersToCSV(String csvFile) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(csvFile))) {
            bw.write("Username,Password\n"); // Writing header
            for (int i = 1; i <= 10000; i++) {
                String username = "username" + i;
                String password = "password" + i;
                bw.write(username + "," + password + "\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

//    public void rewriteUsersToCSV(String csvFile) {
//        try (BufferedWriter writer = new BufferedWriter(new FileWriter(csvFile))) {
//            for (User user : users) {
//                writer.append(user.getUsername()).append(",").append(user.getPassword()).append("\n");
//            }
//            System.out.println("Users rewritten to " + csvFile + " successfully.");
//        } catch (IOException e) {
//            throw new RuntimeException("Error rewriting users to CSV", e);
//        }
//    }

    public void rewriteUsersToCSV(String csvFile) {
        try {
            File file = new File(csvFile);
            Scanner scanner = new Scanner(file);

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] data = line.split(",");
                if (data.length == 2) {
                    String username = data[0].trim();
                    String password = data[1].trim();
                    addUser(username, password);
                }
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    // Method to retrieve a user by username
    public String getPassword(String username) {
        for (User user : users) {
            if (user.getUsername().equals(username)) {
                return user.getPassword();
            }
        }
        return null; // User not found
    }

    // Method to check if a user exists
    public boolean userExists(String username) {
        for (User user : users) {
            if (user.getUsername().equals(username)) {
                return true;
            }
        }
        return false;
    }

    // Method to print all users
    public void printAllUsers() {
        System.out.println("All Users:");
        for (User user : users) {
            System.out.println(user.getUsername() + "," + user.getPassword());
        }
    }
}
