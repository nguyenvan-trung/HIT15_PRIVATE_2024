package HINH;

public class Text {
    public static void main(String[] args)
    {
        HinhChuNhat hinh =  new HinhChuNhat();
        hinh.input();
        System.out.println("thong tin: ");
        System.out.println(hinh.toString());
        System.out.println(" chu vi : ");
        System.out.println(hinh.tinhChuVi());
        System.out.println(" dien tich: ");
        System.out.println(hinh.tinhDienTinh());
    }
}
