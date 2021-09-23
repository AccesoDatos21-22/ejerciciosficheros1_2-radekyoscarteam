package org.madrid.ad.ut01.ficheros;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;

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
		public int contarPalabras(String rutaFichero) {
			File file = new File(rutaFichero);
			String linea;
			int num = 0;
			try (BufferedReader fr = new BufferedReader(new FileReader(file))) {
				if (!file.exists()) {
					System.out.println("El fichero no existe");
					return 0;
				}
				while (true) {
					linea = fr.readLine();
					if (linea == null)
						return num;
					String[] lineaAux = linea.split(" ");
					for (String palabra : lineaAux) {
						num++;
					}
				}
			} catch (IOException e) {
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

		@Override
		public HashMap<Character, Integer> frecuenciaLetras(String rutaFichero) {
			HashMap<Character, Integer> diccionario = new HashMap<Character, Integer>();
			File fichero = new File(rutaFichero);
			try (FileReader fr = new FileReader(fichero)) {
				if (!fichero.exists()) {
					System.out.println("El archivo no existe.");
					return null;
				}

				while (true) {
					int letraNumerica = fr.read();
					if (letraNumerica == -1)
						break;
					char letra = (char) letraNumerica;
					if (letra >= 'a' && letra <= 'z') {
						if (!diccionario.containsKey(letra)) {
							diccionario.put(letra, 1);

						} else {
							int valor = diccionario.get(letra) + 1;
//				diccionario.remove(letra);
							diccionario.put(letra, valor);
						}

					}

				}

			} catch (IOException f) {

				f.printStackTrace();
			}

			return diccionario;
		}

		public void leer(String rutaFichero) {

			File fichero = new File(rutaFichero);
			try (FileReader fr = new FileReader(fichero)) {
				if (!fichero.exists()) {
					System.out.println("El archivo no existe.");
					return;
				}

				while (true) {
					int letra = fr.read();
					if (letra == -1)
						break; // Si devuelve -1 significa que no quedan caracteres por leer
					System.out.print((char) letra);

				}
			} catch (IOException e) {

				e.printStackTrace();
			}

		}

	
}
