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
public class Vehiculo {

   
    
    private String placa;
    private int marca;
    private String valorpeaje;

    public Vehiculo(String placa, int marca, String valorpeaje) {
        this.placa = placa;
        this.marca = marca;
        this.valorpeaje = valorpeaje;
    }

    

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public int getMarca() {
        return marca;
    }

    public void setMarca(int marca) {
        this.marca = marca;
    }

    public String getValorpeaje() {
        return valorpeaje;
    }

    public void setValorpeaje(String valorpeaje) {
        this.valorpeaje = valorpeaje;
    }
    
    @Override
    public String toString() {
        return "Vehiculo{" + "placa=" + placa + ", marca=" + marca + ", valorpeaje=" + valorpeaje + '}';
    }
 
    public static boolean ToString() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
  

    public Vehiculo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Vehiculo(float placa, float marca, float valorpeaje) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
