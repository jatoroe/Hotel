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
public class Persona {
    private String Nombre;
    private String Apellido;
    private long Cedula;
    private long Telefono;
    
    public Persona (String n, String a, long c, long t) {
        this.Apellido = a;
        this.Cedula = c;
        this.Nombre = n;
        this.Telefono = t;
    
}
    public String getNombre(){
        return Nombre;
    }
    public String getApellido(){
        return Apellido;
    }
    public long getCedula(){
        return Cedula;
    }
    public long getTelefono(){
        return Telefono;
    }    
    
    
}
