package bullscows;

import java.util.*;

public interface Generator {
    Random random = new Random();
    List<Integer> secretCode = new ArrayList<>();
    List<Integer> clonedCode = new ArrayList<>();


    static void generateRandomCode(int length) {

        int counter = 0;


        if (length < 11) {
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


            System.out.println("Okay, let's start a game!");

        } else {
            System.out.println("Error: can't generate a secret number with a length of 11 " +
                    "because there aren't enough unique digits.");
        }
//        clonedCode.addAll(secretCode);

        System.out.print("The secret code is prepared: ****.\n");
    }
}
