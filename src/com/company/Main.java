/*Use HashMaps or String arrays to loop through user's input and implement the following:

        Replacements:

        replace i with you
        replace me with you
        replace my with your
        replace am with are
        We will continue to build on top of this application throughout the week.

        Here's how the replacement works:

        The user enters something at the prompt: "my teacher hates me"

        The program will loop through that string and replace "my" with "your" and "me" with "you" and then prepend the qualifier to the replacement string. So, my teacher hates me becomes "Why do you say that your teacher hates you?" The replacement method returns the same words as the user entered only the replacement words have been swapped.

        Spend some time thinking how you would search through a string and replacing specific words. Hint: read about the split  (Links to an external site.)Links to an external site.operator.

        Example output:
        Good day. What is your problem? Enter your response here or Q to quit: my teacher hates me
        your teacher hates you
        Enter your response here or Q to quit: i dont know what's wrong
        you dont know what's wrong*/

package com.company;

import java.util.HashMap;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Operation ops= new Operation();
        ops.userInput();
    }
}

