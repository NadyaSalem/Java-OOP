package oop.inheritanceExercises.p6Animals;

public class Animal {
    private String name;
    private int age;
    private String gender;

    public Animal(String name, int age, String gender) {
        setName(name);
        setAge(age);
        setGender(gender);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Invalid input!");
        }
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 0) {
            throw new IllegalArgumentException("Invalid input!");
        }
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        if (!gender.equals("Male")) {
            if (!gender.equals("Female")) {
                throw new IllegalArgumentException("Invalid input!");
            }
        }
        this.gender = gender;
    }

    public String produceSound() {
        return "sound";
    }

//    public String getClassName(){
//        return this.getClass().getSimpleName().toString();
//    }

    @Override
    public String toString() {
        return String.format("%s%n%s %d %s%n%s", this.getClass().getSimpleName().toString(),name, age, gender, produceSound());
    }
}
