package Assignment1.Introduction;

/*
            Logical operators:
            //binary operators
            AND
            OR
            //unary operator
            NOT
*/

public class LogicalOperators {
    public static void main(String[] args) {
        boolean isRaining = true;
        boolean isWarm = true;

        System.out.println("TRUE, TRUE combination");
        boolean combined = isRaining && isWarm;
        System.out.println("IS it raining AND warm? " + combined);

        combined = isRaining || isWarm;
        System.out.println("Is it raining OR warm? " + combined);

        combined = !isRaining;
        System.out.println("Is it NOT raining outside? " + combined);


    /*
                challenge:
                1. Modify isRaining and isWarm to contain the remaining permutations
                2. Test what is printed after each modification
    */
        System.out.println("\n");
        System.out.println("TRUE, FALSE combination");
        isRaining = true;
        isWarm = false;

        combined = isRaining && isWarm;
        System.out.println("IS it raining AND warm? " + combined);

        combined = isRaining || isWarm;
        System.out.println("Is it raining OR warm? " + combined);

        combined = !isRaining;
        System.out.println("Is it NOT raining outside? " + combined);

        System.out.println("\n");
        System.out.println("FALSE, TRUE combination");
        isRaining = false;
        isWarm = true;

        combined = isRaining && isWarm;
        System.out.println("IS it raining AND warm? " + combined);

        combined = isRaining || isWarm;
        System.out.println("Is it raining OR warm? " + combined);

        combined = !isRaining;
        System.out.println("Is it NOT raining outside? " + combined);

        System.out.println("\n");
        System.out.println("FALSE, FALSE combination");
        isRaining = false;
        isWarm = false;

        combined = isRaining && isWarm;
        System.out.println("IS it raining AND warm? " + combined);

        combined = isRaining || isWarm;
        System.out.println("Is it raining OR warm? " + combined);

        combined = !isRaining;
        System.out.println("Is it NOT raining outside? " + combined);


    }
}
