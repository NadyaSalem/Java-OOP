package oop.workingWithAbstractionLab.p2PointInRectangle;

public class Point {
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public  boolean greaterOrEqual(Point anotherPoint){
        return this.x >= anotherPoint.x && this.y >= anotherPoint.y;
    }

    public  boolean lessOrEqual(Point anotherPoint){
        return this.x <= anotherPoint.x && this.y <= anotherPoint.y;
    }
}
