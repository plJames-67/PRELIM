import java.util.Scanner;

public class HighestNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int first = sc.nextInt();

        System.out.print("Enter second number: ");
        int second = sc.nextInt();

        System.out.print("Enter third number: ");
        int third = sc.nextInt();

        int highest = first;

        if (second > highest) {
            highest = second;
        } else if (third > highest) {
            highest = third;
        }

        System.out.println("The highest number is " + highest);

        sc.close();
    }
}
