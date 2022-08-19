package bullscows;

import java.util.Scanner;

public class Main implements Generator, User, BullsAndCows {
    public static void main(String[] args) {
//        0123456789abcdefghijklmnopqrstuvwxyz
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input the length of the secret code:");
        System.out.print("> ");
        int length = scanner.nextInt();

        System.out.println("Input the number of possible symbols in the code:");
        System.out.print("> ");
        int range = scanner.nextInt();

        if (length < 37) {
            for (int i = 0; i < length; i++) {
                bull.add(false);
                cow.add(false);
                compare.add(true);
                checkBullIndex.add(false);
            }

            Generator.generateRandomCode(length, range);

            String concatCode = "";
            for (int k = 0; k < length; k++) {
                concatCode = concatCode.concat(String.valueOf(secretCode2.get(k)));
            }

            int counter = 1;
            User.input(counter);

            BullsAndCows.check(length);

            boolean loop = false;
            while (!loop) {
                counter++;
                User.input(counter);
                BullsAndCows.check(length);
                if (BullsAndCows.bull.equals(BullsAndCows.compare)) loop = true;
            }
            System.out.println("Congratulations! You guessed the secret code.");

        } else {
            System.out.println("Error: can't generate a secret number with a length over 36 " +
                    "because there aren't enough unique digits.");
        }
    }
}
