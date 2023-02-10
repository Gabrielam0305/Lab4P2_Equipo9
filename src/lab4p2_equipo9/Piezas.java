/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab4p2_equipo9;

/**
 *
 * @author luism
 */
public abstract class Piezas {
    protected int y;
    protected String x;
    protected String color;
    protected String Representacion;

    public Piezas(int y, String x, String color, String Representacion) {
        this.y = y;
        this.x = x;
        this.color = color;
        this.Representacion = Representacion;
    }
    

   

    

    public Piezas() {
    }

    public String getX() {
        return x;
    }

    public void setX(String x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getRepresentacion() {
        return Representacion;
    }

    public void setRepresentacion(String Representacion) {
        this.Representacion = Representacion;
    }
    
    
    
    public abstract void movimiento();
}
