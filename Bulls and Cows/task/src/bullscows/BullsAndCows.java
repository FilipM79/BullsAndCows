package bullscows;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public interface BullsAndCows extends Generator {
    List<Boolean> bull = new ArrayList<>(4);
    List<Boolean> cow = new ArrayList<>(4);
    List<Boolean> checkBullIndex = new ArrayList<>(4);
    List<Boolean> compare = new ArrayList<>(4);

    static void check () {

        int bullCount = 0;
        int cowCount = 0;
        double codeOccurrences = 0;
        double inputOccurrences = 0;

        for (int i = 0; i < 4; i++) {
            checkBullIndex.set(i, Objects.equals(User.userGuess.get(i), secretCode.get(i)));
        }

        for (int i = 0; i < secretCode.size(); i++) {

            bull.set(i, false);
            cow.set(i, false);

            for (int j = 0; j < 4; j++) {
                if (Objects.equals(User.userGuess.get(i), secretCode.get(j))) {
                  codeOccurrences++;
                }
                if (Objects.equals(User.userGuess.get(i), User.userGuess.get(j))) {
                    inputOccurrences++;
                }
            }

            if (clonedCode.contains(User.userGuess.get(i)) &&
                    !Objects.equals(User.userGuess.get(i), secretCode.get(i)) &&
                    !checkBullIndex.get(secretCode.indexOf(User.userGuess.get(i))) && cowCount <= codeOccurrences / 4 ) {

                cow.set(i, true);
                cowCount++;

            } else if (Objects.equals(User.userGuess.get(i), secretCode.get(i))) {
                    bull.set(i, true);
                    bullCount++;
            }
        }

        String bulls = "";
        String cows = "";
        String and = "";
        String dot = "";
        String none = "";

        if (bullCount > 0 && bullCount != 1) {
            bulls = bullCount + " bulls";
        } else if (bullCount == 1) {
            bulls = bullCount + " bull";
        }

        if (cowCount > 0 && cowCount != 1) {
            cows = cowCount + " cows";
        } else if (cowCount == 1) {
            cows = cowCount + " cow";
        }

        if (bullCount > 0 && cowCount > 0) and = " and ";
        if (bullCount > 0 || cowCount > 0) dot = ".";
        if (bullCount == 0 && cowCount == 0) none = "None";

        System.out.println("Grade: " + bulls + and + cows + none + dot);
    }
}
