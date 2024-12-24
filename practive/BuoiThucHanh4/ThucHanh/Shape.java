package ThucHanh;
import java.util.Scanner;
public class Shape {
    protected String name;
    public Shape(){
        this.name = "dagiac";
    }
    public Shape(String name){
        this.name =  name;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String toString(){
        return "ten hinh la: " + name;
    }
    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.print("nhaptenhinh: ");
        this.name = sc.nextLine();
    }
}
