
import java.util.*;

/**
 * 
 */
public class Rectangulo {

    /**
     * Default constructor
     */
    public Rectangulo() {
    }

    /**
     * 
     */
    private int base;

    /**
     * 
     */
    private int altura;

    /**
     * Constructor por defecto.
     * @param base 
     * @param altura
     */
    public Rectangulo() {
        this.base = 1;
        this.altura = 1;
    }

    /**
     * Constructor por defecto = 1..
     * @param base 
     * @param altura
     */
    public Rectangulo(int base, int altura) {
    	this.base = base;
        this.altura = altura;
    }

    /**
     * Modifica la base del rectangulo.
     * @param base
     */
    public void setBase(int base) {
    	this.base = base;
    }

    /**
     * Devuelve la base del rectangulo.
     * @return
     */
    public int getBase() {
        return this.base;
    }

    /**
     * Modifica la altura de la persona.
     * @param altura
     */
    public void setAltura(int altura) {
        this.altura = altura;
    }

    /**
     * Devuelve la altura del rectangulo.
     * @return
     */
    public int getAltura() {
        return this.altura;
    }

    /**
     * Metodo que muestra el area del rectangulo.
     * @return
     */
    public int mostrarArea() {
        return this.base*this.altura;
    }

    /**
     * Metodo que muestra el perimetro del rectangulo.
     * @return
     */
    public int mostrarPerimetro() {
        return this.base+this.base+this.altura+this.altura;
    }

}