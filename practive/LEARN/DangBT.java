package LEARN;
import java.util.Scanner;
public class DangBT {
    protected String tendang;
    protected int so;
    public DangBT()
    {
        Scanner sc = new Scanner(System.in);
        this.so = sc.nextInt();
        sc.nextLine();
        this.tendang =  sc.nextLine();
    }
    public DangBT(int so, String tendang){
        this.tendang = tendang;
        this.so = so;
    }
    public String getTendang() {
        return tendang;
    }
    public void setTendang(String tendang) {
        this.tendang = tendang;
    }
    public int getSo() {
        return so;
    }
    public void setSo(int so) {
        this.so = so;
    }
    public String toString(){
        String v =  Integer.toString(so);
        return v + " " + tendang;
    }
}
