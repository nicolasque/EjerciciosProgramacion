package Ej6;

import java.util.Scanner;

public class ej6 {

	public static void main(String[] args) {

		Scanner scaner = new Scanner(System.in);
		
		//Datos1
		System.out.println("Dime tu nomre:");
		String respuestaNombre1 = scaner.nextLine();
		
		System.out.println("Dime tu año de nacimiento:");
		int respuestaAnoNacimiento1 = scaner.nextInt();
		
		System.out.println("Dime tu genero (h/m):");
		char respuestaGenero1 = scaner.next().charAt(0);
		
		System.out.println("Dime tu altura (en m):");
		float respuestaAltura1 = scaner.nextFloat();
		
		
		//Datos2
		System.out.println("Dime tu nomre:");
		String respuestaNombre2 = scaner.nextLine();
		
		System.out.println("Dime tu año de nacimiento:");
		int respuestaAnoNacimiento2 = scaner.nextInt();
		
		System.out.println("Dime tu genero (h/m):");
		char respuestaGenero2 = scaner.next().charAt(0);
		
		System.out.println("Dime tu altura (en m):");
		float respuestaAltura2 = scaner.nextFloat();
		
		//Datos3
		System.out.println("Dime tu nomre:");
		String respuestaNombre3 = scaner.nextLine();
		
		System.out.println("Dime tu año de nacimiento:");
		int respuestaAnoNacimiento3 = scaner.nextInt();
		
		System.out.println("Dime tu genero (h/m):");
		char respuestaGenero3 = scaner.next().charAt(0);
		
		System.out.println("Dime tu altura (en m):");
		float respuestaAltura3 = scaner.nextFloat();
		
		//Altura media
		System.out.println("La altura media de los 3 es de: " + (((respuestaAltura1 + respuestaAltura2 + respuestaAltura3)/3 )+100) + "cm");
		
		//Siglo de nacimiento
		System.out.println("La primera persona ha nacido en el siglo: " + ((respuestaAnoNacimiento1/100)+1));
		System.out.println("La segunda persona ha nacido en el siglo: " + ((respuestaAnoNacimiento2/100)+1));
		System.out.println("La tercera persona ha nacido en el siglo: " + ((respuestaAnoNacimiento3/100)+1));
		
		
		//Contador hombre mujeres
		int contH = 0;
		int contM = 0;
		
		if (respuestaGenero1 == 'h') {
			contH = contH + 1; 
		}
		else {
			contM = contM + 1;
		};
		if (respuestaGenero2 == 'h') {
			contH = contH + 1; 
		}
		else {
			contM = contM + 1;
		};
		if (respuestaGenero3 == 'h') {
			contH = contH + 1; 
		}
		else {
			contM = contM + 1;
		};
		
		System.out.println("Hay" + contH + "hombres y " + contM + " mujeres");
		
		
		//Nombre mas largo 
		if (respuestaNombre1.length()> respuestaNombre2.length() && respuestaNombre1.length()> respuestaNombre3.length()) {
			System.out.println("El nombre mas largo es el de:" + respuestaNombre1);
		}
		else if (respuestaNombre2.length()> respuestaNombre1.length() && respuestaNombre2.length()> respuestaNombre3.length()) {
			System.out.println("El nombre mas largo es el de:" + respuestaNombre2);
		}
		else {
			System.out.println("El nombre mas largo es el de:" + respuestaNombre3);
		};
		
		//Horas de vida
		int diasVividos1 = ((2021 - respuestaAnoNacimiento1)*365);
		int diasVividos2 = ((2021 - respuestaAnoNacimiento1)*365);
		int diasVividos3 = ((2021 - respuestaAnoNacimiento1)*365);

		
	
		System.out.println(respuestaNombre1 + " ha vivido:"+ (diasVividos1*24) + "horas");
		System.out.println(respuestaNombre2 + " ha vivido:"+ (diasVividos2*24) + "horas");
		System.out.println(respuestaNombre3 + " ha vivido:"+ (diasVividos3*24) + "horas");
		
		//Dias vividos
		System.out.println(respuestaNombre1 + "\n\n ha vivido:"+ diasVividos1 + "dias");
		System.out.println(respuestaNombre2 + "\n\n ha vivido:"+ diasVividos2 + "dias");
		System.out.println(respuestaNombre3 + "\n\n ha vivido:"+ diasVividos3 + "dias");
		
		//Dias promedio
		System.out.println("De promedio han vivido " + ((diasVividos1+diasVividos2+diasVividos3)/3) + "Dias.");
	//Cambio
	
	
	}

}
