package app; 
import modelos.Rectangulo;
import modelos.Circulo;
import modelos.Triangulo;

public class Main {

	public static void main(String[] args) {
		// Creamos los objetos
		
		Rectangulo rect1 = new Rectangulo();
		
		Rectangulo rect2 = new Rectangulo(6,4);
		
		Circulo cir1 = new Circulo();
		
		Circulo cir2 = new Circulo(4.0);
		
		Triangulo tri1 = new Triangulo();
		
		Triangulo tri2 = new Triangulo(4,8);
		
		
		
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
		
		
		
		
		cir1.setRadio(10);
		
		System.out.println(cir1.getRadio());
		
		System.out.println(cir1.mostrarArea());
		
		System.out.println(cir1.mostrarPerimetro());
		
		
		
		cir2.setRadio(6);
		
		System.out.println(cir2.getRadio());
		
		System.out.println(cir2.mostrarArea());
		
		System.out.println(cir2.mostrarPerimetro());
		
		
		
		tri1.setBase(5);
		
		tri1.setAltura(10);
		
		
		tri2.setBase(7);
		
		tri2.setAltura(12);
		
		
		System.out.println(tri1.getBase());
		System.out.println(tri1.getAltura());
		
		System.out.println(tri2.getBase());
		System.out.println(tri2.getAltura());
		
		System.out.println(tri1.mostrarArea());
		System.out.println(tri2.mostrarArea());
		
		
		
		
		
	}

}
