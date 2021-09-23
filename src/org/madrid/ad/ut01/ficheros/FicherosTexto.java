package org.madrid.ad.ut01.ficheros;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


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
			}
				
			
			}
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return num;
	}


}
