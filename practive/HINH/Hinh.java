package HINH;
import java.util.Scanner;
public abstract class Hinh {
    protected String tenHinh;
    protected abstract double tinhChuVi();
    protected abstract double tinhDienTinh();
    public Hinh(){
        this.tenHinh = "O";
    }
    public Hinh(String ten){
        this.tenHinh = ten;
    }
    public String getTenHinh() {
        return tenHinh;
    }
    public void setTenHinh(String tenHinh) {
        this.tenHinh = tenHinh;
    }
    public String toString(){
        return " tenhinh: " + tenHinh;
    }
    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.print("tenhinh: ");
        this.tenHinh = sc.nextLine();
    }
}
