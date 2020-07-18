import java.util.Scanner;



public class GuessNumberGame {

    public static void main(String[] args) {

        int secretNumber;

        secretNumber = (int) (Math.random() * 1000);

        Scanner keyboard = new Scanner(System.in);

        int guess = -1;

        while (guess != secretNumber) {

            System.out.print("Enter a guess (1-1000): ");

            guess = keyboard.nextInt();

            if (guess == secretNumber)

                System.out.println("Your guess is correct. Congratulations!");

            else if (guess < secretNumber)

                System.out.println("Your guess is smaller than the secret number.");

            else {

                System.out.println("Your guess is greater than the secret number.");

            }

        }
    }
}
