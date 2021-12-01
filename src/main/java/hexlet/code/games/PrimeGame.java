package hexlet.code.games;

import static hexlet.code.Engine.gameEngine;
import static hexlet.code.Utils.generateRandom;
import static hexlet.code.Utils.LOWER_RANGE_LIMIT;
import static hexlet.code.Utils.UPPER_RANGE_LIMIT;


public class PrimeGame {

    public static final String PRIME_GAME_RULES = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";

    public static void playPrimeGame() {

        final int arraySize = 3;

        String[] primeGameQuestions = new String[arraySize];

        String[] primeGameAnswers = new String[arraySize];

        for (int count = 0; count < arraySize; count++) {

            int randomNumber = generateRandom(LOWER_RANGE_LIMIT, UPPER_RANGE_LIMIT);

            String rightAnswer = isPrime(randomNumber) ? "yes" : "no";

            primeGameQuestions[count] = String.valueOf(randomNumber);

            primeGameAnswers[count] = rightAnswer;

        }

        gameEngine(PRIME_GAME_RULES, primeGameQuestions, primeGameAnswers);

    }


    public static boolean isPrime(int number) {
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return (number > 1);
    }


}
