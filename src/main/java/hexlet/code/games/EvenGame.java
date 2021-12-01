package hexlet.code.games;

import static hexlet.code.Engine.gameEngine;
import static hexlet.code.Utils.generateRandom;
import static hexlet.code.Utils.LOWER_RANGE_LIMIT;
import static hexlet.code.Utils.UPPER_RANGE_LIMIT;

public class EvenGame {

    public static final String EVEN_GAME_RULES = "Answer 'yes' if the number is even, otherwise answer 'no'.";

    public static void playEvenGame() {

        final int arraySize = 3;

        String[] evenGameAnswers = new String[arraySize];

        String[] evenGameQuestions = new String[arraySize];

        for (int counts = 0; counts < arraySize; counts++) {

            int generatedNumber = generateRandom(LOWER_RANGE_LIMIT, UPPER_RANGE_LIMIT);

            var evenQuestionToPlayer = String.valueOf(generatedNumber);

            var evenRightAnswer = isEven(generatedNumber) ? "yes" : "no";

            evenGameAnswers[counts] = evenRightAnswer;

            evenGameQuestions[counts] = evenQuestionToPlayer;
        }

        gameEngine(EVEN_GAME_RULES, evenGameQuestions, evenGameAnswers);

    }


    private static boolean isEven(int randomNumber) {

        return (randomNumber % 2) == 0;
    }

}
