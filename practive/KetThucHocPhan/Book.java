package practive.KetThucHocPhan;

import java.util.Scanner;

public class Book {
    protected String bookID;
    protected String book_name;
    protected int book_price;
    protected int book_quality;
    protected int book_total;
    public Book(String bookID, String book_name, int book_price, int book_quality) {
        this.bookID = bookID;
        this.book_name = book_name;
        this.book_price = book_price;
        this.book_quality = book_quality;
        this.book_total = this.book_price * this.book_quality;
    }
    public Book(){
        Scanner sc =  new Scanner(System.in);
        System.out.print("nhap ma sach: ");
        this.bookID = sc.nextLine();
        System.out.print("nhap ten sach: ");
        this.book_name = sc.nextLine();
        System.out.print("nhap gia sach: ");
        this.book_price = sc.nextInt();
        System.out.print("nhap so luong sach: ");
        this.book_quality = sc.nextInt();
        this.book_total = this.book_price * this.book_quality;
    }
    public String getBookID() {
        return bookID;
    }
    public void setBookID(String bookID) {
        this.bookID = bookID;
    }
    public String getBook_name() {
        return book_name;
    }
    public void setBook_name(String book_name) {
        this.book_name = book_name;
    }
    public int getBook_price() {
        return book_price;
    }
    public void setBook_price(int book_price) {
        this.book_price = book_price;
    }
    public int getBook_quality() {
        return book_quality;
    }
    public void setBook_quality(int book_quality) {
        this.book_quality = book_quality;
    }
    public int getBook_total() {
        return book_total;
    }
    public void setBook_total(int book_total) {
        this.book_total = book_total;
    }
    public String toString(){
        return this.bookID + "   " + this.book_name + "   " + this.book_price + "   " 
        + this.book_quality + "   " + this.book_total + '\n';
    }
    
}
