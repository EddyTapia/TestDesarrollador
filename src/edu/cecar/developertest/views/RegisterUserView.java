/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.cecar.developertest.views;

import javax.swing.JPanel;

/**
 *
 * @author sgioh
 */
public final class RegisterUserView {
    
    private javax.swing.JButton btnAddUser;
    private javax.swing.JButton btnDeleteUser;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JPanel pgUserRegistration;
    private javax.swing.JTable tbLocalUsers;
    private javax.swing.JTextField txtNickName;
    private javax.swing.JPasswordField txtPassword;
    
    public RegisterUserView() {
        pgUserRegistration = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtNickName = new javax.swing.JTextField();
        btnAddUser = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        btnDeleteUser = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel7 = new javax.swing.JLabel();
        txtPassword = new javax.swing.JPasswordField();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tbLocalUsers = new javax.swing.JTable();

        pgUserRegistration.setBackground(new java.awt.Color(255, 255, 255));
        pgUserRegistration.setMinimumSize(new java.awt.Dimension(820, 444));
        pgUserRegistration.setPreferredSize(new java.awt.Dimension(820, 444));
        pgUserRegistration.setVisible(false);

        jLabel4.setForeground(new java.awt.Color(102, 102, 102));
        jLabel4.setText("Registrar o eliminar usuarios de la aplicación.");

        jLabel5.setForeground(new java.awt.Color(102, 102, 102));
        jLabel5.setText("Nombre de usuario:");

        txtNickName.setMinimumSize(new java.awt.Dimension(150, 20));
        txtNickName.setPreferredSize(new java.awt.Dimension(150, 20));

        btnAddUser.setText("Agregar");
        btnAddUser.setMinimumSize(new java.awt.Dimension(150, 23));
        btnAddUser.setPreferredSize(new java.awt.Dimension(150, 23));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(102, 102, 102));
        jLabel6.setText("Registro de usuarios");

        btnDeleteUser.setText("Eliminar");

        jSeparator2.setMinimumSize(new java.awt.Dimension(800, 10));
        jSeparator2.setPreferredSize(new java.awt.Dimension(800, 10));

        jLabel7.setForeground(new java.awt.Color(102, 102, 102));
        jLabel7.setText("Contraseña:");

        txtPassword.setMinimumSize(new java.awt.Dimension(150, 20));
        txtPassword.setPreferredSize(new java.awt.Dimension(150, 20));

        jSeparator3.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jLabel8.setForeground(new java.awt.Color(102, 102, 102));
        jLabel8.setText("Para eliminar a un usuario, selecciónelo en la tabla y pulse eliminar.");

        tbLocalUsers.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Usuarios"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane3.setViewportView(tbLocalUsers);

        javax.swing.GroupLayout pgUserRegistrationLayout = new javax.swing.GroupLayout(pgUserRegistration);
        pgUserRegistration.setLayout(pgUserRegistrationLayout);
        pgUserRegistrationLayout.setHorizontalGroup(
            pgUserRegistrationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pgUserRegistrationLayout.createSequentialGroup()
                .addGroup(pgUserRegistrationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pgUserRegistrationLayout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addGroup(pgUserRegistrationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pgUserRegistrationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pgUserRegistrationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(btnAddUser, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtPassword, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtNickName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(65, 65, 65)
                        .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(pgUserRegistrationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pgUserRegistrationLayout.createSequentialGroup()
                                .addGap(34, 34, 34)
                                .addComponent(jLabel8))
                            .addGroup(pgUserRegistrationLayout.createSequentialGroup()
                                .addGap(117, 117, 117)
                                .addGroup(pgUserRegistrationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btnDeleteUser, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(pgUserRegistrationLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(pgUserRegistrationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel4)
                            .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        pgUserRegistrationLayout.setVerticalGroup(
            pgUserRegistrationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pgUserRegistrationLayout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(jLabel6)
                .addGap(9, 9, 9)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(pgUserRegistrationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pgUserRegistrationLayout.createSequentialGroup()
                        .addGap(85, 85, 85)
                        .addGroup(pgUserRegistrationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtNickName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(pgUserRegistrationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(btnAddUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pgUserRegistrationLayout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addGroup(pgUserRegistrationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(pgUserRegistrationLayout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnDeleteUser)))))
                .addContainerGap(84, Short.MAX_VALUE))
        );
    }
    
    public void show() { this.pgUserRegistration.setVisible(true); }
    
    public void hide() { this.pgUserRegistration.setVisible(false); }
    
    public JPanel getPage() { return this.pgUserRegistration; }
}
