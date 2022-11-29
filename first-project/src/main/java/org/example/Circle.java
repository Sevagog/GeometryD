package org.example;

public class Circle {
    private double r, s, p;

    public Circle(double r){
        this.r = r;
    }

    public double getS() {
        return s;
    }

    public void setS() {
        this.s = r * r * 3.14f;
    }

    public double getP() {
        return p;
    }

    public void setP() {
        this.p = 2 * 3.14f * r;
    }
}
