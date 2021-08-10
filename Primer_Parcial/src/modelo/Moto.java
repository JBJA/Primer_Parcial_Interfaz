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
public class Moto extends Terrestre{
    private String cilindros,no_ruedas;

    public Moto(){}
    public Moto(String cilindros, String no_ruedas, String matricula, String motor, String placa, String color, String precio, String Fecha_incio_actividad) {
        super(matricula, motor, placa, color, precio, Fecha_incio_actividad);
        this.cilindros = cilindros;
        this.no_ruedas = no_ruedas;
    }

    public String getCilindros() {
        return cilindros;
    }

    public void setCilindros(String cilindros) {
        this.cilindros = cilindros;
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
    System.out.println("Cilindros: " + getCilindros());
    System.out.println("Precio: " + getPrecio());
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
