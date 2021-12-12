package hexlet.code.games;

import static hexlet.code.Engine.GAME_COUNTS;
import static hexlet.code.Engine.runGame;
import static hexlet.code.Utils.generateRandom;
import static hexlet.code.Utils.LOWER_RANGE_LIMIT;
import static hexlet.code.Utils.UPPER_RANGE_LIMIT;


public class PrimeGame {

    public static final String PRIME_GAME_RULES = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";

    public static void playPrimeGame() {

        var primeGameQuestions = new String[GAME_COUNTS];
        var primeGameAnswers = new String[GAME_COUNTS];

        for (int count = 0; count < GAME_COUNTS; count++) {

            int randomNumber = generateRandom(LOWER_RANGE_LIMIT, UPPER_RANGE_LIMIT);
            var rightAnswer = isPrime(randomNumber) ? "yes" : "no";

            primeGameQuestions[count] = String.valueOf(randomNumber);
            primeGameAnswers[count] = rightAnswer;
        }

        runGame(PRIME_GAME_RULES, primeGameQuestions, primeGameAnswers);

    }

    private static boolean isPrime(int number) {

        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }

        return (number > 1);

    }


}
