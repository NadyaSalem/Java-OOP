package oop.inheritanceExercises.p6Animals;

public class Tomcat extends Cat{
    private static final  String TOMCAT_Gender = "Male";

    public Tomcat(String name, int age) {
        super(name, age, TOMCAT_Gender);
    }

    @Override
    public String produceSound() {
        return "MEOW";
    }
}
