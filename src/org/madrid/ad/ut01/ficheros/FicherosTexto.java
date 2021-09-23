package org.madrid.ad.ut01.ficheros;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
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
	public HashMap<Character,Integer> frecuenciaLetras(String rutaFichero) {
		HashMap<Character,Integer> diccionario=new HashMap<Character, Integer>();
		File fichero = new File(rutaFichero);
		try (FileReader fr = new FileReader(fichero)) {
			if (!fichero.exists()) {
				System.out.println("El archivo no existe.");
				return null;
			}
			
			while (true) {
				int letraNumerica = fr.read();
				if (letraNumerica == -1) break;
				char letra=(char)letraNumerica;
				if(!diccionario.containsKey(letra)) {
					diccionario.put(letra,1);

				}else {				
				int valor =diccionario.get(letra)+1;
//				diccionario.remove(letra);
				diccionario.put(letra,valor);
					
				}
				
					
				}

			
		} catch (IOException f) {

			f.printStackTrace();
		}

		
		return diccionario;
	}

}
