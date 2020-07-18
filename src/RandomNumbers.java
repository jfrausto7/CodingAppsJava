import java.util.Random;

public class RandomNumbers {
    public static void main(String[] args) {
        double rand = Math.random();
        System.out.println(rand);

        Random random = new Random();

        int randInt = random.nextInt(3); // any number between 0-2
        double doub = random.nextDouble();
        boolean isTrue = random.nextBoolean();
    }
}
