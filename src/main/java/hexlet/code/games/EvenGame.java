package hexlet.code.games;

import java.util.Scanner;

import static hexlet.code.Cli.playerName;


public class EvenGame {

    private static String playerIntroduction() {
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        final String currentPlayerName = playerName();
        System.out.println("Hello, " + currentPlayerName + "!");
        return currentPlayerName;
    }


    public static void playEvenGame() {

        var currentPlayerName = playerIntroduction();
        int attempts = 3;
        int winCount = 0;
        int rangeOfNumbers = 100;
        for (int i = 0; i < attempts; i++) {
            int randomNumber = (int) (Math.random() * rangeOfNumbers);

            System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
            System.out.println("Question: " + randomNumber);
            System.out.print("Your answer: ");

            Scanner scanner2 = new Scanner(System.in);
            String playerAnswer = scanner2.next();

            if (playerAnswer.equals(answer(randomNumber))) {
                System.out.println("Correct!");
                winCount++;
                if (winCount == attempts) {
                    System.out.println("Congratulations, " + currentPlayerName + "!");
                }

            } else {

                System.out.println("'yes' is wrong answer ;(. Correct answer was 'no'.");
                System.out.println("Let's try again, " + currentPlayerName + "!");
                break;

            }
        }
    }


    private static String answer(int randomNumber) {
        boolean even = (randomNumber % 2) == 0;
        return even ? "yes" : "no";
    }


}
