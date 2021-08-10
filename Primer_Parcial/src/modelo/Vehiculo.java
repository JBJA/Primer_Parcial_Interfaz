/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
// Primer Parcial
package modelo;

/**
 *
 * @author Juárez Arevalo
 */
public class Vehiculo {
private String placa,color,precio,Fecha_incio_actividad;

    public Vehiculo(){}
    public Vehiculo(String placa, String color, String precio, String Fecha_incio_actividad) {
        this.placa = placa;
        this.color = color;
        this.precio = precio;
        this.Fecha_incio_actividad = Fecha_incio_actividad;
    }
    
    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }

    public String getFecha_incio_actividad() {
        return Fecha_incio_actividad;
    }

    public void setFecha_incio_actividad(String Fecha_incio_actividad) {
        this.Fecha_incio_actividad = Fecha_incio_actividad;
    }
    
    public void agregar(){}
    public void eliminar(){}
    public void modificar(){}
    
}
