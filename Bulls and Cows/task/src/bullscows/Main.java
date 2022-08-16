package bullscows;

public class Main implements Generator, User, BullsAndCows {
    public static void main(String[] args) {

        System.out.println("Please, enter the secret code's length:");
        System.out.print("> ");
        int length = scanner.nextInt();

        for (int i = 0; i < length; i++) {
            bull.add(false);
            cow.add(false);
            compare.add(true);
            checkBullIndex.add(false);
        }

        Generator.generateRandomCode(length);

        String concatCode = "";
        for (int k = 0; k < length; k++) {
            concatCode = concatCode.concat(String.valueOf(secretCode.get(k)));
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
        System.out.println("Congrats! The secret code is " + concatCode + ".");


    }
}
