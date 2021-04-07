package com.nextbank.exam;

public class MainApp {

    public static void main (String[] args){
        Map idToWords = new SimpleMap();
        idToWords.put("X", "You are the best!");
        idToWords.put("Y", "A journey to thousand miles starts from a single step.");
        idToWords.put("Z", "Insanity is doing things over and over again and expecting a different result");
        idToWords.put("D", "And I, I took the road less traveled by.");

        System.out.println(idToWords.get("X"));

        idToWords.put("Y", "A journey to thousand miles starts from a single step.");
        idToWords.put(null, "No matter how much love and goodness...!");
    }
}
