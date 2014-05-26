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
public class Avion implements Volador{

    @Override
    public String despegar() {
return "El Avión ha despegado ";
    }

    @Override
     public String aterrizar(int metros) {
     return "El Avión ha aerrizado con un coste de "+ (0.85*metros)+ "  €";
    }
    
    
}
