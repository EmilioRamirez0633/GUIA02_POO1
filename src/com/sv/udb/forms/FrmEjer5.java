/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sv.udb.forms;

import com.sv.udb.clas.Ejercicio5;
import javax.swing.JOptionPane;

/**
 *
 * @author Emilio
 */
public class FrmEjer5 extends javax.swing.JFrame {

    /**
     * Creates new form FrmEjer5
     */
    private boolean isDigit = true;
    private boolean firtexe = true;
    private String nowOperation;
    private int simOperation =0;
    private String firtOperation = "";
    private String secondOperation = "";
    
    Ejercicio5 datos = new Ejercicio5();
    public FrmEjer5() {
        initComponents();
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtresultados = new javax.swing.JTextField();
        btnClear = new javax.swing.JButton();
        btnCambioSigno = new javax.swing.JButton();
        btnEntre = new javax.swing.JButton();
        btn3 = new javax.swing.JButton();
        btn2 = new javax.swing.JButton();
        btn1 = new javax.swing.JButton();
        btnPor = new javax.swing.JButton();
        btn6 = new javax.swing.JButton();
        btn5 = new javax.swing.JButton();
        btn4 = new javax.swing.JButton();
        btnMenos = new javax.swing.JButton();
        btn9 = new javax.swing.JButton();
        btn8 = new javax.swing.JButton();
        btn7 = new javax.swing.JButton();
        jButton20 = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnPunto = new javax.swing.JButton();
        btn0 = new javax.swing.JButton();
        btnIgual = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        txtresultados.setEditable(false);
        txtresultados.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N

        btnClear.setBackground(new java.awt.Color(204, 0, 0));
        btnClear.setFont(new java.awt.Font("Consolas", 1, 15)); // NOI18N
        btnClear.setText("C");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        btnCambioSigno.setBackground(new java.awt.Color(255, 255, 255));
        btnCambioSigno.setFont(new java.awt.Font("Consolas", 1, 11)); // NOI18N
        btnCambioSigno.setText("+/-");
        btnCambioSigno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCambioSignoActionPerformed(evt);
            }
        });

        btnEntre.setBackground(new java.awt.Color(255, 255, 255));
        btnEntre.setFont(new java.awt.Font("Consolas", 1, 15)); // NOI18N
        btnEntre.setText("/");
        btnEntre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEntreActionPerformed(evt);
            }
        });

        btn3.setBackground(new java.awt.Color(255, 255, 255));
        btn3.setFont(new java.awt.Font("Consolas", 1, 15)); // NOI18N
        btn3.setText("3");
        btn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn3ActionPerformed(evt);
            }
        });

        btn2.setBackground(new java.awt.Color(255, 255, 255));
        btn2.setFont(new java.awt.Font("Consolas", 1, 15)); // NOI18N
        btn2.setText("2");
        btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2ActionPerformed(evt);
            }
        });

        btn1.setBackground(new java.awt.Color(255, 255, 255));
        btn1.setFont(new java.awt.Font("Consolas", 1, 15)); // NOI18N
        btn1.setText("1");
        btn1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn1MouseClicked(evt);
            }
        });
        btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1ActionPerformed(evt);
            }
        });

        btnPor.setBackground(new java.awt.Color(255, 255, 255));
        btnPor.setFont(new java.awt.Font("Consolas", 1, 15)); // NOI18N
        btnPor.setText("x");
        btnPor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPorActionPerformed(evt);
            }
        });

        btn6.setBackground(new java.awt.Color(255, 255, 255));
        btn6.setFont(new java.awt.Font("Consolas", 1, 15)); // NOI18N
        btn6.setText("6");
        btn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn6ActionPerformed(evt);
            }
        });

        btn5.setBackground(new java.awt.Color(255, 255, 255));
        btn5.setFont(new java.awt.Font("Consolas", 1, 15)); // NOI18N
        btn5.setText("5");
        btn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn5ActionPerformed(evt);
            }
        });

        btn4.setBackground(new java.awt.Color(255, 255, 255));
        btn4.setFont(new java.awt.Font("Consolas", 1, 15)); // NOI18N
        btn4.setText("4");
        btn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn4ActionPerformed(evt);
            }
        });

        btnMenos.setBackground(new java.awt.Color(255, 255, 255));
        btnMenos.setFont(new java.awt.Font("Consolas", 1, 15)); // NOI18N
        btnMenos.setText("-");
        btnMenos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenosActionPerformed(evt);
            }
        });

        btn9.setBackground(new java.awt.Color(255, 255, 255));
        btn9.setFont(new java.awt.Font("Consolas", 1, 15)); // NOI18N
        btn9.setText("9");
        btn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn9ActionPerformed(evt);
            }
        });

        btn8.setBackground(new java.awt.Color(255, 255, 255));
        btn8.setFont(new java.awt.Font("Consolas", 1, 15)); // NOI18N
        btn8.setText("8");
        btn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn8ActionPerformed(evt);
            }
        });

        btn7.setBackground(new java.awt.Color(255, 255, 255));
        btn7.setFont(new java.awt.Font("Consolas", 1, 15)); // NOI18N
        btn7.setText("7");
        btn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn7ActionPerformed(evt);
            }
        });

        jButton20.setBackground(new java.awt.Color(255, 255, 255));
        jButton20.setFont(new java.awt.Font("Consolas", 1, 15)); // NOI18N
        jButton20.setText("+");
        jButton20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton20ActionPerformed(evt);
            }
        });

        btnEliminar.setBackground(new java.awt.Color(255, 255, 255));
        btnEliminar.setFont(new java.awt.Font("Consolas", 1, 15)); // NOI18N
        btnEliminar.setText("<-");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnPunto.setBackground(new java.awt.Color(255, 255, 255));
        btnPunto.setFont(new java.awt.Font("Consolas", 1, 15)); // NOI18N
        btnPunto.setText(".");
        btnPunto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPuntoActionPerformed(evt);
            }
        });

        btn0.setBackground(new java.awt.Color(255, 255, 255));
        btn0.setFont(new java.awt.Font("Consolas", 1, 15)); // NOI18N
        btn0.setText("0");
        btn0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn0ActionPerformed(evt);
            }
        });

        btnIgual.setBackground(new java.awt.Color(255, 0, 51));
        btnIgual.setFont(new java.awt.Font("Consolas", 1, 15)); // NOI18N
        btnIgual.setText("=");
        btnIgual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIgualActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtresultados)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(6, 6, 6)
                                .addComponent(btn2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(6, 6, 6)
                                .addComponent(btn3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(6, 6, 6)
                                .addComponent(btnPor, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btn4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(6, 6, 6)
                                .addComponent(btn5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(6, 6, 6)
                                .addComponent(btn6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(6, 6, 6)
                                .addComponent(btnMenos, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btn7, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(6, 6, 6)
                                .addComponent(btn8, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(6, 6, 6)
                                .addComponent(btn9, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(6, 6, 6)
                                .addComponent(jButton20, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btn0, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(6, 6, 6)
                                .addComponent(btnPunto, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(6, 6, 6)
                                .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(6, 6, 6)
                                .addComponent(btnIgual, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnCambioSigno, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnEntre, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(txtresultados, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCambioSigno, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEntre, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPor, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn6, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnMenos, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn7, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn8, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn9, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton20, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn0, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPunto, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnIgual, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(13, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btn1MouseClicked

    private void btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1ActionPerformed
        this.nowOperation =txtresultados.getText();
        this.nowOperation += "1";
        txtresultados.setText(nowOperation);
        if(this.isDigit == false)
        {
            this.secondOperation += "1";
        }
        else
        {
            this.firtOperation += "1";
        }
    }//GEN-LAST:event_btn1ActionPerformed

    private void btnPorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPorActionPerformed

        if(this.firtOperation != "")
        {
            if(this.firtexe == true)
            {
               this.nowOperation =txtresultados.getText();
               this.nowOperation += "x";
               txtresultados.setText(nowOperation);
               simOperation = 1;
               isDigit = false;
               this.firtexe=false;
            }
            else
            {
                if(this.secondOperation != "")
                {
                    JOptionPane.showMessageDialog(this, "Obtenga resultado antes de hacer otra operacion");
                }
                else
                {
                     String lastOne,nActual,datoEli;
                     nActual = String.valueOf(txtresultados.getText());
                     datoEli = String.valueOf(nActual.charAt(nActual.length()-1));
                    if(datoEli.equals("x") ||datoEli.equals("/") ||datoEli.equals("-") ||datoEli.equals("+") )
                    {
                        
                    }else
                    {
                        this.nowOperation =txtresultados.getText();
                this.nowOperation += "x";
                txtresultados.setText(nowOperation);
                simOperation = 1;
                isDigit = false;
                    }
                    
                }
            }
        }
        else
        {
            JOptionPane.showMessageDialog(this, "Ingrese un numero antes");
        }
    }//GEN-LAST:event_btnPorActionPerformed

    private void btnIgualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIgualActionPerformed
        Double opeN1,opeN2;
        String lastOne2,lastOne;
        switch (simOperation) {
            case 1:
                opeN1 = Double.parseDouble(firtOperation);
                opeN2 = Double.parseDouble(secondOperation);
                this.datos.setResultadoActual((opeN1*opeN2));
                firtOperation = String.valueOf(this.datos.getResultadoActual());
                
                secondOperation = "";
                nowOperation= "";
                simOperation= 0;
                this.nowOperation =txtresultados.getText();
                this.nowOperation =  firtOperation;
                txtresultados.setText(nowOperation);
                /*lastOne = String.valueOf(firtOperation.charAt(firtOperation.length()-1));
                lastOne2 = String.valueOf(firtOperation.charAt(firtOperation.length()-2));
                if(lastOne.equals("0") && lastOne2.equals("."))
                {                                                                                   era un codigo para quitar decimales pero no funciono :C
                    String cadenaNueva = firtOperation.substring(0, firtOperation.length()-1); 
                    String cadenaNueva2 = cadenaNueva.substring(0, cadenaNueva.length()-1);
                    this.datos.setResultadoActual(Double.parseDouble(cadenaNueva2));
                     firtOperation = String.valueOf(this.datos.getResultadoActual());
                    
                    txtresultados.setText(cadenaNueva2);
                } 
                JOptionPane.showMessageDialog(this, firtOperation);
                 isDigit = true;*/
                break;
            case 2:
                opeN1 = Double.parseDouble(firtOperation);
                opeN2 = Double.parseDouble(secondOperation);
                this.datos.setResultadoActual((opeN1/opeN2));
                firtOperation = String.valueOf(this.datos.getResultadoActual());
                secondOperation = "";
                nowOperation= "";
                simOperation= 0;
                this.nowOperation =txtresultados.getText();
                this.nowOperation =  firtOperation;
                txtresultados.setText(nowOperation);
                break;
            case 3:
                opeN1 = Double.parseDouble(firtOperation);
                opeN2 = Double.parseDouble(secondOperation);
                this.datos.setResultadoActual((opeN1-opeN2));
                firtOperation = String.valueOf(this.datos.getResultadoActual());
                secondOperation = "";
                nowOperation= "";
                simOperation= 0;
                this.nowOperation =txtresultados.getText();
                this.nowOperation =  firtOperation;
                txtresultados.setText(nowOperation);
                break;
            case 4:
                opeN1 = Double.parseDouble(firtOperation);
                opeN2 = Double.parseDouble(secondOperation);
                this.datos.setResultadoActual((opeN1+opeN2));
                firtOperation = String.valueOf(this.datos.getResultadoActual());
                secondOperation = "";
                nowOperation= "";
                simOperation= 0;
                this.nowOperation =txtresultados.getText();
                this.nowOperation =  firtOperation;
                txtresultados.setText(nowOperation);
            break;
            default:
                throw new AssertionError();
        }
    }//GEN-LAST:event_btnIgualActionPerformed

    private void btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2ActionPerformed
        this.nowOperation =txtresultados.getText();
        this.nowOperation += "2";
        txtresultados.setText(nowOperation);
        if(this.isDigit == false)
        {
            this.secondOperation += "2";
        }
        else
        {
            this.firtOperation += "2";
        }
    }//GEN-LAST:event_btn2ActionPerformed

    private void btn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn3ActionPerformed
        this.nowOperation =txtresultados.getText();
        this.nowOperation += "3";
        txtresultados.setText(nowOperation);
        if(this.isDigit == false)
        {
            this.secondOperation += "3";
        }
        else
        {
            this.firtOperation += "3";
        }
    }//GEN-LAST:event_btn3ActionPerformed

    private void btn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn4ActionPerformed
       this.nowOperation =txtresultados.getText();
        this.nowOperation += "4";
        txtresultados.setText(nowOperation);
        if(this.isDigit == false)
        {
            this.secondOperation += "4";
        }
        else
        {
            this.firtOperation += "4";
        }
    }//GEN-LAST:event_btn4ActionPerformed

    private void btn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn5ActionPerformed
       this.nowOperation =txtresultados.getText();
        this.nowOperation += "5";
        txtresultados.setText(nowOperation);
        if(this.isDigit == false)
        {
            this.secondOperation += "5";
        }
        else
        {
            this.firtOperation += "5";
        }
    }//GEN-LAST:event_btn5ActionPerformed

    private void btn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn6ActionPerformed
        this.nowOperation =txtresultados.getText();
        this.nowOperation += "6";
        txtresultados.setText(nowOperation);
        if(this.isDigit == false)
        {
            this.secondOperation += "6";
        }
        else
        {
            this.firtOperation += "6";
        }
    }//GEN-LAST:event_btn6ActionPerformed

    private void btn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn7ActionPerformed
        this.nowOperation =txtresultados.getText();
        this.nowOperation += "7";
        txtresultados.setText(nowOperation);
        if(this.isDigit == false)
        {
            this.secondOperation += "7";
        }
        else
        {
            this.firtOperation += "7";
        }
    }//GEN-LAST:event_btn7ActionPerformed

    private void btn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn8ActionPerformed
        this.nowOperation =txtresultados.getText();
        this.nowOperation += "8";
        txtresultados.setText(nowOperation);
        if(this.isDigit == false)
        {
            this.secondOperation += "8";
        }
        else
        {
            this.firtOperation += "8";
        }
    }//GEN-LAST:event_btn8ActionPerformed

    private void btn9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn9ActionPerformed
       this.nowOperation =txtresultados.getText();
        this.nowOperation += "9";
        txtresultados.setText(nowOperation);
        if(this.isDigit == false)
        {
            this.secondOperation += "9";
        }
        else
        {
            this.firtOperation += "9";
        }
    }//GEN-LAST:event_btn9ActionPerformed

    private void btn0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn0ActionPerformed
       this.nowOperation =txtresultados.getText();
        this.nowOperation += "0";
        txtresultados.setText(nowOperation);
        if(this.isDigit == false)
        {
            this.secondOperation += "0";
        }
        else
        {
            this.firtOperation += "0";
        }
    }//GEN-LAST:event_btn0ActionPerformed

    private void btnEntreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEntreActionPerformed
        if(this.firtOperation != "")
        {
            if(this.firtexe == true)
            {
               this.nowOperation =txtresultados.getText();
               this.nowOperation += "*";
               txtresultados.setText(nowOperation);
               simOperation = 2;
               isDigit = false;
               this.firtexe=false;
            }
            else
            {
                if(this.secondOperation != "")
                {
                    JOptionPane.showMessageDialog(this, "Obtenga resultado antes de hacer otra operacion");
                }
                else
                {
                    String lastOne,nActual,datoEli;
                     nActual = String.valueOf(txtresultados.getText());
                     datoEli = String.valueOf(nActual.charAt(nActual.length()-1));
                    if(datoEli.equals("x") ||datoEli.equals("/") ||datoEli.equals("-") ||datoEli.equals("+") )
                    {
                        
                    }else
                    {
                    this.nowOperation =txtresultados.getText();
                this.nowOperation += "/";
                txtresultados.setText(nowOperation);
                simOperation = 2;
                isDigit = false;
                    }
                }
            }
        }
        else
        {
            JOptionPane.showMessageDialog(this, "Ingrese un numero antes");
        }
    }//GEN-LAST:event_btnEntreActionPerformed

    private void btnMenosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenosActionPerformed
        if(this.firtOperation != "")
        {
            if(this.firtexe == true)
            {
               this.nowOperation =txtresultados.getText();
               this.nowOperation += "-";
               txtresultados.setText(nowOperation);
               simOperation = 3;
               isDigit = false;
               this.firtexe=false;
            }
            else
            {
                if(this.secondOperation != "")
                {
                    JOptionPane.showMessageDialog(this, "Obtenga resultado antes de hacer otra operacion");
                }
                else
                {
                    String lastOne,nActual,datoEli;
                     nActual = String.valueOf(txtresultados.getText());
                     datoEli = String.valueOf(nActual.charAt(nActual.length()-1));
                    if(datoEli.equals("x") ||datoEli.equals("/") ||datoEli.equals("-") ||datoEli.equals("+") )
                    {
                        
                    }else
                    {
                    this.nowOperation =txtresultados.getText();
                this.nowOperation += "-";
                txtresultados.setText(nowOperation);
                simOperation = 3;
                isDigit = false;
                    }
                }
            }
        }
        else
        {
            JOptionPane.showMessageDialog(this, "Ingrese un numero antes");
        }
    }//GEN-LAST:event_btnMenosActionPerformed

    private void jButton20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton20ActionPerformed
        if(this.firtOperation != "")
        {
            if(this.firtexe == true)
            {
               this.nowOperation =txtresultados.getText();
               this.nowOperation += "+";
               txtresultados.setText(nowOperation);
               simOperation = 4;
               isDigit = false;
               this.firtexe=false;
            }
            else
            {
                if(this.secondOperation != "")
                {
                    JOptionPane.showMessageDialog(this, "Obtenga resultado antes de hacer otra operacion");
                }
                else
                {
                    String lastOne,nActual,datoEli;
                     nActual = String.valueOf(txtresultados.getText());
                     datoEli = String.valueOf(nActual.charAt(nActual.length()-1));
                    if(datoEli.equals("x") ||datoEli.equals("/") ||datoEli.equals("-") ||datoEli.equals("+") )
                    {
                        
                    }else
                    {
                    this.nowOperation =txtresultados.getText();
                this.nowOperation += "+";
                txtresultados.setText(nowOperation);
                simOperation = 4;
                isDigit = false;
                    }
                }
            }
        }
        else
        {
            JOptionPane.showMessageDialog(this, "Ingrese un numero antes");
        }
    }//GEN-LAST:event_jButton20ActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        try
        {
            String lastOne,nActual,datoEli;
            nActual = String.valueOf(txtresultados.getText());
            datoEli = String.valueOf(nActual.charAt(nActual.length()-1));
            lastOne = String.valueOf(nActual.substring(0, nActual.length()-1));
            txtresultados.setText(lastOne);
            if(secondOperation.equals(""))
                
            {
                if(datoEli.equals("x") ||datoEli.equals("/") ||datoEli.equals("-") ||datoEli.equals("+") )
                {
                    simOperation = 0;
                    isDigit = true;
                    firtexe = true;
                }
                else{
                firtOperation.substring(0, firtOperation.length()-1);
                }
            }
            else{
                    secondOperation.substring(0, secondOperation.length()-1);            
            }
        }
        catch(Exception e)
        {
            
        }

        
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnPuntoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPuntoActionPerformed
        try
        {
            String lastOne,nActual,datoEli;
            nActual = String.valueOf(txtresultados.getText());
            datoEli = String.valueOf(nActual.charAt(nActual.length()-1));
            if(datoEli.equals("."))
            {
                
            }
            else
            {
                if(secondOperation.equals(""))                
                {
                    if(datoEli.equals("x") ||datoEli.equals("/") ||datoEli.equals("-") ||datoEli.equals("+") )
                    {

                    }
                    else{
                    firtOperation += ".";
                    nActual += ".";
                    txtresultados.setText(nActual);
                    }
                }
                else{
                        secondOperation += ".";     
                        nActual += ".";
                        txtresultados.setText(nActual);
                }
            }
        }
        catch(Exception e)
        {
            
        }
    }//GEN-LAST:event_btnPuntoActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        isDigit = true;
    firtexe = true;
    nowOperation="";
    simOperation =0;
    firtOperation = "";
     secondOperation = "";
    txtresultados.setText("");
    this.datos.setResultadoActual(0);
    }//GEN-LAST:event_btnClearActionPerformed

    private void btnCambioSignoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCambioSignoActionPerformed
         try
        {
            String lastOne,nActual,datoEli;
            nActual = String.valueOf(txtresultados.getText());
            datoEli = String.valueOf(nActual.charAt(0));
            if(simOperation == 0)
            {
                if(datoEli.equals("-"))
                {
                
                }
                else
                {
                    nActual = "-"+nActual;
                    firtOperation = nActual;
                txtresultados.setText(nActual);
                }  
            }
            else
            {
                
            }
            /*if (nActual.contains("x")) {
                if (this.secondOperation.contains("-")) {
                    this.secondOperation = this.secondOperation.substring(1);
                    this.secondOperation = "-"+this.secondOperation;
                }
                else
                {
                    
                }
            String[] sep = nActual.split("x");
            
            if(this.simOperation != 0)
            {
                
            }
            else
            {
                
            }}*/
        }
        catch(Exception e)
        {
            
        }
    }//GEN-LAST:event_btnCambioSignoActionPerformed

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
            java.util.logging.Logger.getLogger(FrmEjer5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmEjer5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmEjer5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmEjer5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmEjer5().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn0;
    private javax.swing.JButton btn1;
    private javax.swing.JButton btn2;
    private javax.swing.JButton btn3;
    private javax.swing.JButton btn4;
    private javax.swing.JButton btn5;
    private javax.swing.JButton btn6;
    private javax.swing.JButton btn7;
    private javax.swing.JButton btn8;
    private javax.swing.JButton btn9;
    private javax.swing.JButton btnCambioSigno;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnEntre;
    private javax.swing.JButton btnIgual;
    private javax.swing.JButton btnMenos;
    private javax.swing.JButton btnPor;
    private javax.swing.JButton btnPunto;
    private javax.swing.JButton jButton20;
    private javax.swing.JTextField txtresultados;
    // End of variables declaration//GEN-END:variables
}
