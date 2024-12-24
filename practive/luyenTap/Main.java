package practive.luyenTap;

import java.sql.ResultSet;
import java.sql.Statement;

public class Main {
    public static void main(String[] args) {
        try {
            Connextion connection = Obconnect.getConnection();
            String query = "SELECT * FROM Product";
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(query);
            while(resultSet.next()){
                System.out.println(resultSet.getString("name"));
            }
        } catch (Exception e) {
            System.out.println("sai");
        }
    }
}
