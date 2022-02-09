package Assignment1.ArraysAndArrayLists;

public class Arrays {
    public static void main(String[] args) {
        int[] myArray;
        myArray = new int[5];

        myArray[0] = 10;
        myArray[1] = 22;
        myArray[2] = 5;
        myArray[3] = 17;
        myArray[4] = 20;

        for (int i = 0; i < myArray.length; i++){
            System.out.println(myArray[i]);
        }

        //for-each
        for (int num: myArray) {
            System.out.println(num);
        }

        /*
                        Challenge: MoreArrayFun
                • Create a file named MoreArrayFun
                • Create an array
                    • The array should be size 10
                • Use a regular for loop to populate an array of integers
                    • The array should contain the integers 1 through 10
                • In a separate enhanced for loop, print out the elements
                  of the array that you just populated
        */

        //initialisation
        int[] arr = new int[10];

        //populating
        for (int i = 0; i <= arr.length-1; i++){
            arr[i] = i + 1;
        }

        //print
        for (int num: arr){
            System.out.println(num);
        }
    }
}
