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
public class Aereo extends Vehiculo{
    private String cantidad_motores,capacidad,velocidad;

    public Aereo(){}
    public Aereo(String cantidad_motores, String capacidad, String velocidad, String placa, String color, String precio, String Fecha_incio_actividad) {
        super(placa, color, precio, Fecha_incio_actividad);
        this.cantidad_motores = cantidad_motores;
        this.capacidad = capacidad;
        this.velocidad = velocidad;
    }
    
    public String getCantidad_motores() {
        return cantidad_motores;
    }

    public void setCantidad_motores(String cantidad_motores) {
        this.cantidad_motores = cantidad_motores;
    }

    public String getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(String capacidad) {
        this.capacidad = capacidad;
    }

    public String getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(String velocidad) {
        this.velocidad = velocidad;
    }
    
    @Override
    public void agregar (){
    System.out.println("Placa: " + getPlaca());
    System.out.println("Color: " + getColor());
    System.out.println("Cantidad Motores: " + this.getCantidad_motores());
    System.out.println("Capacidad: " + getCapacidad());
    System.out.println("Velocidad: " + getVelocidad());
    System.out.println("Precio: " + getPrecio());   
    System.out.println("Fecha Inidio Actividad: " + this.getFecha_incio_actividad());
    System.out.println("_______________________________________________________________");
    }
    
    @Override
    public void modificar (){
    System.out.println("Metodo Modificar");
    }
    
    @Override
    public void eliminar (){
    System.out.println("Metodo Eliminar");
    }
    
}
