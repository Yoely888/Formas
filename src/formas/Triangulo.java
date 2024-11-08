/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package formas;

/**
 *
 * @author 14-cf2074
 */
public class Triangulo extends Formas {
    private final double base;
    private final double altura;

    public Triangulo(String color, double base, double altura) {
        super(color);
        this.base = base;
        this.altura = altura;
    }

    public void calcularArea() {
        double area = (base * altura) / 2;
        System.out.println("El área del triángulo es: " + area);
    }

    @Override
    public void dibujar() {
        System.out.println("Dibujando un Triángulo de color " + color);
    }
}