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
