package oop.workingWithAbstractionLab.p2PointInRectangle;

public class Rectangle {
    private Point a;
    private Point c;

    public Rectangle(Point a, Point c) {
        this.a = a;
        this.c = c;
    }

    public boolean containsPoint(Point p) {
        return p.greaterOrEqual(a) && p.lessOrEqual(c);
    }

}
