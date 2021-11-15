package Encriptar;

import java.util.Scanner;
import java.util.Random;

public class Encriptar {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Dime el nº con el que quieres cifrar"
				+ "(entre 3000 y 10000)");
		short numeroCodificacion=Short.parseShort(sc.nextLine());
		
		while(numeroCodificacion<3000||numeroCodificacion>10000) {
			System.out.println("Te he dicho entre 3000 y 10000");
			numeroCodificacion=Short.parseShort(sc.nextLine());
		}

		Random generadorAleatorios=new Random();
		String mensaje;
		do {
				System.out.println("Escribe un mensaje a crifrar");
		 mensaje=sc.nextLine();	
		}while(mensaje.length()<10||mensaje.length()>100); 

		
		String mensajeCifrado="";
		System.out.println("Cifrando Mensaje...");
		for(short i=0;i<mensaje.length();i++) {
			mensajeCifrado+=""+(char)(mensaje.charAt(i)+numeroCodificacion)+(char)(generadorAleatorios.nextInt(10000)+numeroCodificacion);
		}
		System.out.println(mensajeCifrado);
		System.out.println("\nDescifrando mensaje...");
		for(short i=0;i<mensajeCifrado.length();i+=2) {
			System.out.print((char)(mensajeCifrado.charAt(i)-numeroCodificacion));
		}
	}

}
