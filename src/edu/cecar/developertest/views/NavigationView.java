/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.cecar.developertest.views;

import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;

/**
 *
 * @author sgioh
 */
public final class NavigationView {
    
    private final JPanel pnNavigation;
    private final JLayeredPane pnBook;
    private final JPanel btnUserSearch;
    private final JLabel iconUserSearchOption;
    private final JPanel btnUserDownload;
    private final JLabel iconUserDownloadOption;
    private final JPanel btnUserRegistration;
    private final JLabel iconUserRegistrationOption;
    
    private final SearchUserView searchUserView;
    private final DownloadUserView downloadUserView;
    private final RegisterUserView registerUserView;
    
    public NavigationView(
            SearchUserView searchUserView, 
            DownloadUserView downloadUserView,
            RegisterUserView registerUserView) {
        pnNavigation = new javax.swing.JPanel();
        pnBook = new javax.swing.JLayeredPane();
        btnUserSearch = new javax.swing.JPanel();
        iconUserSearchOption = new javax.swing.JLabel();
        btnUserDownload = new javax.swing.JPanel();
        iconUserDownloadOption = new javax.swing.JLabel();
        btnUserRegistration = new javax.swing.JPanel();
        iconUserRegistrationOption = new javax.swing.JLabel();
        
        this.searchUserView = searchUserView;
        this.downloadUserView = downloadUserView;
        this.registerUserView = registerUserView;
        
        pnNavigation.setBackground(new java.awt.Color(206, 64, 78));
        pnNavigation.setMaximumSize(new java.awt.Dimension(60, 500));
        pnNavigation.setMinimumSize(new java.awt.Dimension(60, 500));
        pnNavigation.setPreferredSize(new java.awt.Dimension(60, 500));
        pnNavigation.setLocation(0, 0);
        
        pnBook.setBackground(new java.awt.Color(204, 204, 204));
        pnBook.setMinimumSize(new java.awt.Dimension(840, 464));
        pnBook.setPreferredSize(new java.awt.Dimension(840, 464));
        pnBook.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        
        pnBook.add(searchUserView.getPage(), new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));
        pnBook.add(downloadUserView.getPage(), new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));
        pnBook.add(registerUserView.getPage(), new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));
        
        btnUserSearch.setBackground(new java.awt.Color(209, 82, 94));
        btnUserSearch.setToolTipText("Buscar usuarios");
        btnUserSearch.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnUserSearch.setMaximumSize(new java.awt.Dimension(60, 60));
        btnUserSearch.setMinimumSize(new java.awt.Dimension(60, 60));
        btnUserSearch.setName("search"); // NOI18N
        btnUserSearch.setPreferredSize(new java.awt.Dimension(60, 60));
        
        btnUserDownload.setBackground(new java.awt.Color(206, 64, 78));
        btnUserDownload.setToolTipText("Sincronizar");
        btnUserDownload.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnUserDownload.setMaximumSize(new java.awt.Dimension(60, 60));
        btnUserDownload.setMinimumSize(new java.awt.Dimension(60, 60));
        btnUserDownload.setName("sync"); // NOI18N
        btnUserDownload.setPreferredSize(new java.awt.Dimension(60, 60));
        
        btnUserRegistration.setBackground(new java.awt.Color(206, 64, 78));
        btnUserRegistration.setToolTipText("Usuarios");
        btnUserRegistration.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnUserRegistration.setMaximumSize(new java.awt.Dimension(60, 60));
        btnUserRegistration.setMinimumSize(new java.awt.Dimension(60, 60));
        btnUserRegistration.setName("users"); // NOI18N
        btnUserRegistration.setPreferredSize(new java.awt.Dimension(60, 60));
        
        iconUserDownloadOption.setIcon(new javax.swing.ImageIcon(getClass().getResource("/edu/cecar/developertest/views/images/cloud-download-off.png"))); 
        
        iconUserSearchOption.setIcon(new javax.swing.ImageIcon(getClass().getResource("/edu/cecar/developertest/views/images/search-on.png"))); // NOI18N
        
        iconUserRegistrationOption.setIcon(new javax.swing.ImageIcon(getClass().getResource("/edu/cecar/developertest/views/images/users-off.png"))); // NOI18N
        iconUserRegistrationOption.setMaximumSize(new java.awt.Dimension(40, 40));
        iconUserRegistrationOption.setMinimumSize(new java.awt.Dimension(40, 40));
        iconUserRegistrationOption.setPreferredSize(new java.awt.Dimension(40, 40));
        
        javax.swing.GroupLayout btnUserSearchLayout = new javax.swing.GroupLayout(btnUserSearch);
        btnUserSearch.setLayout(btnUserSearchLayout);
        btnUserSearchLayout.setHorizontalGroup(
            btnUserSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnUserSearchLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(iconUserSearchOption)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        btnUserSearchLayout.setVerticalGroup(
            btnUserSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnUserSearchLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(iconUserSearchOption)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        
        javax.swing.GroupLayout btnUserDownloadLayout = new javax.swing.GroupLayout(btnUserDownload);
        btnUserDownload.setLayout(btnUserDownloadLayout);
        btnUserDownloadLayout.setHorizontalGroup(
            btnUserDownloadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnUserDownloadLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(iconUserDownloadOption)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        btnUserDownloadLayout.setVerticalGroup(
            btnUserDownloadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnUserDownloadLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(iconUserDownloadOption)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        
        javax.swing.GroupLayout btnUserRegistrationLayout = new javax.swing.GroupLayout(btnUserRegistration);
        btnUserRegistration.setLayout(btnUserRegistrationLayout);
        btnUserRegistrationLayout.setHorizontalGroup(
            btnUserRegistrationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnUserRegistrationLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(iconUserRegistrationOption, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        btnUserRegistrationLayout.setVerticalGroup(
            btnUserRegistrationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnUserRegistrationLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(iconUserRegistrationOption, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        
        javax.swing.GroupLayout pnNavigationLayout = new javax.swing.GroupLayout(pnNavigation);
        pnNavigation.setLayout(pnNavigationLayout);
        pnNavigationLayout.setHorizontalGroup(
            pnNavigationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnUserRegistration, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(btnUserDownload, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(btnUserSearch, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        pnNavigationLayout.setVerticalGroup(
            pnNavigationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnNavigationLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnUserSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnUserDownload, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnUserRegistration, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(297, Short.MAX_VALUE))
        );
    }
    
    public DownloadUserView getDownloadUserView() { return this.downloadUserView; }
    
    public JPanel getNavigationPanel() { return this.pnNavigation; }
    
    public JLayeredPane getBook() { return this.pnBook; }
    
    public JPanel getSearchUsersOption() { return this.btnUserSearch; }
    
    public JPanel getDownloadUsersOption() { return this.btnUserDownload; }
    
    public JPanel getRegisterUserOption() { return this.btnUserRegistration; }
    
    public JLabel getSearchUsersOptionIcon() { return this.iconUserSearchOption; }
    
    public JLabel getDownloadUsersIcon() { return this.iconUserDownloadOption; }
    
    public JLabel getRegisterUserIcon() { return this.iconUserRegistrationOption; }
    
    public void selectSearchUserPage() {
        this.hoverSearchUserOption();
        this.leaveDownloadUserOption();
        this.leaveRegisterUserOption();
        this.searchUserView.show();
        this.downloadUserView.hide();
        this.registerUserView.hide();
    }
    
    public void selectDownloadUsersPage() {
        this.hoverDownloadUserOption();
        this.leaveSearchUserOption();
        this.leaveRegisterUserOption();
        this.downloadUserView.show();
        this.searchUserView.hide();
        this.registerUserView.hide();
    }
    
    public void selectRegisterUserPage() {
        this.hoverRegisterUserOption();
        this.leaveSearchUserOption();
        this.leaveDownloadUserOption();
        this.registerUserView.show();
        this.searchUserView.hide();
        this.downloadUserView.hide();
    }
    
    public void hoverSearchUserOption() {
        btnUserSearch.setBackground(new java.awt.Color(209, 82, 94));
        iconUserSearchOption.setIcon(new javax.swing.ImageIcon(getClass().getResource("/edu/cecar/developertest/views/images/search-on.png")));
    }
    
    public void leaveSearchUserOption() {
        btnUserSearch.setBackground(new java.awt.Color(206, 64, 78));
        iconUserSearchOption.setIcon(new javax.swing.ImageIcon(getClass().getResource("/edu/cecar/developertest/views/images/search-off.png")));
    }
    
    public void hoverDownloadUserOption() {
        btnUserDownload.setBackground(new java.awt.Color(209, 82, 94));
        iconUserDownloadOption.setIcon(new javax.swing.ImageIcon(getClass().getResource("/edu/cecar/developertest/views/images/cloud-download-on.png")));
    }

    public void leaveDownloadUserOption() {
        btnUserDownload.setBackground(new java.awt.Color(206, 64, 78));
        iconUserDownloadOption.setIcon(new javax.swing.ImageIcon(getClass().getResource("/edu/cecar/developertest/views/images/cloud-download-off.png")));
    }
    
    public void hoverRegisterUserOption() {
        btnUserRegistration.setBackground(new java.awt.Color(209, 82, 94));
        iconUserRegistrationOption.setIcon(new javax.swing.ImageIcon(getClass().getResource("/edu/cecar/developertest/views/images/users-on.png")));
    }
    
    public void leaveRegisterUserOption() {
        btnUserRegistration.setBackground(new java.awt.Color(206, 64, 78));
        iconUserRegistrationOption.setIcon(new javax.swing.ImageIcon(getClass().getResource("/edu/cecar/developertest/views/images/users-off.png")));
    }
}
