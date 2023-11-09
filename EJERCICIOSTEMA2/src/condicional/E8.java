package condicional;

import java.util.Scanner;
//ENTRADA: 100/8 || ESPERADO: 250 || OBTENIDO: 250    
//ENTRADA: 900/9 || ESPERADO: 1575 || OBTENIDO: 1575 

public class E8 {

	public static void main(String[] args) {
		final double preciokm=2.5;
		//Constante del precio por km
		final int dias;
		//Constante para los dias
		double distancia;
		//Variable para la distancia
		double precio;
		//Variable de la operacion para calcular el precio
		double reduccion;
		//Variable de la reduccion
		Scanner sc = new Scanner(System.in);
		// Abro el scanner
		System.out.println("Introduzca la distancia: ");
		// System out para preguntar por la distancia
		distancia = sc.nextDouble();
		// distancia = scanner para introducir el numero con el teclado
		System.out.println("Introduzca el numero de días: ");
		// System out para preguntar por el numero de dias
		dias = sc.nextInt();
		// dias=scanner para introducir el numero con el teclado
		precio=preciokm*distancia;
		//operacion para calcular el precio
		
		if (dias>7 && distancia>800) {
		//if para cuando el n de dias es mayor que 7 y el n de kms es mayor que 800
		reduccion=precio*0.3;
		//operacion para la reduccion
		precio=precio-reduccion;
		//resta para calcular el precio final
		System.out.println("El precio será de " + precio + " euros");
		//system out con el precio final
		
		}else {
		System.out.println("El precio será de " + precio + " euros");
		//else que muestra el precio si no se cumple la condicion anterior
	}
	sc.close();	
	//Cierro el scanner
		
}}
