package org.madrid.ad.ut01.ficheros;



public class Main {
	
	public static void main(String[] args) {
		String ruta = "src/org/madrid/ad/ut01/ficheros/assets/el_quijote.txt";
		FicherosTexto fichero=new FicherosTexto();
		fichero.frecuenciaVocales(ruta).forEach((k,v)->System.out.println("letra: "+k+", valor: "+ v));
	}

}
