package bullscows;

import java.util.Objects;
import java.util.Scanner;

public class Main implements Generator, User, BullsAndCows {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int codeLength = 0;
        int codeRange = 0;
        int i1;
        int i2 = 0;
        String codeLengthFromInput1;
        String codeRangeFromInput2;

        boolean properInput = false;
        boolean properInput2 = true;
        boolean condition3 = true;

        while (!properInput) {

            System.out.println("Input the length of the secret code (0-36):");
            System.out.print("> ");
            codeLengthFromInput1 = scanner.nextLine();

            if (Objects.equals(codeLengthFromInput1, "")) {
                System.out.println("Error, the input is empty\n");
                properInput = true;

            } else if (codeLengthFromInput1.length() > 2) {
                System.out.println("Error: " + codeLengthFromInput1 + " isn't a valid input.\n");
                properInput = true;

            } else if (codeLengthFromInput1.length() > 0) {
                i1 = Integer.parseInt(String.valueOf((byte) codeLengthFromInput1.charAt(0))) - 48;

                if (codeLengthFromInput1.length() == 2) {
                    i2 = Integer.parseInt(String.valueOf((byte) codeLengthFromInput1.charAt(1))) - 48;
                    codeLength = i1 * 10 + i2;

                } else codeLength = i1;

                if (i1 > 10 || i2 > 10) {
                    System.out.println("Error: " + codeLengthFromInput1 + " isn't a valid number.\n");
                    properInput = true;

                } else {

                    if (codeLength > 0 && codeLength <= 36) {
                        properInput = true;
                        properInput2 = false;

                    } else {
                        System.out.println("Error: length of the code must be between 1 and 36 (1-36).\n");
                        properInput = true;

                    }
                }
            }

            else System.out.println("Error: " + codeLengthFromInput1 + " isn't a valid input.\n");
            properInput = true;
        }

        while (!properInput2) {

            System.out.println("Input the number of possible symbols in the code (0-36):");
            System.out.print("> ");
            codeRangeFromInput2 = scanner.nextLine();

            if (Objects.equals(codeRangeFromInput2, "")) {
                System.out.println("Error, the input is empty\n");
                properInput2 = true;

            } else if (codeRangeFromInput2.length() > 2) {
                System.out.println("Error: " + codeRangeFromInput2 + " isn't a valid input.\n");
                properInput2 = true;

            } else if (codeRangeFromInput2.length() > 0) {
                i1 = Integer.parseInt(String.valueOf((byte) codeRangeFromInput2.charAt(0))) - 48;

                if (codeRangeFromInput2.length() == 2) {
                    i2 = Integer.parseInt(String.valueOf((byte) codeRangeFromInput2.charAt(1))) - 48;
                    codeRange = i1 * 10 + i2;

                } else codeRange = i1;

                if (codeRange < codeLength) {
                    System.out.println("Error: it's not possible to generate a code with a length of "
                            + codeLength + " with " + codeRange + " unique symbols.\n");
                    properInput2 = true;

                } else if (i1 > 10 || i2 > 10) {
                    System.out.println("Error: " + codeRangeFromInput2 + " isn't a valid number.\n");
                    properInput2 = true;

                } else {

                    if (codeRange <= 36) {
                        properInput2 = true;
                        condition3 = false;

                    } else {
                        System.out.println("Error: maximum number of possible symbols in the code is 36 (0-9, a-z).\n");
                        properInput2 = true;

                    }
                }
            }

            else System.out.println("Error: " + codeRangeFromInput2 + " isn't a valid input.\n");
            properInput2 = true;
        }

        while (!condition3) {

            for (int i = 0; i < codeLength; i++) {
                bull.add(false);
                cow.add(false);
                compare.add(true);
                checkBullIndex.add(false);
            }

            Generator.generateRandomCode(codeLength, codeRange);

            String concatCode = "";
            for (int k = 0; k < codeLength; k++) {
                concatCode = concatCode.concat(String.valueOf(secretCode2.get(k)));
            }

            int counter = 1;
            User.input(counter, codeLength);
            BullsAndCows.check(codeLength);

            boolean loop = false;
            while (!loop) {
                counter++;
                User.input(counter, codeLength);
                BullsAndCows.check(codeLength);
                if (BullsAndCows.bull.equals(BullsAndCows.compare)) loop = true;
            }

            System.out.println("Congratulations! You guessed the secret code.");
            condition3 = true;
        }
    }
}
