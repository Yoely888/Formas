/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package formas;

/**
 *
 * @author 14-cf2074
 */
public class Main {
    public static void main(String[] args) {
        Circulo circulo = new Circulo("Morado", 5);
        Linea linea = new Linea("Rosado", 10);
        Triangulo triangulo = new Triangulo("Verde", 4, 5); 
        Cuadrado cuadrado = new Cuadrado("Amarillo", 4);

        circulo.dibujar();
        circulo.calcularRadio();
        linea.dibujar();
        triangulo.dibujar();
        triangulo.calcularArea();
        cuadrado.dibujar();
        cuadrado.calcularArea();
    }
}
