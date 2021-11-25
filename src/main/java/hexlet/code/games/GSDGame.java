package hexlet.code.games;

import static hexlet.code.Engine.gameEngine;

public class GSDGame {


    public static void playGcdGame() {

        String gsdGameRules = "Find the greatest common divisor of given numbers.";

        final int arraySize = 3;

        String[] gcdGameQuestions = new String[arraySize];

        String[] gcdGameAnswers = new String[arraySize];

        for (int count = 0; count < arraySize; count++) {

            final int randomRange = 100;

            int firstNumber = (int) (Math.random() * randomRange);

            int secondNumber = (int) (Math.random() * randomRange);

            int rightAnswer = findGcd(firstNumber, secondNumber);

            gcdGameAnswers[count] = String.valueOf(rightAnswer);

            gcdGameQuestions[count] = firstNumber + " " + secondNumber;
        }

        gameEngine(gsdGameRules, gcdGameQuestions, gcdGameAnswers);


    }


    public static int findGcd(int firstNumber, int secondNumber) {
        while (secondNumber != 0) {
            int tmp = firstNumber % secondNumber;
            firstNumber = secondNumber;
            secondNumber = tmp;
        }
        return firstNumber;
    }


}
