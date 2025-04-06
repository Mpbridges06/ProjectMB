package module5;

public class Exam extends Assessment {
    private int numQuestions; // Total questions in the exam
    private int numMissed;    // Number of questions missed
    private double pointsEach; // Points per question

    /**
     * Constructor initializes questions and missed answers, and calculates score.
     * @param questions Total number of questions on the exam.
     * @param missed Number of questions missed.
     */
    public Exam(int questions, int missed) {
        try {
            if (questions <= 0) {
                throw new IllegalArgumentException("Number of questions must be positive.");
            }
            if (missed < 0 || missed > questions) {
                throw new IllegalArgumentException("Number of missed questions must be between 0 and total questions.");
            }
            this.numQuestions = questions;
            this.numMissed = missed;
            calculateScore();
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    /**
     * Calculates points per question and overall score.
     */
    private void calculateScore() {
        try {
            if (numQuestions == 0) {
                throw new ArithmeticException("Cannot calculate score with zero questions.");
            }
            pointsEach = 100.0 / numQuestions;
            double numericScore = 100.0 - (numMissed * pointsEach);
            setScore((int) numericScore);
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    private void setScore(int numericScore) {
        // TODO Auto-generated method stub
    }

    /**
     * Returns points per question.
     * @return Points for each question.
     */
    public double getPointsEach() {
        return pointsEach;
    }
}
