/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab4p2_equipo9;

import java.util.ArrayList;

/**
 *
 * @author luism
 */
public class Rook extends Piezas{

    public Rook() {
        super();
    }

    public Rook(int x, int y, String color, String Representacion) {
        super(x, y, color, Representacion);
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

    @Override
    public boolean movimiento(Object[][] o, int f, int c, int f1, int c1) {
        if (color.equals("negro")) {
            if (o[f][c]=="P") {
            if (o[f1][c1]=="") {
                if ((y+2==c1)) {
                    if (x-1==f1||x+1==f1) {
                         return true;
                    }else{
                        return false;
                    }
                    
                }else{
                    return false;
                }
            }else{
                    return false;
                    
                
            }
        }else{
            return false;
        }
        }else{
        if (o[f][c]=="n") {
            if (o[f1][c1]=="") {
                if ((y-2==c1)) {
                    if (x-1==f1||x+1==f1) {
                         return true;
                    }else{
                        return false;
                    }
            }else{
                    return false;
                    
                
            }
        }else{
            return false;
        }
        }else{
            return false;
        }
    }
    }


    
    
    
    
    
}
