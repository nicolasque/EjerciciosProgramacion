package ej13;
import java.util.Random;
import java.util.Scanner;

public class ej13 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String caraOriginal = 
				  "_______ \n"
				+ "\\o   o/ \n"
				+ " \\ ~ / \n"
				+ "  ''' ";

		System.out.println(caraOriginal);
		System.out.println("Este es timi y hoy podras hacerle cirujia estetica");
		
		//pido los caracteres que sustituiran a la cara 

		System.out.println("Dime como un caracter con el que quieras sustituir los osjos:");
		char respuestaOjos = sc.next().charAt(0);
		
		System.out.println("Dime el caracter con el que quieres sustituir la boca:");
		char respuestaBoca = sc.next().charAt(0);
		System.out.println (respuestaOjosBoca(respuestaOjos,respuestaBoca));
		
		//Parte 2 cuantas caras imprimir
		long numeroCaras = 0;
		
		while (numeroCaras <= 0) {
		System.out.println("Cuantas veces quieres que imprima una cara:");
		numeroCaras = sc.nextLong();
		};
		
		System.out.println(caraOriginal);
		System.out.println("Este es timi y hoy podras hacerle cirujia estetica");
		
		//pido los caracteres que sustituiran a la cara 

		System.out.println("Dime como un caracter con el que quieras sustituir los osjos:");
		 respuestaOjos = sc.next().charAt(0);
		
		System.out.println("Dime el caracter con el que quieres sustituir la boca:");
		 respuestaBoca = sc.next().charAt(0);
		for (long i = 0 ; i<numeroCaras; i++) {
			System.out.println( respuestaOjosBoca(respuestaOjos,respuestaBoca));		}
		
		//generacion numero aleatorio 
		int min = 1;
		int max = 2;

		Random numeroRandom = new Random();

		int value = numeroRandom.nextInt(max + min);
		
		respuestaAleatoria(value);
		
	}

	public static String respuestaOjosBoca(char respuestaOjos, char respuestaBoca) {
	
		
		//Impresion cara de usuario 
		String caraOriginal = 
				  "_______ \n"
				+ "\\o   o/ \n"
				+ " \\ ~ / \n"
				+ "  ''' ";
		return caraOriginal.replace('o' , respuestaOjos).replace('~', respuestaBoca);

	};
	public static String respuestaAleatoria(int value) {
		String caraOriginal = 
				  "_______ \n"
				+ "\\x   x/ \n"
				+ " \\ ~ / \n"
				+ "  ''' ";
		
		
		if (value == 1) {
		return caraOriginal.replaceFirst("x", "u");
	
		}
		else 
			return caraOriginal;
	}


}
