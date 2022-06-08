package classeExecutavel;

import model.Circulo;
import model.Retangulo;

public class classeExecutavel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Circulo circulo1 = new Circulo();
		circulo1.setRaio(1);
		System.out.println("Area do Disco: " + circulo1.calcularAreaDisco());
		System.out.println("Circunferencia: " + circulo1.calcularCircunferencia());
		System.out.println("Superficie: " + circulo1.calcularSuperficie());
		System.out.println("Volume: " + circulo1.calcularVolume());
		System.out.println("------------------------ " );
		
		Retangulo retangulo1 = new Retangulo();
		retangulo1.setArea(10);
		System.out.println("Retangulo " );

		System.out.println("Area : " + retangulo1.calcularArea(2, 4));
		System.out.println("Perimetro : " + retangulo1.calcularPerimetro(2, 4));
		

	}

}
