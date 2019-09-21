/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.cecar.developertest.views;

import java.awt.Color;
import java.awt.event.MouseListener;
import javax.swing.JPanel;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

/**
 *
 * @author sgioh
 */
public final class DownloadUserView implements DocumentListener {
    private final javax.swing.JPanel pgUserDownload;
    private final javax.swing.JSeparator separator1;
    private final javax.swing.JLabel label1;
    private final javax.swing.JLabel label2;
    private final javax.swing.JLabel label3;
    private final javax.swing.JLabel label4;
    private final javax.swing.JLabel label5;
    private final javax.swing.JButton btnLoadUsersData;
    private final javax.swing.JTextField txtToken;
    private final javax.swing.JTextField txtUrl;
    private final javax.swing.JButton btnExport;
    private final javax.swing.JLabel lbTokenError;
    private final javax.swing.JLabel lbUrlError;
    
    public DownloadUserView() {
        pgUserDownload = new javax.swing.JPanel();
        separator1 = new javax.swing.JSeparator();
        label1 = new javax.swing.JLabel();
        label2 = new javax.swing.JLabel();
        label3 = new javax.swing.JLabel();
        label4 = new javax.swing.JLabel();
        label5 = new javax.swing.JLabel();
        btnLoadUsersData = new javax.swing.JButton();
        txtToken = new javax.swing.JTextField();
        txtUrl = new javax.swing.JTextField();
        btnExport = new javax.swing.JButton();
        lbUrlError = new javax.swing.JLabel();
        lbTokenError = new javax.swing.JLabel();
        
        pgUserDownload.setBackground(new java.awt.Color(255, 255, 255));
        pgUserDownload.setMinimumSize(new java.awt.Dimension(820, 444));
        pgUserDownload.setPreferredSize(new java.awt.Dimension(820, 444));
        pgUserDownload.setVisible(false);
        
        separator1.setMinimumSize(new java.awt.Dimension(800, 10));
        separator1.setPreferredSize(new java.awt.Dimension(800, 10));
        
        label1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        label1.setForeground(new java.awt.Color(102, 102, 102));
        label1.setText("Recuperar usuarios");
        
        label2.setForeground(new java.awt.Color(102, 102, 102));
        label2.setText("Obtener la última versión de la base de datos de usuarios en la nube.");
        
        label3.setForeground(new java.awt.Color(102, 102, 102));
        label3.setText("URL del servidor");
        
        label4.setForeground(new java.awt.Color(102, 102, 102));
        label4.setText("Token de acceso");
        
        label5.setForeground(new java.awt.Color(102, 102, 102));
        label5.setText("Nota: se perderán todos los usuarios recuperados en la última actualización.");
        
        btnLoadUsersData.setText("Recuperar");
        btnLoadUsersData.setMinimumSize(new java.awt.Dimension(154, 23));
        btnLoadUsersData.setName("load"); // NOI18N
        btnLoadUsersData.setPreferredSize(new java.awt.Dimension(154, 23));
        
        txtToken.setText("0wZiOknooiIHs1-g1ZTFv0b6w9BcpbaUkh47");
        txtToken.setMinimumSize(new java.awt.Dimension(154, 20));
        txtToken.setName("token"); // NOI18N
        txtToken.setPreferredSize(new java.awt.Dimension(154, 20));
        
        txtUrl.setText("https://gorest.co.in/public-api/");
        txtUrl.setEnabled(false);
        txtUrl.setMinimumSize(new java.awt.Dimension(154, 20));
        txtUrl.setName("url"); // NOI18N
        
        btnExport.setText("Exportar");
        btnExport.setName("export");
        btnExport.setMinimumSize(new java.awt.Dimension(154, 23));
        btnExport.setPreferredSize(new java.awt.Dimension(154, 23));
        
        lbUrlError.setForeground(new java.awt.Color(255, 255, 255));
        lbUrlError.setVisible(true);
        lbTokenError.setForeground(new java.awt.Color(255, 255, 255));
        lbTokenError.setVisible(true);
        
        javax.swing.GroupLayout pgUserDownloadLayout = new javax.swing.GroupLayout(pgUserDownload);
        pgUserDownload.setLayout(pgUserDownloadLayout);
        pgUserDownloadLayout.setHorizontalGroup(
            pgUserDownloadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pgUserDownloadLayout.createSequentialGroup()
                .addGroup(pgUserDownloadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pgUserDownloadLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(pgUserDownloadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(separator1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label1)
                            .addComponent(label2)))
                    .addGroup(pgUserDownloadLayout.createSequentialGroup()
                        .addGap(228, 228, 228)
                        .addGroup(pgUserDownloadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbUrlError)
                            .addGroup(pgUserDownloadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(label4)
                                .addComponent(label3)
                                .addComponent(label5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnLoadUsersData, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtToken, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtUrl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnExport, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(lbTokenError))))
                .addContainerGap())
        );
        pgUserDownloadLayout.setVerticalGroup(
            pgUserDownloadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pgUserDownloadLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(label1)
                .addGap(9, 9, 9)
                .addComponent(label2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(separator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(label3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtUrl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(lbUrlError)
                .addGap(2, 2, 2)
                .addComponent(label4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtToken, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(lbTokenError)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnLoadUsersData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnExport, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13)
                .addComponent(label5)
                .addContainerGap(114, Short.MAX_VALUE))
        );
        
        this.txtToken.getDocument().addDocumentListener(this);
    }
    
    public void addLoadListener(MouseListener listener) {
        this.btnLoadUsersData.addMouseListener(listener);
    }
    
    public void addExportListener(MouseListener listener) {
        this.btnExport.addMouseListener(listener);
    }
    
    public void disable() {
         this.txtToken.setEnabled(false);
         this.btnLoadUsersData.setEnabled(false);
         this.btnExport.setEnabled(false);
    }
    
    public void enable() {
        this.txtToken.setEnabled(true);
        this.btnLoadUsersData.setEnabled(true);
        this.btnExport.setEnabled(true);
    }
    
    public String getUrl() { return this.txtUrl.getText().trim(); }
    
    public String getToken() { return this.txtToken.getText().trim(); }
    
    public JPanel getPage() { return this.pgUserDownload; }
    
    public void show() { this.pgUserDownload.setVisible(true); }
    
    public void hide() { this.pgUserDownload.setVisible(false); }

    @Override
    public void insertUpdate(DocumentEvent e) {
        if (e.getDocument().equals(this.txtToken.getDocument())) {
            String token = this.txtToken.getText().trim();
            if (!token.isEmpty()) {
                this.lbTokenError.setForeground(new Color(255, 255, 255));
                this.btnLoadUsersData.setEnabled(true);
            }
        }
    }

    @Override
    public void removeUpdate(DocumentEvent e) {
        if (e.getDocument().equals(this.txtToken.getDocument())) {
            String token = this.txtToken.getText().trim();
            
            if (token.isEmpty()) {
                this.lbTokenError.setText("Este campo es necesario.");
                this.lbTokenError.setForeground(new Color(255, 102, 102));
                this.btnLoadUsersData.setEnabled(false);
            } 
        }
    }

    @Override
    public void changedUpdate(DocumentEvent e) { 
    }
}
