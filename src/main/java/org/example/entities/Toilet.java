package org.example.entities;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.util.Random;

public class Toilet {
    private String toiletID;
    private double meanRating;
    private boolean isOccupied;
    private int numberOfStalls;


    private List<Review> reviews;
}
