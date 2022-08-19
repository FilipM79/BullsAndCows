package bullscows;

import java.util.*;

public interface Generator {
    Random random = new Random();
    List<Integer> secretCode = new ArrayList<>();
    List<Character> secretCode2 = new ArrayList<>();
    List<Integer> clonedCode = new ArrayList<>();

    static void generateRandomCode(int length, int range) {

        int counter = 0;
        char ch1;

        while (counter < length) {

            int digit = random.nextInt(range) + 48;

            if (digit < 58) {
                ch1 = (char) digit;
            } else {
                ch1 = (char) (digit + 39);
            }

            if (!secretCode2.contains((char) digit)) {
                secretCode2.add(counter, (char) Integer.parseInt(String.valueOf((byte) ch1)));
                counter++;
            }
        }

        for (int i = 0; i < secretCode2.size(); i++) {
            secretCode.add(i, Integer.valueOf(secretCode2.get(i)));
        }

        clonedCode.addAll(secretCode);

        String stars = "";
        for (int i = 0; i < length; i++) {
            stars = stars.concat("*");
        }

        String printRange;
        if (range < 11) {
            printRange = " (0-" + (range - 1) + ").";
        } else {
            printRange = " (0-9, a-" + (char) (range + 86) + ").";
        }
        System.out.println("The secret is prepared: " + stars + printRange);
        System.out.println("Okay, let's start a game!");
    }
}
