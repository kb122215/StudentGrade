//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Student student = new Student("Jain",new double[]{89,90,95,78,99});
        Student student1 = new Student("Karen",new double[]{80,100,90,99,99});
        Student student2 = new Student("Terry",new double[]{50,70,95,78,99});
        Student student3 = new Student("Mike",new double[]{89,60,80,69,59});
        Student student4 = new Student("Tom",new double[]{95,96,95,80,99});

        student.displayStudentInfo();
        student1.displayStudentInfo();
        student2.displayStudentInfo();
        student3.displayStudentInfo();
        student4.displayStudentInfo();
    }
}