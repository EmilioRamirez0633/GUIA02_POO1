/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sv.udb.forms;

import com.sv.udb.clas.Ejercicio4;
import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Emilio
 */
public class FrmEjer4 extends javax.swing.JFrame {

    /**
     * Creates new form FrmEjer4
     */
    private Ejercicio4 objeEjer = new Ejercicio4();
    int numeroActual=0;
    String numerosIngresados="";
    public FrmEjer4() {
        initComponents();
        setLocationRelativeTo(null);
        lblingre1.setVisible(false);
        lblingre2.setVisible(false);
        lblingre3.setVisible(false);
        lblingre4.setVisible(false);
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jRadioButton1 = new javax.swing.JRadioButton();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        lbl2 = new javax.swing.JLabel();
        lbl1 = new javax.swing.JLabel();
        lbl3 = new javax.swing.JLabel();
        lbl6 = new javax.swing.JLabel();
        lbl5 = new javax.swing.JLabel();
        lbl4 = new javax.swing.JLabel();
        lbl9 = new javax.swing.JLabel();
        lbl8 = new javax.swing.JLabel();
        lbl7 = new javax.swing.JLabel();
        lbl0 = new javax.swing.JLabel();
        lblingre2 = new javax.swing.JLabel();
        lblingre1 = new javax.swing.JLabel();
        lblingre3 = new javax.swing.JLabel();
        lblingre4 = new javax.swing.JLabel();

        jRadioButton1.setText("jRadioButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        lbl2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/sv/udb/imagenes/numero (1).png"))); // NOI18N
        lbl2.setText("jLabel1");
        lbl2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl2MouseClicked(evt);
            }
        });

        lbl1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/sv/udb/imagenes/numero.png"))); // NOI18N
        lbl1.setText("jLabel1");
        lbl1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl1MouseClicked(evt);
            }
        });

        lbl3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/sv/udb/imagenes/numero (2).png"))); // NOI18N
        lbl3.setText("jLabel1");
        lbl3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl3MouseClicked(evt);
            }
        });

        lbl6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/sv/udb/imagenes/numero (5).png"))); // NOI18N
        lbl6.setText("jLabel1");
        lbl6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl6MouseClicked(evt);
            }
        });

        lbl5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/sv/udb/imagenes/numero (4).png"))); // NOI18N
        lbl5.setText("jLabel1");
        lbl5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl5MouseClicked(evt);
            }
        });

        lbl4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/sv/udb/imagenes/numero (3).png"))); // NOI18N
        lbl4.setText("jLabel1");
        lbl4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl4MouseClicked(evt);
            }
        });

        lbl9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/sv/udb/imagenes/numero (8).png"))); // NOI18N
        lbl9.setText("jLabel1");
        lbl9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl9MouseClicked(evt);
            }
        });

        lbl8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/sv/udb/imagenes/numero (7).png"))); // NOI18N
        lbl8.setText("jLabel1");
        lbl8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl8MouseClicked(evt);
            }
        });

        lbl7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/sv/udb/imagenes/numero (6).png"))); // NOI18N
        lbl7.setText("jLabel1");
        lbl7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl7MouseClicked(evt);
            }
        });

        lbl0.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/sv/udb/imagenes/numero (9).png"))); // NOI18N
        lbl0.setText("jLabel1");
        lbl0.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl0MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lbl4, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbl5, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbl6, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lbl1, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbl2, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbl3, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lbl7, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl0, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lbl8, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lbl9, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl2)
                    .addComponent(lbl3)
                    .addComponent(lbl1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl5)
                    .addComponent(lbl6)
                    .addComponent(lbl4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl8)
                    .addComponent(lbl9)
                    .addComponent(lbl7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl0))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 58, -1, -1));

        lblingre2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/sv/udb/imagenes/circulo.png"))); // NOI18N
        getContentPane().add(lblingre2, new org.netbeans.lib.awtextra.AbsoluteConstraints(91, 20, -1, -1));

        lblingre1.setBackground(new java.awt.Color(0, 0, 204));
        lblingre1.setForeground(new java.awt.Color(0, 0, 204));
        lblingre1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/sv/udb/imagenes/circulo.png"))); // NOI18N
        getContentPane().add(lblingre1, new org.netbeans.lib.awtextra.AbsoluteConstraints(53, 20, -1, -1));

        lblingre3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/sv/udb/imagenes/circulo.png"))); // NOI18N
        getContentPane().add(lblingre3, new org.netbeans.lib.awtextra.AbsoluteConstraints(129, 20, -1, -1));

        lblingre4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/sv/udb/imagenes/circulo.png"))); // NOI18N
        getContentPane().add(lblingre4, new org.netbeans.lib.awtextra.AbsoluteConstraints(167, 20, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lbl1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl1MouseClicked
        if(this.objeEjer.getIntentosRestantes()>= 1)
        {
            numeroActual += 1;
            numerosIngresados += 1;
            switch (numeroActual) {
                    case 1:
                         lblingre1.setVisible(true);
                    break;
                    case 2:
                         lblingre2.setVisible(true);
                    break;
                    case 3:
                         lblingre3.setVisible(true);
                    break;
                    case 4:
                         lblingre4.setVisible(true);
                    break;
                default:
                    
            }
            if(numeroActual == 4)
            {
                if(this.objeEjer.getCodigoActual().equals(numerosIngresados))
                {
                    JOptionPane.showMessageDialog(this, "Codigo correcto");
                    numeroActual =0;
                    numerosIngresados= "";

                }
                else
                {
                    int res = this.objeEjer.getIntentosRestantes();
                    res = res -1;
                    JOptionPane.showMessageDialog(this, "Codigo incorrecto le quedan: " + res + " intentos");
                    numeroActual =0;
                    numerosIngresados= "";             
                    this.objeEjer.setIntentosRestantes(res);
                    lblingre1.setVisible(false);
                    lblingre2.setVisible(false);
                    lblingre3.setVisible(false);
                    lblingre4.setVisible(false);
                }
            }
        }
        else
        {
            JOptionPane.showMessageDialog(this, "No le quedan intentos reinicie la aplicacion");
        }
        
    }//GEN-LAST:event_lbl1MouseClicked

    private void lbl2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl2MouseClicked
        if(this.objeEjer.getIntentosRestantes()>= 1)
        {
            numeroActual += 1;
            numerosIngresados += 2;
            switch (numeroActual) {
                    case 1:
                         lblingre1.setVisible(true);
                    break;
                    case 2:
                         lblingre2.setVisible(true);
                    break;
                    case 3:
                         lblingre3.setVisible(true);
                    break;
                    case 4:
                         lblingre4.setVisible(true);
                    break;
                default:
                    
            }
            if(numeroActual == 4)
            {
                if(this.objeEjer.getCodigoActual().equals(numerosIngresados))
                {
                    JOptionPane.showMessageDialog(this, "Codigo correcto");
                    numeroActual =0;
                    numerosIngresados= "";

                }
                else
                {
                    int res = this.objeEjer.getIntentosRestantes();
                    res = res -1;
                    JOptionPane.showMessageDialog(this, "Codigo incorrecto le quedan: " + res + " intentos");
                    numeroActual =0;
                    numerosIngresados= "";             
                    this.objeEjer.setIntentosRestantes(res);
                    lblingre1.setVisible(false);
                    lblingre2.setVisible(false);
                    lblingre3.setVisible(false);
                    lblingre4.setVisible(false);
                }
            }
        }
        else
        {
            JOptionPane.showMessageDialog(this, "No le quedan intentos reinicie la aplicacion");
        }
    }//GEN-LAST:event_lbl2MouseClicked

    private void lbl3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl3MouseClicked
        if(this.objeEjer.getIntentosRestantes()>= 1)
        {
            numeroActual += 1;
            numerosIngresados += 3;
            switch (numeroActual) {
                    case 1:
                         lblingre1.setVisible(true);
                    break;
                    case 2:
                         lblingre2.setVisible(true);
                    break;
                    case 3:
                         lblingre3.setVisible(true);
                    break;
                    case 4:
                         lblingre4.setVisible(true);
                    break;
                default:
                    
            }
            if(numeroActual == 4)
            {
                    if(this.objeEjer.getCodigoActual().equals(numerosIngresados))
                {
                    JOptionPane.showMessageDialog(this, "Codigo correcto");
                    numeroActual =0;
                    numerosIngresados= "";

                }
                else
                {
                    int res = this.objeEjer.getIntentosRestantes();
                    res = res -1;
                    JOptionPane.showMessageDialog(this, "Codigo incorrecto le quedan: " + res + " intentos");
                    numeroActual =0;
                    numerosIngresados= "";             
                    this.objeEjer.setIntentosRestantes(res);
                    lblingre1.setVisible(false);
                    lblingre2.setVisible(false);
                    lblingre3.setVisible(false);
                    lblingre4.setVisible(false);
                }
            }
        }
        else
        {
            JOptionPane.showMessageDialog(this, "No le quedan intentos reinicie la aplicacion");
        }
    }//GEN-LAST:event_lbl3MouseClicked

    private void lbl4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl4MouseClicked
        if(this.objeEjer.getIntentosRestantes()>= 1)
        {
            numeroActual += 1;
            numerosIngresados += 4;
            switch (numeroActual) {
                    case 1:
                         lblingre1.setVisible(true);
                    break;
                    case 2:
                         lblingre2.setVisible(true);
                    break;
                    case 3:
                         lblingre3.setVisible(true);
                    break;
                    case 4:
                         lblingre4.setVisible(true);
                    break;
                default:
                    
            }
            if(numeroActual == 4)
            {
                if(this.objeEjer.getCodigoActual().equals(numerosIngresados))
                {
                    JOptionPane.showMessageDialog(this, "Codigo correcto");
                    numeroActual =0;
                    numerosIngresados= "";

                }
                else
                {
                    int res = this.objeEjer.getIntentosRestantes();
                    res = res -1;
                    JOptionPane.showMessageDialog(this, "Codigo incorrecto le quedan: " + res + " intentos");
                    numeroActual =0;
                    numerosIngresados= "";             
                    this.objeEjer.setIntentosRestantes(res);
                    lblingre1.setVisible(false);
                    lblingre2.setVisible(false);
                    lblingre3.setVisible(false);
                    lblingre4.setVisible(false);
                }
            }
        }
        else
        {
            JOptionPane.showMessageDialog(this, "No le quedan intentos reinicie la aplicacion");
        }
    }//GEN-LAST:event_lbl4MouseClicked

    private void lbl5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl5MouseClicked
        if(this.objeEjer.getIntentosRestantes()>= 1)
        {
            numeroActual += 1;
            numerosIngresados += 5;
            switch (numeroActual) {
                    case 1:
                         lblingre1.setVisible(true);
                    break;
                    case 2:
                         lblingre2.setVisible(true);
                    break;
                    case 3:
                         lblingre3.setVisible(true);
                    break;
                    case 4:
                         lblingre4.setVisible(true);
                    break;
                default:
                    
            }
            if(numeroActual == 4)
            {
                if(this.objeEjer.getCodigoActual().equals(numerosIngresados))
                {
                    JOptionPane.showMessageDialog(this, "Codigo correcto");
                    numeroActual =0;
                    numerosIngresados= "";

                }
                else
                {
                    int res = this.objeEjer.getIntentosRestantes();
                    res = res -1;
                    JOptionPane.showMessageDialog(this, "Codigo incorrecto le quedan: " + res + " intentos");
                    numeroActual =0;
                    numerosIngresados= "";             
                    this.objeEjer.setIntentosRestantes(res);
                    lblingre1.setVisible(false);
                    lblingre2.setVisible(false);
                    lblingre3.setVisible(false);
                    lblingre4.setVisible(false);
                }
            }
        }
        else
        {
            JOptionPane.showMessageDialog(this, "No le quedan intentos reinicie la aplicacion");
        }
    }//GEN-LAST:event_lbl5MouseClicked

    private void lbl6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl6MouseClicked
        if(this.objeEjer.getIntentosRestantes()>= 1)
        {
            numeroActual += 1;
            numerosIngresados += 6;
            switch (numeroActual) {
                    case 1:
                         lblingre1.setVisible(true);
                    break;
                    case 2:
                         lblingre2.setVisible(true);
                    break;
                    case 3:
                         lblingre3.setVisible(true);
                    break;
                    case 4:
                         lblingre4.setVisible(true);
                    break;
                default:
                    
            }
            if(numeroActual == 4)
            {
                if(this.objeEjer.getCodigoActual().equals(numerosIngresados))
                {
                    JOptionPane.showMessageDialog(this, "Codigo correcto");
                    numeroActual =0;
                    numerosIngresados= "";

                }
                else
                {
                    int res = this.objeEjer.getIntentosRestantes();
                    res = res -1;
                    JOptionPane.showMessageDialog(this, "Codigo incorrecto le quedan: " + res + " intentos");
                    numeroActual =0;
                    numerosIngresados= "";             
                    this.objeEjer.setIntentosRestantes(res);
                    lblingre1.setVisible(false);
                    lblingre2.setVisible(false);
                    lblingre3.setVisible(false);
                    lblingre4.setVisible(false);
                }
            }
        }
        else
        {
            JOptionPane.showMessageDialog(this, "No le quedan intentos reinicie la aplicacion");
        }
    }//GEN-LAST:event_lbl6MouseClicked

    private void lbl0MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl0MouseClicked
        if(this.objeEjer.getIntentosRestantes()>= 1)
        {
            numeroActual += 1;
            numerosIngresados += 0;
            switch (numeroActual) {
                    case 1:
                         lblingre1.setVisible(true);
                    break;
                    case 2:
                         lblingre2.setVisible(true);
                    break;
                    case 3:
                         lblingre3.setVisible(true);
                    break;
                    case 4:
                         lblingre4.setVisible(true);
                    break;
                default:
                    
            }
            if(numeroActual == 4)
            {
                if(this.objeEjer.getCodigoActual().equals(numerosIngresados))
                {
                    JOptionPane.showMessageDialog(this, "Codigo correcto");
                    numeroActual =0;
                    numerosIngresados= "";

                }
                else
                {
                    int res = this.objeEjer.getIntentosRestantes();
                    res = res -1;
                    JOptionPane.showMessageDialog(this, "Codigo incorrecto le quedan: " + res + " intentos");
                    numeroActual =0;
                    numerosIngresados= "";             
                    this.objeEjer.setIntentosRestantes(res);
                    lblingre1.setVisible(false);
                    lblingre2.setVisible(false);
                    lblingre3.setVisible(false);
                    lblingre4.setVisible(false);
                }
            }
        }
        else
        {
            JOptionPane.showMessageDialog(this, "No le quedan intentos reinicie la aplicacion");
        }
    }//GEN-LAST:event_lbl0MouseClicked

    private void lbl7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl7MouseClicked
        if(this.objeEjer.getIntentosRestantes()>= 1)
        {
            numeroActual += 1;
            numerosIngresados += 7;
            switch (numeroActual) {
                    case 1:
                         lblingre1.setVisible(true);
                    break;
                    case 2:
                         lblingre2.setVisible(true);
                    break;
                    case 3:
                         lblingre3.setVisible(true);
                    break;
                    case 4:
                         lblingre4.setVisible(true);
                    break;
                default:
                    
            }
            if(numeroActual == 4)
            {
                if(this.objeEjer.getCodigoActual().equals(numerosIngresados))
                {
                    JOptionPane.showMessageDialog(this, "Codigo correcto");
                    numeroActual =0;
                    numerosIngresados= "";

                }
                else
                {
                    int res = this.objeEjer.getIntentosRestantes();
                    res = res -1;
                    JOptionPane.showMessageDialog(this, "Codigo incorrecto le quedan: " + res + " intentos");
                    numeroActual =0;
                    numerosIngresados= "";             
                    this.objeEjer.setIntentosRestantes(res);
                    lblingre1.setVisible(false);
                    lblingre2.setVisible(false);
                    lblingre3.setVisible(false);
                    lblingre4.setVisible(false);
                }
            }
        }
        else
        {
            JOptionPane.showMessageDialog(this, "No le quedan intentos reinicie la aplicacion");
        }
    }//GEN-LAST:event_lbl7MouseClicked

    private void lbl8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl8MouseClicked
        if(this.objeEjer.getIntentosRestantes()>= 1)
        {
            numeroActual += 1;
            numerosIngresados += 8;
            switch (numeroActual) {
                    case 1:
                         lblingre1.setVisible(true);
                    break;
                    case 2:
                         lblingre2.setVisible(true);
                    break;
                    case 3:
                         lblingre3.setVisible(true);
                    break;
                    case 4:
                         lblingre4.setVisible(true);
                    break;
                default:
                    
            }
            if(numeroActual == 4)
            {
                if(this.objeEjer.getCodigoActual().equals(numerosIngresados))
                {
                    JOptionPane.showMessageDialog(this, "Codigo correcto");
                    numeroActual =0;
                    numerosIngresados= "";

                }
                else
                {
                    int res = this.objeEjer.getIntentosRestantes();
                    res = res -1;
                    JOptionPane.showMessageDialog(this, "Codigo incorrecto le quedan: " + res + " intentos");
                    numeroActual =0;
                    numerosIngresados= "";             
                    this.objeEjer.setIntentosRestantes(res);
                    lblingre1.setVisible(false);
                    lblingre2.setVisible(false);
                    lblingre3.setVisible(false);
                    lblingre4.setVisible(false);
                }
            }
        }
        else
        {
            JOptionPane.showMessageDialog(this, "No le quedan intentos reinicie la aplicacion");
        }
    }//GEN-LAST:event_lbl8MouseClicked

    private void lbl9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl9MouseClicked
        if(this.objeEjer.getIntentosRestantes()>= 1)
        {
            numeroActual += 1;
            numerosIngresados += 9;
            switch (numeroActual) {
                    case 1:
                         lblingre1.setVisible(true);
                    break;
                    case 2:
                         lblingre2.setVisible(true);
                    break;
                    case 3:
                         lblingre3.setVisible(true);
                    break;
                    case 4:
                         lblingre4.setVisible(true);
                    break;
                default:
                    
            }
            if(numeroActual == 4)
            {
                if(this.objeEjer.getCodigoActual().equals(numerosIngresados))
                {
                    JOptionPane.showMessageDialog(this, "Codigo correcto");
                    numeroActual =0;
                    numerosIngresados= "";

                }
                else
                {
                    int res = this.objeEjer.getIntentosRestantes();
                    res = res -1;
                    JOptionPane.showMessageDialog(this, "Codigo incorrecto le quedan: " + res + " intentos");
                    numeroActual =0;
                    numerosIngresados= "";             
                    this.objeEjer.setIntentosRestantes(res);
                    lblingre1.setVisible(false);
                    lblingre2.setVisible(false);
                    lblingre3.setVisible(false);
                    lblingre4.setVisible(false);
                }
            }
        }
        else
        {
            JOptionPane.showMessageDialog(this, "No le quedan intentos reinicie la aplicacion");
        }
    }//GEN-LAST:event_lbl9MouseClicked

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
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrmEjer4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmEjer4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmEjer4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmEjer4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmEjer4().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JLabel lbl0;
    private javax.swing.JLabel lbl1;
    private javax.swing.JLabel lbl2;
    private javax.swing.JLabel lbl3;
    private javax.swing.JLabel lbl4;
    private javax.swing.JLabel lbl5;
    private javax.swing.JLabel lbl6;
    private javax.swing.JLabel lbl7;
    private javax.swing.JLabel lbl8;
    private javax.swing.JLabel lbl9;
    private javax.swing.JLabel lblingre1;
    private javax.swing.JLabel lblingre2;
    private javax.swing.JLabel lblingre3;
    private javax.swing.JLabel lblingre4;
    // End of variables declaration//GEN-END:variables
}
