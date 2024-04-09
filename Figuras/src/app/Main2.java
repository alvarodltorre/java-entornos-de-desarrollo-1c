package app;

import modelos.Circulo;
import modelos.Triangulo;


public class Main2 {

	public static void main(String[] args) {
		Triangulo tri1 = new Triangulo(1,2);

		double areaTriangulo = tri1.mostrarArea();
		
		System.out.println(areaTriangulo);
		
		tri1.setBase(2);
		
		areaTriangulo = tri1.mostrarArea();
		
		System.out.println(areaTriangulo);
		
		tri1.setBase(2);
		
		
		Circulo cir1 = new Circulo(2.0);
		
		double areaCirculo = cir1.mostrarArea();
		
		cir1.setRadio(3.0);
		
		double perimetroCirculo = cir1.mostrarPerimetro();
		
		System.out.println(perimetroCirculo);
		
	}

}
