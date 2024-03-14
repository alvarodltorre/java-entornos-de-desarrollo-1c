package models;

import java.util.*;


public class Persona {

	private String dni;
    private String nombre;
    private String apellidos;
    private int edad;
	
    public Persona() {
    }


    /**
     * @param dni 
     * @param nombre 
     * @param apellidos 
     * @param edad
     */
    public Persona(String dni, String nombre, String apellidos, int edad) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
    }

    /**
     * Modifica el DNI de la persona.
     * @param dni
     */
    public void setDni(String dni) {
        this.dni = dni;
    }

    /**
     * Devuelve el DNI de la persona.
     * @return
     */
    public String getDni() {
        return dni;
    }

    /**
     * Modifica el nombre de la persona.
     * @param nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Devuelve el nombre de la persona.
     * @return
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Modifica los apellidos de la persona.
     * @param apellidos
     */
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    /**
     * Devuelve los apellidos de la persona.
     * @return
     */
    public String getApellidos() {
        return apellidos;
    }

    /**
     * Modifica la edad de la persona.
     * @param edad
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }

    /**
     * Devuelve la edad de la persona.
     * @return
     */
    public int getEdad() {
        return edad;
    }


}