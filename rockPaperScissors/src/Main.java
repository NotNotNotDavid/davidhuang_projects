import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /*

        User enters 1, 2, or 3, symbolizing Rock, Paper, or Scissors.
        The computers, randomly selects from 1, 2, or 3, also symbolizing Rock, Paper, Scissors
        Then from both user and computer it compares the numbers, then determines who wins.

         */

        // Computer's Random Selections
        // Rock = 0 - < 1
        // Paper = 1 - < 2
        // Scissors = 2 - 3

        // Running the "game" function
        game();
    }
    public static void game(){

        // Scanning for user input
        Scanner scanner = new Scanner(System.in);

        // Computer selecting a number from 1 to 3, selections are written above.

        double compRandom = Math.random()*3;
        System.out.println("What is your selection? (Choose a number from 1. Rock, 2. Paper, or 3. Scissors)");

        // Error handling for texts and irregular numbers
        int inputPlayAgain;
        int inputAns = -1;
        try {
            inputAns = scanner.nextInt();
        } catch (Exception e) {
            System.out.println("try again!");
        }

        // Beginning of detecting user input of 1, 2 or 3

        if (inputAns > 3 || inputAns < 0){
            System.out.println("Please select a number from 1, 2 or 3");
            game();
        }

        // Detecting 1, 2 or 3 and going through an if. The if handles when user wins or computer wins.

        else{
            if (inputAns <= 1){
                String userSelect= "Rock";
                if (compRandom > 0 && compRandom < 1){
                    System.out.println("You chose: " + userSelect + " The computer chose: rock");
                    System.out.println("You Tied");
                }
                else if (compRandom >= 1 && compRandom < 2){
                    System.out.println("You chose: " + userSelect + ". The computer chose: paper");
                    System.out.println("You Lose");
                }
                else if (compRandom >= 2 && compRandom <= 3){
                    System.out.println("You chose: " + userSelect + ". The computer chose: scissors");
                    System.out.println("You Win!");
                }
            }
            else if(inputAns <= 2){
                String userSelect= "Paper";
                if (compRandom > 0 && compRandom < 1){
                    System.out.println("You chose: " + userSelect + ". The computer chose: rock");
                    System.out.println("You Win!");
                }
                else if (compRandom >= 1 && compRandom < 2){
                    System.out.println("You chose: " + userSelect + ". The computer chose: paper");
                    System.out.println("You Tie");
                }
                else if (compRandom >= 2 && compRandom <= 3){
                    System.out.println("You chose: " + userSelect + ". The computer chose: scissors");
                    System.out.println("You Lose");
                }
            }
            else if (inputAns <= 3){
                String userSelect= "Scissors";
                if (compRandom > 0 && compRandom < 1){
                    System.out.println("You chose: " + userSelect + ". The computer chose: rock");
                    System.out.println("You Lose");
                }
                else if (compRandom >= 1 && compRandom < 2){
                    System.out.println("You chose: " + userSelect + ". The computer chose: paper");
                    System.out.println("You Win!");
                }
                else if (compRandom >= 2 && compRandom <= 3){
                    System.out.println("You chose: " + userSelect + ". The computer chose: scissors");
                    System.out.println("You Tie");
                }
            }
        }
    }
}
