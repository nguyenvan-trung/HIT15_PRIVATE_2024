import java.util.Scanner;
/*
 * Phương thức length
 SOP(s.length());
 * Phương thức charAt
 SOP(s.charAt(2));
 * Phương thức replace : thay the kt --> kt khac (all)
 SOP("Cod3l3arn".replace('3', 'e'));
 SOP("Blackcat".replace("Black", "White"));
 * Phương thức toUpperCase/toLowerCase -->(all) in hoa, thuong
 SOP(s.toUpperCase());
 SOP(s.toLowerCase());
 * Phương thức indexOf --> vitri first string nay in stringoth
 SOP(s.indexOf("learn"));
 * Phương thức startsWith và endsWith 1 string this have start or end stringoth
 SOP(name.startsWith("Code"));
 * Phương thức split để tách một xâu ra thành mảng các xâu dựa trên một xâu cho trước
 String[] words = s.split(" ");
		for(String word:words) {
			System.out.println(word);
		}
 * Phương thức substring lấy ra một xâu con dựa trên chỉ số bắt đầu và chỉ số kết thúc của một xâu khác
 SOP(name.substring(0, 2));
 */
public class M {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		String name = sc.nextLine();
		int age = sc.nextInt();
		
		System.out.println("Name: " + name);
		System.out.println("Age: " + age);
		

    }
    
}
