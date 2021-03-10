import  java.sql.Connection;
import  java.sql.DriverManager;

public class dbConnect {

    static Connection conn = null;

    private dbConnect() {

    }

    public static Connection get_dbConnect(){
        try {
            if (conn == null) {
                Class.forName("com.mysql.jdbc.Driver");
                conn = DriverManager.getConnection("jdbc:msql://localhost/fees_management_system","postgres","345547Ll");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return conn;

    }

}
