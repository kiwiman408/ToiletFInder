package org.example.entities;

public class Review {
    private String assignedToToilet;
    private double rating;
    private String comment;
    private String leftByUsername;

    public Review(String assignedToToilet, double rating,String comment,String leftByUsername){
        this.assignedToToilet = assignedToToilet;
        this.rating = rating;

        this.comment = comment;
        this.leftByUsername = leftByUsername;
    }

}
