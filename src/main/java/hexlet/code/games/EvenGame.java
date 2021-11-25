package hexlet.code.games;

import static hexlet.code.Engine.gameEngine;

public class EvenGame {


    public static void playEvenGame() {

        String evenGameRules = "Answer 'yes' if the number is even, otherwise answer 'no'.";

        final int arraySize = 3;

        String[] evenGameAnswers = new String[arraySize];

        String[] evenGameQuestions = new String[arraySize];

        for (int counts = 0; counts < arraySize; counts++) {

            int generatedNumber = randomNumber();

            var evenQuestionToPlayer = String.valueOf(generatedNumber);

            var evenRightAnswer = answer(generatedNumber);

            evenGameAnswers[counts] = evenRightAnswer;

            evenGameQuestions[counts] = evenQuestionToPlayer;
        }


        gameEngine(evenGameRules, evenGameQuestions, evenGameAnswers);

    }


    private static int randomNumber() {

        final int rangeOfNumbers = 100;

        return (int) (Math.random() * rangeOfNumbers);
    }

    private static String answer(int randomNumber) {
        boolean even = (randomNumber % 2) == 0;
        return even ? "yes" : "no";
    }

}
