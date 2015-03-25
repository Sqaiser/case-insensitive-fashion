/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgcase.insensitive.fashion;

import java.util.Scanner;

/**
 *
 * @author Sameen Qaiser
 */
public class CaseInsensitiveFashion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.print("Enter a string: ");

        Scanner scanner = new Scanner(System.in);

        String inputString = scanner.nextLine();
        System.out.println("Your string was: " + inputString);

        System.out.print("Enter a character: ");
        char inputCharacter = scanner.next().charAt(0);

        System.out.println("Your character was: " + inputCharacter);

        int i = 0; //the index of the current character in inputString.
        int characterCount = 0; //the number of characters found.

        //traverse each character in the string.
        while (i < inputString.length()) {
            //if the current character matches the input character.
            if (inputString.charAt(i) == inputCharacter) {
                characterCount++; //increment a count.

                //TODO: Make the character matching case insensitive.
                //For example, "City Tech" and the character 't' should print 2
                //occurrences.
                //For homework, due Wednesday evening.
            }

            //move to the next character.
            i++;
        }
                //output the final count. 
        System.out.println("Found " + characterCount + " " + inputCharacter + " character(s) in " + inputString + ".");
    }
    
}
