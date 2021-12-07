package ej16;
import java.util.Scanner;


public class ej16 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String palabraUsuario = "";
		String sinEspacios = "";
		int contador = 0;
		String textoComkpleto = "Los padres españoles han presentado esta mañana un informe en el que certifican las altas capacidades de la mayor parte de los niños de nuestro país. «El 93% de los bebés de entre nueve y doce meses ya es capaz de tenerse en pie y dar sus primeros pasitos, es realmente increíble», señalan los progenitores, que insisten en que «no lo decimos porque seamos los padres».\r\n"
				+ "\r\n"
				+ "El informe viene acompañado de más de 500 vídeos hechos con teléfonos móviles que muestran a bebés interactuando con sus padres de formas especialmente llamativas. «Mira cómo sabe que es momento de bañarse. Se acuerda perfectamente, es como si tuviera un reloj interno», señala en uno de estos documentos audiovisuales Cloé Porqueres, una de las madres que firman el estudio. Su bebé podría ser el próximo Michael Phelps, asegura.\r\n"
				+ "\r\n"
				+ "La cantidad de bebés de diez meses que balbucean palabras muy parecidas a las que acepta la Real Academia Española -más del 75%, según el informe- hace pensar que, en un futuro próximo, la literatura en España experimentará un nuevo Siglo de Oro. «Basta con verles enganchados a la tableta para saber que se convertirán en ‘streamers’ de éxito y que ganarán millones en YouTube, Twitch o la plataforma que esté de moda entonces y que incluso puede que lleguen a programar ellos mismos», señala la investigación.\r\n"
				+ "\r\n"
				+ "«Ba… babá… bababá», declaran algunos bebés españoles, mostrando una facilidad de palabra inusual en estas fases del desarrollo cognitivo. «Bá es que quiere agua, babá es que la quiere ahora mismo. Ha desarrollado su propio código lingüístico y no tiene ni seis meses. No hace falta someterlo a un test psicométrico de inteligencia general para saber que en unos cinco años se sacará su primera filología», agrega Cloé Porqueres, que no sabe cómo compaginará su hijo la natación olímpica con la dirección del Instituto Cervantes. «No me preocupa: si es capaz de cagar y vomitar al mismo tiempo, sabrá gestionar las dos carreras profesionales», sentencia.\r\n"
				+ "\r\n"
				+ "El informe, repleto de manchas de papilla y otros restos de comida y fluidos corporales, ha sido revisado por la Asociación Española de Abuelos, que ha confirmado la superdotación intelectual de la mayor parte de los niños y ha exigido pasar más tiempo con ellos.";
		

		sinEspacios = preguntarPalabra(palabraUsuario, sinEspacios);
		System.out.println("Tu palabra aparece:" +respuestaNumeroRepeticiones(textoComkpleto, sinEspacios, contador) + " veces" );
		
	}

	public static String preguntarPalabra (String palabraUsuario, String sinEspacios) {
		Scanner sc = new Scanner(System.in);
		
		while (palabraUsuario == ""){
		System.out.println("Dime una palabra y te dire cuantas veces aparece en el texto:");
		 palabraUsuario = sc.nextLine();
		 	};
		
		 	 sinEspacios = palabraUsuario.replaceAll("\\s+","");
		return sinEspacios;
	
		
	};
	
	public static Integer respuestaNumeroRepeticiones (String textoComkpleto, String sinEspacios, int contador) {
		
		
		while (textoComkpleto.indexOf(sinEspacios) > -1) {
			textoComkpleto = textoComkpleto.substring(textoComkpleto.indexOf(
					sinEspacios)+sinEspacios.length(),textoComkpleto.length());
		      contador++; 
		}
		
		return contador;
	}
}
