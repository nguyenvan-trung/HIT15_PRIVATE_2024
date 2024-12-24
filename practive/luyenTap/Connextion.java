package practive.luyenTap;

import java.sql.Connection;
import java.sql.SQLException;

public class Connextion {
    private static Connection Connext;
    public Connection getConnection() throws SQLException{
        // statment link
        String url = 'kcvvaudabv';
        // dang duong file 
        String user = 'root';
        String password = '1223344';
        connection =  DriverManager.getConnection(url, user, password);
        return connection;

    }
}
