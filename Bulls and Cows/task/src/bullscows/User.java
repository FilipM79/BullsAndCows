package bullscows;

import java.util.*;

public interface User extends BullsAndCows {
    Scanner scanner = new Scanner(System.in);
    List<Integer> userGuess = new ArrayList<>();


    static void input(int counter) {

        System.out.println("\nTurn " + counter + ". Answer:");
        System.out.print("> ");

        List<String> inputCode = List.of(scanner.nextLine().split(""));

        for (int i = 0; i < inputCode.size(); i++) {
            userGuess.add(i, Integer.valueOf(inputCode.get(i)));
        }
    }
}
