package BAI8;

import java.awt.Graphics;
import java.util.Scanner;

public class Circle extends Shape implements Actable {
    protected double ra;

    public Circle() {}

    public Circle(String type, String name, double ra) {
        super(type, name);  
        this.ra = ra;
    }

    public double tongChuVi() {
        return 2 * ra * Math.PI;
    }

    public double dienTich() {
        return ra * ra * Math.PI;
    }

    public double getRa() {
        return ra;
    }

    public void setRa(double ra) {
        this.ra = ra;
    }

    @Override
    public String toString() {
        return super.toString() + " radius: " + ra;
    }

    public void input() {
        Scanner sc = new Scanner(System.in);
        super.input();
        System.out.print("Radius: ");
        this.ra = sc.nextDouble();
    }

    // Draw the circle
    @Override
    public void drawn(Graphics graphics) {
        int diameter = (int) (ra * 2);
        graphics.drawOval(50, 50, diameter, diameter);  
    }

    @Override
    public void moveTo(Graphics graphics, int a, int b) {
        int diameter = (int) (ra * 2);
        graphics.clearRect(0, 0, 400, 400);  
        graphics.drawOval(a, b, diameter, diameter);  
    }
 
    @Override
    public void erase(Graphics graphics) {
        int diameter = (int) (ra * 2);
        graphics.clearRect(50, 50, diameter, diameter);  
    }
}
