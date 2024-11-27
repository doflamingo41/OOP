import java.util.Scanner;

public class QuizApp {

    public static void main(String[] args) {
      
        Scanner scanner = new Scanner(System.in);

        
        int totalScore = 0, correctAnswers = 0, incorrectAnswers = 0;
        System.out.println("Welcome to the Simple Quiz!\n");

        // Question 1
        String question1 = "1. What is the full form of ICT?\n" +
                           "a) Information and Communication Technology\n" +
                           "b) Information and Technology\n" +
                           "c) Inform and Communication Technology\n" +
                           "d) Information and Connection Technology\n";
        String correctAnswer1 = "a";

        System.out.print(question1);
        System.out.print("\nAnswer: ");
        String userAnswer = scanner.nextLine();

        if (userAnswer.equals(correctAnswer1)) {
            totalScore += 5;
            correctAnswers++;
        } else {
            totalScore -= 1;
            incorrectAnswers++;
        }

        // Question 2
        String question2 = "2. What is the full form of DSA?\n" +
                           "a) Digital Subtraction Angiography\n" +
                           "b) Direct Selling Agent\n" +
                           "c) Democratic Socialists of America\n" +
                           "d) Data Structures and Algorithms\n";
        String correctAnswer2 = "d";

        System.out.print(question2);
        System.out.print("\nAnswer: ");
        userAnswer = scanner.nextLine();

        if (userAnswer.equals(correctAnswer2)) {
            totalScore += 5;
            correctAnswers++;
        } else {
            totalScore -= 1;
            incorrectAnswers++;
        }

        // Question 3
        String question3 = "3. Which of the following is an example of an open-source operating system?\n" +
                           "a) Windows\n" +
                           "b) macOS\n" +
                           "c) Linux\n" +
                           "d) iOS\n";
        String correctAnswer3 = "c";

        System.out.print(question3);
        System.out.print("\nAnswer: ");
        userAnswer = scanner.nextLine();

        if (userAnswer.equals(correctAnswer3)) {
            totalScore += 5;
            correctAnswers++;
        } else {
            totalScore -= 1;
            incorrectAnswers++;
        }

        // Question 4
        String question4 = "4. Which company is known as the creator of the Windows operating system?\n" +
                           "a) Apple\n" +
                           "b) Google\n" +
                           "c) Microsoft\n" +
                           "d) Amazon\n";
        String correctAnswer4 = "c";

        System.out.print(question4);
        System.out.print("\nAnswer: ");
        userAnswer = scanner.nextLine();

        if (userAnswer.equals(correctAnswer4)) {
            totalScore += 5;
            correctAnswers++;
        } else {
            totalScore -= 1;
            incorrectAnswers++;
        }

        // Question 5
        String question5 = "5. Which of the following is NOT a programming language?\n" +
                           "a) Python\n" +
                           "b) Java\n" +
                           "c) HTML\n" +
                           "d) C\n";
        String correctAnswer5 = "c";

        System.out.print(question5);
        System.out.print("\nAnswer: ");
        userAnswer = scanner.nextLine();

        if (userAnswer.equals(correctAnswer5)) {
            totalScore += 5;
            correctAnswers++;
        } else {
            totalScore -= 1;
            incorrectAnswers++;
        }

        // Results
        System.out.println("\nYour correct answers: " + correctAnswers);
        System.out.println("Your incorrect answers: " + incorrectAnswers);
        System.out.println("Your total score: " + totalScore);

        // Close the scanner
        scanner.close();
    }
}
