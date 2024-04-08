package ar.edu.unju.fi.main;

import java.util.Scanner;
import ar.edu.unju.fi.model.Alumno;
import ar.edu.unju.fi.model.Materia;
import ar.edu.unju.fi.model.RegistroNota;

public class Main {
	public static void main(String[] args) {
		
		Alumno alumno = generarAlumno();
		registrarNotas(alumno, 1);
		
	}
	public static Alumno generarAlumno() {
		Alumno alumno = new Alumno();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Ingrese el legajo");
		Integer legajo = scanner.nextInt();
		System.out.println("Ingrese el apellido");
		String apellido = scanner.next();
		System.out.println("Ingrese el nombre");
		String nombre = scanner.next();
		
		alumno.setLegajo(legajo);
		alumno.setNombre(nombre);
		alumno.setApellido(apellido);
		System.out.println(alumno.toString());
		//11scanner.close();
		return alumno;
	}
	
	public static void registrarNotas(Alumno alumno, int numMaterias){
		Scanner scanner = new Scanner(System.in);
		
		while (numMaterias <= 4) {
			System.out.println("Ingrese el codigo de la materia");
			String codigoMateria = scanner.next();
			System.out.println("Ingrese el nombre de la materia");
			String nombreMateria = scanner.next();
			Materia materia = new Materia(codigoMateria, nombreMateria);
			
			System.out.println("Ingrese el codigo del registro de notas");
			String codigoNota = scanner.next();
			System.out.println("Ingrese la nota final");
			Float nota = scanner.nextFloat();
			RegistroNota registroNota = new RegistroNota(codigoNota, alumno, materia, nota);
			
			System.out.println(registroNota.toString());
			numMaterias++;
		}
		scanner.close();
	}
}
