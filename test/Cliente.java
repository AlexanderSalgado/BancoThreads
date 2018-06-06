/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author cmundo
 */
public class Cliente {

	private String nombre;
	private int[] Transaccion;

	// Constructor, getter y setter

    public Cliente(String nombre, int[] Transaccion) {
        this.nombre = nombre;
        this.Transaccion = Transaccion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int[] getTransaccion() {
        return Transaccion;
    }

    public void setTransaccion(int[] Transaccion) {
        this.Transaccion = Transaccion;
    }
    

}