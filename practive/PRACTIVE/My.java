package PRACTIVE;
import java.util.Scanner;
/*
 *Wrapper Class: tương ứng với kiểu dữ liệu cơ bản
 Boxing : tự chuyển từ kiểu cơ bản thành kiểu đối tượng 
 Interger.valueOf();
 long.valueOf();
 Unboxing: chuyển tử đối tượng thành cơ bản
 */
public class My {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = Math.max(a,b);
        System.out.println(c);

    }
}
