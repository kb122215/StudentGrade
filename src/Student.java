import java.util.Arrays;

public class Student {
    private String firstName;
    private double[] examScores;
    public Student() {
        this.firstName = "";
        this.examScores = new double[5];

    }
    public Student(String firstName, double[] examScores) {
        this.firstName = firstName;
        this.examScores = examScores;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public double[] getExamScores() {
        return examScores;
    }

    public void setExamScores(double[] examScores) {
        this.examScores = examScores;
    }
    public double calculateAverage() {
        double sum = 0.0;
        for (double score : examScores) {
            sum += score;
        }
        return sum / examScores.length;
    }
    public void displayStudentInfo() {
        System.out.println("First Name: " + firstName);
        System.out.println("Exam Scores: " + Arrays.toString(examScores));
        System.out.println("Average: " + calculateAverage());
        System.out.println("Hello friends");
    }
}
