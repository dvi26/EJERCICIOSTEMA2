package condicional;

import java.util.Scanner;
//ENTRADA: 9 || ESPERADO: nueve || OBTENIDO: nueve    
//ENTRADA: 12 || ESPERADO: doce || OBTENIDO: doce 
//ENTRADA: 65 || ESPERADO: sesenta y cinco || OBTENIDO: sesenta y cinco
//ENTRADA: -1 || ESPERADO: Error || OBTENIDO: Error    
//ENTRADA: 101 || ESPERADO: Error || OBTENIDO: Error 

public class E4 {

	public static void main(String[] args) {
		int n1;
		//Varialbe para el numero introducido
		int n2;
		//Variable para calcular las unidades
		int n3;
		//Variable para calcular las decenas
		String unidades;
		//Variable para las unidades(Del 0 al 9)
		String decenas;
		//Variable para las decenas (20,30,40,50,60,70,80,90)
		String excepciones;
		//Variable para los numeros entre el 10 y el 15
		String u0="cero";
		String u1= "uno";
		String u2= "dos";
		String u3= "tres";
		String u4= "cuatro";
		String u5= "cinco";
		String u6= "seis";
		String u7= "siete";
		String u8= "ocho";
		String u9= "nueve";
		String u10= "diez";
		String u11= "once";
		String u12= "doce";
		String u13= "trece";
		String u14= "catorce";
		String u15= "quince";
		String u20= "veinte";
		String u30= "treinta";
		String u40= "cuarenta";
		String u50= "cincuenta";
		String u60= "sesenta";
		String u70= "setenta";
		String u80= "ochenta";
		String u90= "noventa";
		//Le doy los valores de los numeros necesarios a variables
		Scanner sc = new Scanner(System.in);
		// Abro el scanner
		System.out.println("Introduzca un numero (Entre (0 y 99) ");
		// System out para preguntar por el numero
		n1 = sc.nextInt();
		// n1 = scanner para introducir el numero con el teclado
		if (n1<0 || n1>99) {
			System.out.println("El número introducido es incorrecto (Fuera de rango) ");}
		//Condición if que declara que si el numero es menor que 0 o mayor que 99 haga el system out
		else if (n1<10){
			//Else if para cuando el numero es menor que 10
			unidades=switch(n1) {
			case 0 -> u0;
			case 1 -> u1;
			case 2 -> u2;
			case 3 -> u3;
			case 4 -> u4;
			case 5 -> u5;
			case 6 -> u6;
			case 7 -> u7;
			case 8 -> u8;
			case 9 -> u9;
			default -> "Error";
			};
			//Switch con los casos del 0 al 9 que de las variables Strings declaradas previamente
			System.out.println("El número introducido se lee como: " + unidades);
			//System out que muestre el numero
		}
			else if (n1>=10 && n1<=15) {
				//Else if para cuando el numero introducido esté entre 10 y 15
				excepciones=switch(n1) {
				case 11 -> u11;
				case 12-> u12;
				case 13-> u13;
				case 14 -> u14;
				case 15 -> u15;
				default -> "Error";
				};
				//Switch con los casos del 1 al 15 que de las variables declaradas previamente
				System.out.println("El número introducido se lee como: " + excepciones);
				//System out que muestre el numero
			}
				
				else if (n1>15) {
				//Else if para cuando el numero es mayor que 15 
				n2=n1%10;
				//Operacion para que al el numero introducido ser de dos cifras, saque solo las unidades
				unidades=switch(n2) {
				case 1 -> u1;
				case 2 -> u2;
				case 3 -> u3;
				case 4 -> u4;
				case 5 -> u5;
				case 6 -> u6;
				case 7 -> u7;
				case 8 -> u8;
				case 9 -> u9;
				default -> "Error";
				};
				//Primer switch que de las unidades (n2) en letra según las variables declaradas al principio
				n3=n1/10;
				//Operacion para sacar solo las decenas del numero de dos cifras
				decenas=switch(n3) {
				case 1 -> u10;
				case 2 -> u20;
				case 3 -> u30;
				case 4 -> u40;
				case 5 -> u50;
				case 6 -> u60;
				case 7 -> u70;
				case 8 -> u80;
				case 9 -> u90;
				default -> "Error";
				};
				//Segundo switch que de las decenas (n3) en letra según las variables anteriores
				System.out.println("El número introducido se lee como: " + decenas + " y " + unidades);
				//System out que muestre el numero de dos cifras en letra
				}
		sc.close();
		//Cierro el scanner
	}
}
				
		
		
	


	


