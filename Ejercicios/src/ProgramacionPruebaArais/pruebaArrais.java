package ProgramacionPruebaArais;

import java.util.Iterator;

public class pruebaArrais {

	public static void main(String[] args) {
		int a = 1;
		int[] b = new int[5];
		b[0] = 31;
		b[1]= 11;
		b[2]= 44;
		b[3] = 21;
		b[4] = 89;
		
		for (byte i = 0; i<b.length; i++) {
			System.out.println(b[i]);
		}
		int [] c = {1,2,3,4,5,6};
		for (byte i  = 0; i<b.length; i++) {
		b[i] = c[i]- b[i];
		System.out.println(b[i]);
		}
	}

}
