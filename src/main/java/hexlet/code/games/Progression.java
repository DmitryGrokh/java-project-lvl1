package hexlet.code.games;

import java.util.Arrays;
import java.util.Scanner;

import static hexlet.code.Cli.playerName;

public class Progression {
    private static String playerIntroduction() {
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        final String currentPlayerName = playerName();
        System.out.println("Hello, " + currentPlayerName + "!");
        return currentPlayerName;
    }


    public static void playProgressionGame() {
        var currentPlayerName = playerIntroduction();
        int winCounts = 0;
        final int count = 3;
        for (int i = 0; i < count; i++) {
            var counts = createProgression();

            int randomPlaceInArray = (int) (Math.random() * counts.length);
            int rightAnswer = Integer.parseInt(counts[randomPlaceInArray]);

            counts[randomPlaceInArray] = "..";
            System.out.println("What number is missing in the progression? ");
            System.out.println("Question: " + Arrays.toString(counts)
                    .replace("[", "")
                    .replace("]", "")
                    .replace(",", ""));

            System.out.print("Your answer: ");
            Scanner scanner = new Scanner(System.in);
            int playerAnswer = scanner.nextInt();

            if (playerAnswer == rightAnswer) {
                System.out.println("Correct!");
                winCounts++;
                if (winCounts == count) {
                    System.out.printf("Congratulations, %s!%n", currentPlayerName);
                }
            } else {
                System.out.printf("%d is wrong answer ;(. Correct answer was %d%n", playerAnswer, rightAnswer);
                System.out.printf("Let's try again, %s!%n", currentPlayerName);
                break;
            }
        }

    }

    private static String[] createProgression() {
        final int arrayRangeModificator = 5;
        int arrayLenght = (int) ((Math.random() * arrayRangeModificator) + arrayRangeModificator);

        if (arrayLenght == 0) {
            arrayLenght = 1;
        }

        var progression = new String[arrayLenght];
        final int progressionRange = 100;
        final int progressionStepRange = 10;
        int progressionDisplacement = (int) (Math.random() * progressionRange);
        int progressionStep = (int) (Math.random() * progressionStepRange);

        for (int i = 0; i < arrayLenght; i++) {
            int count = i + progressionDisplacement + (i * progressionStep);
            String count2 = String.valueOf(count);
            progression[i] = count2;
        }

        return progression;
    }

}
