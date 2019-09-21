/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.cecar.developertest.controllers;

import edu.cecar.developertest.views.NavigationView;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.SwingUtilities;

/**
 *
 * @author sgioh
 */
public final class NavigationController implements MouseListener {

    private final NavigationView view;
    
    private String selectedPageName = "search";
    
    public NavigationController(NavigationView view) {
        this.view = view;
        this.view.getDownloadUsersOption().addMouseListener(this);
        this.view.getRegisterUserOption().addMouseListener(this);
        this.view.getSearchUsersOption().addMouseListener(this);
    }
    
    public NavigationView getView() { return this.view; }
    
    @Override
    public void mouseClicked(MouseEvent e) {
    }

    @Override
    public void mousePressed(MouseEvent e) {
        if (SwingUtilities.isLeftMouseButton(e)) {
            if (e.getSource().equals(this.view.getSearchUsersOption())){
                this.view.leaveSearchUserOption();
            }else if(e.getSource().equals(this.view.getDownloadUsersOption())){
                this.view.leaveDownloadUserOption();
            }else if(e.getSource().equals(this.view.getRegisterUserOption())){
                this.view.leaveRegisterUserOption();
            }
        }
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        if (SwingUtilities.isLeftMouseButton(e)) {
            if (e.getSource().equals(this.view.getSearchUsersOption())){
                this.selectedPageName = e.getComponent().getName();
                this.view.selectSearchUserPage();
            }else if(e.getSource().equals(this.view.getDownloadUsersOption())){
                this.selectedPageName = e.getComponent().getName();
                this.view.selectDownloadUsersPage();
            }else if(e.getSource().equals(this.view.getRegisterUserOption())){
                this.selectedPageName = e.getComponent().getName();
                this.view.selectRegisterUserPage();
            }
        }
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        if (e.getSource().equals(this.view.getSearchUsersOption())){
            this.view.hoverSearchUserOption();
        }else if(e.getSource().equals(this.view.getDownloadUsersOption())){
            this.view.hoverDownloadUserOption();
        }else if(e.getSource().equals(this.view.getRegisterUserOption())){
            this.view.hoverRegisterUserOption();
        }
    }

    @Override
    public void mouseExited(MouseEvent e) {
        if (e.getSource().equals(this.view.getSearchUsersOption()) && !e.getComponent().getName().equals(this.selectedPageName)){
            this.view.leaveSearchUserOption();
        }else if(e.getSource().equals(this.view.getDownloadUsersOption()) && !e.getComponent().getName().equals(this.selectedPageName)){
            this.view.leaveDownloadUserOption();
        }else if(e.getSource().equals(this.view.getRegisterUserOption()) && !e.getComponent().getName().equals(this.selectedPageName)){
            this.view.leaveRegisterUserOption();
        }
    } 
}
