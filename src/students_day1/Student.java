package students_day1;
//import java.util.ArrayList;

import java.util.ArrayList;

public class Student {
    private String name;
    private String id;
    private ArrayList<Double> marks;

    public Student(String name, String id) {
        this.name = name;
        this.id = id;
        this.marks = new ArrayList<>();
    }

    public void addMark(double mark) {
        this.marks.add(mark);
    }

    public double calculateAverage() {
        if (marks.isEmpty()) {
            return 0.0;
        }
        double sum = 0.0;
        for (Double mark : marks) {
            sum += mark;
        }
        return sum / marks.size();
    }

    public String getName() {
        return name;
    }
    public String getId() {
        return id;
    }
}
