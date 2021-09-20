package org.madrid.ad.ut01.ficheros;

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
	public int contarCaracteres(String rutaFichero) {
		int num=0;
		File fichero=new File(rutaFichero);
		try {
			FileReader fr=new FileReader(fichero);
			if(!fichero.exists()){
				System.out.println("El fichero no existe");
			}else{
				while(true){
					int letra=fr.read();
					if(letra == -1) break; ////Si devuelve -1 significa que no quedan caracteres por leer
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
