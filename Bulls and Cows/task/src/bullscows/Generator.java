package bullscows;

import java.util.*;

public interface Generator {
    Random random = new Random();
    List<Integer> secretCode = new ArrayList<>(4);
    List<Integer> clonedCode = new ArrayList<>(4);

    static void generateRandomCode() {
        for (int i = 0; i < 4; i++) {
            if (i == 0) {
                secretCode.add(random.nextInt(9) + 1);
            } else {
                secretCode.add(random.nextInt(9));
            }
        }



        clonedCode.addAll(secretCode);

        System.out.print("The secret code is prepared: ****.");
    }
}
