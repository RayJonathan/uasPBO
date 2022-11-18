package Controller;

import java.sql.*;

public class dbConnection {
    public static dbConnection con() {

        Connection con = null;
            try{
                Class.forName("com.mysql.jdbc.Driver");
                con = DriverManager.getConnection();
            }


        return con;
    }

}
