package BAI8;
import java.util.Scanner;

public class Shape {
    protected String type;
    protected String name;

    // Default constructor
    public Shape() {
        this.type = "dagiac";
        this.name = "shape";
    }

    // Constructor with parameters
    public Shape(String type, String name) {
        this.type = type;
        this.name = name;
    }

    // Getter and Setter for type
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    // Getter and Setter for name
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Convert Shape object to string representation
    @Override
    public String toString() {
        return "The loai hinh: " + type + ", Ten hinh: " + name;
    }

    // Input type and name from user
    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("The loai: ");
        this.type = sc.nextLine();
        System.out.print("Ten hinh: ");
        this.name = sc.nextLine();
    }
}
