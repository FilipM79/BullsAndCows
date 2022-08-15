package bullscows;

import java.util.*;

public interface User {
    Scanner scanner = new Scanner(System.in);
    List<Integer> userGuess = new ArrayList<>();

    static void input() {
        int counter = 0;
        System.out.println("Turn " + counter + ". Answer:");
        System.out.println("> ");
        counter++;
        List<String> inputCode = List.of(scanner.nextLine().split(""));




        for (int i = 0; i < inputCode.size(); i++) {
            userGuess.add(i, Integer.valueOf(inputCode.get(i)));
        }
    }
}
