/*
    Create Student and Teacher classes
    Student
        learn()
        question(teacher) -> calls the teachers answer method
    Teacher
        teach(student) -> calls the students learn method
        answer()
*/

package teachersandstudents;

public class Main {

    public static void main(String[] args) {
        Student student1 = new Student();
        Student student2 = new Student();
        Teacher teacher1 = new Teacher();
        Teacher teacher2 = new Teacher();

        student1.question(teacher1);

        teacher2.teach(student2);
    }
}
