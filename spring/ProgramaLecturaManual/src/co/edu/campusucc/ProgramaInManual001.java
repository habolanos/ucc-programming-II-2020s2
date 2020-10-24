package co.edu.campusucc;

import java.util.Scanner;

public class ProgramaInManual001 {
	public static void main(String[] args) {
		System.out.println("+-------------------------------------------+");
		System.out.println("|  Autor: Harold Adrian Bolanos Rodriguez   |");
		System.out.println("|  Fecha: 24/OCT 2020                       |");
		System.out.println("+-------------------------------------------+");
		System.out.println("|  Programa Entrada Manual: Captura Teclado |");
		System.out.println("+-------------------------------------------+");
		System.out.println();

		String numero = "";
		Scanner scan = new Scanner(System.in);
		
		System.out.println("digite un numero: ");
		numero = scan.next();

		System.out.println("el numero digitado es: " + numero);

	}
}
