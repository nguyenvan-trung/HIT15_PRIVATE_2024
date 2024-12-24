package practive.luyenTap;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connext {
    private static Connection Connext;
    public Connection getConnection() throws SQLException{
        // statment link
        String url = '';
        // dang duong file 
        String user = 'root';
        String password = '';
        connection =  DriverManager.getConnection(url, user, password);
        return connection;

    }


}
