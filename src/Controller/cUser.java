/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import Model.mCekLogin;
import Model.mAdmin;
import Model.mManajer;
import Model.mMember;
import view.vloginmember;
import view.vhalamanadmin;
import view.vhomemanager;
import view.vhomepagemember;
        
/**
 *
 * @author Dhais Firmansyah
 */
public class cUser {
     private String username;
    private String password;
    private int level;
    protected vloginmember login;
    protected mCekLogin model;
    protected mAdmin admin;
    protected mMember member;
    protected mManajer manajer;
    protected vhalamanadmin vadmin;
    protected vhomemanager vmanajer;
    protected vhomepagemember vmember;

    public cUser(vloginmember login, mAdmin admin, mMember member, mManajer manajer) {
        this.login = login;
        this.admin = admin;
        this.member = member;
        this.manajer = manajer;
       // login.tombolLogin(new loginListeners());
    }

    public cUser(vloginmember login, mManajer manajer, vhomemanager vmanajer) {
        this.login = login;
        this.manajer = manajer;
        this.vmanajer = vmanajer;
        login.tombolLogin(new loginListeners());
    }
    
    
        class loginListeners implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            String username = login.username();
            String password = login.password();
            boolean in = true;
            if (in) {
                try {
                    if (manajer.cekLogin(username, password)) {
                        if (manajer.cekLevel(username, password)) {
                            vhomemanager v = new vhomemanager();
                            mManajer m = new mManajer();
                            vloginmember vlog = new vloginmember();
                            mAdmin madm = new mAdmin();
                            mMember mmemb = new mMember();
                            cManajer c;
                            c = new cManajer(m,v,vlog,m,v);
                            login.dispose();
                            System.out.println("yes");
                        }
                    }
                } catch (SQLException ex) {
                    System.err.println("Ada kesalahan " + ex);
                }
            }
        }
    }
    
}
