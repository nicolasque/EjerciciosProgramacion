package ej11;
import java.util.Scanner;

public class ej11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		

		
		String respuesntaAnimal = "";
		String nombreMascota = "";

//Selecion de animal
	while (!respuesntaAnimal.equalsIgnoreCase("perro") & !respuesntaAnimal.equalsIgnoreCase("gato") & !respuesntaAnimal.equalsIgnoreCase("hipopotamo") & !respuesntaAnimal.equalsIgnoreCase("carpincho")) {
			
			System.out.println("Dime que animal quieres ser (perro/ gato/ hipopotamo/ carpincho)");
			respuesntaAnimal = sc.nextLine();
			
		}
		System.out.println("Dime como quieres que se llame:");
		nombreMascota = sc.next();
		//Elige nombre
		while (nombreMascota.contains("0")||nombreMascota.contains("1")||nombreMascota.contains("2")||nombreMascota.contains("3")||nombreMascota.contains("4")||nombreMascota.contains("5")||
				nombreMascota.contains("6")||nombreMascota.contains("7")||nombreMascota.contains("8")||nombreMascota.contains("9")) {
			System.out.println("El nombre de tu mascota no puede contener números. Revísalo:");
			nombreMascota=sc.next();
		}
			
			int hambre = 50;
			int sueno = 50; 
			int higiene = 50;
			int diversion = 50;
			int paseo = 50;
			int mate = 50;
			int contadorTurnos = 0;

			int respuestaAccion  ;
			//Inicio bucle principal
			while (hambre >= 0 && sueno >= 0 && higiene >= 0 && diversion >=0 && paseo >= 0 && mate >= 0&&
					hambre < 100 && sueno < 100 && higiene < 100 && diversion <100 && paseo <100 && mate <100 && contadorTurnos < 30) {
				System.out.println("\n\nEl " + respuesntaAnimal +" "+ nombreMascota);
				System.out.println("-----------------------");
				System.out.println("Hanbre- "+ hambre);
				System.out.println("Sueño- " + sueno);
				System.out.println("Higiene- " + higiene);
				System.out.println("Diversion- "+ diversion);
				
				switch (respuesntaAnimal){
				case "perro":
					System.out.println("Paseo- " + paseo);
					break;
				case "carpincho":
				System.out.println("Mate-" + mate);
				break;
				}
				System.out.println("\nElige accion:\n"
						+ "1-Comer \n"
						+ "2-Dormir \n"
						+ "3-Duchrse \n"
						+ "4-Jugar");
				switch (respuesntaAnimal){
				case "perro":
					System.out.println("5-Pasear");
					break;
				case "carpincho":
				System.out.println("5- Tomar mate");
				break;
				}
				
				//Decision y efectos
				
				respuestaAccion = sc.nextInt();
				if (respuestaAccion == 1) {
					System.out.println(nombreMascota + "Come");
					hambre += 20;
					sueno -= 5;
					higiene -=5;
					diversion -=5;
					paseo = -5;
					mate = -5;
				}
				else if (respuestaAccion == 2) {
					System.out.println(nombreMascota + "Duerme");
					hambre -= 5;
					sueno += 20;
					higiene -=5;
					diversion -=5;
					paseo = -5;
					mate = -5;
				}
				else if (respuestaAccion == 3) {
					System.out.println(nombreMascota + "se ducha");
					hambre -= 5;
					sueno -= 5;
					higiene +=20;
					diversion -=5;
					paseo = -5;
					mate = -5;
				}
				else if (respuestaAccion == 4) {
					System.out.println(nombreMascota + "Juega");
					hambre -= 5;
					sueno -= 5;
					higiene -=5;
					diversion +=20;
					paseo = -5;
					mate = -5;
				}
				else if (respuestaAccion == 5) {
					switch (respuesntaAnimal) {
					case "perro": 
						System.out.println(nombreMascota + "sale a pasear");
						hambre -= 5;
						sueno -= 5;
						higiene -=5;
						diversion -=5;
						paseo +=20;
					break;
					case "carpincho":
						System.out.println(nombreMascota + "toma su matecito");
						hambre -= 5;
						sueno -= 5;
						higiene -=5;
						diversion -=5;
						mate += 20;
						break;
					}
					}
				contadorTurnos += 1;

				};	//Fin bucle
			
			
	
			
			System.out.println("Tu tamagochi la ha palmado chavalote");
			
	}}
		
	


