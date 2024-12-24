package ThucHanh;

import java.util.Scanner;

public class ResizeCircle extends Circle implements Resizeble {
    protected double per;
    public ResizeCircle(){
        super();
        this.per = 1.0;
    }
    public ResizeCircle(String name,double rad, double per ){
        super(name, rad);
        this.per = per;
    }
    public double getPer() {
        return per;
    }
    public void setPer(double per) {
        this.per = per;
    }
    public String toString(){
        return super.toString() + " percent: " + per;
    }
    public void input(){
        Scanner sc = new Scanner(System.in);
        super.input();
        System.out.print("nhapPercent: ");
        this.per = sc.nextDouble();
    }
    @Override
    public void resize(double per) {
        this.per = per;
    }
}
