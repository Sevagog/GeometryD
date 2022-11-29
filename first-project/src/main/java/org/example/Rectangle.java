package org.example;

public class Rectangle {
    private double a, b, p, s;

    public Rectangle(double a, double b){
        this.a = a;
        this.b = b;
    }

    public double getS() {
        return s;
    }

    public void setS() {
        this.s = a * b;
    }

    public double getP() {
        return p;
    }

    public void setP() {
        this.p = 2 * (a + b);
    }
}
