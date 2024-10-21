
package com.mycompany.figurasgeometricas;

/**
 *
 * @author User
 */
 class Triangulo extends FiguraGeometrica {
    private double base;
    private double altura;

    public Triangulo(String nombre, String color, double base, double altura) {
        super(nombre, color);
        this.base = base;
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        if (base > 0) {
            this.base = base;
        } else {
            System.out.println("La base debe ser mayor a 0");
        }
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        if (altura > 0) {
            this.altura = altura;
        } else {
            System.out.println("La altura debe ser mayor a 0");
        }
    }

    @Override
    public double obtenerArea() {
        return (base * altura) / 2;
    }

    @Override
    public double obtenerPerimetro() {
        return base * 3;
    }
}
