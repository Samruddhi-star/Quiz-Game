import java.util.Scanner;

public class MultipleChoiceQuiz {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            // Define the questions and answers
            String[][] questions = {
                    {"What is the capital of France?", "Paris", "London", "Berlin", "Rome"},
                    {"What is the largest planet in our solar system?", "Earth", "Saturn", "Jupiter", "Uranus"},
                    {"What is the smallest country in the world?", "Vatican City", "Monaco", "Nauru", "Tuvalu"}
            };

            int score = 0;

            // Loop through each question
            for (int i = 0; i < questions.length; i++) {
                System.out.println("Question " + (i + 1) + ": " + questions[i][0]);
                System.out.println("A) " + questions[i][1]);
                System.out.println("B) " + questions[i][2]);
                System.out.println("C) " + questions[i][3]);
                System.out.println("D) " + questions[i][4]);

                System.out.print("Enter your answer (A, B, C, or D): ");
                String userAnswer = scanner.next().toUpperCase();

                // Check if the user's answer is correct
                if (userAnswer.equals("A") && questions[i][1].equals(getCorrectAnswer(questions[i]))) {
                    score++;
                    System.out.println("Correct!");
                } else if (userAnswer.equals("B") && questions[i][2].equals(getCorrectAnswer(questions[i]))) {
                    score++;
                    System.out.println("Correct!");
                } else if (userAnswer.equals("C") && questions[i][3].equals(getCorrectAnswer(questions[i]))) {
                    score++;
                    System.out.println("Correct!");
                } else if (userAnswer.equals("D") && questions[i][4].equals(getCorrectAnswer(questions[i]))) {
                    score++;
                    System.out.println("Correct!");
                } else {
                    System.out.println("Incorrect. The correct answer is " + getCorrectAnswer(questions[i]));
                }

                System.out.println();
            }

            // Display the final score
            System.out.println("Your final score is " + score + " out of " + questions.length);
        }
    }

    
    private static String getCorrectAnswer(String[] question) {
        return question[1]; // Assuming the correct answer is always the first option
    }
}