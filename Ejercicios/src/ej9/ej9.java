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
	}

}
