package bucles;

import java.util.Scanner;

//ENTRADA: 100 || ESPERADO: 25 || OBTENIDO: 25
//ENTRADA: -1 || ESPERADO: Error || OBTENIDO: Error
//ENTRADA: 1 || ESPERADO: 0 || OBTENIDO: 0
public class E2 {

	public static void main(String[] args) {
		int n1;
		//Variable del numero a introducir
		int contador=1;
		//Variable para el contaador
		int contador2=1;
		//Variable para el contador de no primos
		int contadorF;
		//Variable para los numeros que son primos
		double div2;
		double div3;
		double div5;
		double div7;
		//Restos del contador entre 2,3,5 y 7 
		Scanner sc = new Scanner(System.in);
		// Abro el scanner
		System.out.println("Introduzca un numero ");
		// System out para preguntar por el numero
		n1 = sc.nextInt();
		// n1 = scanner para introducir el numero con el teclado
		
		if (n1<1) {
		System.out.println("Error");
		//If para que si el numero es menor que 1 de error
		}
		else if(n1==1) {
		System.out.println("La cantidad de numeros primos es de: " + 0 );	
		//Else if para que si el numero es 1 de 0 primos
		}else {
		while (contador<n1) {
		contador++;
		//While hasta que el contador sea menor que n1, que va sumando 1 al contador
		if(contador !=2 && contador!=3 && contador!=5 && contador !=7) {
		div2=contador%2;
		div3=contador%3;
		div5=contador%5;
		div7=contador%7;
		//If para cuando el contador no sea 2,3,5 y 7 haga los restos para comprobar si no es primo (da 0)
		
		
		if(div2==0 || div3==0 || div5==0 || div7==0) {
			contador2++;
		//Si algún resto da 0, se la suma 1 al contador de no primos
		}}}
			
		contadorF=n1-contador2;
		//Operacion para calcular los que son primos, restando el numero total al contador de no primos
		System.out.println("La cantidad de numeros primos es de: " + contadorF );
		//System out con el numero de primos
		sc.close();
		//Cierro el scanner
		
		

	}}}


