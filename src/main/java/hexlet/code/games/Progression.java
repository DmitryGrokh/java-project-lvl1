package hexlet.code.games;

import java.util.Arrays;

import static hexlet.code.Engine.GAME_COUNTS;
import static hexlet.code.Engine.runGame;

import static hexlet.code.Utils.LOWER_RANGE_LIMIT;
import static hexlet.code.Utils.UPPER_RANGE_LIMIT;
import static hexlet.code.Utils.generateRandom;


public class Progression {

    public static final String PROGRESSION_GAME_RULES = "What number is missing in the progression? ";

    private static final int PROGRESSION_RANGE_STEP = 10;

    private static final int ARRAY_RANGE_MODIFIER = 5;

    public static void playProgressionGame() {

        var progressionGameQuestions = new String[GAME_COUNTS];
        var progressionGameAnswers = new String[GAME_COUNTS];

        for (int count = 0; count < GAME_COUNTS; count++) {

            int firstElement = generateRandom(LOWER_RANGE_LIMIT, UPPER_RANGE_LIMIT);
            int progressionLength = generateRandom(ARRAY_RANGE_MODIFIER, ARRAY_RANGE_MODIFIER);
            int progressionStep = generateRandom(LOWER_RANGE_LIMIT, PROGRESSION_RANGE_STEP);

            var progression = createProgression(firstElement, progressionLength, progressionStep);

            int hiddenElementIndex = generateRandom(LOWER_RANGE_LIMIT, progression.length - 1);

            var rightAnswer = progression[hiddenElementIndex];

            progressionGameQuestions[count] = buildQuestion(progression, hiddenElementIndex);
            progressionGameAnswers[count] = rightAnswer;

        }

        runGame(PROGRESSION_GAME_RULES, progressionGameQuestions, progressionGameAnswers);

    }


    private static String buildQuestion(String[] array, int hiddenItemIndex) {

        var arrayForQuestionBuilder = array.clone();

        arrayForQuestionBuilder[hiddenItemIndex] = "..";

        return Arrays.toString(arrayForQuestionBuilder)
                .replace("[", "")
                .replace("]", "")
                .replace(",", "");

    }

    private static String[] createProgression(int firstElement, int progressionLength, int progressionStep) {

        var progression = new String[progressionLength];

        for (int i = 0; i < progressionLength; i++) {

            int count = i + firstElement + (i * progressionStep);

            progression[i] = String.valueOf(count);
        }

        return progression;

    }

}
