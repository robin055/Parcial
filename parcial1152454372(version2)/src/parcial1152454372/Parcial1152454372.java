/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcial1152454372;

import Clases.Automovil;
import Clases.Camion;
import Clases.CamionDeDosEjes;
import Clases.CamionDeUnEje;
import Clases.Moto;
import Clases.Vehiculo;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class Parcial1152454372 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        
        ArrayList<Vehiculo> vehiculo = new ArrayList<Vehiculo>();
        vehiculo.add(new Automovil(5, "1452mhh", "toyota", 12.000));
        vehiculo.add(new Moto(5, "14hh", "honda", 2.000));
        vehiculo.add(new Camion(5, "14022hh", "honda", 22.000));
        
        System.out.println(vehiculo.toString());
    }
        
       

}
       
        
    

 
    
    

