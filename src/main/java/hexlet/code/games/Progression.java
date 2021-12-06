package hexlet.code.games;

import java.util.Arrays;

import static hexlet.code.Engine.GAME_COUNTS;
import static hexlet.code.Engine.runGame;

import static hexlet.code.Utils.LOWER_RANGE_LIMIT;
import static hexlet.code.Utils.UPPER_RANGE_LIMIT;
import static hexlet.code.Utils.generateRandom;


public class Progression {

    public static final String PROGRESSION_GAME_RULES = "What number is missing in the progression? ";

    public static void playProgressionGame() {

        final int progressionRangeStep = 10;

        var progressionGameQuestions = new String[GAME_COUNTS];

        var progressionGameAnswers = new String[GAME_COUNTS];

        final int arrayRangeModificator = 5;

        for (int count = 0; count < GAME_COUNTS; count++) {

            int arrayLenght = generateRandom(arrayRangeModificator, arrayRangeModificator);

            int progressionDisplacement = generateRandom(LOWER_RANGE_LIMIT, UPPER_RANGE_LIMIT);

            int progressionStep = generateRandom(LOWER_RANGE_LIMIT, progressionRangeStep);

            var basedProgression = createProgression(arrayLenght, progressionDisplacement, progressionStep);

            int randomPlaceInArray = generateRandom(LOWER_RANGE_LIMIT, basedProgression.length - 1);

            var rightAnswer = basedProgression[randomPlaceInArray];

            progressionGameQuestions[count] = buildQuestion(basedProgression, randomPlaceInArray);

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

    private static String[] createProgression(int arrayLenght, int progressionDisplacement, int progressionStep) {

        var progression = new String[arrayLenght];

        for (int i = 0; i < arrayLenght; i++) {

            int count = i + progressionDisplacement + (i * progressionStep);

            progression[i] = String.valueOf(count);
        }

        return progression;
    }

}
