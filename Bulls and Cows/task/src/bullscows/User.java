package bullscows;

import java.util.*;
import java.lang.*;

public interface User extends Generator {
    Scanner scanner1 = new Scanner(System.in);
    List<Character> userGuess2 = new ArrayList<>();
    List<Integer> userGuess = new ArrayList<>();

    static void input(int counter, int codeLength) {

        System.out.println("\nTurn " + counter + ". Answer:");
        System.out.print("> ");

        String inputCode = "";
        boolean condition2 = false;
        while(!condition2) {
            inputCode = scanner1.nextLine();
            if (inputCode.length() < codeLength) {
                System.out.println("Error, the input length is less than code length.");
            } else {
                condition2 = true;
            }
        }

        for (int i = 0; i < secretCode2.size(); i++) {
            char ch2 = inputCode.charAt(i);
            userGuess2.add(i, (char) Integer.parseInt(String.valueOf((byte) ch2)));
        }

        for (int i = 0; i < secretCode2.size(); i++) {
            userGuess.add(i, Integer.valueOf(userGuess2.get(i)));
        }
    }
}
