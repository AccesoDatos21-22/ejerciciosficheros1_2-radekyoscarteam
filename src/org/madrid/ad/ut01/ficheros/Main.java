package org.madrid.ad.ut01.ficheros;



public class Main {
	
	public static void main(String[] args) {
		FicherosTexto fichero=new FicherosTexto();
		int num=fichero.palabrasPentavocalica("src/org/madrid/ad/ut01/ficheros/assets/el_quijote.txt");
		System.out.println("El Quijote tiene "+num+" palabras con las 5 vocales");
	}

}
