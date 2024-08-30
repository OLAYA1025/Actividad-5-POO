/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Figuras;
import java.math.*;
/**
 *
 * @author jeron
 */
public class Esfera extends FigurasGeometricas {
    private double Radio;

    public Esfera(double Radio) {
        this.Radio = Radio;
        this.setVolumen(CalcularVolumen());
        this.setSuperficie(CalcularSuperficie());
    }
    
    protected double CalcularVolumen(){
        double volumen=(4/3)*Math.PI*Math.pow(Radio, 3);
        return volumen;
    }
    
    protected double CalcularSuperficie(){
        double superficie=4*Math.PI*Math.pow(Radio, 2);
        return superficie;
    }
    
    
}
