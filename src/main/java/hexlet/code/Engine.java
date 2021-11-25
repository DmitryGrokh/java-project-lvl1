package hexlet.code;

import java.util.Scanner;

import static hexlet.code.Cli.playerName;

public class Engine {


    private static String playerIntroduction() {
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        final String currentPlayerName = playerName();
        System.out.println("Hello, " + currentPlayerName + "!");
        return currentPlayerName;
    }

    public static void gameEngine(String gameRules, String[] questions, String[] rightAnswers) {

        var currentPlayerName = playerIntroduction();

        System.out.println(gameRules);

        int winCount = 0;

        final int gamesCount = 3;

        for (int i = 0; i < gamesCount; i++) {

            System.out.println("Question: " + questions[i]);

            System.out.print("Your answer: ");

            Scanner scanner = new Scanner(System.in);

            String playerAnswer = scanner.next();

            if (playerAnswer.equals(rightAnswers[i])) {
                System.out.println("Correct!");
                winCount++;

                if (winCount == gamesCount) {
                    System.out.println("Congratulations, " + currentPlayerName + "!");
                    break;
                }

            } else {

                System.out.println(playerAnswer + " is wrong answer ;(. Correct answer was " + rightAnswers[i]);
                System.out.println("Let's try again, " + currentPlayerName + "!");
                break;

            }
        }
    }


}

