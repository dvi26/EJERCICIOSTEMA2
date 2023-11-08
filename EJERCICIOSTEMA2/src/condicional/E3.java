package condicional;

import java.util.Scanner;

//ENTRADA:12345678 || ESPERADO:12345678Z || OBTENIDO:12345678Z    
//ENTRADA:00000001 || ESPERADO:00000001R || OBTENIDO:00000001R 
//ENTRADA:22 || ESPERADO:00000022E || OBTENIDO:00000022E

public class E3 {

	public static void main(String[] args) {
		double CTotal;
		// Variable de la cantidad total comprada
		double nA;
		// Variable del numero de aniamles
		double kilos;
		// Variable de los kilos que consumen en total los animales
		double kilosconsumidos;
		// Varialbe que determinará los kilos consumidos por animal
		double kilosnecesarios;
		// Variable para los kilos que se necesitarán
		Scanner sc = new Scanner(System.in);
		// Abro el scanner
		System.out.println("Introduzca la cantidad de comida comprada");
		// System out preguntando por la comida
		CTotal=sc.nextDouble();
		// CTotal = scanner para introducir la comida por el teclado
		System.out.println("Introduzca el numero de animales ");
		// System out preguntando por el numero de animales
		nA=sc.nextDouble();
		//nA= scanner para introducir el numero de aniamles con el teclado
		System.out.println("Introduzca los kilos que comen en total ");
		// System out preguntando por los kilos
		kilos=sc.nextDouble();
		kilosconsumidos=kilos/nA;
		kilosnecesarios=CTotal/nA;
		
		if(nA<=0 && kilos<=0 && CTotal<=0) {
		System.out.println("Algún dato introducido es erroneo (Menor que 0) ");
		}
		else if (kilosconsumidos>kilosnecesarios) {
		System.out.println("Si se tendrá comida suficiente ");
		}
		else if (kilosconsumidos<kilosnecesarios) {
		System.out.println("Necesitarán una ración cada uno de  " + kilosnecesarios + "kg");
		
	}
		sc.close();
}}
