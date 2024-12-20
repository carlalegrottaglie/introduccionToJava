package com.globant.exercices;

public class RandomRound {
    public static void main(String[] args) {
        int randomNumber;
        int count=0;
        do {
            randomNumber = (int) (Math.random() * 355) + 1;
            System.out.println(count + "  Random number between 1 and 355: " + randomNumber);
            count++;
        }
        while (randomNumber != 355);
    }
}
