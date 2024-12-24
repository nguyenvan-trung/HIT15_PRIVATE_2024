package HOMEWORK;
import java.util.Scanner;
public class DiaChi {
    protected String thon;
    protected String xa;
    protected String huyen;
    protected String tinh;
    public DiaChi()
    {
        this.thon =  "0";
        this.xa = "0";
        this.huyen = "0";
        this.tinh = "0";
    }
    public DiaChi(String thon, String xa, String huyen, String tinh)
    {
        this.thon =  thon;
        this.xa = xa;
        this.huyen = huyen;
        this.tinh = tinh;
    }
    public String getThon() {
        return thon;
    }
    public void setThon(String thon) {
        this.thon = thon;
    }
    public String getXa() {
        return xa;
    }
    public void setXa(String xa) {
        this.xa = xa;
    }
    public String getHuyen() {
        return huyen;
    }
    public void setHuyen(String huyen) {
        this.huyen = huyen;
    }
    public String getTinh() {
        return tinh;
    }
    public void setTinh(String tinh) {
        this.tinh = tinh;
    }
    public String toString()
    {
        return "thon: " + thon + " xa: " + xa + " huyen: " + huyen +  " tinh: " + tinh;
    }
    public void input()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("thon: ");
        this.thon = sc.nextLine();
        System.out.print("xa: ");
        this.xa = sc.nextLine();
        System.out.print("huyen: ");
        this.huyen = sc.nextLine();
        System.out.print("tinh: ");
        this.tinh = sc.nextLine();
    }
}
