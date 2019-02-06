package cloneable;

public class Student extends Person {

    String previousOrg;
    int skippedDays;


    private String classroom;

    public Student(String name, int age, String gender, String previousOrg) {
        super(name, age, gender);
        this.classroom = classroom;
        this.skippedDays = 0;
        this.previousOrg = previousOrg;
    }

    public Student(){
        this.name = "Jane Doe";
        this.age = 30;
        this.gender = "female";
        this.previousOrg = "The School of Life";
        this.skippedDays = 0;
    }

    public void getGoal() {
        System.out.println("Be a junior software developer.");
    }

    public void introduce(){
        System.out.println("Hi, I'm " + name + ", a " + age + " year old " + gender + " from " + previousOrg + ", who skipped " + skippedDays + "days from the course already");
    }

    public void skipDays(int numberOfDays){
        numberOfDays += numberOfDays;
        this.skippedDays = numberOfDays;
    }

    public Student clone(){
       //Student cloneStudent = this;  - ha változtatom az eredetit, változik vele a klón is!
        Student cloneStudent = new Student(name, age, gender, previousOrg); //ha változtatom az eredetit, a klón nem változik!
        return cloneStudent;
    }

}