package ej5;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		
		Scanner lector = new Scanner(System.in);
		System.out.println("Dime un año para mostrar PIBs");
		short anoUsuario = lector.nextShort();
		
		System.out.println("Dime el pib de Espa�a en "+ anoUsuario + ":");
		long pibEspana = Integer.parseInt(lector.nextLine());
		System.out.println("Dime el pib de Francia en "+ anoUsuario + ":");
		long pibFrancia = Integer.parseInt(lector.nextLine());
		System.out.println("Dime el pib de Alemania en "+ anoUsuario + ":");
		long pibAlemania = Integer.parseInt(lector.nextLine());
		System.out.println("Dime el pib de Portugal en "+ anoUsuario + ":");
		long pibPortugal = Integer.parseInt(lector.nextLine());
		System.out.println("Dime el pib de Andorra en "+ anoUsuario + ":");
		long pibAndorra = Integer.parseInt(lector.nextLine());
		System.out.println("Dime el pib de Belgica en "+ anoUsuario + ":");
		long pibBelgica = Integer.parseInt(lector.nextLine());
		
		long pibMedio = (pibEspana + pibFrancia + pibAlemania + pibPortugal + pibAndorra + pibBelgica)/ (6);
		
		System.out.println("El PiB me dio de estos pais es :" +pibMedio);
		
		//PIB superior media
		if (pibMedio < pibEspana) {
			System.out.println("El pib de españa es superior a la media");
		}
		else { 
			System.out.println("El pib de españa no es superior a la media");
		};
		if (pibMedio < pibFrancia) {
			System.out.println("El pib de Francia es superior a la media");
		}
		else { 
			System.out.println("El pib de Francia no es superior a la media");
		};
		if (pibMedio < pibAlemania) {
			System.out.println("El pib de alemania es superior a la media");
		}
		else { 
			System.out.println("El pib de alemania no es superior a la media");
		};
		if (pibMedio < pibPortugal) {
			System.out.println("El pib de portugal es superior a la media");
		}
		else { 
			System.out.println("El pib de portugal no es superior a la media");
		};
		if (pibMedio < pibAndorra) {
			System.out.println("El pib de andorra es superior a la media");
		}
		else { 
			System.out.println("El pib de andorra no es superior a la media");
		};
		if (pibMedio < pibBelgica) {
			System.out.println("El pib de belgica es superior a la media");
		}
		else { 
			System.out.println("El pib de belgica no es superior a la media");
		};
		
		
		//Comparativa PIB
		long pibEPA = pibEspana + pibPortugal + pibAndorra;
		long pibFA = pibFrancia + pibAlemania;
		if (pibEPA > pibFA) {
			System.out.println("El PIB combinado de España, Portugal y Andorra es mayor que el de Francia y Alemania combinados.");
		}
		else {
			System.out.println("El PIB combinado de Alemania y Francia es mayor que el de España, Portugal y Andorra combinados.");
		};
		
		if (pibBelgica > pibEspana || (pibPortugal > pibBelgica && pibAlemania >pibFrancia)) {
			
			System.out.println("Verdadero");
			
		}
		else {
			System.out.println("Flaso");
		};
	}

}
