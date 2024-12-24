package ThuCac;

public class Thu {
    public static void main(String[] args)
    {
        Animals con = new Animals();
        Dog dog =  new Dog();
        con = (Animals) dog;
        dog.sound();
        con.input();
    } 
}
