package bullscows;

import java.util.ArrayList;
import java.util.List;

public interface BullsAndCows extends Generator, User {
    List<Boolean> bull = new ArrayList<>();
    List<Boolean> compare = new ArrayList<>();

    static void check () {

        int bullCount = 0;
        int cowCount = 0;
        int counter = 0;

        for (int i = 0; i < 4; i++) {
            compare.add(true);
        }

        for (int i: Generator.secretCode) {
            bull.add(counter, false);
            if (User.userGuess.get(counter).equals(i)) {
                bull.set(counter, true);
                bullCount++;
            } else if (!User.userGuess.get(counter).equals(i) &&
                    Generator.secretCode.contains(User.userGuess.get(counter))) {
                cowCount++;
            } counter++;
        }

        String bulls = "";
        String cows = "";
        String and = "";
        String dot = "";

        if (bullCount > 0 && bullCount != 1) {
            bulls = bullCount + " bulls";
        } else if (bullCount == 1) {
            bulls = bullCount + " bull";
        }

        if (cowCount > 0 && cowCount != 1) {
            cows = cowCount + " cows.";
        } else if (cowCount == 1) {
            cows = cowCount + " cow.";
        } else {
            bulls = "None.";
        }

        if (bullCount > 0 && cowCount > 0) and = " and ";
        if (bullCount > 0 || cowCount > 0) dot = ".";

        System.out.println("Grade: " + bulls + and + cows + dot);
    }
}
