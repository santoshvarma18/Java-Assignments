package Assignment9;

import java.util.Scanner;
import java.util.regex.Pattern;

/*
Using the documentation for java.util.regex.Pattern as a resource,
write and test a regular expression that checks a sentence to see that it begins with a capital letter and ends with a period.
*/

public class Regex {
    public boolean regexCheck(String sentence){
        // ^ - start, $ - end, .* - multiple sequence of characters
        boolean b = Pattern.matches("^[A-Z].*\\.$",sentence);
        return b;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String sentence = input.nextLine();
        Regex r = new Regex();
        System.out.println("Start with a capital letter and end with period? "+r.regexCheck(sentence));
    }
}
