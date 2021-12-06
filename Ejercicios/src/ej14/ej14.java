package ej14;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class ej14 {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);

        int primero;

        int segundo;

        System.out.println("Dime el primer número (menor que el segundo)");

        primero=Integer.parseInt(sc.nextLine());

        do{

            System.out.println("Dime el segundo número (mayor que el primero)");

            segundo=Integer.parseInt(sc.nextLine());

        }while(primero>=segundo);


       

        System.out.println("Bucle que imprime todos los números entre el primero y el segundo");

        for (int i = primero; i < segundo; i++) {

            System.out.print(i+"\t"); 

        }
        
        System.out.println( imprimirTodos(primero, segundo) + "\t");

        System.out.println("\nBucle que imprime los números entre el primero y el segundo que son múltiplos de 3");

        for (int i = primero; i < segundo; i++) {

            if(i%3==0){

                System.out.print(i+"\t");

            }

        }

       

        Random r=new Random();

        int ganador=primero+r.nextInt(segundo-primero);

        System.out.println("\nHe escogido un número ganador entre "+primero+" y "+segundo+". Dime números hasta que lo aciertes.");

        int elegido=-1;

        while(elegido!=ganador){

            System.out.println("Dime qué número piensas que es: ");

            elegido=Integer.parseInt(sc.nextLine());

            if(elegido!=ganador){

                System.out.println("No has acertado. Estás a "+(ganador-elegido)+" números de acertar.");

            }

        }

        System.out.println("¡Por fin has acertado!");


		
		
	}

	public static Integer imprimirTodos(int primero, int segundo, int i) {
		for (int i = primero; i < segundo; i++) {
			 
        }
		return list;
        
	}
	
}
