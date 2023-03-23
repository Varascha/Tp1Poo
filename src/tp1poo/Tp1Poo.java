/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp1poo;

/**
 *
 * @author Alumno
 */
public class Tp1Poo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        cuatriciclos a = new cuatriciclos("honda",(short)250,(short)700);
        a.saludar();
        a.mostrarInformacion();
        
        a.setCilindrada((short)300);
        a.mostrarInformacion();
        
    }
    
}
