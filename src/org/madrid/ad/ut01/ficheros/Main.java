package org.madrid.ad.ut01.ficheros;



public class Main {
	
	public static void main(String[] args) {

		String ruta = "src/org/madrid/ad/ut01/ficheros/assets/el_quijote.txt";
			FicherosTexto ejercicios = new FicherosTexto();
			System.out.println("Caracteres totales: "+ejercicios.contarCaracteres(ruta));
			System.out.println("Palabras totales: "+ejercicios.contarPalabras(ruta));
			
			System.out.println("\nFrecuencia de Vocales: \n");
			ejercicios.frecuenciaVocales(ruta).forEach((k,v)->System.out.println("Vocal: "+k+", valor: "+ v));

			System.out.println("\nFrecuencia de Letras: |n");

			ejercicios.frecuenciaLetras(ruta).forEach((k,v)->System.out.println("Letra: "+k+", valor: "+ v));


	}

}
