package hexlet.code;

import java.util.Scanner;

public class Cli {
    public static String playerName() {
        var scanner = new Scanner(System.in);
        return scanner.next();
    }

    public static void greetingMessage() {
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        final var currentPlayerName = playerName();
        System.out.println("Hello, " + currentPlayerName + "!");
    }

}
