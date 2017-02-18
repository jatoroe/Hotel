/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotel;

import java.util.Scanner;
/**
 *
 * @author Estudiante
 */
public class Piso {
   Scanner capacity = new Scanner(System.in);
   private Habitacion[] hab;
   private int cod;
   
   public Piso (int h, int c){
       this.hab = new Habitacion[h];
       this.cod = c;
       for (int i = 0; i < h; i++){
           System.out.println("Ingrese la capacidad de habitantes de la abitación numero" + cod + "0"+(i+1));
           int cap = capacity.nextInt();
           String codigo = cod + "0" + (i+1);
           hab[i] = new Habitacion(cap, cod);
       }
   }
           
    
}
