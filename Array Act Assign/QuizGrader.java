
public class QuizGrader {
    public static void main(String[] args) {

        // Array ng tamang sagot
        char[] answerKey = {'A', 'C', 'B', 'D', 'A', 'C', 'C', 'B', 'A', 'D'};

        // Array ng sagot ng estudyante
        char[] studentAnswers = {'A', 'B', 'B', 'D', 'C', 'C', 'C', 'B', 'A', 'A'};

        // Sinimulan ko sa zero yung correct count
        int correctCount = 0;

        // Icheck ang bawat sagot
        for (int i = 0; i < answerKey.length; i++) {

            // Gawing uppercase ang sagot para hindi case-sensitive
            studentAnswers[i] = Character.toUpperCase(studentAnswers[i]);

            // Icompare ang sagot sa answer key
            if (studentAnswers[i] == answerKey[i]) {
                correctCount++;
            } else {
                // I-display ang maling sagot
                System.out.println("Question " + (i + 1) + ": Incorrect. You answered "
                        + studentAnswers[i] + ", correct answer is " + answerKey[i]);
            }
        }

        // Kunin ang percentage ng score
        double scorePercentage = (double) correctCount / answerKey.length * 100;

        // Dinisplay ang resulta
        System.out.println("\n--- Quiz Result ---");
        System.out.println("Correct Answers: " + correctCount + "/" + answerKey.length);
        System.out.println("Score: " + scorePercentage + "%");

        // Icheck kung pasado o bagsak
        if (scorePercentage >= 70) {
            System.out.println("Result: PASS");
        } else {
            System.out.println("Result: FAIL");
        }
    }
}
