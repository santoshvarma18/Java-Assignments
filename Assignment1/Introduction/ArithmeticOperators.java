package Assignment1.Introduction;

/*
            Arithmetic operators
            + - Addition
            - - Subtraction
            * - Multiplication
            / - Division
            % - Modulo
*/
public class ArithmeticOperators {
    public static void main(String[] args) {
        int a = 10;
        int b = 15;
        System.out.println("Result : "+(a+b));
        System.out.println("Difference : "+(a-b));
        System.out.println("Product : "+(a*b));
        System.out.println("Quotient : "+(b/a));
        System.out.println("Remainder : "+(b%a));

        //compound arithmetic operator
        int start = 10;
        System.out.println("Initial start value: "+start);

        start += 20;    //start = start + 20;
        System.out.println("Final start value: "+start);


        //unary operator

        start++;        //++start;
        System.out.println("Start++: "+start);

        start--;        //--start;
        System.out.println("Start--: "+start);

        //challenge - product by 2 and store the value back in variable

        int product = 10;
        System.out.println("Initial product value: "+product);
        product *= 2;
        System.out.println("Final Product value: "+product);



    }
}
