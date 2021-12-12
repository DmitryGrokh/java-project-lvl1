package hexlet.code.games;

import static hexlet.code.Engine.GAME_COUNTS;
import static hexlet.code.Engine.runGame;
import static hexlet.code.Utils.generateRandom;
import static hexlet.code.Utils.LOWER_RANGE_LIMIT;
import static hexlet.code.Utils.UPPER_RANGE_LIMIT;


public class GCDGame {

    public static final String GCD_GAME_RULES = "Find the greatest common divisor of given numbers.";

    public static void playGcdGame() {

        var gcdGameQuestions = new String[GAME_COUNTS];
        var gcdGameAnswers = new String[GAME_COUNTS];

        for (int count = 0; count < GAME_COUNTS; count++) {

            int firstNumber = generateRandom(LOWER_RANGE_LIMIT, UPPER_RANGE_LIMIT);
            int secondNumber = generateRandom(LOWER_RANGE_LIMIT, UPPER_RANGE_LIMIT);
            int rightAnswer = findGcd(firstNumber, secondNumber);

            gcdGameAnswers[count] = String.valueOf(rightAnswer);
            gcdGameQuestions[count] = String.format("%d %d", firstNumber, secondNumber);
        }

        runGame(GCD_GAME_RULES, gcdGameQuestions, gcdGameAnswers);

    }


    private static int findGcd(int firstNumber, int secondNumber) {

        while (secondNumber != 0) {
            int tmp = firstNumber % secondNumber;
            firstNumber = secondNumber;
            secondNumber = tmp;
        }

        return firstNumber;

    }


}
