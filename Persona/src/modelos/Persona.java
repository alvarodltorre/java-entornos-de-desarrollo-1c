package modelos;

public class Persona {
	String nombre;
	String apellidos;
	int edad;
	
	
	/**
	 * Constructor de la clase Persona. Crea un objeto que representa a una persona.
	 * 
	 * @param nombre		El nombre de la Persona.
	 * @param apellidos 	Los apellidos de la Persona.
	 * @param edad 			La edad de la Persona. Debe estar entre 0 y 130.
	 * 
	 * @throws IllegalArgumentException
	 */
	public Persona(String nombre, String apellidos, int edad) {
		if (edad < 0 || edad > 130) {
			throw new IllegalArgumentException("La edad debe estar entre 0 y 130.");
		}
		this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
    }
	
	
	
	public String getNombre() {
		return this.nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getApellidos() {
		return this.nombre;
	}
	
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	
	public int getEdad() {
		return this.edad;
	}
	
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	/**
	 * Metodo mostrarEdad, el cual, muestra un mensaje dependiendo de la edad de la Persona.
	 * 
	 * @return Si la edad es menor a 18, devuelve "Menor de edad", si la edad esta entre 18 y 65, devuelve "Mayor de edad" y si la edad es mayor a 65, devuelve "Jubilado".
	 */
	public String mostrarEdad() {
		String frase;
		if (edad < 18) {
			frase = "Menor de edad";
		} else if (edad <= 65) {
			frase = "Mayor de edad";
		} else {
			frase = "Jubilado";
		}
		return frase;
	}
	
	
}
