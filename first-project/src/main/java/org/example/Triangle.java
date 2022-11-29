package org.example;

public class Triangle {
    private double a, b, c, p, s;

    public Triangle(double a, double b, double c){
        this.c = c;
        this.a = a;
        this.b = b;
    }

    public double getS() {
        return s;
    }

    public void setS() {
        double pp;
        pp = 0.5 * (a + b + c);
        this.s = Math.sqrt((pp*(pp-a)*(pp-b)*(pp-c)));
    }

    public double getP() {
        return p;
    }

    public void setP() {
        this.p = 2 * (a + b);
    }
}
