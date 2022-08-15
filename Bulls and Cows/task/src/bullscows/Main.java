package bullscows;

public class Main implements Generator, User, BullsAndCows {
    public static void main(String[] args) {

        Generator.generateRandomCode();

        for (int i = 0; i < 4; i++) {
            bull.add(false);
            cow.add(false);
            compare.add(true);
            checkBullIndex.add(false);
        }

        System.out.println();
        System.out.println(Generator.secretCode);
        User.input();
        BullsAndCows.check();

        boolean loop = false;

        while (!loop) {
            User.input();
            BullsAndCows.check();
            if (BullsAndCows.bull.equals(BullsAndCows.compare)) loop = true;
        }

        System.out.println(BullsAndCows.bull + " + " + BullsAndCows.compare);
        System.out.println("Congrats! The secret code is " + Generator.secretCode);
    }
}
