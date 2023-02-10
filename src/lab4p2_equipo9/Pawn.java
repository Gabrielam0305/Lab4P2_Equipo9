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
    private boolean fMove = true;
    
    public Pawn() {
        super();
    }

    public Pawn(int x, int y, String color, String Representacion, boolean valido) {
        super(x, y, color, Representacion, valido);
    }

    
    
    public int getX() {
        return x;
    }

    public void setX(int x) {
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
    
    
    public void movimiento(){
        if 
        if(fMove==true){
            //poder mover hasta 2 casillas
        }else{
            //el peon se mueve normalmente
        }
    }
}
