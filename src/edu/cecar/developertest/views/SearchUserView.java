/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.cecar.developertest.views;

import edu.cecar.developertest.models.Person;
import edu.cecar.developertest.services.LoadService;
import edu.cecar.developertest.views.helpers.ObjectTableModel;
import java.awt.event.MouseListener;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSeparator;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author sgioh
 */
public final class SearchUserView {
    
    private final JPanel pgUserSearch;
    private final JSeparator jSeparator1;
    private final JLabel jLabel1;
    private final JLabel jLabel2;
    private final JTextField txtQuery;
    private final JLabel btnSearch;
    private final JScrollPane jScrollPane1;
    private final JTable tbUsers;
    
    public SearchUserView() {
        pgUserSearch = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtQuery = new javax.swing.JTextField();
        btnSearch = new javax.swing.JLabel();
        tbUsers = new javax.swing.JTable();
        jScrollPane1 = new javax.swing.JScrollPane();
        
        pgUserSearch.setBackground(new java.awt.Color(255, 255, 255));
        pgUserSearch.setMinimumSize(new java.awt.Dimension(820, 444));
        pgUserSearch.setPreferredSize(new java.awt.Dimension(820, 444));
        
        jSeparator1.setMinimumSize(new java.awt.Dimension(800, 10));
        jSeparator1.setPreferredSize(new java.awt.Dimension(800, 10));
        
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 102, 102));
        jLabel1.setText("Búsqueda de usuarios ");
        
        jLabel2.setForeground(new java.awt.Color(102, 102, 102));
        jLabel2.setText("Buscar usuarios por su identificación o generar una lista de todos ellos.");
        
        txtQuery.setToolTipText("Para generar una lista de todos los usuarios deje este campo vacío");
        txtQuery.setPreferredSize(new java.awt.Dimension(150, 20));
        
        btnSearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/edu/cecar/developertest/views/images/search.png"))); // NOI18N
        btnSearch.setName("search");
        tbUsers.setModel(this.createPersonDataModel());
        jScrollPane1.setViewportView(tbUsers);
        
        javax.swing.GroupLayout pgUserSearchLayout = new javax.swing.GroupLayout(pgUserSearch);
        pgUserSearch.setLayout(pgUserSearchLayout);
        pgUserSearchLayout.setHorizontalGroup(
            pgUserSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pgUserSearchLayout.createSequentialGroup()
                .addGroup(pgUserSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pgUserSearchLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jSeparator1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pgUserSearchLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1))
                    .addGroup(pgUserSearchLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2))
                    .addGroup(pgUserSearchLayout.createSequentialGroup()
                        .addGap(323, 323, 323)
                        .addComponent(txtQuery, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pgUserSearchLayout.createSequentialGroup()
                        .addGap(110, 110, 110)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        pgUserSearchLayout.setVerticalGroup(
            pgUserSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pgUserSearchLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(9, 9, 9)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(pgUserSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtQuery, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }
    
    public void addSearchListener(MouseListener listener) {
        this.btnSearch.addMouseListener(listener);
    }
    
    public Boolean searchAllUsers() {
        return this.txtQuery.getText().trim().isEmpty();
    }
    
    public void fillWithUsers(Person[] users) {
        DefaultTableModel model = (DefaultTableModel)this.createPersonDataModel();
        model.addRow(users);
        this.tbUsers.setModel(model);
    }
    
    public JPanel getPage() { return this.pgUserSearch; }
    
    public void show() { this.pgUserSearch.setVisible(true); }
    
    public void hide() { this.pgUserSearch.setVisible(false); }
    
    private TableModel createPersonDataModel() {
        return new ObjectTableModel<Person>(){

            @Override
            public Object getValueAt(Person person, int columnIndex) {
                switch(columnIndex) {
                    case 0:
                        return person.getFirstName();
                    case 1:
                        return person.getLastName();
                    case 2:
                        return person.getGender();
                    case 3:
                        return person.getDob();
                    case 4:
                        return person.getEmail();
                    case 5:
                        return person.getPhone();
                    case 6:
                        return person.getStatus();
                    case 7:
                        return person.getWebsite();
                }
                return null;
            }

            @Override
            public String getColumnName(int column) {
                switch(column) {
                    case 0:
                        return "Nombre";
                    case 1:
                        return "Apellido";
                    case 2:
                        return "Sexo";
                    case 3:
                        return "Fecha de nacimiento";
                    case 4:
                        return "Email";
                    case 5:
                        return "Teléfono";
                    case 6:
                        return "Estado";
                    case 7:
                        return "Website";
                }
                return null;
            }

            @Override
            public int getColumnCount() {
                return 8;
            }   
        };
    }
}
