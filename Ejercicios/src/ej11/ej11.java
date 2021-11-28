package ej11;
import java.util.Scanner;
import java.util.Random;

public class ej11 {




	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		

		
		String respuestaAnimal = "";
		String nombreMascota = "";

//Selecion de animal
	while (!respuestaAnimal.equalsIgnoreCase("perro") & !respuestaAnimal.equalsIgnoreCase("gato") & !respuestaAnimal.equalsIgnoreCase("hipopotamo") & !respuestaAnimal.equalsIgnoreCase("carpincho")) {
			
			System.out.println("Dime que animal quieres ser (perro/ gato/ hipopotamo/ carpincho)");
			respuestaAnimal = sc.nextLine();
			
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

			int respuestaAccion =0;
			//Inicio bucle principal
			while (hambre >= 0 && sueno >= 0 && higiene >= 0 && diversion >=0 && paseo >= 0 && mate >= 0&&
					hambre < 100 && sueno < 100 && higiene < 100 && diversion <100 && paseo <100 && mate <100 && contadorTurnos < 30) {
				

				System.out.println("\n\nEl " + respuestaAnimal +" "+ nombreMascota);
				System.out.println("-----------------------");
				System.out.println("Hanbre- "+ hambre);
				System.out.println("Sueño- " + sueno);
				System.out.println("Higiene- " + higiene);
				System.out.println("Diversion- "+ diversion);
				
				switch (respuestaAnimal){
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
					switch (respuestaAnimal){
					case "perro":
						System.out.println("5-Pasear");
						break;
					case "carpincho":
					System.out.println("5- Tomar mate");
					break;
					}
					respuestaAccion = sc.nextInt();
				
				
					
				//Decision y efectos
			
					
				if (respuestaAccion == 1) {
					System.out.println(nombreMascota + " Come");
					hambre += 20;
					sueno -= 5;
					higiene -=5;
					diversion -=5;
					switch (respuestaAnimal){
					case "perro":
						paseo -=5;
						break;
					case "carpincho":
						mate -=5;
					break;
					}
					
				}
				else if (respuestaAccion == 2) {
					System.out.println(nombreMascota + " Duerme");
					hambre -= 5;
					sueno += 20;
					higiene -=5;
					diversion -=5;
					switch (respuestaAnimal){
					case "perro":
						paseo -=5;
						break;
					case "carpincho":
						mate -=5;
					break;
					}
				}
				else if (respuestaAccion == 3) {
					System.out.println(nombreMascota + " se ducha");
					hambre -= 5;
					sueno -= 5;
					higiene +=20;
					diversion -=5;
					switch (respuestaAnimal){
					case "perro":
						paseo -=5;
						break;
					case "carpincho":
						mate -=5;
					break;
					}
				}
				else if (respuestaAccion == 4) {
					System.out.println(nombreMascota + " Juega");
					hambre -= 5;
					sueno -= 5;
					higiene -=5;
					diversion +=20;
					switch (respuestaAnimal){
					case "perro":
						paseo -=5;
						break;
					case "carpincho":
						mate -=5;
					break;
					}
				}
				else if (respuestaAccion == 5) {
					switch (respuestaAnimal) {
					case "perro": 
						System.out.println(nombreMascota + " sale a pasear");
						hambre -= 5;
						sueno -= 5;
						higiene -=5;
						diversion -=5;
						paseo +=20;
					break;
					case "carpincho":
						System.out.println(nombreMascota + " toma su matecito");
						hambre -= 5;
						sueno -= 5;
						higiene -=5;
						diversion -=5;
						mate += 20;
						break;
					}
					}
				contadorTurnos += 1;
				clearScreen();
				
				//probailidad de suicidio
				if (contadorTurnos == 4 ){
					System.out.println( nombreMascota + " se cansa de la vida, ahora hay una posibilidad entre 10 de que se suicide por turno.");
					
				};
				if (contadorTurnos >= 4 ){
					int min = 1;
					int max = 10;

					Random random = new Random();

					int value = random.nextInt(max + min) + min;

					if (value == 2 ) {
						System.out.println(nombreMascota + "ha decidido acabar con su vida.");
						contadorTurnos = 40;
					}
				}

			};//Fin buc

			//Formas de morir
			if (hambre >= 100) {
				System.out.println("Tu "+ nombreMascota +" ha explotado de gordo");
			}
			else if (hambre <= 0) {
				System.out.println("Tu " + nombreMascota +" ha muerto de habre, inutil");
			}
			
			if (sueno >= 100) {
				System.out.println("Tu "+ nombreMascota +" ha dormido demasiado y ha muerto");
			}
			else if (sueno <= 0) {
				System.out.println("Tu "+ nombreMascota + " no ha dormido lo suficiente y a amochado");
			}
			
			if (higiene >= 100) {
				System.out.println("Tu "+ nombreMascota +" se ha aoado de tanto bañito.");
			}
			else if (higiene <= 0) {
				System.out.println("A tu "+ nombreMascota + " le ha aplastado la mierda, guarro ");
			}
			
			if (diversion >= 100) {
				System.out.println("Tu "+ nombreMascota +" se lo estaba pasando tan bien que le ha dado un perrenque en la patata");
			}
			else if (diversion <= 0) {
				System.out.println("Tu "+ nombreMascota + "  se aburria tanto que se ha cansado de vivir");
			}
			if (paseo >= 100) {
				System.out.println("Tu "+ nombreMascota +" esta cansado de tanto paseito, estaba............");
			}
			else if (paseo <= 0) {
				System.out.println("Tu "+ nombreMascota + " se mea en la alfombra y tu tia prepara una cena especial  ");
			}
			if (mate >= 100) {
				System.out.println("Tu "+ nombreMascota +" se ha ahogado en tanto matecito");
			}
			else if (mate <= 0) {
				System.out.println("A tu "+ nombreMascota + " pero no sabes que los carpinchos la palman sin su matecito ?");
			}
} 
	public static void clearScreen() {  
	    System.out.print("\033[H\033[2J");  
	    System.out.flush();  
	}

}
		
	


