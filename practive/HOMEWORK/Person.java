package HOMEWORK;
import java.util.Scanner;
public class Person {
    protected String name;
    // dob ngay sinh 
    protected String dob;
    // pob noi sinh 
    protected String pob;
    protected char gender;
    protected String email;
    protected String phone;
    public Person()
    {
        this.name= "0";
        this.dob = "0";
        this.pob = "0";
        this.email = "0";
        this.phone = "0";
        this.gender = 'M';
    }
    public Person(String name , String dob,String pob, char gender, String email, String phone)
    {
        this.name= name;
        this.dob =dob;
        this.pob = pob;
        this.gender = gender;
        this.email = email;
        this.phone = phone;
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
    public String getPob() {
        return pob;
    }
    public void setPob(String pob) {
        this.pob = pob;
    }
    public char getGender() {
        return gender;
    }
    public void setGender(char gender) {
        this.gender = gender;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getPhone() {
        return phone;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }
    public String toString(){
        return "name: " + name + " ngay sinh: "+ dob + " noi sinh: " + pob + 
        " gioi tinh: " + gender + " email: " + email + " phone: "+ phone;
    }
    public void input()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("name: ");
        this.name = sc.nextLine();
        System.out.print("dob: ");
        this.dob = sc.nextLine();
        System.out.print("pob: ");
        this.pob = sc.nextLine();
        System.out.print("gender: ");
        this.gender = sc.next().charAt(0);
        sc.nextLine();
        System.out.print("email: ");
        this.email = sc.nextLine();
        System.out.print("phone: ");
        this.phone = sc.nextLine();
    }
}
