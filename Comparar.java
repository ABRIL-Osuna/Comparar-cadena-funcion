package es.studium.Comparar;

import java.util.Scanner;

public class Comparar {

	public static void main(String[] args) {
		String cadena1,cadena2;
		Scanner teclado = new Scanner (System.in);
		System.out.println("Introduce una frase ");
		cadena1 = teclado.nextLine();
		System.out.println("Introduce otra frase ");
		cadena2 = teclado.nextLine();
		System.out.println(comparar(cadena1,cadena2));
			}
	public static String comparar(String a, String b) {
		if(a.equals(b)){
			System.out.println("Las frases son iguales");
			String resultado;
			resultado="";
			return resultado;
		}
		else
			System.out.println("Las frases son distintas "+"miden: "+a.length()+" letras la primera"+" y "+b.length()+" letras la segunda");
		return "";
	}
}
		
