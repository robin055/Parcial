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
public class Moto extends Vehiculo {
    private int numLlantas;

    public Moto(int numLlantas, String placa, String marca, double valorpeaje) {
        super(placa, marca, valorpeaje);
        this.numLlantas = numLlantas;
    }

    public int getNumLlantas() {
        return numLlantas;
    }

    public void setNumLlantas(int numLlantas) {
        this.numLlantas = numLlantas;
    }

    @Override
    public String toString() {
        return "Moto{" + "numLlantas=" + numLlantas + "placa="  + super.getPlaca() +", marca=" + super.getMarca() + ", valorpeaje=" + super.getValorpeaje();
    }
    
  
    
}

    
