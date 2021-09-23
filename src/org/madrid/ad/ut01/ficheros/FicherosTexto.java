package org.madrid.ad.ut01.ficheros;

<<<<<<<HEAD

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;=======
import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;>>>>>>>ejercicio7

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

	public int contarPalabras(String rutaFichero) {
		File file = new File(rutaFichero);
		String linea;
		int num=0;
		try(BufferedReader fr= new BufferedReader(new FileReader(file))) {
			if(!file.exists()) {
				System.out.println("El fichero no existe"); 
				return 0;
			}
			while(true) {
			linea=fr.readLine();
			if(linea==null) return num;
			String[]lineaAux=linea.split(" ");
			for(String palabra: lineaAux) {
				num++;
			}		}} catch (IOException e) {
				e.printStackTrace();
			}
			
			return num;
				
			
			}

	public int palabrasPentavocalica(String rutaFichero) {
		int num = 0;
		File archivo = new File(rutaFichero);
		ArrayList<String> lista = new ArrayList<>();
		try {
			BufferedReader br = new BufferedReader(new FileReader(archivo));
			String linea = br.readLine();
			String lineamin = linea.toLowerCase();
			while (lineamin != null) {
				lineamin = lineamin.toLowerCase();
				boolean contiene = true;
				String[] palabras = lineamin.split(" ");
				String[] vocales = { "a", "e", "i", "o", "u" };
				for (int i = 0; i < palabras.length; i++) {
					for (String vocal : vocales) {
						if (!palabras[i].contains(vocal)) {
							contiene = false;
						}
					}
					if (contiene)
						lista.add(palabras[i]);
					contiene = true;
				}
				lineamin = br.readLine();
			}
			num = lista.size();

		} catch (IOException e) {
			e.printStackTrace();
		}

		return num;
	}

}
