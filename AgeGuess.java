import java.util.Random;
import java.util.Scanner;

public class AgeGuess {
    public static void main(String[] args) {
        String name;
        int ageGuess;
        int age;

        Random generator = new Random();
        age = generator.nextInt(101);
        Scanner scan = new Scanner(System.in);
        System.out.print("name:");
        name = scan.nextLine();

        while (true) {
            System.out.print("ageGuess:");
            ageGuess = scan.nextInt();
            System.out.println();

            if (Math.abs(ageGuess - age) < 0.0000001) {
                System.out.print("congrats! ");
                break;
            }

            if (ageGuess != age) {
                System.out.println("You are wrong! Please try again");
            }

            if (ageGuess < age) {
                System.out.println("older");

            } else {
                System.out.println("younger");
            }
            System.out.println();
        }
            System.out.println("The correct answer is: " + age);
            System.out.println();
            scan.close();
    }
}
