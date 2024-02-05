/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.principal;

import com.formdev.flatlaf.FlatLightLaf;
import com.formdev.flatlaf.intellijthemes.materialthemeuilite.FlatAtomOneLightIJTheme;
import java.awt.BorderLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.UIManager;
import paneles.panelconsultas;
import paneles.panelhistoria;
import paneles.panelmedicamentos;
import paneles.panelmedico;
import paneles.panelpaciente;
import paneles.prueba;

/**
 *
 * @author VictorY
 */
public class dd extends javax.swing.JFrame {

    /**
     * Creates new form dd
     */
    public dd() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    private String correo;

    public void mostrarcorreo(String correo) {
        this.correo = correo;
        correolabel.setText("Sesion de: " + correo);
    }

    private void ShowJpanel(JPanel pl) {
        pl.setSize(890, 560);
        pl.setLocation(0, 0);

        viewp.removeAll();
        viewp.add(pl, BorderLayout.CENTER);
        viewp.revalidate();
        viewp.repaint();
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        correolabel = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        medicobtn = new javax.swing.JButton();
        consultasbtn = new javax.swing.JButton();
        medicamentosbtn = new javax.swing.JButton();
        pacientebtn = new javax.swing.JButton();
        salirbtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        pacientebtn1 = new javax.swing.JButton();
        viewp = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 204, 204));
        setMaximumSize(new java.awt.Dimension(1032, 595));
        setMinimumSize(new java.awt.Dimension(1032, 595));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(1050, 600));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setMaximumSize(new java.awt.Dimension(1050, 600));
        jPanel1.setMinimumSize(new java.awt.Dimension(1050, 600));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(51, 204, 0));

        jPanel4.setBackground(new java.awt.Color(25, 117, 209));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("X");
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });

        correolabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        correolabel.setForeground(new java.awt.Color(255, 255, 255));
        correolabel.setText("asd");
        correolabel.setToolTipText("");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(correolabel, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 784, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(correolabel, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1050, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 39, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1050, -1));

        jPanel3.setBackground(new java.awt.Color(5, 80, 155));

        medicobtn.setBackground(new java.awt.Color(17, 111, 171));
        medicobtn.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        medicobtn.setForeground(new java.awt.Color(255, 255, 255));
        medicobtn.setText("Médico");
        medicobtn.setBorder(null);
        medicobtn.setBorderPainted(false);
        medicobtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        medicobtn.setIconTextGap(6);
        medicobtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                medicobtnActionPerformed(evt);
            }
        });

        consultasbtn.setBackground(new java.awt.Color(17, 111, 171));
        consultasbtn.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        consultasbtn.setForeground(new java.awt.Color(255, 255, 255));
        consultasbtn.setText("Consultas");
        consultasbtn.setBorder(null);
        consultasbtn.setBorderPainted(false);
        consultasbtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        consultasbtn.setIconTextGap(6);
        consultasbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consultasbtnActionPerformed(evt);
            }
        });

        medicamentosbtn.setBackground(new java.awt.Color(17, 111, 171));
        medicamentosbtn.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        medicamentosbtn.setForeground(new java.awt.Color(255, 255, 255));
        medicamentosbtn.setText("Medicamentos");
        medicamentosbtn.setBorder(null);
        medicamentosbtn.setBorderPainted(false);
        medicamentosbtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        medicamentosbtn.setIconTextGap(6);
        medicamentosbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                medicamentosbtnActionPerformed(evt);
            }
        });

        pacientebtn.setBackground(new java.awt.Color(17, 111, 171));
        pacientebtn.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        pacientebtn.setForeground(new java.awt.Color(255, 255, 255));
        pacientebtn.setText("Paciente");
        pacientebtn.setBorder(null);
        pacientebtn.setBorderPainted(false);
        pacientebtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pacientebtn.setIconTextGap(6);
        pacientebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pacientebtnActionPerformed(evt);
            }
        });

        salirbtn.setBackground(new java.awt.Color(17, 111, 171));
        salirbtn.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        salirbtn.setForeground(new java.awt.Color(255, 255, 255));
        salirbtn.setText("Salir");
        salirbtn.setBorder(null);
        salirbtn.setBorderPainted(false);
        salirbtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        salirbtn.setIconTextGap(6);
        salirbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirbtnActionPerformed(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(5, 80, 155));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("MENÚ");
        jLabel1.setToolTipText("");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel1.setOpaque(true);

        pacientebtn1.setBackground(new java.awt.Color(17, 111, 171));
        pacientebtn1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        pacientebtn1.setForeground(new java.awt.Color(255, 255, 255));
        pacientebtn1.setText("Historia médica");
        pacientebtn1.setBorder(null);
        pacientebtn1.setBorderPainted(false);
        pacientebtn1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pacientebtn1.setIconTextGap(6);
        pacientebtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pacientebtn1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(pacientebtn1, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(pacientebtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(medicobtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(medicamentosbtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(consultasbtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(salirbtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(99, 99, 99)
                .addComponent(pacientebtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(pacientebtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(medicobtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(medicamentosbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(consultasbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 136, Short.MAX_VALUE)
                .addComponent(salirbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56))
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 39, 160, 570));

        viewp.setBackground(new java.awt.Color(255, 255, 255));
        viewp.setPreferredSize(new java.awt.Dimension(870, 550));

        javax.swing.GroupLayout viewpLayout = new javax.swing.GroupLayout(viewp);
        viewp.setLayout(viewpLayout);
        viewpLayout.setHorizontalGroup(
            viewpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 880, Short.MAX_VALUE)
        );
        viewpLayout.setVerticalGroup(
            viewpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 560, Short.MAX_VALUE)
        );

        jPanel1.add(viewp, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 40, 880, 560));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void medicobtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_medicobtnActionPerformed
        // TODO add your handling code here:
        ShowJpanel(new panelmedico());
    }//GEN-LAST:event_medicobtnActionPerformed

    private void consultasbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consultasbtnActionPerformed
        // TODO add your handling code here:
        ShowJpanel(new panelconsultas());
    }//GEN-LAST:event_consultasbtnActionPerformed

    private void pacientebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pacientebtnActionPerformed
        // TODO add your handling code here:
        ShowJpanel(new panelpaciente());
    }//GEN-LAST:event_pacientebtnActionPerformed

    private void medicamentosbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_medicamentosbtnActionPerformed
        // TODO add your handling code here:
        ShowJpanel(new panelmedicamentos());
    }//GEN-LAST:event_medicamentosbtnActionPerformed

    private void salirbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirbtnActionPerformed
        // TODO add your handling code here:

        int op = JOptionPane.showConfirmDialog(null, "¿Desea finalizar la sesión?", "CERRAR SESIÓN", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);

        if (op == 0) {
            JOptionPane.showMessageDialog(null, "Cerrando sesión..", "Sesión Cerrada", JOptionPane.INFORMATION_MESSAGE);

            loginnuevo loginframe = new loginnuevo();
            loginframe.setVisible(true);
            loginframe.pack();
            loginframe.setLocationRelativeTo(null);
            this.dispose();

        }
    }//GEN-LAST:event_salirbtnActionPerformed

    private void pacientebtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pacientebtn1ActionPerformed
        // TODO add your handling code here:
        ShowJpanel(new panelhistoria());
    }//GEN-LAST:event_pacientebtn1ActionPerformed

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabel2MouseClicked

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        for (double i = 0.0; i <= 1.0; i = i + 0.1) {
            String val = i + "";
            float f = Float.valueOf(val);
            this.setOpacity(f);
            try {
                Thread.sleep(50);
            } catch (Exception e) {

            }
        }
    }//GEN-LAST:event_formWindowOpened

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
            UIManager.setLookAndFeel(new FlatLightLaf());
            FlatAtomOneLightIJTheme.setup();

        } catch (Exception ex) {
            System.err.println("Failed to initialize LaF");
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new dd().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton consultasbtn;
    private javax.swing.JLabel correolabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JButton medicamentosbtn;
    private javax.swing.JButton medicobtn;
    private javax.swing.JButton pacientebtn;
    private javax.swing.JButton pacientebtn1;
    private javax.swing.JButton salirbtn;
    private javax.swing.JPanel viewp;
    // End of variables declaration//GEN-END:variables
}
