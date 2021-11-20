package hexlet.code.games;


import java.util.Scanner;

import static hexlet.code.Cli.playerName;

public class PrimeGame {

    private static String playerIntroduction() {
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        final String currentPlayerName = playerName();
        System.out.println("Hello, " + currentPlayerName + "!");
        return currentPlayerName;
    }


    public static void playPrimeGame() {
        var currentPlayerName = playerIntroduction();

        int winCount = 0;
        for (int count = 0; count < 3; count++) {
            int randomNumber = (int) (Math.random() * 50);
            String rightAnswer;
            if (simpleCheck(randomNumber)) {
                rightAnswer = "yes";
            } else {
                rightAnswer = "no";
            }

            System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'.");
            System.out.println("Question: " + randomNumber);
            System.out.print("Your answer: ");

            Scanner scanner = new Scanner(System.in);
            String playerAnswer = scanner.next();
            if (playerAnswer.equals(rightAnswer)) {
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


    public static boolean simpleCheck(int number) {
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return (number > 1);
    }


}
