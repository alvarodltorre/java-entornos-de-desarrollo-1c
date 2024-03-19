
import java.util.*;

/**
 * 
 */
public class Triangulo {

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
     */
    public Triangulo() {
        this.base = 1;
        this.altura = 1;
    }

    /**
     * @param base 
     * @param altura
     */
    public Triangulo(int base, int altura) {
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
        return base;
    }

    /**
     * Modifica la altura de la triangulo.
     * @param altura
     */
    public void setAltura(int altura) {
        this.altura = altura;
    }

    /**
     * Devuelve la altura del triangulo.
     * @return
     */
    public int getAltura() {
        return altura;
    }

    /**
     * Metodo que muestra el area del triangulo.
     * @return
     */
    public double mostrarArea() {
        return (base*altura)/2;
    }

}