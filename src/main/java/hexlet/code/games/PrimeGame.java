package hexlet.code.games;

import static hexlet.code.Engine.gameEngine;

public class PrimeGame {


    public static void playPrimeGame() {

        String primeGameRules = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";

        final int arraySize = 3;

        String[] primeGameQuestions = new String[arraySize];

        String[] primeGameAnswers = new String[arraySize];

        for (int count = 0; count < arraySize; count++) {
            final int randomModificator = 50;

            int randomNumber = (int) (Math.random() * randomModificator);

            String rightAnswer;

            if (simpleCheck(randomNumber)) {
                rightAnswer = "yes";
            } else {
                rightAnswer = "no";
            }

            primeGameQuestions[count] = String.valueOf(randomNumber);

            primeGameAnswers[count] = rightAnswer;

        }

        gameEngine(primeGameRules, primeGameQuestions, primeGameAnswers);

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
