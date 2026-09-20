public class Switch{
    public static void main(String[] args){
        try (Scanner scoreScanner = new Scanner(System.in)) {
            boolean continueProgram = true;

            while(continueProgram){
                System.out.println("Get the average of three subjects and grade the student");
                System.out.println("Input:");

                System.out.println("Java Score: ");
                double Java_Score = scoreScanner.nextDouble();

                System.out.println("C Score: ");
                double C_Score = scoreScanner.nextDouble();

                System.out.println("Database Handling Score: ");
                double Database_Score = scoreScanner.nextDouble();

                double AvgScore = (Database_Score + Java_Score + C_Score) / 3.0f;
                String formattedAvg = String.format("%.3f", AvgScore);

                String grade = switch ((Integer)(int) AvgScore) {
                    case Integer s when s >= 90 && s <= 100 -> "A";
                    case Integer s when s >= 80 && s <= 89  -> "B";
                    case Integer s when s >= 75 && s <= 79  -> "C";
                    default -> "F";
                };

                System.out.println("The average of the student is " + formattedAvg + ", so the student's grade is " + grade + ".");

                System.out.println("\nDo you want to continue : YES / NO ");
                String choice = scoreScanner.next().trim().toUpperCase();

                if(!choice.equals("YES")){
                    System.out.println("Program terminated.");
                    continueProgram = false;
                }
            }
        }
    }
}
