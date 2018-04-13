/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author Dhais Firmansyah
 */
public class mAdmin extends mCekLogin{
    private String uname;
    private int level;
    private int id;

public mAdmin() throws SQLException{
super();
}     

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


    

    @Override
    public boolean cekLogin(String username, String password) throws SQLException {
        String sql = "select * from user where username = '" + username + "' and password = '" + password + "'";
        ResultSet rs = conn.getResult(sql);
        return rs.last();
    }

    @Override
    public boolean cekLevel(String username, String password) throws SQLException {
         String sql = "select * from user where username = '" + username + "' and password = '" + password + "'";
        ResultSet rs = conn.getResult(sql);
        rs.next();
        return rs.getInt("level") == 1;
    }
    
}
