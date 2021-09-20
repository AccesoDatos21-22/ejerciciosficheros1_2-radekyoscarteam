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
	public void leer(String rutaFichero) {
	}

	@Override
	public int contarCaracteres(String rutaFichero) {

		return 0;
	}

	@Override
	public int contarLineas(String rutaFichero) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int contarPalabras(String rutaFichero) {
	
		return 0;
	}

	@Override
	public int palabrasPentavocalica(String rutaFichero) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String palabraMasLarga(String rutaFichero) {
		File file = new File(rutaFichero);
		String linea,palabraIntermedia="";
		
		try(BufferedReader fr= new BufferedReader(new FileReader(file))) {
			if(!file.exists()) {
				System.out.println("El fichero no existe"); 
				return palabraIntermedia;
			}
			
			while(true) {
			linea=fr.readLine();
			if(linea==null) return palabraIntermedia;
			String[]lineaAux=linea.split("\\s|\\.|,");
			for(String palabra: lineaAux) {
				if(palabraIntermedia==null) palabraIntermedia=palabra;
				if(palabraIntermedia.length()<=palabra.length()) palabraIntermedia=palabra;
			}
				
			
			}
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return palabraIntermedia;
	}

	@Override
	public int frecuenciaVocales(String rutaFichero) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public HashMap<Character,Integer> frecuenciaLetras(String rutaFichero) {
		
		return null;
	}

}
