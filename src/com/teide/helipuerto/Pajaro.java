/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.teide.helipuerto;

/**
 *
 * @author antonio
 */
public class Pajaro implements Volador {

    @Override
    public String despegar() {
        return "El pájaro está despegando";
    }

    @Override
    public String aterrizar(int metros) {
        return "El pájaro ha aterrizado con un consumo de "+(metros*0.02)+ " €";
    }
    
}
