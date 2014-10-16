/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.controledelaudos.view.rn;

import java.awt.event.KeyEvent;

/**
 *
 * @author CMR
 */
public abstract class ControleDeCaracteres {
    
    
    
    
    
    public static void permitirSomenteTexto(KeyEvent evt){
        String caracteres = " ABCDEFGHIJLMNOPQRSTUVXZKYWÇabcdefghijlmnopqrstuvxzkywçúóáéãõàôÚÓÁÉÃÕÀÔ";
        if (!caracteres.contains(evt.getKeyChar() + "")) {
            evt.consume();
        }
    }
    
    public static void permitirSomenteNumeros(KeyEvent evt){
        String caracteres = "0123456789";
        if (!caracteres.contains(evt.getKeyChar() + "")) {
            evt.consume();
        }
    }
    
    
    
}
