package hexlet.code.games;

import java.util.Scanner;

import static hexlet.code.Cli.playerName;

public class GSDGame {

    private static String playerIntroduction() {
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        final String currentPlayerName = playerName();
        System.out.println("Hello, " + currentPlayerName + "!");
        return currentPlayerName;
    }


    public static void playGcdGame() {
        var currentPlayerName = playerIntroduction();
        int winCount = 0;
        for (int x = 0; x < 3; x++) {
            int firstNumber = (int) (Math.random() * 100);
            int secondNumber = (int) (Math.random() * 100);
            int rightAnswer = findGcd(firstNumber, secondNumber);


            System.out.println("Find the greatest common divisor of given numbers.");
            System.out.println("Question: " + firstNumber + " " + secondNumber);
            System.out.print("Your answer: ");

            Scanner scanner = new Scanner(System.in);
            int playerAnswer = scanner.nextInt();

            if (rightAnswer == playerAnswer) {
                System.out.println("Correct!");
                winCount++;
                if (winCount == 3) {
                    System.out.println("Congratulations, " + currentPlayerName + "!");
                    break;
                }
            } else {
                System.out.println(playerAnswer + " is wrong answer ;(. Correct answer was " + rightAnswer + ".");
                System.out.println("Let's try again, " + currentPlayerName + "!");
                break;
            }

        }
    }


    public static int findGcd(int firstNumber, int secondNumber) {
        while (secondNumber != 0) {
            int tmp = firstNumber % secondNumber;
            firstNumber = secondNumber;
            secondNumber = tmp;
        }
        return firstNumber;
    }


}
