/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.cecar.developertest.controllers;

import edu.cecar.developertest.helpers.ProgressListener;
import edu.cecar.developertest.services.LoadService;
import edu.cecar.developertest.views.DownloadUserView;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.SwingUtilities;

/**
 *
 * @author sgioh
 */
public final class DownloadUserController implements MouseListener, ProgressListener {
    
    private final DownloadUserView view;
    private final LoadService loadService;

    public DownloadUserController(DownloadUserView view) {
        this.view = view;
        this.loadService = LoadService.getInstance(this.view.getToken(), this.view.getUrl());
        this.loadService.addProgressListener(this);
        
        this.view.addExportListener(this);
        this.view.addLoadListener(this);
    }
    
    public DownloadUserView getView() { return this.view; }
    
    @Override
    public void mouseClicked(MouseEvent e) {
    }

    @Override
    public void mousePressed(MouseEvent e) {
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        if (SwingUtilities.isLeftMouseButton(e)) {
            switch (e.getComponent().getName()) {
                case "load":
                    this.loadService.loadDataFromSource();
                    this.view.disable();
                    break;
                case "export":
                    break;
            }
        }
    }

    @Override
    public void mouseEntered(MouseEvent e) {
    }

    @Override
    public void mouseExited(MouseEvent e) {
    }

    int overallProgress = 0;
    @Override
    public void progressChanged(float deltaProgress) {
        overallProgress+=deltaProgress;
        if (overallProgress == 100) {
            this.view.enable();
        }
    }

    @Override
    public void operationFailed(String reason) {
        //Mostrar mensaje de error, no hubo tiempo para implementarlo.
        this.view.enable();
    }
    
}
