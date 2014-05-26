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
public class Helicoptero implements Volador{

    @Override
    public String despegar() {
return "El Helicopterio ha despegado ";
    }

    @Override
     public String aterrizar(int metros) {
     return "El Helicopterio ha aterrizado con un coste de " + (0.95*metros)+ "  €";
    }
    
    
}
