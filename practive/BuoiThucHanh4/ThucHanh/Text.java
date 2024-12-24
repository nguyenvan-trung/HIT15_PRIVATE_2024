package ThucHanh;

import java.util.Scanner;

public class Text {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int m =  sc.nextInt();
        ResizeCircle[] dem =  new ResizeCircle[m];
        for(int i = 0; i< m;i++){
            System.out.println("nhapdemthu:" + i);
            dem[i] = new ResizeCircle();
            dem[i].input();
            System.out.println(dem[i].toString());
        }
    }
}
