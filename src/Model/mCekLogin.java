/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
/**
 *
 * @author Dhais Firmansyah
 */
public abstract class mCekLogin {
    protected String username = null;
    protected String password = null;
    protected mKoneksi conn;

    public mCekLogin() throws SQLException {
        conn = new mKoneksi();
    }

    public abstract boolean cekLogin(String username, String password) throws SQLException;

    public abstract boolean cekLevel(String username, String password) throws SQLException;

}


