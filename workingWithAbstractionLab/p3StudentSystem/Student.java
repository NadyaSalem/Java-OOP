package oop.workingWithAbstractionLab.p3StudentSystem;

public class Student {
    private String name;
    private int age;
    private double grade;

    public Student(String name, int age, double grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    public void getInfo(){
        String studentInformation = String.format("%s is %s years old.",name, age);

        if (grade >= 5.00) {
            studentInformation += " Excellent student.";
        } else if (grade >= 3.50) {
            studentInformation += " Average student.";
        } else {
            studentInformation += " Very nice person.";
        }

        System.out.println(studentInformation);
    }
}
