package condicional;

import java.util.Scanner;

public class E1 {

	public static void main(String[] args) {
		int n1;
		// Declaro la variable
		int resto;
		int nI=0;
		Scanner sc = new Scanner(System.in);
		// Abro el scanner
		System.out.println("Introduzca un numero (Entre (0 y 9999) ");
		// System out para preguntar por el numero
		n1 = sc.nextInt();
		// numero = scanner para introducir el numero con el tecladoç+
		if (n1<0 || n1>9999) {
			System.out.println("Error, introduzca un número dentro del rango ");
		}else if(n1>=0 && n1<=9999){
			if (n1<=9) {
				System.out.println("El número es capicua ");
			}else if(n1>=10 && n1<=99){
				resto=n1%10;	
				nI=2*10+resto;
				n1=n1/10;
				
			}else if(n1>=100 && n1<=999){
				resto=n1%10;	
				nI=3*10+resto;
				n1=n1/10;
				
			}else if(n1>=1000 && n1<=9999){
				resto=n1%10;	
				nI=4*10+resto;
				n1=n1/10;
				
				
			}
		
		}
		if(nI==n1)
			 System.out.println("El numero es capicua");
			else
			 System.out.println("El numero no es capicua");
		sc.close();

	}

}
