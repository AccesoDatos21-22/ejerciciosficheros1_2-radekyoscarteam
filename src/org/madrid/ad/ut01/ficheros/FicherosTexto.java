package org.madrid.ad.ut01.ficheros;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;


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
		int num=0;
		File archivo=new File(rutaFichero);
<<<<<<< HEAD
		ArrayList<String> lista= new ArrayList<>();
		try {
			BufferedReader br=new BufferedReader(new FileReader(archivo));
			String linea=br.readLine();
			String lineamin=linea.toLowerCase();
			while (lineamin!=null){
				 lineamin=lineamin.toLowerCase();
				boolean contiene=true;
				String[] palabras=lineamin.split(" ");
				String[]vocales={"a","e","i","o","u"};
				for (int i = 0; i < palabras.length; i++) {
					for (String vocal:vocales) {
						if(!palabras[i].contains(vocal))
						{
							contiene=false;
						}
					}
					if(contiene) lista.add(palabras[i]);
					contiene=true;
				}
				lineamin=br.readLine();
			}
			num=lista.size();
=======
		ArrayList<String> lista=new ArrayList<String>();
		try {
			BufferedReader br=new BufferedReader(new FileReader(archivo));
			String linea=br.readLine();
			while (linea!=null){
				boolean contiene=true;
				String[] palabras=linea.split(" ");
				String[]vocales={"a","e","i","o","u"};
				for (int i = 0; i < palabras.length; i++) {
					for (String vocal:vocales) {
						if(!palabras[i].contains(vocal))contiene=false;
					}
					if(contiene) lista.add(palabras[i]);
				}
				linea=br.readLine();
			}
			lista.forEach(System.out::println);
>>>>>>> parent of 6746e87 (initial)
		} catch (IOException e) {
			e.printStackTrace();
		}
		return num;
	}

	@Override
	public int palabraMasLarga(String rutaFichero) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
<<<<<<< HEAD
	public HashMap<Character,Integer> frecuenciaVocales(String rutaFichero) {
		return null;
=======
	public int frecuenciaVocales(String rutaFichero) {
		// TODO Auto-generated method stub
		return 0;
>>>>>>> parent of 6746e87 (initial)
	}

	@Override
	public int frecuenciaLetras(String rutaFichero) {
		// TODO Auto-generated method stub
		return 0;
	}

}
