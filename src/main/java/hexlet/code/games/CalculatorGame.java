package hexlet.code.games;

import static hexlet.code.Engine.gameEngine;

public class CalculatorGame {

    public static final int ADDITION = 1;
    public static final int SUBTRACTION = 2;
    public static final int MULTIPLICATION = 3;

    public static void playCalculatorGame() {

        String calculatorGameRules = "What is the result of the expression?";

        final int arraySize = 3;

        String[] calculatorGameAnswers = new String[arraySize];

        String[] calculatorGameQuestions = new String[arraySize];

        for (int counts = 0; counts < arraySize; counts++) {

            int numberOfExercise = (int) (Math.random() * arraySize);
            if (numberOfExercise == 0) {
                numberOfExercise = arraySize;
            }

            int rightAnswer = 0;

            final int randomRange = 50;

            int firstNumber = (int) (Math.random() * randomRange);

            int secondNumber = (int) (Math.random() * randomRange);

            String question = "";

            switch (numberOfExercise) {
                case ADDITION:
                    question = firstNumber + " + " + secondNumber;
                    rightAnswer = firstNumber + secondNumber;
                    break;
                case SUBTRACTION:
                    question = firstNumber + " - " + secondNumber;
                    rightAnswer = firstNumber - secondNumber;
                    break;
                case MULTIPLICATION:
                    question = firstNumber + " * " + secondNumber;
                    rightAnswer = firstNumber * secondNumber;
                    break;
                default:
                    break;

            }

            calculatorGameQuestions[counts] = question;

            calculatorGameAnswers[counts] = String.valueOf(rightAnswer);

        }

        gameEngine(calculatorGameRules, calculatorGameQuestions, calculatorGameAnswers);


    }

}
