/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotel;

/**
 *
 * @author Estudiante
 */
public class Habitacion {
    private int Codigo;
    private int CantMaxima; 
    private int Price;
    
    
    public Habitacion (int c, int m,int pr, int mc){
        this.CantMaxima = mc;
        this.Codigo = c;
        this.Price = pr;
          
        
    }
}
