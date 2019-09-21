/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.cecar.developertest.views;

import edu.cecar.developertest.helpers.ProgressListener;
import edu.cecar.developertest.services.LoadService;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JProgressBar;

/**
 *
 * @author sgioh
 */
public final class MainView implements ProgressListener {
    private final JFrame frame;
    private final JPanel canvas;
    private final JPanel pnTiitleBar;
    private final JPanel btnExitApp;
    private final JLabel iconExitAppOption;
    private final JProgressBar progressBar;
    
    private final NavigationView navigationView;
    
    public MainView(NavigationView navigationView) {
        
        frame = new JFrame();
        canvas = new javax.swing.JPanel();
        iconExitAppOption = new javax.swing.JLabel();
        btnExitApp = new javax.swing.JPanel();
        progressBar = new javax.swing.JProgressBar();
        pnTiitleBar = new javax.swing.JPanel();
        this.navigationView = navigationView;

        frame.setSize(900, 500);
        frame.setResizable(false);
        frame.setUndecorated(true);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        canvas.setBackground(new java.awt.Color(255, 255, 255));
        canvas.setMinimumSize(new java.awt.Dimension(900, 500));
        canvas.setPreferredSize(new java.awt.Dimension(900, 500));
        
        canvas.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        canvas.add(navigationView.getNavigationPanel(), new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
        canvas.add(navigationView.getBook(), new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 36, 840, -1));
        
        pnTiitleBar.setBackground(new java.awt.Color(255, 255, 255));
        pnTiitleBar.setMaximumSize(new java.awt.Dimension(32767, 36));
        pnTiitleBar.setMinimumSize(new java.awt.Dimension(840, 36));
        pnTiitleBar.setPreferredSize(new java.awt.Dimension(840, 36));
        
        progressBar.setBackground(new java.awt.Color(255, 255, 255));
        progressBar.setMinimumSize(new java.awt.Dimension(800, 4));
        progressBar.setPreferredSize(new java.awt.Dimension(800, 4));
        progressBar.setMinimum(0);
        progressBar.setMaximum(100);
        
        btnExitApp.setBackground(new java.awt.Color(255, 255, 255));
        btnExitApp.setMinimumSize(new java.awt.Dimension(30, 30));
        btnExitApp.setPreferredSize(new java.awt.Dimension(30, 30));
        
        iconExitAppOption.setIcon(new javax.swing.ImageIcon(getClass().getResource("/edu/cecar/developertest/views/images/exit-off.png"))); // NOI18N
        
        javax.swing.GroupLayout btnExitAppLayout = new javax.swing.GroupLayout(btnExitApp);
        btnExitApp.setLayout(btnExitAppLayout);
        btnExitAppLayout.setHorizontalGroup(
            btnExitAppLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnExitAppLayout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(iconExitAppOption)
                .addGap(5, 5, 5))
        );
        btnExitAppLayout.setVerticalGroup(
            btnExitAppLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnExitAppLayout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(iconExitAppOption, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(5, 5, 5))
        );
        
        javax.swing.GroupLayout pnTiitleBarLayout = new javax.swing.GroupLayout(pnTiitleBar);
        pnTiitleBar.setLayout(pnTiitleBarLayout);
        pnTiitleBarLayout.setHorizontalGroup(
            pnTiitleBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnTiitleBarLayout.createSequentialGroup()
                .addComponent(progressBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnExitApp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        pnTiitleBarLayout.setVerticalGroup(
            pnTiitleBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnTiitleBarLayout.createSequentialGroup()
                .addGap(3, 3, 3)
                .addComponent(btnExitApp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(pnTiitleBarLayout.createSequentialGroup()
                .addComponent(progressBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 32, Short.MAX_VALUE))
        );
        canvas.add(pnTiitleBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 0, -1, -1));

        
//        JPanel t = new JPanel();
//        javax.swing.GroupLayout canvasLayout = new javax.swing.GroupLayout(canvas);
//        canvas.setLayout(canvasLayout);
//        canvasLayout.setHorizontalGroup(
//            canvasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
//            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, canvasLayout.createSequentialGroup()
//                .addComponent(this.navigationView.getNavigationPanel(), javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
//                .addGap(0, 0, 0)
//                .addGroup(canvasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
//                    .addComponent(this.navigationView.getBook(), javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
//                    .addComponent(t /*pnTiitleBar*/, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
//                .addContainerGap())
//        );
//        canvasLayout.setVerticalGroup(
//            canvasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
//            .addGroup(canvasLayout.createSequentialGroup()
//                .addGroup(canvasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
//                    .addGroup(canvasLayout.createSequentialGroup()
//                        .addComponent(t /*pnTiitleBar*/, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
//                        .addGap(0, 0, 0)
//                        .addComponent(this.navigationView.getNavigationPanel(), javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
//                    .addComponent(this.navigationView.getBook(), javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
//                .addContainerGap())
//        );
        
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(frame.getContentPane());
        frame.getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(canvas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(canvas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        
        frame.setVisible(true);
        DownloadUserView downloadUserView = this.navigationView.getDownloadUserView();
        LoadService.getInstance(downloadUserView.getToken(), downloadUserView.getUrl()).addProgressListener(this);
    }
    
    public NavigationView getNavigationView() { return this.navigationView; }
    
    public JPanel getTittleBar() {
        return this.pnTiitleBar;
    }
    
    public JPanel getExitAppButton() {
        return this.btnExitApp;
    }
    
    public JFrame getFrame() {
        return this.frame;
    }

    
    @Override
    public void progressChanged(float deltaProgress) {
        // No hubo tiempo para implementarlo.
       // overallProgress += deltaProgress;
        //this.progressBar.setValue(overallProgress);
    }

    @Override
    public void operationFailed(String reason) {
        System.out.println(reason);
    }
}
