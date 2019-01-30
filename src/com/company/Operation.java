package com.company;

import java.util.HashMap;
import java.util.Scanner;

public class Operation {

    public static void main(String args[]) {

    }

    public static void userInput() {

        Scanner input = new Scanner(System.in);

        //takes input from user
        String str = "";
        String convertedStr = "";

        HashMap<String, String> wordReplace = new HashMap<String, String>();

        wordReplace.put("i", "you");
        wordReplace.put("me", "you");
        wordReplace.put("my", "your");
        wordReplace.put("am", "are");


        while (!str.equalsIgnoreCase("i am feeling great")) {

            System.out.println("Good day. What is your problem? Enter your response here or Q to quit:");
            str = input.nextLine();
            convertedStr="";

            for (String retval : str.split(" ")) {

                String[] retVal = str.split(" ");

                if (wordReplace.containsKey(retval)) {

                    convertedStr += wordReplace.get(retval) + " ";
                }

                    else {

                        convertedStr += retval + " ";
                }
            }

            if(!str.equalsIgnoreCase("q")){
                System.out.println(convertedStr);
            }
            else {
                System.exit(0);
            }
        }
    }
}



