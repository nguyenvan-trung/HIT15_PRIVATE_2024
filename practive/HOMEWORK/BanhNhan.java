package HOMEWORK;
import java.util.Scanner;
public class BanhNhan extends Nguoi {
    protected String tienSu;
    protected String chuanDoan;
    protected BanhVien banhVien;
    public BanhNhan(){
        super();
        this.tienSu = "O";
        this.chuanDoan ="O";
        this.banhVien = new BanhVien();
    }
    public BanhNhan(String ten, String tuoi, String gioiTinh,String tienSu, String chuanDoan, BanhVien benhVien )
    {
        super(ten, tuoi, gioiTinh);
        this.tienSu = tienSu;
        this.chuanDoan = chuanDoan;
        this.banhVien = benhVien;
    }
    public String getTienSu() {
        return tienSu;
    }
    public void setTienSu(String tienSu) {
        this.tienSu = tienSu;
    }
    public String getChuanDoan() {
        return chuanDoan;
    }
    public void setChuanDoan(String chuanDoan) {
        this.chuanDoan = chuanDoan;
    }
    public BanhVien getBanhVien() {
        return banhVien;
    }
    public void setBanhVien(BanhVien banhVien) {
        this.banhVien = banhVien;
    }
    public String toString()
    {
        return super.toString() + " " + " tienSu: " + tienSu + " chuanDoan: "+ chuanDoan + " { " 
        + banhVien.toString() + " } "; 
    }
    public void input()
    {
        Scanner sc = new Scanner(System.in);
        super.input();
        System.out.print("tienSu: ");
        this.tienSu = sc.nextLine();
        System.out.print("chuanDoan: ");
        this.chuanDoan = sc.nextLine();
        System.out.print("banhVien: ");
        banhVien.input();
    }
}
