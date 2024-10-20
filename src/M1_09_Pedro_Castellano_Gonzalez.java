
import java.util.Scanner;

public class M1_09_Pedro_Castellano_Gonzalez {

	public static void main(String[] args) {
		
		String cadena;
		
		//se pide al usuario introducir una frase
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Introduce la frase a analizar: ");
		cadena = sc.nextLine();
		sc.close();
		
		contarVocales(cadena);
		
		System.out.println("En el texto hay: "+contarVocales(cadena)+" vocales");
		

	}

	//funcion que recorre la frase letra por letra y identifica si es una vocal o no
	
	private static int contarVocales(String cadena) {
		
		int contador = 0;
		char letra;
		
		//para simplificar se usa tolowercase para poner las vocales mayusculas a minusculas
		for (int i = 0; i < cadena.length(); i++) {
			
			letra = Character.toLowerCase(cadena.charAt(i));
			if(letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
				contador++;
			}
			//despues de detectar con el if las vocales se cuentan y se devuelve la variable contador
		}
		return contador;
	}
}

