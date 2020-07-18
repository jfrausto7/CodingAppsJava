import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //int and string
        System.out.println("Enter an int: ");
        int inputInt = scanner.nextInt();
        System.out.println("Enter a String: ");
        String inputString = scanner.nextLine();
        double dub = scanner.nextDouble();

    }
}
