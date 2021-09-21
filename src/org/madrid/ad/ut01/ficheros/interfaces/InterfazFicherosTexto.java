package org.madrid.ad.ut01.ficheros.interfaces;

import java.util.HashMap;

/**
 * 
 * @author Carlos Tessier
 * @date 18/09/2021
 * @version 1.0
 * @license GPLv3
 *
 */
public interface InterfazFicherosTexto {

	/**
	 * 	
	 * M�todo que lee un fichero txt	  
	 *
	 * @param rutaFichero
	 */
	public void leer(String rutaFichero);
	
	/**
	 * 	
	 * M�todo que cuenta en n�mero de caracteres de un fichero txt	  
	 *
	 * @param rutaFichero
	 */
	public int contarCaracteres(String rutaFichero);
	
	
	/**
	 * 	
	 * M�todo que cuenta en n�mero de l�neas de un fichero txt	  
	 *
	 * @param rutaFichero
	 */
	public int contarLineas(String rutaFichero);
	
	/**
	 * 	
	 * M�todo que cuenta en n�mero de palabras de un fichero txt	  
	 *
	 * @param rutaFichero
	 */
	public int contarPalabras(String rutaFichero);
	
	/**
	 * 	
	 * M�todo que cuenta y muestra el n�mero total de palabras pentavoc�licas 
	 *
	 * @param rutaFichero
	 */
	public int palabrasPentavocalica(String rutaFichero);
	
	/**
	 * 	
	 * Obtener y mostrar la palabra m�s larga, su n�mero de letras y su posici�n
	 *  (n�mero de orden en la secuencia de palabras).
	 *  Si hay m�s de una se toma la primera. 
	 *  Nota: El n�mero de orden o posici�n de la palabra en el texto es el lugar que ocupa,
	 *  una vez contadas todas.   
	 *
	 * @param rutaFichero
	 */
	public int palabraMasLarga(String rutaFichero);
	
	/**
	 * 	
	 * M�todo Obtener la frecuencia de las 5 vocales 
	 * (n�mero de veces que se repite cada vocal).  
	 *
	 * @param rutaFichero
	 */
	
	public HashMap<Character,Integer> frecuenciaVocales(String rutaFichero);
	

	/**
	 * 	
	 * M�todo Obtener la frecuencia de las 27 letras del alfabeto 
	 * y muestra el resultado en orden descendente de frecuencia.  
	 *
	 * @param rutaFichero
	 */
	public int frecuenciaLetras(String rutaFichero);
	
	
	
	

}
