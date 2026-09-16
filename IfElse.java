import java.util.Scanner;

public class IfElse{
    public static void main(String[] args){
        try (Scanner scoreScanner = new Scanner(System.in)) {
            boolean continueProgram = true;

            while(continueProgram){
                System.out.println("Get the average of three subjects and grade the student");
                System.out.println("input your scores:");

                System.out.println("Java Score: ");
                Double Java_Score = scoreScanner.nextDouble();

                System.out.println("C Score: ");
                Double C_Score = scoreScanner.nextDouble();

                System.out.println("Database Handling Score: ");
                Double Database_Score = scoreScanner.nextDouble();

                Double AvgScore = (Database_Score + Java_Score + C_Score) / 3.0f;
                String formattedAvg = String.format("%.3f", AvgScore);

                if(AvgScore <= 100 && AvgScore >=90){
                    System.out.println("The average of the student is " + formattedAvg + ", so the student's grade is A.");
                } else if(AvgScore <= 89 && AvgScore >=80){
                    System.out.println("The average of the student is " + formattedAvg + ", so the student's grade is B.");
                } else if(AvgScore <= 79 && AvgScore >=75){
                    System.out.println("The average of the student is " + formattedAvg + ", so the student's grade is C.");
                } else if(AvgScore <=74){
                    System.out.println("The average of the student is " + formattedAvg + ", so the student's grade is F.");
                }
               
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