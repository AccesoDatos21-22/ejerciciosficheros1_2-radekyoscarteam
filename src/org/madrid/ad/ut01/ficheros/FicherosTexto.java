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
	public int contarCaracteres(String rutaFichero) {
		int num = 0;
		File fichero = new File(rutaFichero);
		try {
			FileReader fr = new FileReader(fichero);
			if (!fichero.exists()) {
				System.out.println("El fichero no existe");
			} else {
				while (true) {
					int letra = fr.read();
					if (letra == -1)
						break; //// Si devuelve -1 significa que no quedan caracteres por leer
					num++;
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		return num;
	}

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

	@Override
	public int contarLineas(String rutaFichero) {
		int num = 0;
		File fichero = new File(rutaFichero);
		try {
			BufferedReader br = new BufferedReader(new FileReader(fichero));
			String linea = br.readLine();
			while (linea != null) {
				num++;
				linea = br.readLine();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		return num;
	}

	@Override
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
	public int palabraMasLarga(String rutaFichero) {
		File file = new File(rutaFichero);
		String linea, palabraIntermedia = "";

		try (BufferedReader fr = new BufferedReader(new FileReader(file))) {
			if (!file.exists()) {
				System.out.println("El fichero no existe");
				return 0;
			}
			
			linea="";
			while (linea != null) {
				
				String[] lineaAux = linea.split("\\s|\\.|,");
				for (String palabra : lineaAux) {
					if (palabraIntermedia == null)
						palabraIntermedia = palabra;
					if (palabraIntermedia.length() <= palabra.length())
						palabraIntermedia = palabra;
				}
				linea = fr.readLine();
			}

		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("Larga: "+ palabraIntermedia);
		return 0;
	}

	
	public HashMap<Character, Integer> frecuenciaVocalesConHashMap(String rutaFichero) {
		int a = 0, e = 0, i = 0, o = 0, u = 0;
		HashMap<Character, Integer> diccionario = new HashMap<>();
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
				if (letra == 'a' || letra == 'A')
					a++;
				if (letra == 'e' || letra == 'E')
					e++;
				if (letra == 'i' || letra == 'I')
					i++;
				if (letra == 'o' || letra == 'O')
					o++;
				if (letra == 'u' || letra == 'U')
					u++;
			}
			diccionario.put('a', a);
			diccionario.put('e', e);
			diccionario.put('i', i);
			diccionario.put('o', o);
			diccionario.put('u', u);
		} catch (IOException error) {

			error.printStackTrace();
		}
		return diccionario;
	}

	public HashMap<Character, Integer> frecuenciaLetrasConHashMap(String rutaFichero) {
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
				System.err.println("El archivo no existe.");
				return;
			}
			int letra=fr.read();
			while (letra != -1) {
				System.out.print((char) letra);
				letra=fr.read();

			}
		} catch (IOException e) {

			e.printStackTrace();
		}

	}



	@Override
	public int frecuenciaVocales(String rutaFichero) {
		int a = 0, e = 0, i = 0, o = 0, u = 0;
		HashMap<Character, Integer> diccionario = new HashMap<>();
		File fichero = new File(rutaFichero);
		try (FileReader fr = new FileReader(fichero)) {
			if (!fichero.exists()) {
				System.out.println("El archivo no existe.");
				return 0;
			}

			while (true) {
				int letraNumerica = fr.read();
				if (letraNumerica == -1)
					break;
				char letra = (char) letraNumerica;
				if (letra == 'a' || letra == 'A')
					a++;
				if (letra == 'e' || letra == 'E')
					e++;
				if (letra == 'i' || letra == 'I')
					i++;
				if (letra == 'o' || letra == 'O')
					o++;
				if (letra == 'u' || letra == 'U')
					u++;
			}
			diccionario.put('a', a);
			diccionario.put('e', e);
			diccionario.put('i', i);
			diccionario.put('o', o);
			diccionario.put('u', u);
		} catch (IOException error) {

			error.printStackTrace();
		}
		diccionario.forEach((k,v)->System.out.println("Vocal: "+k+", valor: "+ v));

		return 0;
	}

	@Override
	public int frecuenciaLetras(String rutaFichero) {
		HashMap<Character, Integer> diccionario = new HashMap<Character, Integer>();
		File fichero = new File(rutaFichero);
		try (FileReader fr = new FileReader(fichero)) {
			if (!fichero.exists()) {
				System.out.println("El archivo no existe.");
				return 0;
			}

			while (true) {
				int letraNumerica = fr.read();
				if (letraNumerica == -1)
					break;
				char letra = (char) letraNumerica;
				
				if ((letra >= 'a' && letra <= 'z') || (letra >= 'A' && letra <= 'Z')  ) {
					letra=Character.toLowerCase(letra);
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
		diccionario.forEach((k,v)->System.out.println("Letra: "+k+", valor: "+ v));
		return 0;
	}

}
