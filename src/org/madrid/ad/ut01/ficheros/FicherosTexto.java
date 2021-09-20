package org.madrid.ad.ut01.ficheros;

import java.io.*;


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
		int num=0;
		File fichero=new File(rutaFichero);
		try {
			BufferedReader br=new BufferedReader(new FileReader(fichero));
			String linea=br.readLine();
			while (linea!=null){
				num++;
				linea=br.readLine();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		return num;
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
