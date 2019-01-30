package com.company;

import com.sun.javafx.collections.MappingChange;

import java.util.HashMap;
import java.util.Scanner;

public class Iter {

    public static void main(String[] args) {
        HashMap<String, String> myMap = new HashMap<String, String>();

        myMap.put("i", "you");
        myMap.put("me", "you");
        myMap.put("my", "your");
        myMap.put("am", "are");

        Scanner keyboard = new Scanner(System.in);
        String question, answer;
        System.out.print("Good day. What is your problem? ");
        while (true) {
            System.out.print("Enter your response here or Q to quit: ");
            question = keyboard.nextLine().toLowerCase();
            answer = "";
            for (String retval : question.split(" ")) {
                if (myMap.containsKey(retval)) {
                    answer += myMap.get(retval) + " ";
                } else {
                    answer += retval + " ";
                }
            }
            System.out.println(answer);

            if (question.equalsIgnoreCase("I am feeling great") | question.equals("q")) {
                break;
            }
        }
    }
}

