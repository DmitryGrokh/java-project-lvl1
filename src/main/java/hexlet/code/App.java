package hexlet.code;

import java.util.Scanner;

import static hexlet.code.Cli.playerName;
import static hexlet.code.EvenGame.playEvenGame;

public class App {

    public static void main(String[] args) {


        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("0 - Exit");
        System.out.print("Your choice: ");

        Scanner scanner = new Scanner(System.in);
        int gameNumber = scanner.nextInt();


        switch (gameNumber) {
            case 1:
                greetingMessage();
                break;
            case 2:
                playEvenGame();
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



