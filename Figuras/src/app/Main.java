package app; 
import modelos.Rectangulo;
public class Main {

	public static void main(String[] args) {
		// Creamos dos objetos
		
		Rectangulo rect1 = new Rectangulo();
		
		Rectangulo rect2 = new Rectangulo(6,4);
		
		// Prueba de los metodos getters y setters.
		
		rect1.setBase(4);
		
		rect1.setAltura(2);
		
		System.out.println(rect1.getBase());
		
		System.out.println(rect1.getAltura());
		
		
		rect2.setBase(10);
		
		rect2.setAltura(16);
		
		System.out.println(rect2.getBase());
		
		System.out.println(rect2.getAltura());
		
		
		System.out.println(rect1.mostrarArea());
		
		System.out.println(rect1.mostrarPerimetro());
		
		
		System.out.println(rect2.mostrarArea());
		
		System.out.println(rect2.mostrarPerimetro());
		
	}

}
