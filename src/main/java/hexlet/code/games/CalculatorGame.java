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

        int winCount = 0;
        int i = 0;
        while (i < 3) {
            int numberOfExercise = (int) (Math.random() * 3) + 1;
            if (numberOfExercise == 4) {
                numberOfExercise = 3;
            }
            int playerAnswer;
            var rightAnswer = selectExercise(numberOfExercise);

            Scanner scanner2 = new Scanner(System.in);
            playerAnswer = scanner2.nextInt();

            if (playerAnswer == rightAnswer) {
                System.out.println("Correct!");
                winCount++;
            } else {
                System.out.printf("%d is wrong answer ;(. Correct answer was %d%n", playerAnswer, rightAnswer);
                System.out.printf("Let's try again, %s!%n", currentPlayerName);
                break;
            }
            if (winCount == 3) {
                System.out.printf("Congratulations, %s!%n", currentPlayerName);
                break;
            }

            i++;
        }

    }

    private static int selectExercise(int numberOfExercise) {
        int rightAnswer = 0;
        int firstNumber = (int) (Math.random() * 10);
        int secondNumber = (int) (Math.random() * 10);
        String question = "What is the result of the expression?";

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
        return rightAnswer;
    }


}
