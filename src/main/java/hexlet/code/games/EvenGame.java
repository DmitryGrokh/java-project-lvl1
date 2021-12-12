package hexlet.code.games;

import static hexlet.code.Engine.GAME_COUNTS;
import static hexlet.code.Engine.runGame;
import static hexlet.code.Utils.generateRandom;
import static hexlet.code.Utils.LOWER_RANGE_LIMIT;
import static hexlet.code.Utils.UPPER_RANGE_LIMIT;

public class EvenGame {

    public static final String EVEN_GAME_RULES = "Answer 'yes' if the number is even, otherwise answer 'no'.";

    public static void playEvenGame() {

        var evenGameAnswers = new String[GAME_COUNTS];
        var evenGameQuestions = new String[GAME_COUNTS];

        for (int counts = 0; counts < GAME_COUNTS; counts++) {

            int generatedNumber = generateRandom(LOWER_RANGE_LIMIT, UPPER_RANGE_LIMIT);
            var evenQuestionToPlayer = String.valueOf(generatedNumber);
            var evenRightAnswer = isEven(generatedNumber) ? "yes" : "no";

            evenGameAnswers[counts] = evenRightAnswer;
            evenGameQuestions[counts] = evenQuestionToPlayer;
        }

        runGame(EVEN_GAME_RULES, evenGameQuestions, evenGameAnswers);

    }


    private static boolean isEven(int randomNumber) {

        return (randomNumber % 2) == 0;

    }

}
