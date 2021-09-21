package org.madrid.ad.ut01.ficheros;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;


import org.madrid.ad.ut01.ficheros.interfaces.InterfazFicherosTexto;

/**
 * 
 * @author Escribe_aqui_tu_nombre
 * @date
 * @version
 * @license GPLv3
 *
 */
public class FicherosTexto implements InterfazFicherosTexto {

	@Override
	public void leer(String rutaFichero) {
	}

	@Override
	public int contarCaracteres(String rutaFichero) {
		return 0;
	}



	@Override
	public int contarLineas(String rutaFichero) {
		return  0;
	}

	@Override
	public int contarPalabras(String rutaFichero) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int palabrasPentavocalica(String rutaFichero) {
		return 0;
	}

	@Override
	public int palabraMasLarga(String rutaFichero) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public HashMap<Character,Integer> frecuenciaVocales(String rutaFichero) {
		HashMap<Character, Integer> diccionario = new HashMap<>();
		int a = 0, e = 0, i = 0, o = 0, u = 0;
		File fichero = new File(rutaFichero);
		try (FileReader fr = new FileReader(fichero)) {
			if (!fichero.exists()) {
				System.out.println("El archivo no existe.");
				return null;
			}

			while (true) {
				int letraNumerica = fr.read();
				if (letraNumerica == -1) break;
				char letra = (char) letraNumerica;
				if (letra == 'a' || letra=='A') a++;
				if (letra == 'e' || letra=='E') e++;
				if (letra == 'i' || letra=='I') i++;
				if (letra == 'o' || letra=='O') o++;
				if (letra == 'u' || letra=='U') u++;
			}
			diccionario.put('a',a);
			diccionario.put('e',e);
			diccionario.put('i',i);
			diccionario.put('o',o);
			diccionario.put('u',u);
		} catch (IOException error) {

			error.printStackTrace();
		}


		return diccionario;
	}
	@Override
	public int frecuenciaLetras(String rutaFichero) {
		// TODO Auto-generated method stub
		return 0;
	}

}
