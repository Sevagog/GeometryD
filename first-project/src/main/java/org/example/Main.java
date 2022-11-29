package org.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите сначала радиус круга, потом стороны квадрата, потом три стороны триугольника.");
        Scanner sc = new Scanner(System.in);
        double r = sc.nextDouble(), aRec = sc.nextDouble(), bRec = sc.nextDouble(), aTri = sc.nextDouble(), bTri = sc.nextDouble(), cTri = sc.nextDouble();
        if(r<0){
            System.out.println("Радиус должен быть положительным!");
        } else {
            Circle circle = new Circle(r);
            circle.setP();
            circle.setS();
            System.out.println("Периметр круга = " + circle.getP() + ", площадь  = " + circle.getS());
        }

        if(aRec<0 || bRec<0){
            System.out.println("Стороны квадрата должены быть положительными!");
        } else {
            Rectangle rectangle = new Rectangle(aRec, bRec);
            rectangle.setP();
            rectangle.setS();
            System.out.println("Периметр квадрата = " + rectangle.getP() + ", площадь  = " + rectangle.getS());
        }

        if(aTri<0 || bTri<0 || cTri<0){
            System.out.println("Стороны треугольника должены быть положительными!");
        } else if(aTri+bTri<cTri || bTri+cTri<aTri || aTri+cTri<bTri){
            System.out.println("Треугольник с такими сторонами не существует!");
        } else {
            Triangle triangle = new Triangle(aTri, bTri, cTri);
            triangle.setP();
            triangle.setS();
            System.out.println("Периметр треугольника = " + triangle.getP() + ", площадь  = " + triangle.getS());
        }
    }
}
