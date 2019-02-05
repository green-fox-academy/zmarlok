package greenfoxorganization;//Create a Cohort class that has the following
//
//    fields:
//        name: the name of the cohort
//        students: a list of Students
//        mentors: a list of Mentors
//    methods:
//        addStudent(Student): adds the given Student to students list - DONE
//        addMentor(Mentor): adds the given Mentor to mentors list - DONE
//        info(): prints out "The name cohort has students.size() students and mentors.size() mentors."
//
//The Cohort class has the following constructors:
//
//    Cohort(name): beside the given parameter, it sets students and mentors as empty lists

import java.util.ArrayList;

public class Cohort {

    String name;
    ArrayList<String> students = new ArrayList<>();
    ArrayList<String> mentors = new ArrayList<>();

    public void addStudent (Student student){
        students.add(student.toString());
    }

    public void addMentor (Mentor mentor){
        students.add(mentor.toString());
    }

    public void info(){
        System.out.println("The " + name + " cohort has " + students.size() + " students and " + mentors.size() + " mentors.");

    }

    Cohort (String name) {
        this.name = name;
        students.clear();
        mentors.clear();
    }



}
