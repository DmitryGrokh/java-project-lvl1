package hexlet.code;

import java.util.Scanner;

import static hexlet.code.Cli.playerName;

public class Engine {

    public static final int GAME_COUNTS = 3;

    public static void runGame(String gameRules, String[] questions, String[] rightAnswers) {

        System.out.println("Welcome to the Brain Games!");

        System.out.print("May I have your name? ");

        final var currentPlayerName = playerName();

        System.out.println("Hello, " + currentPlayerName + "!");

        System.out.println(gameRules);

        for (int i = 0; i < GAME_COUNTS; i++) {

            System.out.println("Question: " + questions[i]);

            System.out.print("Your answer: ");

            var scanner = new Scanner(System.in);

            var playerAnswer = scanner.next();

            if (playerAnswer.equals(rightAnswers[i])) {
                System.out.println("Correct!");


            } else {
                System.out.printf("'%s' is wrong answer ;(. "
                        +
                        "Correct answer was '%s'. %n", playerAnswer, rightAnswers[i]);
                System.out.println("Let's try again, " + currentPlayerName + "!");
                return;

            }
        }

        System.out.println("Congratulations, " + currentPlayerName + "!");


    }


}

