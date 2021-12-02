package ej13;
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
		preguntaOjosCara(respuestaOjos,respuestaBoca);
		
		//Parte 2 cuantas caras imprimir
		int numeroCaras = 0;
		while (numeroCaras <= 0) {
		System.out.println("Cuantas veces quieres que imprima una cara:");
		numeroCaras = sc.nextInt();
		};
        
		for (int i = 0 ; i<numeroCaras; i++) {
			preguntaOjosCara(respuestaOjos,respuestaBoca);		}
		
	}

	public static String preguntaOjosCara(char respuestaOjos, char respuestaBoca) {
	
		
		//Impresion cara de usuario 
		String caraOriginal = 
				  "_______ \n"
				+ "\\o   o/ \n"
				+ " \\ ~ / \n"
				+ "  ''' ";
		return caraOriginal.replace('o' , respuestaOjos).replace('~', respuestaBoca);
		
		
		//Tengo que cambiar este sysout
		//System.out.println(caraUsuario);


	}
}
