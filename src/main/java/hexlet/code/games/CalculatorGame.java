package hexlet.code.games;

import java.util.Scanner;

import static hexlet.code.Cli.playerName;

public class CalculatorGame {

    public static final int ADDITION = 1;
    public static final int SUBTRACTION = 2;
    public static final int MULTIPLICATION = 3;

    private static String playerIntroduction() {
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        final String currentPlayerName = playerName();
        System.out.println("Hello, " + currentPlayerName + "!");
        return currentPlayerName;
    }

    public static void playCalculatorGame() {
        var currentPlayerName = playerIntroduction();
        final int cycleCount = 3;
        int winCount = 0;
        int i = 0;
        while (i < cycleCount) {
            int numberOfExercise = (int) (Math.random() * 2) + 1;
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
            if (winCount == cycleCount) {
                System.out.printf("Congratulations, %s!%n", currentPlayerName);
                break;
            }

            i++;
        }

    }

    private static int selectExercise(int numberOfExercise) {
        int rightAnswer = 0;
        final int randomRange = 10;
        int firstNumber = (int) (Math.random() * randomRange);
        int secondNumber = (int) (Math.random() * randomRange);
        String question = "What is the result of the expression?";

        switch (numberOfExercise) {
            case ADDITION:
                rightAnswer = firstNumber + secondNumber;
                System.out.println(question);
                System.out.printf("Question: %d + %d%n", firstNumber, secondNumber);
                System.out.print("Your answer: ");
                break;
            case SUBTRACTION:
                rightAnswer = firstNumber - secondNumber;
                System.out.println(question);
                System.out.printf("Question: %d - %d%n", firstNumber, secondNumber);
                System.out.print("Your answer: ");
                break;
            case MULTIPLICATION:
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
