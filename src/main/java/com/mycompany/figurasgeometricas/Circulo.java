
package com.mycompany.figurasgeometricas;

/**
 *
 * @author User
 */
 class Circulo extends FiguraGeometrica{
    private double radio;

    public Circulo(String nombre, String color, double radio) {
        super(nombre, color);
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        if (radio > 0) {
            this.radio = radio;
        } else {
            System.out.println("El radio debe ser mayor a 0");
        }
    }

    @Override
    public double obtenerArea() {
        return Math.PI * radio * radio;
    }

    @Override
    public double obtenerPerimetro() {
        return Math.PI * 2 * radio;
    }
}
