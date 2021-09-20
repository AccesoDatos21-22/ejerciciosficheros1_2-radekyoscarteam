package org.madrid.ad.ut01.ficheros;



public class Main {
	
	public static void main(String[] args) {
		FicherosTexto fichero=new FicherosTexto();
		int num=fichero.contarCaracteres(".\\src\\org\\madrid\\ad\\ut01\\ficheros\\assets\\el_quijote.txt");
		System.out.println("el_qijote.txt tiene: "+num+" caracteres");
	}

}
