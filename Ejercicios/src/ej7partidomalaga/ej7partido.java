package ej7partidomalaga;

import java.util.Scanner;

public class ej7partido {

	public static void main(String[] args) {

		int asientoPreferenciaAlta = 5345;
		int precioPreferenciaAlta = 35;
		int asientoPreferenciaBaja = 3345;
		int precioPreferenciaBaja = 40;
		int asientoTribunaAlta = 5345;
		int precioTribunaAlata = 45;
		int asientoTribunaBaja = 3345;
		int precioTribunaBaja = 50;
		int asientoFondoSurBajo = 1986;
		int precioFondoSurBajo = 20;
		int asientoFondoSurAlto = 3896;
		int precioFondoSurAlto = 15;
		int asientoFondoNorteBajo = 1986;
		int precioFondoNorteBajo = 20;
		int asientoFondoNorteAlto = 3896;
		int precioFondoNorteAlto = 15;
		
		int abonadosTribunaAlta = 3000;
		int abonadosTribunaBaja = 1000;
		int abonadosPreferenciaAalta = 5000;
		int abonadosPreferenciaBaja = 3000;
		int abonadosFondoSurAlto = 500;
		int abonadosFondoNorteAlto = 500;
		int abonadosFondoSurBajo = 1000;
		int abonadosFondoNorteBajo = 1000;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Dime que tipo de que partido quieres saber la recaudacion axima:"
				+ "\n (1)Playoff Ascenso"
				+ "\n (2)Liga"
				+ "\n (3)Copa del rey"
				+ "\n (4)Otro");
		short tipoDePartido = Short.parseShort(sc.nextLine());
		System.out.println("L a recaudacion maxima, sin contar abonados es de: \n "   ) ;
		
		int abonadosPaganEntrada = 
				(asientoPreferenciaAlta*precioPreferenciaAlta)+
				(asientoPreferenciaBaja*precioPreferenciaBaja) +
				(asientoTribunaAlta*precioTribunaAlata) +
				(asientoTribunaBaja*precioTribunaBaja) +
				(asientoFondoSurBajo*precioFondoSurBajo) +
				(asientoFondoSurAlto*precioFondoSurAlto) +
				(asientoFondoNorteBajo*precioFondoNorteBajo) +
				(asientoFondoNorteAlto*precioFondoNorteAlto);
		int abonadosNoPaganEntrada =
				((asientoPreferenciaAlta -abonadosPreferenciaAalta )*precioPreferenciaAlta)+
				((asientoPreferenciaBaja - abonadosPreferenciaBaja)*precioPreferenciaBaja) +
				((asientoTribunaAlta - abonadosTribunaAlta)*precioTribunaAlata) +
				((asientoTribunaBaja - abonadosTribunaBaja) * precioTribunaBaja) +
				((asientoFondoSurBajo -abonadosFondoSurBajo )*precioFondoSurBajo) +
				((asientoFondoSurAlto - abonadosFondoSurAlto) *precioFondoSurAlto) +
				((asientoFondoNorteBajo - abonadosFondoNorteBajo) *precioFondoNorteBajo) +
				((asientoFondoNorteAlto -abonadosFondoNorteAlto ) *precioFondoNorteAlto);
				;
				
			
		System.out.println("Quieres calcular la recaudacion con el estadio lleno? S/N");
		String respuesta1 = sc.nextLine();
		
		if (respuesta1.equals("S")) {
			if (tipoDePartido == 1 || tipoDePartido == 3) {
				System.out.println("La recaudacion maxima (los abonados no pagan entrada) es de:" + abonadosNoPaganEntrada);
				}
			else {
				System.out.println("La recaudacion maxima (pagando entrada los abonados) es de:" + abonadosPaganEntrada);

			};

		}
		
		else {
			System.out.println("¿Que porcentaje del estadio estaba lleno?");
			float respuestaPorcentaje = sc.nextFloat();
			
			if (tipoDePartido == 1 || tipoDePartido == 3) {
				System.out.println("Si el estadio estaba lleno al " + respuestaPorcentaje + "% la recaudacion sera de: "+ (abonadosNoPaganEntrada * (respuestaPorcentaje/100)) );
				}
			else {
				System.out.println("Si el estadio estaba lleno al " + respuestaPorcentaje + "% la recaudacion sera de: "+ (abonadosPaganEntrada * (respuestaPorcentaje/100)) );

			};


			
		};
	}

}
