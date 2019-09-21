/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.cecar.developertest.controllers;

import edu.cecar.developertest.views.MainView;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import javax.swing.SwingUtilities;

/**
 *
 * @author sgioh
 */
public class MainController implements MouseListener, MouseMotionListener {

    private final MainView view;
    
    public MainController(MainView view) {
        this.view = view;
        this.view.getTittleBar().addMouseListener(this);
        this.view.getTittleBar().addMouseMotionListener(this);
        this.view.getExitAppButton().addMouseListener(this);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
    }

    private int xx, yy;
    @Override
    public void mousePressed(MouseEvent e) {
        if (SwingUtilities.isLeftMouseButton(e)) {
            if (e.getSource().equals(this.view.getTittleBar())) {
                xx = e.getX() + (int)this.view.getNavigationView().getNavigationPanel().getSize().getWidth();
                yy = e.getY();
            }
        }
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        if (SwingUtilities.isLeftMouseButton(e)) {
            if (e.getSource().equals(this.view.getExitAppButton())) {
                System.exit(0);
            }
        }
    }

    @Override
    public void mouseEntered(MouseEvent e) {
    }

    @Override
    public void mouseExited(MouseEvent e) {
    }

    @Override
    public void mouseDragged(MouseEvent e) {
        if (SwingUtilities.isLeftMouseButton(e)) {
            if (e.getSource().equals(this.view.getTittleBar())) {
                int x = e.getXOnScreen();
                int y = e.getYOnScreen();
                this.view.getFrame().setLocation(x - xx, y - yy);
            }
        }
    }

    @Override
    public void mouseMoved(MouseEvent e) {
    }
}
