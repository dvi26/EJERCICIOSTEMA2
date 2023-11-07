package condicional;

import java.util.Scanner;

//ENTRADA:12345678 || ESPERADO:12345678Z || OBTENIDO:12345678Z    
//ENTRADA:00000001 || ESPERADO:00000001R || OBTENIDO:00000001R 
//ENTRADA:22 || ESPERADO:00000022E || OBTENIDO:00000022E

public class E2 {

	public static void main(String[] args) {
	int nDNI;
	// Declaro la variable que contendrá los numeros a introducir
	int resto;
	// Declaro la variable que será el resto para calcular la letra
	String letra;
	// Variable que contendrá la letra
	Scanner sc = new Scanner(System.in);
	// Abro el scanner
	System.out.println("Introduzca los números de su DNI (8 digitos) ");
	// System out que pregunta por los numeros del DNI
	nDNI=sc.nextInt();
	// nDNI=scanner para introducir los numeros con el teclado
	if (nDNI<1 || nDNI>99999999) {
	System.out.println("El DNI introducido es incorrecto ");
	/* Hago un if con la cndición que establece el rango entre 1 y 99999999,
	 * si está fuera de este rango  se hace el system out */
	}else{
		resto=nDNI%23;
	// operación para el resto
	letra=switch(resto) {
	/*Hago un switch que compara el resto con los casos, y le da el valor a la letra
	 * en su correspondiente caso */
	case 0 -> "T";
	case 1 -> "R";
	case 2 -> "W";
	case 3 -> "a";
	case 4 ->"G";
	case 5 ->"M";
	case 6 ->"Y";
	case 7 ->"F";
	case 8 ->"P";
	case 9 ->"D";
	case 10 ->"X";
	case 11 ->"B";
	case 12 ->"N";
	case 13 ->"J";
	case 14 ->"Z";
	case 15 ->"S";
	case 16 ->"Q";
	case 17 ->"V";
	case 18 ->"H";
	case 19 ->"L";
	case 20 ->"C";
	case 21 ->"K";
	case 22 ->"E";
	default -> "Error";
	};
	
	if(nDNI<10000000 && nDNI>9999999)
		System.out.println("El DNI introducido es: " + "0" + nDNI + letra);
	else if(nDNI<1000000 && nDNI>=100000)
		System.out.println("El DNI introducido es: " + "00" + nDNI + letra);
	else if(nDNI<100000 && nDNI>=10000)
		System.out.println("El DNI introducido es: " + "000" + nDNI + letra);
	else if(nDNI<10000 && nDNI>=1000)
		System.out.println("El DNI introducido es: " + "0000" + nDNI + letra);
	else if(nDNI<1000 && nDNI>=100)
		System.out.println("El DNI introducido es: " + "00000" + nDNI + letra);
	else if(nDNI<100 && nDNI>=10)
		System.out.println("El DNI introducido es: " + "000000" + nDNI + letra);
	else if(nDNI<10)
		System.out.println("El DNI introducido es: " + "0000000" + nDNI + letra);
	//Conjunto de if/else if que establecen rangos por si el numero del DNI es menor a 99999999

	
	
	}
	sc.close();
	//Cierro el scanner
	}}

