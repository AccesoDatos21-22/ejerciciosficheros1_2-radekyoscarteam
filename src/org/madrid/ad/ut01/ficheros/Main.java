package org.madrid.ad.ut01.ficheros;



public class Main {
	
	public static void main(String[] args) {
		String ruta = "src/org/madrid/ad/ut01/ficheros/assets/el_quijote.txt";
			FicherosTexto ejercicios = new FicherosTexto();
//			System.out.println(ejercicios.contarCaracteres(ruta));
//			System.out.println(ejercicios.contarPalabras(ruta));
			System.out.println(ejercicios.palabraMasLarga(ruta));
			
//			System.out.println(ejercicios.frecuenciaLetras(ruta));
//			ejercicios.frecuenciaLetras(ruta).forEach((k,v)->System.out.println("letra: "+k+", valor: "+ v));

	}

}
