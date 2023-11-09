package bucles;

import java.util.Scanner;

public class E9 {

	public static void main(String[] args) {
		int n1;
		int contador=0;
		Scanner sc = new Scanner(System.in);
		// Abro el scanner
		System.out.println("Introduzca un numero: ");
		// System out para preguntar por el numero
		n1=sc.nextInt();
		// n1 = scanner para introducir el numero con el teclado
		for(n1=n1;n1>0;contador++){
		n1=n1/10;
		}
		System.out.println("El numero tiene: " + contador + " cfiras");
		sc.close();
	}

}
