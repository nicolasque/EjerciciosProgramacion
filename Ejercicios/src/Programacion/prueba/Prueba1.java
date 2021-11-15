
package Programacion.prueba;

import java.sql.Date;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.temporal.ChronoField;
import java.util.Scanner;

public class Prueba1 {

	public static void main(String[] args) {
		Scanner lector = new Scanner(System.in);
		int segundosEnUnDia=60*60*24;
		short segundosEnUnaHora=60*60;
		byte segundosEnUnMinuto=60;
		
		System.out.println("Dime tu nombre");
		String nombre = lector.nextLine();
		System.out.println("Dime tu edad");
		int edad = Integer.parseInt(lector.nextLine());
		System.out.println("Bienvenid@, " + nombre + " de " + edad + " años! Vamos a programar algo!");
		System.out.println("Dime sobre qué tema quieres que hablemos hoy");
		String tema = lector.nextLine();
		System.out.println("Vale! Hablemos de " + tema + "!");
		int añoNacimiento=2021-edad;
		System.out.println("Veo que naciste en el "+añoNacimiento);
		
		//Una expresión es una cuenta. Matemática o no, que devuelve un resultado. Normalmente será de uno de los tipos básicos.

		System.out.println("Dime la edad que tienes");
		byte miEdad=Byte.parseByte(lector.nextLine());
		
		System.out.println("Deduzco que estamos en el año: "+(añoNacimiento+miEdad));
		int añoFuturama=miEdad+añoNacimiento+1000;
		System.out.println("Si fueras Phillip J. Fry estaríamos en el año: "+(añoFuturama));
		
		//Operadores básicos: + - * / %
		int operacionesRandom=añoFuturama/(5-3)*4;
		operacionesRandom=operacionesRandom*2;
		System.out.println("30%4: "+(30%4));

		float fechaDesdeEpoch=1634899761;
		float segundosEnUnAño=60*60*24*365.24219879f; //Esta cuenta sirve para saber cuántos segundos tiene un año
		System.out.println("Años transcurridos desde 1970 hasta hoy: "+(fechaDesdeEpoch/segundosEnUnAño));
		
		System.out.println("Días transcurridos desde 1970 hasta hoy: "+(fechaDesdeEpoch/segundosEnUnDia));
		
		System.out.println("Horas transcurridas desde 1970 hasta hoy: "+(fechaDesdeEpoch/segundosEnUnaHora));
		
		System.out.println("Minutos transcurridos desde 1970 hasta hoy: "+(fechaDesdeEpoch/segundosEnUnMinuto));
		
		//Cálculo para sacarlo en una forma más legible por personas
		System.out.println("Años transcurridos desde 1970 hasta hoy: "+(fechaDesdeEpoch/segundosEnUnAño));
		float fechaDesdeEpochDias=fechaDesdeEpoch%segundosEnUnAño;
		System.out.println("Dias que han pasado desde 1970 hasta hoy: "+(fechaDesdeEpochDias/segundosEnUnDia));
		float fechaDesdeEpochHoras=fechaDesdeEpoch%segundosEnUnDia;
		//2 horas de desfase horario en españa en verano, la cuenta tal cual lo saca en el meridiano de Greenwich.
		System.out.println("Horas que han pasado desde 1970 hasta hoy: "+(fechaDesdeEpochHoras/segundosEnUnaHora+2)); 
		float fechaDesdeEpochMinutos=fechaDesdeEpoch%segundosEnUnaHora;
		System.out.println("Minutos que han pasado desde 1970 hasta hoy: "+(fechaDesdeEpochMinutos/segundosEnUnMinuto));
		float fechaDesdeEpochSegundos=fechaDesdeEpoch%segundosEnUnMinuto;
		System.out.println("Segundos que han pasado desde 1970 hasta hoy "+fechaDesdeEpochSegundos);
		
		int halloween2021=1635714000-60*60*2; //segundos desde epoch que habrán transcurrido en Haloween;
		//Recupera automáticamente los segundos que han pasado desde epoch hasta ahora mismo
		//Esta línea en concreto no tenéis que saber como funciona, las demás si.
		long segundosActuales=LocalDateTime.now().atZone(ZoneId.systemDefault()).toEpochSecond();
		
		long diferenciaSegundos=halloween2021-segundosActuales;
		System.out.println("Para halloween faltan "+
				(diferenciaSegundos/segundosEnUnDia)+
				" dias "+
				(diferenciaSegundos%segundosEnUnDia)/segundosEnUnaHora
				+" horas "+
				(diferenciaSegundos%segundosEnUnaHora)/segundosEnUnMinuto
				+" minutos "+
				(diferenciaSegundos%segundosEnUnMinuto)+" segundos"
				);
		
		//Operadores de comparación: >   <  >=  <=  == !=  . Coherencia solo con los numéricos y los char
		//Todos devuelven un booleano, y tienen precedencia muy baja, más baja que todos los operadores aritméticos
		//Mayor que da true solo si la expresión de la izda es mayor que la de la derecha
		System.out.println("Dime un número");
		byte numero=Byte.parseByte(lector.nextLine());
		boolean resultado1=(12+9/7>12+9/7);
		System.out.println("probando operador > "+resultado1);
		//menor que es al contrario
		System.out.println("probando operador < "+(12+9/7<5-numero*4));
		//mayor o igual funciona como el mayor, pero también me da true si los dos lados son iguales
		System.out.println("probando operador >= "+(12+9/7>=14-1));
		//menor o igual funciona como el menor, pero también da true si los dos lados son iguales
		System.out.println("probando operador <= "+(12+9/7<=5+8));
		// == sirve para comparar. Da true si los dos lados tienen un valor exactamente igual. Da false en caso de que sean distintos
		System.out.println("probando operador == "+('c'+3=='h'-2));
		// != sirve para comparar. Da true si los dos lados son distintos. Da false solo si el valor es el mismo.
		System.out.println("probando operador != "+('c'+1!='h'-2));
		//TODO contarles como comparar String
		
		//Operadores lógicos : && ||
		
		
		
		boolean eresMayorDeEdad=miEdad>=18;
		System.out.println(eresMayorDeEdad);
		
		System.out.println("Resultado de operación Random: "+operacionesRandom);
		
		System.out.println("Estoy en edad de trabajar?" + (miEdad >= 18 && miEdad <= 65));
		String saludo = "hola";
		System.out.println("Son los strings iguales ?" + (!saludo.equals(saludo)));
		
		String nacionalidad = "Española";
		short anioNacimiento = 1986;
		float altura = 1.71f;
		float peso = 500;
		System.out.println("Derecho de admision de la discoteca");
		System.out.println("te dejo entrar ?"+
		(nacionalidad.equals("Española")&& anioNacimiento<= 2003 &&
		(altura >2 || peso < 300)));
	}
	
}
