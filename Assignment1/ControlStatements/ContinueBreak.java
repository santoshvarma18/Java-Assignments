package Assignment1.ControlStatements;

/*
        Break: The break statement in java is used to terminate from the loop immediately.
        Continue: The continue statement in Java is used to skip the current iteration of a loop.
*/
public class ContinueBreak {
    public static void main(String[] args) {
        int count = 0;

        while(count < 10){
            if (count == 5){
                count++;
                continue;
            }
            System.out.print(count + "\t");
            count++;
        }

        int count2 = 0;
        while(count2 < 10){
            if (count2 == 5){
                break;
            }
            System.out.println(count2);
            count2++;
        }

        /*
                        Challenge: EvenOnly
                      • Create an EvenOnly file
                      • Loop through 0 through 10 (exclusive), printing out only the even integers
                      • Even integer is an integer that is divisible by 2
                      • Hint: Use continue and think about any operators we have at our disposal to help us
        */
        int num = 0;
        while(num < 10){
            if (num % 2 != 0) {
                num++;
                continue;
            }
            System.out.println(num);
            num++;
        }
    }
}
