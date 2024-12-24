package HOMEWORK;
import java.util.Scanner;
public class Nguoi {
    protected String ten;
    protected String tuoi;
    protected String gioTinh;
    public Nguoi()
    {
        this.ten = "O";
        this.tuoi = "O";
        this.gioTinh = "O";
    }
    public Nguoi(String ten, String tuoi, String gioiTinh)
    {
        this.ten = ten ;
        this.tuoi = tuoi;
        this.gioTinh = gioiTinh;
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
    public String getGioTinh() {
        return gioTinh;
    }
    public void setGioTinh(String gioTinh) {
        this.gioTinh = gioTinh;
    }
    public String toString()
    {
        return "ten: "+ ten + " tuoi: "+ tuoi + " gioiTinh: "+ gioTinh;
    }
    public void input()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("ten: ");
        this.ten = sc.nextLine();
        System.out.print("tuoi: ");
        this.tuoi = sc.nextLine();
        System.out.print("gioitinh: ");
        this.gioTinh = sc.nextLine();
    }
}
