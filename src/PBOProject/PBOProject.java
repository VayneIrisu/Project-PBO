/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PBOProject;

import Controller.cManajer;
import Controller.cUser;
import Model.mManajer;
import java.sql.SQLException;
import view.vhomemanager;
import view.vloginmember;

/**
 *
 * @author Dhais Firmansyah
 */
public class PBOProject {

    public static void main(String[] args) {
        vhomemanager manajer = new vhomemanager();
        vloginmember member = new vloginmember();
        try {
            mManajer model = new mManajer();
            cUser user = new cManajer(model, manajer, member);
        } catch (SQLException e) {
            e.getMessage();
        }
    }
}
