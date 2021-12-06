package hexlet.code.games;

import static hexlet.code.Engine.GAME_COUNTS;
import static hexlet.code.Engine.runGame;
import static hexlet.code.Utils.generateRandom;
import static hexlet.code.Utils.LOWER_RANGE_LIMIT;
import static hexlet.code.Utils.UPPER_RANGE_LIMIT;

public class CalculatorGame {

    public static final String CALCULATOR_GAME_RULES = "What is the result of the expression?";

    public static final String[] OPERATIONS = new String[]{"+", "-", "*"};

    public static void playCalculatorGame() {

        var calculatorGameAnswers = new String[GAME_COUNTS];

        var calculatorGameQuestions = new String[GAME_COUNTS];

        for (int counts = 0; counts < GAME_COUNTS; counts++) {

            int numberOfExercise = generateRandom(LOWER_RANGE_LIMIT, GAME_COUNTS);

            if (numberOfExercise == GAME_COUNTS) {
                numberOfExercise = 0;
            }

            var typeOfOperation = OPERATIONS[numberOfExercise];

            int firstNumber = generateRandom(LOWER_RANGE_LIMIT, UPPER_RANGE_LIMIT);

            int secondNumber = generateRandom(LOWER_RANGE_LIMIT, UPPER_RANGE_LIMIT);

            var questionToPlayer = String.format("%d %s %d", firstNumber, typeOfOperation, secondNumber);

            var rightAnswer = calculateRightAnswer(firstNumber, typeOfOperation, secondNumber);

            calculatorGameQuestions[counts] = questionToPlayer;

            calculatorGameAnswers[counts] = String.valueOf(rightAnswer);
        }

        runGame(CALCULATOR_GAME_RULES, calculatorGameQuestions, calculatorGameAnswers);

    }


    private static int calculateRightAnswer(int firstNumber, String typeOfOperation, int secondNumber) {

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
