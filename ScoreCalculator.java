import java.util.Scanner;

public class ScoreCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("--- Exam Score Calculator ---");

        // Input 1: Correct Questions
        System.out.print("Enter Number of Correct Questions: ");
        int correctCount = scanner.nextInt();

        // Input 2: Incorrect Questions
        System.out.print("Enter Number of Incorrect Questions: ");
        int incorrectCount = scanner.nextInt();

        // Input 3: Marks for one Correct Answer
        System.out.print("Enter Marks for One Correct Answer: ");
        double marksPerCorrect = scanner.nextDouble();

        // Input 4: Marks for one Incorrect Answer
        System.out.print("Enter Marks (penalty) for One Incorrect Answer: ");
        double marksPerIncorrect = scanner.nextDouble();

        // The Formula: (Input 1 * Input 3) - (Input 2 * Input 4)
        double finalScore = (correctCount * marksPerCorrect) - (incorrectCount * marksPerIncorrect);

        System.out.println("\n--- Results ---");
        System.out.println("Total Score: " + finalScore);

        scanner.close();
    }
}
