package teachersandstudents;

public class Student {

    public Student() {
    }

    public void learn() {
        System.out.println("Student reads a book, and does some excersises...");
    }

    public void question(Teacher teacher) {
        System.out.println("What's the meaning of life?");
        teacher.answer();
    }
}
