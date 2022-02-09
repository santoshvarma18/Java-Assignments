package Assignment2;

import java.util.HashSet;
import java.util.Scanner;

// Time Complexity - O(N)
// Space Complexity - O(N), used HashSet as an extra space
class CheckAlphabets{

    // Loops over the character array
    // If the character is an alphabet, appends to set
    // Returns true if all the alphabets are found

    public boolean alphabetCheck(String str){
        int count = 0;
        HashSet<Integer> alphabetCount = new HashSet<>(26);

        // If the length of string is less than 26 return false
        if (str.length() < 26) {
            return false;
        }

        for(char c : str.toLowerCase().toCharArray()){
            int index = c - 'a';        // calculate range of alphabet character between 0-26
            if(0 <= index  && index <= 26){
                if(alphabetCount.add(index)){
                    count++;
                    if(alphabetCount.size() == 26){
                        return true;
                    }
    
                }
            }
        }
        return false;
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = input.nextLine();
        CheckAlphabets sentence = new CheckAlphabets();
        System.out.println(sentence.alphabetCheck(str));
    }
}