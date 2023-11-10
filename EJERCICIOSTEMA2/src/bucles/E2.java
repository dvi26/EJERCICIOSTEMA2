package bucles;

import java.util.Scanner;

public class E2 {

	public static void main(String[] args) {
		int n1;
		int contador=0;
		int contador2=0;
		double div2;
		double div3;
		double div5;
		double div7;
		// Declaro la variable del numero
		Scanner sc = new Scanner(System.in);
		// Abro el scanner
		System.out.println("Introduzca un numero ");
		// System out para preguntar por el numero
		n1 = sc.nextInt();
		// n1 = scanner para introducir el numero con el teclado
		while (contador<=n1) {
		contador++;
		
		div2=contador%2;
		div3=contador%3;
		div5=contador%5;
		div7=contador%7;
		
		
		if(div2==0 || div3==0 || div5==0 || div7==0) {
			contador2++;
		
		}		}
			
		int contadorF=contador-contador2;
		System.out.println("La cantidad de numeros primos es de: " + contadorF );
		sc.close();

		
		

	}

}
