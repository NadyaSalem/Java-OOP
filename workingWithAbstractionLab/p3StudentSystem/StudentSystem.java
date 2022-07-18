package oop.workingWithAbstractionLab.p3StudentSystem;

import java.util.HashMap;
import java.util.Map;

public class StudentSystem {
    private Map<String, Student> students;

    public StudentSystem() {
        this.students = new HashMap<>();
    }

    public void ParseCommand(String[] inputData) {
        String name = inputData[1];
        String command = inputData[0];

        if (command.equals("Create")) {

            int age = Integer.parseInt(inputData[2]);
            double grade = Double.parseDouble(inputData[3]);

            Student student = new Student(name, age, grade);
            students.putIfAbsent(name, student);

        } else if (command.equals("Show")) {

            if (students.containsKey(name)) {

                Student student = students.get(name);

                student.getInfo();

            }
        }
    }
}
