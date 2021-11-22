import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Main {
    public static boolean currentlyPlaying = true;
    public static int userScore = 0;
    public static int compScore = 0;

    public static void main(String[] args) {

        // Computer's Random Selections
        // Rock = 0 - < 1
        // Paper = 1 - < 2
        // Scissors = 2 - 3

        game();
    }
    public static void game(){

        System.out.println("What is your selection? (Choose a number from 1. Rock, 2. Paper, or 3. Scissors)");
        for (int i = 0; i < 25; i++) {
            System.out.print("*");
        }
        System.out.println();

        while (currentlyPlaying){
            Scanner scanner = new Scanner(System.in);
            double compRandom = Math.random()*3;

            int inputAns = -1;
            try {
                inputAns = scanner.nextInt();
            } catch (Exception e) {
                System.out.println("try again!");
            }
            if (inputAns > 3 || inputAns < 0){
                System.out.println("Please select a number from 1, 2 or 3");
                game();
            }
            else{

                if (inputAns <= 1){
                    String userSelect= "Rock";
                    if (compRandom > 0 && compRandom < 1){
                        System.out.println("You chose: " + userSelect + " The computer chose: rock");
                        System.out.println("You Tied");
                        System.out.println();
                        returnScore();
                        playAgain();
                    }
                    else if (compRandom >= 1 && compRandom < 2){
                        System.out.println("You chose: " + userSelect + ". The computer chose: paper");
                        System.out.println("You Lose");
                        System.out.println();
                        compScore++;
                        returnScore();
                        playAgain();
                    }
                    else if (compRandom >= 2 && compRandom <= 3){
                        System.out.println("You chose: " + userSelect + ". The computer chose: scissors");
                        System.out.println("You Win!");
                        userScore++;
                        System.out.println();
                        returnScore();
                        playAgain();
                    }
                }
                else if(inputAns <= 2){
                    String userSelect= "Paper";
                    if (compRandom > 0 && compRandom < 1){
                        System.out.println("You chose: " + userSelect + ". The computer chose: rock");
                        System.out.println("You Win!");
                        userScore++;
                        System.out.println();
                        returnScore();
                        playAgain();
                    }
                    else if (compRandom >= 1 && compRandom < 2){
                        System.out.println("You chose: " + userSelect + ". The computer chose: paper");
                        System.out.println("You Tie");
                        System.out.println();
                        returnScore();
                        playAgain();
                    }
                    else if (compRandom >= 2 && compRandom <= 3){
                        System.out.println("You chose: " + userSelect + ". The computer chose: scissors");
                        System.out.println("You Lose");
                        compScore++;
                        System.out.println();
                        returnScore();
                        playAgain();
                    }
                }
                else if (inputAns <= 3){
                    String userSelect= "Scissors";
                    if (compRandom > 0 && compRandom < 1){
                        System.out.println("You chose: " + userSelect + ". The computer chose: rock");
                        System.out.println("You Lose");
                        compScore++;
                        System.out.println();
                        returnScore();
                        playAgain();
                    }
                    else if (compRandom >= 1 && compRandom < 2){
                        System.out.println("You chose: " + userSelect + ". The computer chose: paper");
                        System.out.println("You Win!");
                        userScore++;
                        System.out.println();
                        returnScore();
                        playAgain();
                    }
                    else if (compRandom >= 2 && compRandom <= 3){
                        System.out.println("You chose: " + userSelect + ". The computer chose: scissors");
                        System.out.println("You Tie");
                        System.out.println();
                        returnScore();
                        playAgain();
                    }
                }
            }
        }
    }

    public static void playAgain() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Would you like to play again? 1.Yes 2.No");
        String inputAnsLoop = scanner.nextLine();
        while(true) {
            if (inputAnsLoop.equals("1") || inputAnsLoop.equals("2")){
                break;
            } else {
                System.out.println("try again!");
                System.out.println("Please choose 1 or 2");
                inputAnsLoop = scanner.nextLine();
            }
        }
        if(inputAnsLoop.equals("1")){
            game();
        }
        else if (inputAnsLoop.equals("2")){
            currentlyPlaying = false;
        }
    }

    public static void returnScore() {
        System.out.println("Your score: " + userScore);
        System.out.println("Computer score: " + compScore);
        System.out.println();
    }
}