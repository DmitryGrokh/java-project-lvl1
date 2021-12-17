package hexlet.code;

import java.util.Scanner;

import static hexlet.code.Cli.playerName;
import static hexlet.code.games.CalculatorGame.playCalculatorGame;
import static hexlet.code.games.EvenGame.playEvenGame;
import static hexlet.code.games.GCDGame.playGcdGame;
import static hexlet.code.games.PrimeGame.playPrimeGame;
import static hexlet.code.games.Progression.playProgressionGame;

public class App {

    public static final int GREETING_MESSAGE = 1;
    public static final int EVEN_GAME = 2;
    public static final int CALCULATOR_GAME = 3;
    public static final int GCD_GAME = 4;
    public static final int PROGRESSION_GAME = 5;
    public static final int PRIME_GAME = 6;
    public static final int EXIT_PROGRAM = 0;

    public static void main(String[] args) {

        printMenu();

        var scanner = new Scanner(System.in);
        int gameNumber = scanner.nextInt();

        switch (gameNumber) {
            case GREETING_MESSAGE:
                printGreetingMessage();
                break;
            case EVEN_GAME:
                playEvenGame();
                break;
            case CALCULATOR_GAME:
                playCalculatorGame();
                break;
            case GCD_GAME:
                playGcdGame();
                break;
            case PROGRESSION_GAME:
                playProgressionGame();
                break;
            case PRIME_GAME:
                playPrimeGame();
                break;
            case EXIT_PROGRAM:
                System.out.println("Bye!");
                break;
            default:
                break;
        }

    }

    public static void printMenu() {

        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("3 - Calculator");
        System.out.println("4 - GCD");
        System.out.println("5 - Progression");
        System.out.println("6 - Prime");
        System.out.println("0 - Exit");
        System.out.print("Your choice: ");

    }
    
    private static void printGreetingMessage() {        
        System.out.print("Welcome to the Brain Games!"
        + System.lineSeparator()
        + "May I have your name? ");
        final var currentPlayerName = playerName();
        System.out.printf("Hello, %s!%n", currentPlayerName);        
    }
    
}
