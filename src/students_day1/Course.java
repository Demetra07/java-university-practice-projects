package students_day1;

import java.util.ArrayList;

public class Course {
    private String courseName;
    private ArrayList<Student> studentNames;

    public Course(String courseName) {
        this.courseName = courseName;
        this.studentNames = new ArrayList<>() ;
    }

    public void addStudent(Student student) {
        this.studentNames.add(student);
    }

    public Student getTopStudent(){
        if (studentNames.isEmpty()){
            return null;
        }
        Student topStudent = studentNames.get(0);
        double maxAverage = topStudent.calculateAverage() ;
        for (Student s:studentNames){
            double currentAverage = s.calculateAverage() ;
            if (currentAverage > maxAverage){
                maxAverage = currentAverage;
                topStudent = s;
            }
        }
        return topStudent;
    }
}