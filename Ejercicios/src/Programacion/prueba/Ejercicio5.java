package Programacion.prueba;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		
		Scanner lector = new Scanner(System.in);
		System.out.println("Dime un año para mostrar PIBs");
		String anoUsuario = lector.nextLine();
		
		System.out.println("Dime el pib de Espa�a en "+ anoUsuario + ":");
		int pibEspana = Integer.parseInt(lector.nextLine());
		System.out.println("Dime el pib de Francia en "+ anoUsuario + ":");
		int pibFrancia = Integer.parseInt(lector.nextLine());
		System.out.println("Dime el pib de Alemania en "+ anoUsuario + ":");
		int pibAlemania = Integer.parseInt(lector.nextLine());
		System.out.println("Dime el pib de Portugal en "+ anoUsuario + ":");
		int pibPortugal = Integer.parseInt(lector.nextLine());
		System.out.println("Dime el pib de Andorra en "+ anoUsuario + ":");
		int pibAndorra = Integer.parseInt(lector.nextLine());
		System.out.println("Dime el pib de Belgica en "+ anoUsuario + ":");
		int pibBelgica = Integer.parseInt(lector.nextLine());
		
		int pibMedio = (pibEspana + pibFrancia + pibAlemania + pibPortugal + pibAndorra + pibBelgica)/ (6);
		System.out.println("El PiB me dio de estos pais es :" +pibMedio);
	}

}
