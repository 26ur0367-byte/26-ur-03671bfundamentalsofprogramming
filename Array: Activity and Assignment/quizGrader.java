public class quizGrader {
    public static void main(String[] args) {

        //ito ung mga initializing ng mga variables
        char answerKey[] = {'A', 'C', 'B', 'D', 'A', 'B', 'C', 'D', 'A', 'B'};
        char studentAnswers[] = {'A', 'C', 'D', 'D', 'A', 'B', 'A', 'D', 'B', 'B'};

        //ito ay pang check nga mga tama na sagot
        int correctCount = 0;
        for (int i = 0; i < studentAnswers.length; i++) {
            if (studentAnswers[i] == answerKey[i]) {
                correctCount++;
            }
        }

        //ito naman ay para ma-caculate ung score nya sa quiz based on ung nakuha sa "correctCount"
        double scorePercent = ((double) correctCount / answerKey.length) * 100;

        System.out.println("Correct answers: " + correctCount + "/" + answerKey.length);
        System.out.println("Score percent: " + scorePercent + "%");

        //ito naman ay para makita kung pass or fail siya based on kung above or equal to 70% ung na calculate ng "scorePercent'
        if (scorePercent >= 70.0) {
            System.out.println("PASSED!");
        } else {
            System.out.println("FAILED!");
        }
    }
}
