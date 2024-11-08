/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package formas;

/**
 *
 * @author 14-cf2074
 */
public class Cuadrado extends Formas {
    private final double lado;

    public Cuadrado(String color, double lado) {
        super(color);
        this.lado = lado;
    }

    public void calcularArea() {
        double area = lado * lado;
        System.out.println("El área del cuadrado es: " + area);
    }

    @Override
    public void dibujar() {
        System.out.println("Dibujando un Cuadrado de color " + color);
    }
}