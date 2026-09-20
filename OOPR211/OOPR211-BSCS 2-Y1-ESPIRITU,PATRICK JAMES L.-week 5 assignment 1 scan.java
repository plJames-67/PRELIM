import java.util.Scanner;

public class PhraseScanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first word: ");
        String first = sc.next();

        System.out.print("Enter second word: ");
        String second = sc.next();

        System.out.print("Enter third word: ");
        String third = sc.next();

        System.out.println(first + " " + second + " " + third);

        sc.close();
    }
}
