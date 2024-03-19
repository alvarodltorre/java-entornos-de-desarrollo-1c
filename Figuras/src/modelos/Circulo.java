package modelos;
import java.util.*;

/**
 * 
 */
public class Circulo {

    /**
     * 
     */
    private double radio;

    /**
     * Constructor por defecto.
     */
    public Circulo() {
        this.radio=1;
    }

    /**
     * @param radio
     */
    public Circulo(double radio) {
    	this.radio=radio;
    }

    /**
     * Modifica la base del circulo.
     * @param radio
     */
    public void setRadio(double radio) {
    	this.radio=radio;
    }

    /**
     * Devuelve la base del circulo.
     * @return
     */
    public double getRadio() {
        return radio;
    }

    /**
     * Metodo que muestra el area del circulo.
     * @return
     */
    public double mostrarArea() {
        return Math.PI*(radio*radio);
    }

    /**
     * Metodo que muestra el perimetro del circulo.
     * @return
     */
    public double mostrarPerimetro() {
        return Math.PI*(radio*2);
    }

}