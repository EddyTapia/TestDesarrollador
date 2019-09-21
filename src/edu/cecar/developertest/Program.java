/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.cecar.developertest;

import edu.cecar.developertest.controllers.DownloadUserController;
import edu.cecar.developertest.controllers.MainController;
import edu.cecar.developertest.controllers.NavigationController;
import edu.cecar.developertest.controllers.SearchUserController;
import edu.cecar.developertest.views.DownloadUserView;
import edu.cecar.developertest.views.Home;
import edu.cecar.developertest.views.MainView;
import edu.cecar.developertest.views.NavigationView;
import edu.cecar.developertest.views.RegisterUserView;
import edu.cecar.developertest.views.SearchUserView;

/**
 *
 * @author sgioh
 */
public class Program {
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
//            Home home = new Home();
//            
//            home.setLocationRelativeTo(null);
//            home.setVisible(true);
            NavigationController navigationController = 
                    new NavigationController(
                            new NavigationView(
                                    new SearchUserController(new SearchUserView()).getView(), 
                                    new DownloadUserController(new DownloadUserView()).getView(), 
                                    new RegisterUserView()
                            )
                    );
            new MainController(new MainView(navigationController.getView()));
            
        });
    }
}
