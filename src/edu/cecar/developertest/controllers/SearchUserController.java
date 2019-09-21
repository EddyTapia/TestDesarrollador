/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.cecar.developertest.controllers;

import edu.cecar.developertest.models.Person;
import edu.cecar.developertest.services.LoadService;
import edu.cecar.developertest.views.SearchUserView;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.SwingUtilities;

/**
 *
 * @author sgioh
 */
public class SearchUserController implements MouseListener {

    private final SearchUserView view;
    public SearchUserController(SearchUserView view) {
        this.view = view;
        this.view.addSearchListener(this);
    }
    
    @Override
    public void mouseClicked(MouseEvent e) {
    }

    @Override
    public void mousePressed(MouseEvent e) {
    }
    
    public SearchUserView getView() { return this.view; }

    @Override
    public void mouseReleased(MouseEvent e) {
        if (SwingUtilities.isLeftMouseButton(e)) {
            if (e.getComponent().getName().equals("search")) {
                if (this.view.searchAllUsers()) {
                    this.view.fillWithUsers(LoadService.getInstance().getUsers().stream().toArray(Person[]::new));
                }else {
                     
                }
            }
        }
    }

    @Override
    public void mouseEntered(MouseEvent e) {
    }

    @Override
    public void mouseExited(MouseEvent e) {
    }
    
}
