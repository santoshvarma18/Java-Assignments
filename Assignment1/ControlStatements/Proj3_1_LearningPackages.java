package Assignment1.ControlStatements;

/*
            Project 03-01: Learning Packages of the Month
    • Create a file called Proj3_1_LearningPackages
    • User can determine total cost after purchasing a package and a certain number
        of courses per month- the Learning Stars platform
    • Prompt the user for package, and total courses enrolled that month
    • Tell the user how much their total (including package cost) is for the month
    • Packages:
        • Learning Package 1
            • $10/month, includes 2 courses per month
            • Each additional course is $6
        • Learning Package 2
            • $12/month, includes 4 courses per month
            • Each additional course is $4
        • Learning Package 3
            • $15/month, includes 6 courses per month
            • Each additional course is $3
*/

import java.util.Scanner;

public class Proj3_1_LearningPackages {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your package? 1, 2, or 3?: ");
        int userPackage = input.nextInt();
        System.out.println("Enter number of courses purchased:");
        int totalCourses = input.nextInt();
        int standardCost;
        int standardCourses;
        int additionalCostPerCourse;
        int totalCost = 0;

        if (userPackage == 1){
            standardCost = 10;
            standardCourses = 2;
            additionalCostPerCourse = 6;
        }

        else if (userPackage == 2){
            standardCost = 12;
            standardCourses = 4;
            additionalCostPerCourse = 4;
        }

        else {
            standardCost = 15;
            standardCourses = 6;
            additionalCostPerCourse = 3;
        }

        if (totalCourses > standardCourses){
            totalCost = standardCost + (totalCourses - standardCourses) * additionalCostPerCourse;
            System.out.println("Total cost: $"+totalCost);
        }
        else{
            System.out.println("Total cost: $"+(standardCost * standardCourses));
        }



    }
}
