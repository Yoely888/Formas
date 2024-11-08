/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package formas;

/**
 *
 * @author 14-cf2074
 */

public class Circulo extends Formas {
    private final double radio;

    public Circulo(String color, double radio) {
        super(color);
        this.radio = radio;
    }

    public void calcularRadio() {
        System.out.println("El radio del círculo es: " + radio);
    }

    @Override
    public void dibujar() {
        System.out.println("Dibujando un Círculo de color " + color);
    }
}
