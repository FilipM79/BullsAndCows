package bullscows;

import java.util.*;

public interface Generator {
    Random random = new Random();
    List<Integer> secretCode = new ArrayList<>();
    List<Integer> clonedCode = new ArrayList<>();


    static void generateRandomCode(int length) {

        int counter = 0;

        while (counter < length) {
            int digit = Math.abs(random.nextInt(10));

            if (counter == 0) {
                secretCode.add(counter, random.nextInt(9) + 1);
                counter++;
            } else if (!secretCode.contains(digit)) {
                secretCode.add(counter, digit);
                counter++;
            }
        }

        clonedCode.addAll(secretCode);
        System.out.println("Okay, let's start a game!");
    }
}
