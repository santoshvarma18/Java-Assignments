package Assignment1.StringsAndStringBuilderClass;

public class StringMethods {
    public static void main(String[] args) {
        String name = "Santosh";
        String name2 = "Santosh";
        String name3 = "Tarun";

        // length - returns length of the string,
        // charAt(index) - returns character at particular index
        for (int i = 0; i < name.length(); i++){
            System.out.print(name.charAt(i)+" ");
        }

        System.out.println();

        // equals - compares contents of the strings
        if (name.equals(name2)){
            System.out.println("Names are equal.");
        }
        else{
            System.out.println("Names aren't equal.");
        }

        // compareTo - compares lexicographically
        if (name.compareTo(name2) > 0){
            System.out.println("name > name3");
        }
        else{
            System.out.println("name <= name3");
        }
    }
}
