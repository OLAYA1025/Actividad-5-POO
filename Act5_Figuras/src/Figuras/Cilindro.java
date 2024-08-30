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
public class Cilindro extends FigurasGeometricas {
    private double Radio;
    private double Altura;

    public Cilindro(double Radio, double Altura) {
        this.Radio = Radio;
        this.Altura = Altura;
        this.setVolumen(CalcularVolumen());
        this.setSuperficie(CalcularSuperficie());
    }
    
    protected double CalcularVolumen(){
       double volumen=Math.PI*Radio*Altura;
       return volumen;
    }
    
   
    protected double CalcularSuperficie(){
        double superficie=(2*Math.PI*Radio*Altura)+(Math.PI*Math.pow(Radio, 2));
        return superficie;
    }
}
