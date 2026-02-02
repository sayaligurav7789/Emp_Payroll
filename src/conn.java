import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Properties;

public class conn {

    public Connection c;
    public Statement s;

    public conn() {
        try {
            Properties p = new Properties();
            p.load(new FileInputStream("config.properties"));

            String url = p.getProperty("db.url");
            String user = p.getProperty("db.user");
            String pass = p.getProperty("db.password");

            Class.forName("com.mysql.cj.jdbc.Driver");
            c = DriverManager.getConnection(url, user, pass);
            s = c.createStatement();

            System.out.println("Connection successful!");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
