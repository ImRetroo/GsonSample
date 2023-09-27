package es.yorman.dad.maven.gson;

import java.util.Scanner;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Main {

	public static void main(String[] args) {
		//Instanciamos scanner + persona
		Scanner scan = new Scanner(System.in);
		Persona persona = new Persona();
		
		//Pedimos el nombre y apellidos por consola
		System.out.println("Por favor, introduzca su nombre:");
		persona.setNombre(scan.nextLine());
		
		System.out.println("Por favor, introduzca sus apellidos:");
		persona.setApellidos(scan.nextLine());

		//Pedimos la edad
		System.out.println("Por favor, introduzca su edad:");
		//Comprobamos que lo introducido sea un int
		try {
			persona.setEdad(scan.nextInt());
		} catch (Exception e) {
			//Cerramos el programa si no lo es.
			System.err.println("¡La edad debe ser un número!");
			System.exit(1);
		}		
		//Cerramos scanner
		scan.close();
		
		//Convertirmos la clase Persona a formato JSON e imprimimos por consola.
		Gson gson = new GsonBuilder().setPrettyPrinting().create();
		String json = gson.toJson(persona);
		System.out.println(json);
	}

}
