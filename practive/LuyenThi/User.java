package practive.LuyenThi;

import java.util.Scanner;

public abstract class User {
    protected String user_id;
    protected String user_name;
    protected String user_fullname;
    protected double user_cosalary;
    // nhap qua ham tao
    public User()
    {
        Scanner sc =  new Scanner(System.in);
        System.out.print("nhap dinh danh: ");
        this.user_id =  sc.nextLine();
        System.out.print("nhap ten dang nhap: ");
        this.user_name = sc.nextLine();
        System.out.print("nhap ho va ten user: ");
        this.user_fullname =  sc.nextLine();
        System.out.print("nhap he so luong: ");
        this.user_cosalary = sc.nextDouble();
    }
    public User(String user_id, String user_name, String user_fullname, double user_cosalary) {
        this.user_id = user_id;
        this.user_name = user_name;
        this.user_fullname = user_fullname;
        this.user_cosalary = user_cosalary;
    }
    public String getUser_id() {
        return user_id;
    }
    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }
    public String getUser_name() {
        return user_name;
    }
    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }
    public String getUser_fullname() {
        return user_fullname;
    }
    public void setUser_fullname(String user_fullname) {
        this.user_fullname = user_fullname;
    }
    public double getUser_cosalary() {
        return user_cosalary;
    }
    public void setUser_cosalary(double user_cosalary) {
        this.user_cosalary = user_cosalary;
    }
    public abstract double getSalary();
    public String toString(){
        return " dinh danh: " + user_id + '\n'
        + " ten dang nhap: " + user_name + '\n'
        + " ho va ten user: " + user_fullname + '\n'
        + " he so luong: " + user_cosalary + '\n';
    } 
}