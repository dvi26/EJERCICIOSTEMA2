package condicional;

import java.util.Scanner;
//ENTRADA: 2 || ESPERADO: 2 || OBTENIDO: 2    
//ENTRADA: -2 || ESPERADO: 2 || OBTENIDO: 2 
//ENTRADA: 0 || ESPERADO: 0 || OBTENIDO: 0

public class E5 {

	public static void main(String[] args) {	
		int n1;
		//Variable del numero a introducir
		int condicion;
		//Variable de la condicion del ternario
		Scanner sc = new Scanner(System.in);
		// Abro el scanner
		System.out.println("Introduzca un numero (Entre (0 y 99) ");
		// System out para preguntar por el numero
		n1 = sc.nextInt();
		// n1 = scanner para introducir el numero con el teclado
		condicion=(n1>0)?n1:(n1*(-1));
		//Operador ternario de que si la condicion de que n1 es mayor que 0 es verdadera, de el n1, y si es falsa de el numero en negativo
		if (n1==0) {
			System.out.println("El numero es " + n1 );
		//If para cuando el numero introducido es 0
		}else {
			System.out.println("El numero es " + condicion );
		//Si no es 0 de la condicion	
		}	
		sc.close();
		//Cierro el scanner
		}
	}
