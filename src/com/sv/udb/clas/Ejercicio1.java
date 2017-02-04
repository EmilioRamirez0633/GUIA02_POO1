/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sv.udb.clas;

import javax.swing.JOptionPane;

/**
 *
 * @author Estudiante
 */
public class Ejercicio1 {
    private int numBase;
    private int numPote;

    public int getNumBase() {
        return numBase;
    }

    public void setNumBase(int numBase) {
        this.numBase = numBase;
    }

    public int getNumPote() {
        return numPote;
    }
    public void setNumPote(int numPote) {
        this.numPote = numPote;
    }
    public int getResultado()
    {
        int resp = 1;
        try {
            if(numPote == 0)
            {
                return 1;
            }
            for (int i = 1; i <= numPote; i++) {
                resp = this.multiplicar(resp, numBase);
            }
        } 
        catch (Exception e) {
            System.err.println("Error en ejercicio 1: " + e.getMessage());
        }
        return resp;
    }
    private int multiplicar(int num1, int num2)
    {
        int resp = 0;
        for (int i = 0; i < num1; i++) {
            resp += num2;
        }
        return resp;
    }
            
}
