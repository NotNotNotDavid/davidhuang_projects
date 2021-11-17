import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Computer's Random Selections
        // Rock = 0 - < 1
        // Paper = 1 - < 2
        // Scissors = 2 - 3
        game();
    }
    public static void game(){
        Scanner scanner = new Scanner(System.in);
        double compRandom = Math.random()*3;
        System.out.println("What is your selection? (Choose a number from 1. rock, 2. paper, or 3.scissors)");
        int inputAns = scanner.nextInt();
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
