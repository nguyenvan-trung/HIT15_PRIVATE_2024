package ThucHanh;

import java.util.Scanner;
import java.lang.Math;
public class Circle extends Shape implements GeoObject {
    protected double rad;
    public Circle(){
        super();
        this.rad = 1.0;
    }
    public Circle(String name, double rad){
        // tinh ke thua
        super(name);
        this.rad = rad;
    }
    public double getRad() {
        return rad;
    }
    public void setRad(double rad) {
        this.rad = rad;
    }
    public String toString(){
        return  super.toString() + " radius: "+ rad;
    }
    public void input(){
        Scanner sc = new Scanner(System.in);
        super.input();
        System.out.print("nhapradius: ");
        this.rad = sc.nextDouble();
    }
    @Override
    // tinh chu vi
    public double getPerimeter() {
        return rad * 2 * Math.PI;
    }
    @Override
    // tinh dien tich
    public double getArea() {
        return rad *  rad * Math.PI;
    }
}
