package condicional;

import java.util.Scanner;

//ENTRADA: 12/59/59|| ESPERADO: 13/0/0  || OBTENIDO: 13/0/0    

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
		segundos++;
		// sumo 1 a los segundos

		 if (segundos==60) {
			 segundos=0;
	     minutos++;
	     //Si los segundos llegan a 60, se ponen a 0 y se suma 1 minuto
	        }
	        if (minutos==60) {
	            minutos=0;
	            horas++;
	      //Si los minutos llegan a 60, se ponen a 0 y se suma 1 hora
	        }
	        System.out.println("La hora sera: " + horas + " horas " + minutos + " minutos " + segundos + " segundos");
	        //System out con la hora
		sc.close();
		//Cierro el scanner
		}
}
