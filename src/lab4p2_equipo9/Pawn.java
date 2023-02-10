/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab4p2_equipo9;

/**
 *
 * @author luism
 */
public class Pawn extends Piezas{
    
    
    public Pawn() {
        super();
    }

    public Pawn(String x, String y, String color, String Representacion) {
        super(x, y, color, Representacion);
    }

    

    

    
    
    public String getX() {
        return x;
    }

    public void setX(String x) {
        this.x = x;
    }

    public String getY() {
        return y;
    }

    public void setY(String y) {
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
    
    
    public void movimiento(){
        
    }
}
