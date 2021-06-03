package university_management_system;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class conn {
    Connection c;
    Statement s;
    public conn () {
        try {
            c = DriverManager.getConnection("jdbc:sqlite:C:\\Users\\Raja Gupta\\IdeaProjects\\" +
                    "University-Management-System\\src\\university_management_system\\ums.db");
            s = c.createStatement();

        } catch (SQLException e) {
            System.out.printf("Something went Wrong!: " + e.getMessage());
        }
    }
}
