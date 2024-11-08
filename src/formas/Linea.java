/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package formas;

/**
 *
 * @author 14-cf2074
 */
public class Linea extends Formas {
    private final double largo;

    public Linea(String color, double largo) {
        super(color);
        this.largo = largo;
    }

    /**
     *
     */
    @Override
    public void dibujar() {
        System.out.println("Dibujando una Línea de color " + color);
    }
}

