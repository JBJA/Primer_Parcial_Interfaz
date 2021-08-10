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
public class Avion extends Aereo{
    private String tipo;

    public Avion(){}
    public Avion(String tipo, String cantidad_motores, String capacidad, String velocidad, String placa, String color, String precio, String Fecha_incio_actividad) {
        super(cantidad_motores, capacidad, velocidad, placa, color, precio, Fecha_incio_actividad);
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    @Override
    public void agregar (){
    System.out.println("Placa: " + getPlaca());
    System.out.println("Tipo: " + getTipo());
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
