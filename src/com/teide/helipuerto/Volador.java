/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.teide.helipuerto;

/**
 *
 * @author DAM
 */
public interface Volador {
    
    public abstract String despegar();
    //una interfaz no se pueden realizar metodos , solo puden realizar metodos abstractos .
    public abstract String aterrizar(int metros);
    
    
}
