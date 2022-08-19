package bullscows;

import java.util.*;

public interface Generator {
    Random random = new Random();
    List<Character> asciiSecretCode = new ArrayList<>();
    List<Character> secretCode = new ArrayList<>();
    List<Character> clonedCode = new ArrayList<>();


    static void generateRandomCode(int length) {

        int counter = 0;
        char ch1 = 0;
//        while (counter < length) {
//            int digit = random.nextInt(36) + 48;
//            ch1 = (char) digit;
//
//            asciiSecretCode.add(counter, ch1);
//            counter++;
//        }
        while (counter < length) {

            int digit = random.nextInt(36) + 48;
            if (digit < 58) {
                ch1 = (char) digit;
            } else {
                ch1 = (char) (digit + 39);
            }

            if (!secretCode.contains(digit)) {
                secretCode.add(counter, (char) Integer.parseInt(String.valueOf((byte) ch1)));
                counter++;
            }
        }

        clonedCode.addAll(secretCode);
        System.out.println("Okay, let's start a game!");
        System.out.println("secretCode: " + secretCode);
//        System.out.println("clonedCode: " + clonedCode);
    }
}
