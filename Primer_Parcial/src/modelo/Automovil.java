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
public class Automovil extends Terrestre{
private String no_puertas,velocidad,no_ruedas;

    public Automovil(){}
    public Automovil(String no_puertas, String velocidad, String no_ruedas, String matricula, String motor, String placa, String color, String precio, String Fecha_incio_actividad) {
        super(matricula, motor, placa, color, precio, Fecha_incio_actividad);
        this.no_puertas = no_puertas;
        this.velocidad = velocidad;
        this.no_ruedas = no_ruedas;
    }

    public String getNo_puertas() {
        return no_puertas;
    }

    public void setNo_puertas(String no_puertas) {
        this.no_puertas = no_puertas;
    }

    public String getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(String velocidad) {
        this.velocidad = velocidad;
    }

    public String getNo_ruedas() {
        return no_ruedas;
    }

    public void setNo_ruedas(String no_ruedas) {
        this.no_ruedas = no_ruedas;
    }

     @Override
    public void agregar (){
    System.out.println("Placa: " + getPlaca());
    System.out.println("Color: " + getColor());
    System.out.println("Matricula: " + getMatricula());
    System.out.println("Motor: " + getMotor());
    System.out.println("Precio: " + getPrecio());
    System.out.println("No Puertas: " + this.getNo_puertas());
    System.out.println("Velocidad: " + getVelocidad());
    System.out.println("No Ruedas: " + this.getNo_ruedas());
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
