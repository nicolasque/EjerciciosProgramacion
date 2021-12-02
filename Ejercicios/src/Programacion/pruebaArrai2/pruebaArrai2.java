package Programacion.pruebaArrai2;

import java.util.Random;

public class pruebaArrai2 {
	public static void main(String[] args) {
		System.out.println(nombreAleatorio(false));
	}
	
	/**
	 * Función que da un nombre aleatorio de hombre o mujer en Castellano
	 * @param esHombre boolean que si es true la función devolverá u nombre de hombre, si es false, devolverá un nombre de mujer
	 * @return String con un nombre en castellano aleatorio, respetando el género elegido
	 */
	public static String nombreAleatorio(boolean esHombre) {
		Random r=new Random();
		if(esHombre){
			String[]  nombresPosibles={"Juanjo","Guille","Alex","Alexis","Antonio",
				"Cristian","Hugo","Gonzalo","Marcos","Jose Luis",
				"Joaquin","Jenaro","Miguel","Juanmi","Jose","Nico",
				"Eric","Jero","Juan","Victor","Agustín",
				"David","Ángel","Cermuzio","Ambrosio","Canduterio"};
			return nombresPosibles[r.nextInt(nombresPosibles.length)];
		}else {
			String[]  nombresPosibles={"Leti","Sandra","Pescueza",
					"Lola","María","Marta",
					"Laura","Alba","Sonia","Rocío"};
				return nombresPosibles[r.nextInt(nombresPosibles.length)];
		}
	}
}
