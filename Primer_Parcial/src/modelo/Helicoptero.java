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
public class Helicoptero extends Aereo{
    private String no_elices,tipo;

    public Helicoptero(){}
    public Helicoptero(String no_elices, String tipo, String cantidad_motores, String capacidad, String velocidad, String placa, String color, String precio, String Fecha_incio_actividad) {
        super(cantidad_motores, capacidad, velocidad, placa, color, precio, Fecha_incio_actividad);
        this.no_elices = no_elices;
        this.tipo = tipo;
    }

    public String getNo_elices() {
        return no_elices;
    }

    public void setNo_elices(String no_elices) {
        this.no_elices = no_elices;
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
    System.out.println("No Elices: " + this.getNo_elices());
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
