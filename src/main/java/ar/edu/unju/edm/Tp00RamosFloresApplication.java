package ar.edu.unju.edm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import ar.edu.unju.edm.model.Calculadora;
import ar.edu.unju.edm.model.Estudiante;

@SpringBootApplication
public class Tp00RamosFloresApplication {

	public static void main(String[] args) {
		SpringApplication.run(Tp00RamosFloresApplication.class, args);
		
		String nombre = "Rafael";
		System.out.println("Hola EDM dice "+nombre+" y mi compañero "+darNombre());
		
		Estudiante unEstudiante = new Estudiante();
		unEstudiante.setDni("94623941");
		unEstudiante.setNombre("Rafael");
		
		System.out.println("Estudiante: "+unEstudiante.getNombre()+" \nDNI: "+unEstudiante.getDni());
		
		Calculadora unaCalculadora = new Calculadora();
		unaCalculadora.setN1(25);
		unaCalculadora.setN2(5);
		
		System.out.println("La Suma es: "+unaCalculadora.resolverSuma());
		System.out.println("La Resta es: "+unaCalculadora.resolverResta());
		System.out.println("La Multiplicacion es: "+unaCalculadora.resolverMultiplicacion());
		System.out.println("La potencia es: "+ unaCalculadora.resolverPotencia());
		System.out.println("La raiz es: "+ unaCalculadora.resolverRaiz());
		unaCalculadora.resolverDivision();
		
	}
	
	public static  String darNombre() {
		String nuevoNombre = "Facundo";
		return nuevoNombre;
	}

}
