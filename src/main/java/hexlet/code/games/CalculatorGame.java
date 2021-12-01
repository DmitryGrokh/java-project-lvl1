package hexlet.code.games;

import static hexlet.code.Engine.gameEngine;
import static hexlet.code.Utils.generateRandom;
import static hexlet.code.Utils.LOWER_RANGE_LIMIT;
import static hexlet.code.Utils.UPPER_RANGE_LIMIT;

public class CalculatorGame {

    public static final String CALCULATOR_GAME_RULES = "What is the result of the expression?";

    public static void playCalculatorGame() {

        final int arraySize = 3;

        String[] calculatorGameAnswers = new String[arraySize];

        String[] calculatorGameQuestions = new String[arraySize];

        var operations = new String[]{"+", "-", "*"};

        for (int counts = 0; counts < arraySize; counts++) {

            int numberOfExercise = generateRandom(LOWER_RANGE_LIMIT, arraySize);

            if (numberOfExercise == arraySize) {
                numberOfExercise = 0;
            }

            String typeOfOperation = operations[numberOfExercise];

            int firstNumber = generateRandom(LOWER_RANGE_LIMIT, UPPER_RANGE_LIMIT);

            int secondNumber = generateRandom(LOWER_RANGE_LIMIT, UPPER_RANGE_LIMIT);

            String questionToPlayer = String.format("%d %s %d", firstNumber, typeOfOperation, secondNumber);

            var rightAnswer = calculateRightAnswer(firstNumber, typeOfOperation, secondNumber);

            calculatorGameQuestions[counts] = questionToPlayer;

            calculatorGameAnswers[counts] = String.valueOf(rightAnswer);
        }

        gameEngine(CALCULATOR_GAME_RULES, calculatorGameQuestions, calculatorGameAnswers);

    }


    public static int calculateRightAnswer(int firstNumber, String typeOfOperation, int secondNumber) {

        int rightAnswer = 0;

        switch (typeOfOperation) {

            case "+":
                rightAnswer = firstNumber + secondNumber;
                break;

            case "-":
                rightAnswer = firstNumber - secondNumber;
                break;

            case "*":
                rightAnswer = firstNumber * secondNumber;
                break;

            default:
                break;

        }

        return rightAnswer;

    }

}
