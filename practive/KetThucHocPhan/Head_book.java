package practive.KetThucHocPhan;

import java.util.Scanner;

public class Head_book {
    protected String phieuID;
    protected String date;
    protected String supportID;
    protected String support_name;
    protected String address;
    protected int phone;
    public Head_book() {
        Scanner sc = new Scanner(System.in);
        System.out.print("nhap ma phieu: ");
        this.phieuID = sc.nextLine();
        System.out.print("nhap ngay phieu: ");
        this.date = sc.nextLine();
        System.out.print("nhap ma nha cung cap phieu: ");
        this.supportID = sc.nextLine();
        System.out.print("nhap ten nha cung cap phieu phieu: ");
        this.support_name = sc.nextLine();
        System.out.print("nhap sd thoai nha cung cap phieu phieu: ");
        this.phone = sc.nextInt();

    }
    public Head_book(String phieuID, String date, String supportID, String support_name, String address, int phone) {
        this.phieuID = phieuID;
        this.date = date;
        this.supportID = supportID;
        this.support_name = support_name;
        this.address = address;
        this.phone = phone;
    }
    public String getPhieuID() {
        return phieuID;
    }
    public void setPhieuID(String phieuID) {
        this.phieuID = phieuID;
    }
    public String getDate() {
        return date;
    }
    public void setDate(String date) {
        this.date = date;
    }
    public String getSupportID() {
        return supportID;
    }
    public void setSupportID(String supportID) {
        this.supportID = supportID;
    }
    public String getSupport_name() {
        return support_name;
    }
    public void setSupport_name(String support_name) {
        this.support_name = support_name;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public int getPhone() {
        return phone;
    }
    public void setPhone(int phone) {
        this.phone = phone;
    }
    public String toString() {
        return "ma phieu: " + phieuID + "     ngay nhap: " + date + '\n'
        + " ma nha cung cap: " + supportID + "      ten nha cung cap: " + support_name + '\n'
        + " dia chi: " + address + "     soDT" + phone + '\n'
        + " thong tin sach nhap: " + '\n'
        + " ma sach " + "  ten sach  " + "  gia  " + "  so luong  " + "  thanh tien  " + '\n';
    }
    
}
