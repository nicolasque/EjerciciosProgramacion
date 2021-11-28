package Programacion.prueba;
import java.util.Scanner;
public class PruebaStaticVoid {

	public static void main(String[] args) {
		recursivilidad();

	}
	public static void recursivilidad() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Comprendes la recursividad ? (s/n)");
		if(sc.nextLine().toLowerCase().charAt(0) == 's'){
			System.out.println("Ole tu");
		}
		else {
			recursivilidad();
		}
		}
		
	}


