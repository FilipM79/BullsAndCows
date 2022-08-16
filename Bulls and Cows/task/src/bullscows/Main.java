package bullscows;

public class Main implements Generator, User, BullsAndCows {
    public static void main(String[] args) {

        for (int i = 0; i < 4; i++) {
            bull.add(false);
            cow.add(false);
            compare.add(true);
            checkBullIndex.add(false);
        }

        Generator.generateRandomCode();

        int codeAsNumber = 0;
        int counter2 = 1;
        for (int k = 3; k >= 0; k--) {
            codeAsNumber = codeAsNumber + secretCode.get(k) * counter2 ;
            counter2 *= 10;
        }

        int counter = 1;
        User.input(counter);
        BullsAndCows.check();

        boolean loop = false;
        while (!loop) {
            counter++;
            User.input(counter);
            BullsAndCows.check();
            if (BullsAndCows.bull.equals(BullsAndCows.compare)) loop = true;
        }

        System.out.println("Congrats! The secret code is " + codeAsNumber + ".");
    }
}
