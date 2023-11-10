package condicional;

import java.util.Scanner;
//ENTRADA: 32/59/59|| ESPERADO: La hora será: 33 horas 0 minutos 0 segundos  || OBTENIDO: La hora será: 33 horas 0 minutos 0 segundos     
//ENTRADA: 32/12/59 || ESPERADO: La hora será: 32 horas 13 minutos 0 segundos  || OBTENIDO: La hora será: 32 horas 13 minutos 0 segundos  
//ENTRADA: 32/60/60 || ESPERADO: Error || OBTENIDO: Error

public class E7 {

	public static void main(String[] args) {
		int horas;
		//Variable de las horas
		int minutos;
		//Variable de los minutos
		int segundos;
		//Variable de los segundos
		Scanner sc = new Scanner(System.in);
		// Abro el scanner
		System.out.println("Introduzca las horas:");
		// System out para preguntar por las horas
		horas = sc.nextInt();
		// horas = scanner para introducir el numero con el teclado
		System.out.println("Introduzca los minutos:");
		// System out para preguntar por los minutos
		minutos = sc.nextInt();
		// minutos = scanner para introducir el numero con el teclado
		System.out.println("Introduzca los segundos:");
		// System out para preguntar por los segundos
		segundos = sc.nextInt();
		// segundos = scanner para introducir el numero con el teclado

		
		if(segundos>=59 || minutos>=59) {
		System.out.println("Error. 60 segundos es 1 minuto/60 minutos es 1 hora");	
		}
		else if(segundos==59 && minutos==59) {
			segundos=0;
			minutos=0;
			horas=horas+1;
			System.out.println("La hora será: " + horas + " horas " + minutos + " minutos " + segundos + " segundos " );
		}
			
			else if(segundos==59) {
				segundos=0;
				minutos=minutos+1;
				System.out.println("La hora será: " + horas + " horas " + minutos + " minutos " + segundos + " segundos " );
				
			}else {
			segundos=segundos+1;
			System.out.println("La hora será: " + horas + " horas " + minutos + " minutos " + segundos + " segundos " );
			}
		sc.close();
		}
}
