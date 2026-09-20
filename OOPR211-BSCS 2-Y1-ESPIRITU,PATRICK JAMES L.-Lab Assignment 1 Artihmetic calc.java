import java.util.Scanner;

public class arithmetic {
    public static void main(String[] args) {
        try (Scanner NumberScanner = new Scanner(System.in)) {
           
            while(true){
                    System.out.println("ARITHMETIC CALCULATOR");
                    System.out.println("1. Addition          2. Subtraction       3. Multiplication");
                    System.out.println("4. Division          5. Modulus           6. Increment");
                    System.out.println("7. Decrement");
                   
                    int y=0;
               
                    System.out.println("Select an Arithmetic Operation:");
                    int operation= NumberScanner.nextInt();
                    System.out.println("Variable Values:");
                    System.out.print("X=");
                    int x = NumberScanner.nextInt();
                int operation2 = operation;
                    if(operation2<=5){
                    System.out.print("Y=");
                    y = NumberScanner.nextInt();
                    }
                    System.out.println("result = 0.0\n");
                    System.out.println("Arithmetic Operation");
                   
                switch (operation) {
                    case 1 -> System.out.println("Addition: x + y = " + (double)(x + y));
                    case 2 -> System.out.println("Subtraction: x - y = " + (double)(x - y));
                    case 3 -> System.out.println("Multiplication: x * y = " + (double)(x * y));
                    case 4 ->{if(y == 0)
                             {System.out.println("invalid input.");}
                             else {System.out.println("Division: x / y = " + (double)(x / y));}
                            }
                    case 5 -> System.out.println("Modulus: x % y = " + (double)(x % y));
                    case 6 -> System.out.println("Increment: x ++ = " + (int)(++x));
                    case 7 -> System.out.println("Decrement: x -- = " + (int)(--x));
                    default -> {
                    }
                }
               
                System.out.println("\nDo you want to continue : YES / NO ");
                String choice = NumberScanner.next().trim().toUpperCase();

                if(!choice.equals("YES")){
                    System.out.println("Program terminated.");
                    break;
                }
            }
        }
    }
}

