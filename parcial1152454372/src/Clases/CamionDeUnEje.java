/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author Lenovo
 */
public class CamionDeUnEje extends Camion {
    
    public CamionDeUnEje(String placa, int marca, String valorpeaje) {
        super(placa, marca, valorpeaje);
    }

    @Override
    public String toString() {
        return "CamionDeUnEje{" + '}';
    }
    
}
