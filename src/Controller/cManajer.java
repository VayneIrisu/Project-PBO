/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.mAdmin;
import Model.mManajer;
import Model.mMember;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import view.vloginmember;
import view.vhomemanager;
/**
 *
 * @author Dhais Firmansyah
 */
public class cManajer extends cUser {
    
      private mManajer manajerM;
      private vhomemanager managerV;


    public cManajer(vloginmember login, mAdmin admin, mMember member, mManajer manajer) {
        super(login, admin, member, manajer);
        logout();
    }

    public cManajer(mManajer manajerM, vhomemanager managerV, vloginmember login) {
        super(login, manajerM, managerV);
        this.manajerM = manajerM;
        this.managerV = managerV;
        logout();
    }


    

    protected void logout() {
        managerV.tombolKeluar(new tombolKeluarx());
    }
    
    class tombolKeluarx implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            try {
                mManajer m = new mManajer();
                mMember m1 = new mMember();
                mAdmin m2 = new mAdmin();
                vloginmember v = new vloginmember();
                cUser c = new cUser(v,m2, m1, m);
                managerV.setVisible(false);
            } catch (SQLException ex) {
                Logger.getLogger(cManajer.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
    }

  
}
