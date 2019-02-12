package teachersandstudents;

public class Teacher {

    public Teacher() {
    }

    public void answer() {
        System.out.println("This is a really good question, let me think about it.");
    }

    public void teach(Student student) {
        System.out.println("I'm teaching now... ");
        student.learn();
    }
}

