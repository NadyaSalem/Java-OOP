package oop.inheritanceLab.p5RandomArrayList;

public class Main {
    public static void main(String[] args) {

        RandomArrayList randomArrayList = new RandomArrayList();

        randomArrayList.add(15);
        randomArrayList.add(25);
        randomArrayList.add(9);
        randomArrayList.add(2);

        System.out.println(randomArrayList.getRandomElement());
    }
}
