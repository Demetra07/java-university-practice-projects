package students_day1;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Course javaCourse = new Course("Object-Oriented Programming");

        Student s1 = new Student("Joanna", "P25014");
        Student s2 = new Student("Vasilis", "P54637");
        Student s3 = new Student("Demetra", "P25011");

        s1.addMark(8.5);
        s1.addMark(9.0);
        s1.addMark(9.5);// (8.5+9.0+9.5)/3=9.0= MESOS OROS

        s2.addMark(7.0);
        s2.addMark(8.0);// (7.0+8.0)/2=7.5= MESOS OROS

        s3.addMark(9.0);
        s3.addMark(10.0);
        s3.addMark(9.5);// (9.0+10.0+9.5)/3=9.5=MESOS OROS

        javaCourse.addStudent(s1);
        javaCourse.addStudent(s2);
        javaCourse.addStudent(s3);

        Student top = javaCourse.getTopStudent();
        if (top != null) {
            System.out.println("Top student is found " + top.getName() + "(ID: " + top.getId() + ") with an average of:" + top.calculateAverage());
        } else {
            System.out.println("Top student is NOT found");
        }
    }
}