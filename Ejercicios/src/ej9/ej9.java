package ej9;
import java.util.Scanner;

public class ej9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		byte numeroParticipantes = 0;
		
		while (numeroParticipantes < 2 || numeroParticipantes>10 ) {
		System.out.println("Dime el numero de personas para hacer la encuesta (entre 2 y 10): ");
		
		numeroParticipantes = sc.nextByte();
		};
		int contH = 0;
		int contM = 0;
		String nombreLargo = "";
		int alturaSumada = 0;
		int diasSumados = 0;
		String nombreMasLargo = "";

		for(byte i = 0;i!=numeroParticipantes;i++) {
			//Datos
			System.out.println("Dime tu nomre:");
			String respuestaNombre = sc.next();
			
			System.out.println("Dime tu año de nacimiento:");
			int respuestaAnoNacimiento = sc.nextInt();
			
			System.out.println("Dime tu genero (h/m):");
			char respuestaGenero = sc.next().charAt(0);
			
			System.out.println("Dime tu altura (en m):");
			float respuestaAltura = sc.nextFloat();
			
			
			//Siglo de nacimiento
			System.out.println(respuestaNombre +" ha nacido en el siglo: " + ((respuestaAnoNacimiento/100)+1));
			
			//Horas de vida
			int diasVividos = ((2021 - respuestaAnoNacimiento)*365);
			System.out.println(respuestaNombre + " ha vivido: "+ (diasVividos*24) + " horas");
			//Dias vividos
			System.out.println(respuestaNombre + "ha vivido:"+ diasVividos + " dias");
			
			//Contador hombre mujeres

			if (respuestaGenero == 'h') {
				contH = contH + 1; }
			else {
				contM = contM + 1;
			};
			//Nombre mas largo 
			int largoNombre = respuestaNombre.length();
			if (largoNombre> nombreLargo.length()) {
			 nombreLargo = respuestaNombre;
		}
			alturaSumada = (int) (respuestaAltura+ alturaSumada);
			diasSumados = diasVividos + diasSumados;
		
	}
		System.out.println("El nombre mas largo es el de:" + nombreLargo);
		
		System.out.println("\nHay " + contH + " hombres y " + contM + " mujeres\n ");
		
		//Altura media
		System.out.println("La altura media de los 3 es de: " + (((alturaSumada/numeroParticipantes))*100) + "cm");
		
		//Dias promedio
				System.out.println("De promedio han vivido " + ((diasSumados)/numeroParticipantes) + "Dias.");
			
		
	}

	}
