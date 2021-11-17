import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        System.out.println();
//        int people = 30;
//        int cars = 40;
//        int buses = 15;
//
//
//        if (cars > people) {
//            System.out.println("We should take the cars.");
//        } else if (cars < people) {
//            System.out.println("We should not take the cars.");
//        } else {
//            System.out.println("We can't decide.");
//        }
//
//
//        if (buses > cars) {
//            System.out.println("That's too many buses.");
//        } else if (buses < cars) {
//            System.out.println("Maybe we could take the buses.");
//        } else {
//            System.out.println("We still can't decide.");
//        }
//
//
//        if (people > buses) {
//            System.out.println("All right, let's just take the buses.");
//        } else {
//            System.out.println("Fine, let's stay home then.");
//        }

//    In this section, you're going to try to guess what you think the if statement is and what it does.
//    What do you think else if and else are doing? Answer in a comment.
    // Else if's and else's are comparing the numbers given to their condition. Their job is to see if the statement
    // is true or not. If true, something happens, if false, another statement is reached.

//    Remove the else part at the beginning of one of the else if statements. What difference does that make? Why? Answer in a comment.
//    If else is removed from "else if", then the "else if" would become a singular if, meaning that it would run
    // another conditional statement, resulting with an extra return value.

    /*

    Assignment 2

     */

//    Scanner scanner = new Scanner(System.in);
//        System.out.println("What's your name");
//        String name = scanner.nextLine();
//        System.out.println("Ok, " + name + ", What's your age");
//        int age = scanner.nextInt();
//        if (age > 0 && age < 150){
//            if (age < 16){
//                System.out.println("You can't drive, "+ name);
//            }
//            else if (age == 16 || age == 17){
//                System.out.println("You can drink but not vote, " + name);
//            }
//            else if(age >= 18 && age <= 24){
//                System.out.println("You can vote but not rent a car, "+ name);
//            }
//            else if(age > 25){
//                System.out.println("You can pretty much do anything, " + name);
//            }
//        }
//        else{
//            System.out.println("no.");
//        }

        /*

        Assignment 3 - Space Boxing

         */
//
//        Scanner scanner2 = new Scanner(System.in);
//        System.out.println("Please enter your current Earth weight");
//        int weight = scanner2.nextInt();
//        System.out.println();
//        System.out.println("I have information for the following planets: ");
//        System.out.println("\t 1. Venus  2. Mars  3. Jupiter");
//        System.out.println("\t 4. Saturn 5. Uranus 6. Neptune");
//        System.out.println();
//        System.out.println("Which planet are you visiting?");
//        int planet = scanner2.nextInt();
//        if (planet == 1){
//            System.out.println("You would weight " + weight * 0.78 + " pounds on that planet");
//        }
//        else if (planet == 2){
//            System.out.println("You would weight " + weight * 0.39 + " pounds on that planet");
//        }
//        else if (planet == 3){
//            System.out.println("You would weight " + weight * 2.65 + " pounds on that planet");
//        }
//        else if (planet == 4){
//            System.out.println("You would weight " + weight * 1.17 + " pounds on that planet");
//        }
//        else if (planet == 5){
//            System.out.println("You would weight " + weight * 1.05 + " pounds on Uranus");
//            //im a child i swear
//        }
//        else if (planet == 6){
//            System.out.println("You would weight " + weight * 1.23 + " pounds on that planet");
//        }
//

        /*

        Assignment 3 - A Little Quiz

         */

        int count = 0;
        Scanner scanAns = new Scanner(System.in);
        System.out.println("Are you ready for quiz");
        System.out.println("Too bad here it is: ");
        System.out.println("Question 1: Where is Nigeria");
        System.out.println("\t 1) Sub-Saharan Africa");
        System.out.println("\t 2) Rest of Africa");
        System.out.println("\t 3) Asia");

        int ans1 = scanAns.nextInt();
        if(ans1 != 2){
            System.out.println("that's wrong, sorry");
        }
        else{
            System.out.println("THAT'S RIGHT!");
            count++;
        }

        System.out.println("Question 2: What is Physics");
        System.out.println("\t 1) pain");
        System.out.println("\t 2) A combination of math and applied science");
        System.out.println("\t 3) All of the above");
        int ans2 = scanAns.nextInt();
        if(ans2 != 3){
            System.out.println("that's wrong, sorry");
        }
        else{
            System.out.println("THAT'S RIGHT!");
            count++;
        }

        System.out.println("Question 3: What is the worst brand that makes technology?");
        System.out.println("\t 1) Apple");
        System.out.println("\t 2) Pear");
        System.out.println("\t 3) Oranges");
        int ans3 = scanAns.nextInt();
        if(ans3 != 1){
            System.out.println("that's wrong, sorry");
        }
        else{
            System.out.println("THAT'S RIGHT!");
            count++;
        }
        System.out.println("Thanks for playing!");
        System.out.println("you scored " + count + " out of 3 questions correctly");

    }

}
