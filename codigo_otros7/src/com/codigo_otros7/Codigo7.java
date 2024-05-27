package com.codigo_otros7;

import java.util.HashMap; // se importa el HashMap
import java.util.Scanner; // se importa Scanner

public class Codigo7 { // se quita el acento
	public static void main(String[] args) { // se pone el main
		Scanner s = new Scanner(System.in); // se agrega el System.in
		HashMap<String, String> capitales = new HashMap<>(); //  se corrige "ca" por "capitales"
		// se cambian los parametros ya que los que recibe son Strings 
		
		capitales.put("Canadá", "Otawwa");
		capitales.put("Estados Unidos", "Washington DC");
		capitales.put("México", "México DF");
		capitales.put("Belice", "Belmopán");
		capitales.put("Costa rica", "San José");
		capitales.put("El Salvador", "San Salvador"); //falta agregar la otra parte del string
		capitales.put("Guatemala", "Ciudad de Guatemala");
		capitales.put("Honduras", "Tegucigalpa");
		capitales.put("Nicaragua", "Managua");
		capitales.put("Panamá", "Panamá");
		
		String c = ""; // está mal escrito string
		do { 
			System.out.println("Escribe el nombre de un país y te diré su capital: "); //se cambia in por out y se escribe "ln"
			c = s.nextLine(); // se cambia por nextLine para pedir al usuario 
		if (!c.equals("salir")) { // se cambia por equals 
			if (capitales.containsKey(c)) { // se agrega el Key para que te de los valores del HashMap
				System.out.println("La capital de " + c); //se escribe en consola con out y ln
				System.out.println(" es " + capitales.get(c)); // se cambia put por get para obtener las capitales del HashMap
			} else {
				System.out.print("No conozco la respuesta ");
				System.out.print("¿cuál es la capital de " + c + "?: ");
				String nuevaCapital = s.nextLine(); // se escribe un nuevo dato para preguntar por una nueva capital ya que si no encuentra la capital en nuestro HashMap la pregunta al usuario
				capitales.put(c, nuevaCapital);
				System.out.println("Gracias por enseñarme nuevas capitales");
			}
	    }
	 } while (!c.equals("salir")); //se corrige "wile" y se agrega el parentesis
	s.close(); //agrego el s close para cerrar el scanner 
  }
}
