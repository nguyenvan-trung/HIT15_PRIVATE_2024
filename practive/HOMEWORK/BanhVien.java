package HOMEWORK;

import java.util.Scanner;

public class BanhVien {
    protected String tenVien;
    protected String diaChi;
    protected String giamDoc;
    public BanhVien(){
        this.tenVien = "O";
        this.giamDoc = "O";
        this.diaChi = "O";
    }
    public BanhVien(String tenVien, String diaChi, String giamDoc)
    {
        this.tenVien = tenVien;
        this.giamDoc = giamDoc;
        this.diaChi = diaChi;
    }
    public String getTenVien() {
        return tenVien;
    }
    public void setTenVien(String tenVien) {
        this.tenVien = tenVien;
    }
    public String getDiaChi() {
        return diaChi;
    }
    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }
    public String getGiamDoc() {
        return giamDoc;
    }
    public void setGiamDoc(String giamDoc) {
        this.giamDoc = giamDoc;
    }
    public String toString(){
        return "tenVien: " + tenVien + " Diachi: " + diaChi + " giamDoc: " + giamDoc + " ";
    }
    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.print("tenVien: ");
        this.tenVien = sc.nextLine();
        System.out.print("Diachi: ");
        this.diaChi = sc.nextLine();
        System.out.print("giamDoc: ");
        this.giamDoc = sc.nextLine();
    }
}
