package HINH;

import java.util.Scanner;

public class HinhChuNhat extends Hinh {
    protected double chieuDai;
    protected double chieuRong;
    public HinhChuNhat(){
        super();
        this.chieuDai = 0;
        this.chieuRong = 0;
    }
    public HinhChuNhat(String tenHinh, double chieuDai, double chieuRong){
        super(tenHinh);
        this.chieuDai = chieuDai;
        this.chieuRong = chieuRong;
    }
    public double getChieuDai() {
        return chieuDai;
    }
    public void setChieuDai(double chieuDai) {
        this.chieuDai = chieuDai;
    }
    public double getChieuRong() {
        return chieuRong;
    }
    public void setChieuRong(double chieuRong) {
        this.chieuRong = chieuRong;
    }
    @Override
    public double tinhChuVi(){
        double cv;
        cv = (chieuDai + chieuRong) * 2;
        return cv;
    }
    @Override
    public double tinhDienTinh(){
        double cv;
        cv = (chieuDai * chieuRong);
        return cv;
    }
    public String toString(){
        return super.toString() + " chieudai: " + chieuDai + " chieurong: " + chieuRong;
    }
    public void input(){
        Scanner sc = new Scanner(System.in);
        super.input();
        System.out.print("chieudai: ");
        this.chieuDai = sc.nextDouble();
        System.out.print("chieurong: ");
        this.chieuRong = sc.nextDouble();
    }
}
