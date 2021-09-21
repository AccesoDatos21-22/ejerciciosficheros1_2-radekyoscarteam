package org.madrid.ad.ut01.ficheros;



public class Main {
	
	public static void main(String[] args) {
		FicherosTexto fichero=new FicherosTexto();
		fichero.frecuenciaVocales("src/org/madrid/ad/ut01/ficheros/assets/el_quijote.txt").forEach((k,v)->System.out.println("letra: "+k+", valor: "+ v));
	}

}
