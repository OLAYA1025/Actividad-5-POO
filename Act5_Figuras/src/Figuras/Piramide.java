 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Figuras;

/**
 *
 * @author jeron
 */
public class Piramide extends FigurasGeometricas {
    private double Base;
    private double Altura;
    private double Apotema;

    public Piramide(double Base, double Altura, double Apotema) {
        this.Base = Base;
        this.Altura = Altura;
        this.Apotema = Apotema;
        this.setVolumen(CalcularVolumen());
        this.setSuperficie(CalcularSuperficie());
    }
    
    protected double CalcularVolumen(){
        double volumen = (Math.pow(Base, 2) * Altura) / 3;
        return volumen;
    }
    
    public double CalcularSuperficie() {
        double areaBase = Math.pow(Base, 2.0);
        double areaLado = 2.0 * Base * Apotema;
        return areaBase + areaLado;
}

    
}
