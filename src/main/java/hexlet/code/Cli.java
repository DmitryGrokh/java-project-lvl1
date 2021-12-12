package hexlet.code;

import java.util.Scanner;

public class Cli {

    public static String playerName() {

        var scanner = new Scanner(System.in);
        return scanner.next();

    }

}
