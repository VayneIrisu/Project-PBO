/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;
import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
/**
 *
 * @author Dhais Firmansyah
 */
public class mKoneksi  {
      static Connection conn;
    private Statement stm;

    public mKoneksi() throws SQLException {
        String url = "jdbc:mysql://localhost:3306/sistem informasi suku cadang osaka motor",
                username = "root",
                password = "";
        conn = DriverManager.getConnection(url, username, password);
        stm = conn.createStatement();
}
     public void execute(String sql) throws SQLException {
        stm.executeUpdate(sql);
    }

    public ResultSet getResult(String sql) throws SQLException {
        ResultSet rs = stm.executeQuery(sql);
        return rs;
    }

    Statement createStatement() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
