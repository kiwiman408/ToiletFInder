package org.example.databases;

import org.example.entities.Review;
import org.example.entities.User;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class ReviewDatabase {

    private List<Review> reviews;

    public ReviewDatabase() {
        reviews = new ArrayList<>();
    }

    public void addReview(String assignedToToilet, double rating,String comment, String leftByUsername){
        reviews.add(new Review(assignedToToilet,  rating, comment, leftByUsername));
    }

    public void readReviewsFromCSV(String csvFile) {
        try {
            File file = new File(csvFile);
            Scanner scanner = new Scanner(file);

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] data = line.split(",");
                if (data.length == 4) {
                    String assignedToToilet = data[0].trim();
                    double rating = Double.parseDouble(data[1].trim());
                    String comment = data[2].trim();
                    String leftByUsername = data[3].trim();
                    addReview(assignedToToilet, rating, comment, leftByUsername);
                }
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}

