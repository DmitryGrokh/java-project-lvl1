package hexlet.code.games;

import java.util.Scanner;

import static hexlet.code.Cli.playerName;

public class CalculatorGame {

    private static String playerIntroduction() {
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        final String currentPlayerName = playerName();
        System.out.println("Hello, " + currentPlayerName + "!");
        return currentPlayerName;
    }

    public static void playCalculatorGame() {
        var currentPlayerName = playerIntroduction();
        String question = "What is the result of the expression?";

        int winCount = 0;
        int i = 0;
        while (i < 3) {
            int firstNumber = (int) (Math.random() * 10);
            int secondNumber = (int) (Math.random() * 10);
            int numberOfExercise = (int) (Math.random() * 3) + 1;
            if (numberOfExercise == 4) {
                numberOfExercise = 3;
            }
            int playerAnswer;
            int rightAnswer = 0;

            switch (numberOfExercise) {
                case 1:
                    rightAnswer = firstNumber + secondNumber;
                    System.out.println(question);
                    System.out.printf("Question: %d + %d%n", firstNumber, secondNumber);
                    System.out.print("Your answer: ");
                    break;
                case 2:
                    rightAnswer = firstNumber - secondNumber;
                    System.out.println(question);
                    System.out.printf("Question: %d - %d%n", firstNumber, secondNumber);
                    System.out.print("Your answer: ");
                    break;
                case 3:
                    rightAnswer = firstNumber * secondNumber;
                    System.out.println(question);
                    System.out.printf("Question: %d * %d%n", firstNumber, secondNumber);
                    System.out.print("Your answer: ");
                    break;
                default:
                    break;

            }


            Scanner scanner2 = new Scanner(System.in);
            playerAnswer = scanner2.nextInt();

            if (playerAnswer == rightAnswer) {
                System.out.println("Correct!");
                winCount++;
            } else {
                System.out.println(playerAnswer + " is wrong answer ;(. Correct answer was " + rightAnswer);
                System.out.println("Let's try again, " + currentPlayerName + "!");
                break;
            }
            if (winCount == 3) {
                System.out.println("Congratulations, " + currentPlayerName + "!");
                break;
            }


            i++;
        }

    }


}
