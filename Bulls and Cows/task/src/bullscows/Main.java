package bullscows;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();

        List<Integer> secretCode = new ArrayList<>();

        for (int i = 0; i < 4; i++) {
            if (i == 0) {
                secretCode.add(random.nextInt(9) + 1);
            } else {
                secretCode.add(random.nextInt(9));
            }
        }

        // Not sure if I will use it. It is a secretCode represented as number, not as an array.
        int codeAsNumber = 0;
        int counter = 1;
        for (int k = 3; k >= 0; k--) {
            codeAsNumber = codeAsNumber + secretCode.get(k) * counter ;
            counter *= 10;
        }

        System.out.print("The secret code is prepared: ");
        for (int j: secretCode) {
            System.out.print(j);
        } System.out.println(".");
    }
}
