/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package formas;

/**
 *
 * @author 14-cf2074
 */

public abstract class Formas {
    protected String color;

    public Formas(String color) {
        this.color = color;
    }

    public void establecerColor(String color) {
        this.color = color;
    }

    public abstract void dibujar();
}