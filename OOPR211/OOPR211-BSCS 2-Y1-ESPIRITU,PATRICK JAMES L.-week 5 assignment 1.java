import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PhraseBuffered {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter first word: ");
        String first = br.readLine();

        System.out.print("Enter second word: ");
        String second = br.readLine();

        System.out.print("Enter third word: ");
        String third = br.readLine();

        System.out.println(first + " " + second + " " + third);
    }
}
