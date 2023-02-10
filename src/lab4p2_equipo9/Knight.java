/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab4p2_equipo9;

/**
 *
 * @author luism
 */
public class Knight extends Piezas{
    
    public Knight() {
        super();
    }

    public Knight(String x, String y, String color, String Representacion) {
        super(x, y, color, Representacion);
    }

    public String getY() {
        return y;
    }

    public void setY(String y) {
        this.y = y;
    }

    
    
    public String getX() {
        return x;
    }

    public void setX(String x) {
        this.x = x;
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
    
    @Override
    public void movimiento() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    
}
