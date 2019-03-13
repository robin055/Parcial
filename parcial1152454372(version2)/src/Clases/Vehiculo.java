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
    private String marca;
    private double valorpeaje;

    public Vehiculo(String placa, String marca, double valorpeaje) {
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

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getValorpeaje() {
        return valorpeaje;
    }

    public void setValorpeaje(double valorpeaje) {
        this.valorpeaje = valorpeaje;
    }

    @Override
    public String toString() {
        return "Vehiculo{" + "placa=" + placa + ", marca=" + marca + ", valorpeaje=" + valorpeaje + '}';
    }

   
    
}
