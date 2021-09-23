package org.madrid.ad.ut01.ficheros;

import java.io.*;


import org.madrid.ad.ut01.ficheros.interfaces.InterfazFicherosTexto;


public class FicherosTexto implements InterfazFicherosTexto {


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


}
