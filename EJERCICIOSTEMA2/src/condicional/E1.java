package condicional;

import java.util.Scanner;

public class E1 {

	public static void main(String[] args) {
		int n1;
		// Declaro la variable del numero
		int nI=0;
		// Variable para el número inverso
		int resto;
		int resto2;
		int resto3;
		int resto4;
		// Variables para los retos
		Scanner sc = new Scanner(System.in);
		// Abro el scanner
		System.out.println("Introduzca un numero (Entre (0 y 9999) ");
		// System out para preguntar por el numero
		n1 = sc.nextInt();
		// n1 = scanner para introducir el numero con el teclado
		if (n1<0 || n1>9999) {
		System.out.println("Error, introduzca un número dentro del rango ");
		/* Abro el if con la condición de que si el número introducido es 
		menor que 0 o mayor que 9999 haga el system out*/
		}else if(n1>=0 && n1<=9999){
		// Else if con la condición del rango entre 0 y 9999
			if (n1<=9) {
				System.out.println("El número es capicua ");
		//Abro un if para cuando el número sea igual o menor que 9
			}else if(n1>=10 && n1<=99){
		// Else if para cuando el número este entre 10 y 99
				resto=n1%10;
				// El resto del número dejar el numero como la ultima unidad
				nI=n1/10;
				/* Utilizo nI como placeholder, dandole el valor de el numero introducido 
				entre 10 para coger el numero sin el ultimo numero*/
				resto2=nI;
				// En el caso de dos unidades, el numero seria de un solo digito
				nI=resto*10+resto2;
				/* El número inverso se calcula con el resto inicial (último numero) por 10
				+ el resto2 */
				if(nI==n1)
				System.out.println("El numero es capicua");
				else
				System.out.println("El numero no es capicua");
				/* Condición if else para que si el número introducido es igual al inverso calculado
				haga el system out diciendo que es capicua, si no haga el system out
				diciendo que no lo es */
				
			}else if(n1>=100 && n1<=999){
			// Else if para cuando el número este entre 100 y 999
				resto=n1%10;	
			// Hago el resto del número para dejar el numero como la ultima unidad
				nI=n1/10;
			/* Utilizo nI como placeholder, dandole el valor de el numero introducido 
			entre 10 para coger el numero sin el ultimo numero*/
				resto2=nI%10;
			// Hago el resto del número para dejar el nuevo numero como la ultima unidad
				nI=nI/10;
				resto3=nI;
				nI=resto*100+resto2*10+resto3;
				if(nI==n1)
					 System.out.println("El numero es capicua");
					else
					 System.out.println("El numero no es capicua");
				
			}else if(n1>=1000 && n1<=9999){
			// Else if para cuando el número este entre 1000 y 9999
				resto=n1%10;	
				nI=n1/10;
				resto2=nI%10;
				nI=nI/10;
				resto3=nI%10;
				nI=nI/10;
				resto4=nI;
				nI=resto*1000+resto2*100+resto3*10+resto4;
				if(nI==n1)
				System.out.println("El numero es capicua");
				else
				System.out.println("El numero no es capicua");
						
			}
		
		}
		
		sc.close();

	}

}
