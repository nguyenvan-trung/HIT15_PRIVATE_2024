package PRACTIVE;

import java.util.Scanner;

public class sau extends hello {
    protected String a, b;
    public sau(){
        Scanner sc = new Scanner(System.in);
        System.out.print("a ");
        a = sc.nextLine();
        System.out.print("b ");
        b = sc.nextLine();
    }
    public sau(String a, String b)
    {
        this.a = a;
        this.b = b;
    }
    public String getA() {
        return a;
    }
    public void setA(String a) {
        this.a = a;
    }
    public String getB() {
        return b;
    }
    public void setB(String b) {
        this.b = b;
    }
    public String toString()
    {
        return super.toString()+  "a: " + a + "b: " + b;
    }
}
