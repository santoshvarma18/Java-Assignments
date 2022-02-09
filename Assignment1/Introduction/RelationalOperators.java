package Assignment1.Introduction;

/*
            Relational operators
            <
            <=
            >
            >=
            ==, !=     //Equality operator
*/
public class RelationalOperators {
    public static void main(String[] args) {
        int myAge = 21;
        int bobsAge = 21;

        String myName = "Santosh";
        String yourName = "Karthik";

        boolean ageComparison = myAge > bobsAge;
        System.out.println("myAge > bobsAge? "+ageComparison);

        ageComparison = myAge < bobsAge;
        System.out.println("myAge < bobsAge? "+ageComparison);

        ageComparison = myAge == bobsAge;
        System.out.println("myAge == bobsAge? "+ageComparison);

        boolean nameComparison = myName.equals(yourName);
        System.out.println("Do names match? "+nameComparison);


        /*
                    Challenge:
                    1. create a currentAge variable
                    2. set it equal to your current age
                    3. Print out the boolean value, whether your
                    current age is greater than or equal to 21
        */

        int currentAge;
        currentAge = 21;
        System.out.println("Current age: "+currentAge);
        System.out.println("Current age >= 21? "+(currentAge >= 21));

    }

}
