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
public class Terrestre extends Vehiculo{
        private String matricula,motor;

    public Terrestre(){}
    public Terrestre(String matricula, String motor, String placa, String color, String precio, String Fecha_incio_actividad) {
        super(placa, color, precio, Fecha_incio_actividad);
        this.matricula = matricula;
        this.motor = motor;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getMotor() {
        return motor;
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }

    @Override
    public void agregar (){
    System.out.println("Placa: " + getPlaca());
    System.out.println("Color: " + getColor());
    System.out.println("Matricula: " + getMatricula());
    System.out.println("Motor: " + getMotor());
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
