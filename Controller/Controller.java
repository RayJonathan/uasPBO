package Controller;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import Model.User;

public class Controller {

    static DatabaseHandler conn = new DatabaseHandler();

    public static boolean insertNewUser(User user) {
        conn.connect();
        String query = "INSERT INTO user VALUES(?,?,?,?,?,?,?,?)";
        try {
            PreparedStatement stmt = conn.con.prepareStatement(query);
            stmt.setInt(1, user.getUserId());
            stmt.setString(2, user.getUserPassword());
            stmt.setString(3, user.getUserName());
            stmt.setString(4, user.getUserEmail());
            stmt.setString(5, user.getUserGender());
            stmt.setString(6, user.getUserGender());
            stmt.setString(7, user.getCategoryName());
            stmt.setInt(8, user.getUserFollowers());
            stmt.executeUpdate();
            return (true);
        } catch (SQLException e) {
            e.printStackTrace();
            return (false);
        }
    }
}
