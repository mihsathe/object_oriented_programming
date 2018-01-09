
import java.util.Random;
import java.util.Scanner;

public class GuessingNumberGame {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int numberDrawn = drawNumber();
        int countGuessesMadeByUser = 0;

        // program your solution here. Do not touch the above lines!
        while (true) {
            System.out.print("Guess a number: ");
            int userInputNumber = Integer.parseInt(reader.nextLine());

            if (userInputNumber == numberDrawn) {
                System.out.println("Congratulations, your guess is correct!");
                break;
            } else if (numberDrawn < userInputNumber) {
                countGuessesMadeByUser++;
                System.out.println("The number is lesser, guesses made: " + countGuessesMadeByUser);
            } else {
                countGuessesMadeByUser++;
                System.out.println("The number is greater, guessess made: " + countGuessesMadeByUser);
            }
        }
    }

    // DO NOT MODIFY THIS!
    private static int drawNumber() {
        return new Random().nextInt(101);
    }
}
