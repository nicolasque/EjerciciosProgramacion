package ej10;
import java.util.Scanner;

public class ej10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		byte numeroPisos = 0;
		byte numeroCasas = 0;
		String modeloPiso = "|------|";
		
		System.out.println("¿Cuantos pisos quieres que tenga el edificio?");
		numeroPisos = Byte.parseByte(sc.nextLine());
		System.out.println("¿Cuantas casas quieres que halla por piso?");
		numeroCasas =Byte.parseByte(sc.nextLine());
		
		System.out.println("|----------------------|\n"
				         + "|  13 Rue del Percebe  |\n"
				         + "|----------------------|\n");
		
		
		for(byte j =0; j != numeroPisos; j++) {
            String strinPisos = new String(new char[numeroCasas]).replace("\0", "|------|");

			System.out.println(strinPisos);
		
		for (byte i = 0; i!= 2; i++) {
		    String strinCasas = new String(new char[numeroCasas]).replace("\0", "|      |");

			System.out.println(strinCasas);
			
		}
		
		}
		
	}

}
