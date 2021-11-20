package hexlet.code;

import static hexlet.code.games.CalculatorGame.playCalculatorGame;
import static hexlet.code.Cli.playerName;
import static hexlet.code.games.EvenGame.playEvenGame;
import static hexlet.code.games.GSDGame.playGcdGame;
import static hexlet.code.games.Progression.playProgressionGame;

public class Engine {

    public static void gameSelection(int gameNumber) {
        switch (gameNumber) {
            case 1:
                greetingMessage();
                break;
            case 2:
                playEvenGame();
                break;
            case 3:
                playCalculatorGame();
                break;
            case 4:
                playGcdGame();
                break;
            case 5:
                playProgressionGame();
                break;
            case 0:
                System.out.println("Bye!");
                break;
            default:
                break;
        }

    }

    public static void greetingMessage() {
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        final String currentPlayerName = playerName();
        System.out.println("Hello, " + currentPlayerName + "!");
    }

}

