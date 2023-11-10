package bucles;

import java.util.Scanner;

public class E1 {

	public static void main(String[] args) {
		int horas;
		//Variable de las horas
		int minutos;
		//Variable de los minutos
		int segundos;
		//Variable de los segundos
		int incremento;
		//Variable para el incremento
		int segundosF;
		//Variable para los segundos finales
		int minutosF=0;
		//Variable para los minutos finales
		int contador=0;
		//Variable para el contador
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
		System.out.println("Introduzca los segundos a incrementar:");
		// System out para preguntar por el incremento
		incremento=sc.nextInt();
		// incremento = scanner para introducir el numero con el teclado
		segundosF=incremento+segundos;
		
		while(segundosF>59) {
		minutos++; 
		contador++; 
		segundosF=segundosF-60; 
		}
		while(minutos>59){
			horas++; 
			minutos=minutos-60;
		}
		System.out.println("La hora será: " + horas + ":" + minutos + ":" + segundosF );
		sc.close();
	}}		
			
				
	
