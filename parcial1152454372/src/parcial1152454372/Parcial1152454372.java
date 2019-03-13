/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcial1152454372;

import Clases.Automovil;
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
        
        
        String opc = "";
        int tri = 0;

        while (!"s".equalsIgnoreCase(opc)) {
            System.out.println("=============================================");
            System.out.println("PROGRAMA Vehiculo");
            System.out.println("=============================================");
            System.out.println("a) Moto");
            System.out.println("b) automovil");
            System.out.println("c) Camion de un eje");
            System.out.println("d) Camion de dos ejes");
            
            System.out.println("m) Visualizar ");
            
            System.out.println("s) Salir");
            System.out.println("=============================================");
            opc = scan.nextLine();

            if ("a".equalsIgnoreCase(opc)) {
                System.out.println("ingrese la placa");
                tri = scan.nextInt();
                System.out.println("ingrese la marca");
                tri = scan.nextInt();
                System.out.println("ingrese el valor peaje"); 
                tri = scan.nextInt();

                Vehiculo[] vecTri = new Vehiculo[tri];
                
                for (int i = 0; i < vecTri.length; i++) {
                    System.out.println("ingrese la placa");
                    float placa = scan.nextFloat();
                    System.out.println("ingrese la marca");
                    Float marca = scan.nextFloat();
                    System.out.println("ingrese la valor peaje");
                    float valorpeaje = scan.nextFloat();
                    vecTri[i] = new Vehiculo(placa,marca,valorpeaje);
                    i++;
                    

                }
                System.out.println();

            } else if ("b".equalsIgnoreCase(opc)) {
              System.out.println("ingrese la placa");
                tri = scan.nextInt();
                System.out.println("ingrese la marca");
                tri = scan.nextInt();
                System.out.println("ingrese el valor peaje"); 
                tri = scan.nextInt();
            } else if ("c".equalsIgnoreCase(opc)) {
                
                System.out.println("ingrese la placa");
                tri = scan.nextInt();
                System.out.println("ingrese la marca");
                tri = scan.nextInt();
                System.out.println("ingrese el valor peaje"); 
                tri = scan.nextInt();

                } else if ("d".equalsIgnoreCase(opc)) {
                System.out.println("ingrese la placa");
                tri = scan.nextInt();
                System.out.println("ingrese la marca");
                tri = scan.nextInt();
                System.out.println("ingrese el valor peaje"); 
                tri = scan.nextInt();
                    
            } else if ("m".equalsIgnoreCase(opc)) {
                System.out.println(Automovil.ToString());
                System.out.println(Moto.ToString());
                System.out.println(CamionDeDosEjes.ToString());
                System.out.println(CamionDeUnEje.ToString());
                 
                
            }//fin del menu

        }//fin del while

    }

}
       
        
    

 
    
    

