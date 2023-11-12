package bucles;

import java.util.Scanner;

//ENTRADA: 20 || ESPERADO: 2 cifras || OBTENIDO: 2 cifras
//ENTRADA: -1 || ESPERADO: Error || OBTENIDO: Error

public class E9 {

	public static void main(String[] args) {
		int n1;
		//Variable para el numero a introducir
		int contador=0;
		//Variable para el contador
		Scanner sc = new Scanner(System.in);
		// Abro el scanner
		System.out.println("Introduzca un numero: ");
		// System out para preguntar por el numero
		n1=sc.nextInt();
		// n1 = scanner para introducir el numero con el teclado
		if (n1<=0) {
			System.out.println("Error");
			//Si el n1 es menor o igual que 0 da error
		
		}else {
		for(;n1>0;contador++){
			//For mientras que n1 sea mayor que 0 va sumando 1 al contador
		n1=n1/10;
		// Voy dividiendo hasta que de 0
		}
		System.out.println("El numero tiene: " + contador + " cfiras");
		//System out con el numero de cifras
		sc.close();
		//Cierro el scanner
	}

}}
