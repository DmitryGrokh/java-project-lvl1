package hexlet.code.games;

import java.util.Arrays;

import static hexlet.code.Engine.gameEngine;
import static hexlet.code.Utils.generateRandom;
import static hexlet.code.Utils.LOWER_RANGE_LIMIT;


public class Progression {

    public static final String PROGRESSION_GAME_RULES = "What number is missing in the progression? ";

    public static void playProgressionGame() {

        final int arraySize = 3;

        final int progressionRange = 100;

        final int progressionRangeStep = 10;

        String[] progressionGameQuestions = new String[arraySize];

        String[] progressionGameAnswers = new String[arraySize];

        for (int count = 0; count < arraySize; count++) {

            var basedProgression = createProgression(progressionRange, progressionRangeStep);

            int randomPlaceInArray = generateRandom(LOWER_RANGE_LIMIT, basedProgression.length - 1);

            var rightAnswer = basedProgression[randomPlaceInArray];

            progressionGameQuestions[count] = buildQuestion(basedProgression, randomPlaceInArray);

            progressionGameAnswers[count] = rightAnswer;

        }

        gameEngine(PROGRESSION_GAME_RULES, progressionGameQuestions, progressionGameAnswers);

    }


    public static String buildQuestion(String[] array, int hiddenItemIndex) {

        array[hiddenItemIndex] = "..";

        return Arrays.toString(array)
                .replace("[", "")
                .replace("]", "")
                .replace(",", "");

    }

    private static String[] createProgression(int progressionRange, int progressionRangeStep) {
        final int arrayRangeModificator = 5;

        int arrayLenght = generateRandom(arrayRangeModificator, arrayRangeModificator);

        if (arrayLenght == 0) {
            arrayLenght = 1;
        }

        var progression = new String[arrayLenght];

        int progressionDisplacement = generateRandom(LOWER_RANGE_LIMIT, progressionRange);

        int progressionStep = generateRandom(LOWER_RANGE_LIMIT, progressionRangeStep);

        for (int i = 0; i < arrayLenght; i++) {

            int count = i + progressionDisplacement + (i * progressionStep);

            String count2 = String.valueOf(count);

            progression[i] = count2;

        }

        return progression;
    }

}
