/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EquipoFutbol;

/**
 *
 * @author Usuario
 */
public abstract class Persona {
    protected String nombre;
    protected String apeliidos;
    protected int edad;

    public Persona(String nombre, String apeliidos, int edad) {
        this.nombre = nombre;
        this.apeliidos = apeliidos;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApeliidos() {
        return apeliidos;
    }

    public void setApeliidos(String apeliidos) {
        this.apeliidos = apeliidos;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    public void viajar(){
        System.out.println("Viajar");
    }
    
    public abstract void partidoFutbol();
    
    public abstract void entrenamiento();
    
}
