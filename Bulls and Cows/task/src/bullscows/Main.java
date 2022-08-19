package bullscows;

import java.util.*;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Main implements Generator, User, BullsAndCows {
    public static void main(String[] args) {
//        0123456789abcdefghijklmnopqrstuvwxyz
        Scanner scanner = new Scanner(System.in);

//        String s1 = scanner.nextLine();
//        String c1 = Arrays.toString(s1.getBytes());
//        String s3 = "";
//
//        System.out.println("c1: " + c1);
//
//        for (int i = 0; i < s1.length(); i++) {
//            int i11 = Integer.parseInt(String.valueOf((byte) s1.charAt(i)));
//            System.out.println("i11: " + i11);
//            char ch1 = (char) i11;
//            System.out.println("ch1: " + ch1);
//            int i12 = Integer.parseInt(String.valueOf((byte) ch1));
//            System.out.println("i12: " + i12);
//            s3 = s3.concat(String.valueOf(ch1));
//
//        } System.out.println("s3: " + s3);


        System.out.println("Please, enter the secret code's length:");
        System.out.print("> ");
        int length = scanner.nextInt();
//
//        if (length < 11) {
//            for (int i = 0; i < length; i++) {
//                bull.add(false);
//                cow.add(false);
//                compare.add(true);
//                checkBullIndex.add(false);
//            }
//
            Generator.generateRandomCode(length);

            String concatCode = "";
            for (int k = 0; k < length; k++) {
                concatCode = concatCode.concat(String.valueOf(secretCode.get(k)));
            }

        System.out.println("concatCode: " + concatCode);

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
//        } else {
//            System.out.println("Error: can't generate a secret number with a length of 11 " +
//                    "because there aren't enough unique digits.");
//        }
    }
}
