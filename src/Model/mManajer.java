/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Dhais Firmansyah
 */
public class mManajer extends mCekLogin {

    private int level;
    private int id;

    public mManajer() throws SQLException {
//        super();
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
        id = rs.getInt("idUser");
        return rs.getInt("level") == 3;
    }

}
