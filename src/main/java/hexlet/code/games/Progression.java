package hexlet.code.games;

import java.util.Arrays;

import static hexlet.code.Engine.gameEngine;

public class Progression {

    public static void playProgressionGame() {
        String progressionGameRules = "What number is missing in the progression? ";

        final int arraySize = 3;

        String[] progressionGameQuestions = new String[arraySize];

        String[] progressionGameAnswers = new String[arraySize];

        for (int count = 0; count < arraySize; count++) {

            var basedProgression = createProgression();

            int randomPlaceInArray = (int) (Math.random() * (basedProgression.length - 1));

            int rightAnswer = Integer.parseInt(basedProgression[randomPlaceInArray]);

            basedProgression[randomPlaceInArray] = "..";

            String arrayToQuestion = Arrays.toString(basedProgression)
                    .replace("[", "")
                    .replace("]", "")
                    .replace(",", "");

            progressionGameQuestions[count] = arrayToQuestion;

            progressionGameAnswers[count] = String.valueOf(rightAnswer);

        }

        gameEngine(progressionGameRules, progressionGameQuestions, progressionGameAnswers);

    }

    private static String[] createProgression() {
        final int arrayRangeModificator = 5;

        int arrayLenght = (int) ((Math.random() * arrayRangeModificator) + arrayRangeModificator);

        if (arrayLenght == 0) {
            arrayLenght = 1;
        }

        var progression = new String[arrayLenght];

        final int progressionRange = 100;

        final int progressionStepRange = 10;

        int progressionDisplacement = (int) (Math.random() * progressionRange);

        int progressionStep = (int) (Math.random() * progressionStepRange);

        for (int i = 0; i < arrayLenght; i++) {
            int count = i + progressionDisplacement + (i * progressionStep);

            String count2 = String.valueOf(count);

            progression[i] = count2;
        }

        return progression;
    }

}
