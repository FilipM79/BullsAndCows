package bullscows;

import java.util.*;
import java.lang.*;

public interface User extends Generator {
    Scanner scanner1 = new Scanner(System.in);
    List<Integer> userGuess = new ArrayList<>();

    static void input(int counter) {

        System.out.println("\nTurn " + counter + ". Answer:");
        System.out.print("> ");
//        counter++;
        List<String> inputCode = List.of(scanner1.nextLine().split(""));

        for (int i = 0; i < inputCode.size(); i++) {
            userGuess.add(i, Integer.valueOf(inputCode.get(i)));
        }
    }
}
