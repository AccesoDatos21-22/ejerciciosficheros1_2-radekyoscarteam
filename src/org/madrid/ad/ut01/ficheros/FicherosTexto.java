package org.madrid.ad.ut01.ficheros;

import org.madrid.ad.ut01.ficheros.interfaces.InterfazFicherosTexto;

import java.io.*;

/**
 * 
 * @author Escribe_aqui_tu_nombre
 * @date 
 * @version 
 * @license GPLv3
 *
 */
public class FicherosTexto implements InterfazFicherosTexto{

	@Override
	public void leer(String rutaFichero) {
		File archivo=new File(rutaFichero);
		try {
			BufferedReader br=new BufferedReader(new FileReader(archivo));
			String linea=br.readLine();
			while (linea != null) {
				System.out.println(linea);
				linea=br.readLine();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	@Override
	public int contarCaracteres(String rutaFichero) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int contarLineas(String rutaFichero) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int contarPalabras(String rutaFichero) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int palabrasPentavocalica(String rutaFichero) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int palabraMasLarga(String rutaFichero) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int frecuenciaVocales(String rutaFichero) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int frecuenciaLetras(String rutaFichero) {
		// TODO Auto-generated method stub
		return 0;
	}



}
