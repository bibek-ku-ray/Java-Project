package university;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class conn {
    Connection c;
    Statement s;

    public conn(){

        try {
            c = DriverManager.getConnection("jdbc:mysql:///ums", "root", "poonam");
            s = c.createStatement();
            System.out.println("Connected.");
        }
        catch (Exception ex){
            System.out.println("not connected"+ ex);
        }

    }

/*    public static void main(String[] args) {
        Connection c;
        Statement s;

            try {
                c = DriverManager.getConnection("jdbc:mysql:///ums", "root", "poonam");
                s = c.createStatement();
                System.out.println("Connected.");

//                System.out.println(s.executeQuery("select * from login"));

                ResultSet rs = s.executeQuery("select * from login");
                rs.next();
                String str = rs.getString(3);
                System.out.println(str);

                System.out.println("Connected again.");
            }
            catch (Exception ex){
                System.out.println("not connected:  ->  "+ ex);
            }

    }

 */
}
