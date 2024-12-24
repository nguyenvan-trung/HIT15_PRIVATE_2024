package HOMEWORK;
import java.util.Scanner;
public class NhanVien {
    protected String name ;
    protected String dob;
    protected DiaChi address;
    protected char gender;
    public NhanVien(){}
    public NhanVien(String name, String dob, DiaChi address, char gender)
    {
        this.name =  name ;
        this.dob = dob;
        this.address = address;
        this.gender = gender;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getDob() {
        return dob;
    }
    public void setDob(String dob) {
        this.dob = dob;
    }
    public DiaChi getAddress() {
        return address;
    }
    public void setAddress(DiaChi address) {
        this.address = address;
    }
    public char getGender() {
        return gender;
    }
    public void setGender(char gender) {
        this.gender = gender;
    }
    public String toString(){
        return "name: " + name + " ngaysinh: " + dob + " gioitinh: " + gender 
        + " diachi{ " + address.toString() + "}";
    }
    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.print("name: ");
        this.name = sc.nextLine();
        System.out.print("ngaysinh: ");
        this.dob = sc.nextLine();
        System.out.println("diachi: ");
        DiaChi ad = new DiaChi();
        ad.input();
        this.address = ad;
        System.out.print("gioitinh: ");
        this.gender = sc.next().charAt(0);
    }
}
