import java.util.Scanner;

public class EvenNumSum {
    public static void main(String[] args) {

        int value;

        System.out.println("Enter an integer: ");
        Scanner scan = new Scanner(System.in);

        do {
            value = scan.nextInt();
            if (value < 2) {
                System.out.println("Please enter a number greater than or equal to 2: ");
            }
        } while (value < 2);

        int sum = 0;
        for (int i = 2; i <= value; i += 2) {
            sum += i;
        }
        System.out.println("The sum of all even integers between 2 and your input value " + value + " is: " + sum);
        scan.close();
    }
}

