import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Computer's Random Selections
        // Rock = 0 - < 1
        // Paper = 1 - < 2
        // Scissors = 2 - 3
        System.out.println("What is your selection? (Choose a number from 1. Rock, 2. Paper, or 3. Scissors)");
        game();
    }
    public static void game(){
        
        for (int i = 0; i < 25; i++) {
            System.out.print("*");
        }
        System.out.println();

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