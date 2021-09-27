# Ejercicios 1.2
## Ejercicio 1
Para leer el fichero de texto caracter a caracter, es mas aconsejable utilizar el metodo FileReader. Para marcar el final del texto, utilizaremos 
```javascript
letra==-1
```
ya que esto nos indicara que en esa posición no hay ningun caracter, ni siquiera espacios.
```javascript
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
```
## Ejercicio 2
Este ejercicio es una variante del ejercicio 1, siendo la unica diferencia que en este método utilizaremos el BufferedReader.
```javascript
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
```
La principal diferencia entre los dos métodos es que en el segundo leeremos la linea completa, en vez de leer cada caracter por separado.  
En este caso la condicion para parar de leer sera:
```javascript
linea!=null
```
## Ejercicio 3
Para realizar tanto este como el siguiente método, usaremos el FileReader, ya que nos permite leer caracter a caracter el fichero.
```javascript
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
```
## Ejercicio 4
Similar al anterior, este metodo contara solo los caracteres mediante la siguiente condicion:
```javascript
Character.isAlphabetic(letra)
```
Este metodo comprueba si el caracter pasado por parametro esta dentro del código ASCII.
```javascript
public int contarCaracteres(String rutaFichero) {
		int cuenta=0;
		File fichero = new File(rutaFichero);
		try (FileReader fr = new FileReader(fichero)) {
			if (!fichero.exists()) {
				System.out.println("El archivo no existe.");
				return 0;
			}
			
			while (true) {
				int letra = fr.read();
				if(letra==-1) break;
				if (Character.isAlphabetic(letra)) cuenta++;

			}
		} catch (IOException e) {

			e.printStackTrace();
		}
		return cuenta;
	}
```
## Ejercicio 5
Para este ejercicio utlizaremos el BufferedReader, ya que nos permite leer lineas sin problema.
```javascript
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
```
## Ejercicio 6
En este método, utilizaremos el metodo `.split()` para meter en un array las palabras de cada frase. Contaremos las palabras de la frase con un `foreach()`
```javascript
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
```
## Ejercicio 7
En este ejercicio el objetivo es buscar el numero de palabras en el texto que contengan las 5 vocales. Para ello, primero tendremos que diferenciar cada una de las palabras. Esto lo conseguiremos leyendo primero las lineas y luego separando cada una en palabras mediante el método `split()`.  
Al tener ya separadas las palabras, debemos filtrar las cuales no tengan alguna de las 5 vocales. Para ello usarems un `foreach()` que recorra cada palabra buscando cada una de las vocales. Si no contiene alguna de ellas, no añadira la palabra al ArrayList llamado lista. Para terminar, devolveremos el tamaño del 
ArrayList.
```javascript
public int palabrasPentavocalica(String rutaFichero) {
		int num=0;
		File archivo=new File(rutaFichero);
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
		} catch (IOException e) {
			e.printStackTrace();
		}
		return num;
	}
```
## Ejercicio 8
Para obtener la palabra mas larga del texto, primero volveremos a leer las lineas y a separarlas en palabras con el `split()`, teniendo en cuenta los diversos signos de puntuacion presentes en el texto. Además, crearemos una variable String en la que guardaremos la palabra mas larga que nos hayamos encontrado.
```javascript
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
```
## Ejercicio 9
En este ejercicio utilizaremos un HashMap para guardar el numero de veces que ha aparecido una vocal en el texto. Utilizaremos un FileReader para leer caracter a caracter, y comprobaremos si el caracter sobre el que nos encontramos se corresponde con alguna de las vocales.
```javascript
public int frecuenciaVocales(String rutaFichero) {
		int a = 0, e = 0, i = 0, o = 0, u = 0;
		HashMap<Character, Integer> diccionario = new HashMap<>();
		File fichero = new File(rutaFichero);
		try (FileReader fr = new FileReader(fichero)) {
			if (!fichero.exists()) {
				System.out.println("El archivo no existe.");
				return -1;
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
```
## Ejercicio 10
Similar al ejercicio anterior, crearemos un HashMap que guarde todas las letras del abecedario y cuente el numero de veces que aparece cada una de ellas en el texto.
```javascript
public int frecuenciaLetras(String rutaFichero) {
		HashMap<Character, Integer> diccionario = new HashMap<Character, Integer>();
		File fichero = new File(rutaFichero);
		try (FileReader fr = new FileReader(fichero)) {
			if (!fichero.exists()) {
				System.out.println("El archivo no existe.");
				return -1;
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
```
