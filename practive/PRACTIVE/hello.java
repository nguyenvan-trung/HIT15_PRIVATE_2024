package PRACTIVE;

import java.util.Scanner;

public class hello {
    protected String ten, tuoi, truong;
    public hello()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("ten ");
        ten = sc.nextLine();
        System.out.print("tuoi ");
        tuoi = sc.nextLine();
        System.out.print("truong ");
        truong = sc.nextLine();
    }
    public hello(String ten, String tuoi, String truong)
    {
        this.ten = ten;
        this.truong = truong;
        this.tuoi = tuoi;
    }
    public String getTen() {
        return ten;
    }
    public void setTen(String ten) {
        this.ten = ten;
    }
    public String getTuoi() {
        return tuoi;
    }
    public void setTuoi(String tuoi) {
        this.tuoi = tuoi;
    }
    public String getTruong() {
        return truong;
    }
    public void setTruong(String truong) {
        this.truong = truong;
    }
    public String toString()
    {
        return "ten: " + ten + "Tuoi: " + tuoi + "truong: " + truong;
    }
}
    