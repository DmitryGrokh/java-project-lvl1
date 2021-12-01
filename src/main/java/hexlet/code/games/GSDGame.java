package hexlet.code.games;

import static hexlet.code.Engine.gameEngine;
import static hexlet.code.Utils.generateRandom;
import static hexlet.code.Utils.LOWER_RANGE_LIMIT;
import static hexlet.code.Utils.UPPER_RANGE_LIMIT;


public class GSDGame {

    public static final String GSD_GAME_RULES = "Find the greatest common divisor of given numbers.";

    public static void playGcdGame() {

        final int arraySize = 3;

        String[] gcdGameQuestions = new String[arraySize];

        String[] gcdGameAnswers = new String[arraySize];

        for (int count = 0; count < arraySize; count++) {

            int firstNumber = generateRandom(LOWER_RANGE_LIMIT, UPPER_RANGE_LIMIT);

            int secondNumber = generateRandom(LOWER_RANGE_LIMIT, UPPER_RANGE_LIMIT);

            int rightAnswer = findGcd(firstNumber, secondNumber);

            gcdGameAnswers[count] = String.valueOf(rightAnswer);

            gcdGameQuestions[count] = String.format("%d %d", firstNumber, secondNumber);
        }

        gameEngine(GSD_GAME_RULES, gcdGameQuestions, gcdGameAnswers);


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
