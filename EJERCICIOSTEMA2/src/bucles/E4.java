package bucles;

import java.util.Scanner;

//ENTRADA: 55/10 || ESPERADO: 5 || OBTENIDO: 5

public class E4 {

	public static void main(String[] args) {
		int a;
		int b;
		//Variables para a y b
		int menorn;
		//Variable para el menor numero
		int MCD=1;
		//Variable para el MCD
		int nD;
		//Variable con el numero a dividir
		Scanner sc = new Scanner(System.in);
		//Abro el scanner
	    System.out.print("Ingrese el primer numero: ");
	    //System out que pide el primer numero
	    a=sc.nextInt();
	    //a=scanner para introducir el numero con el teclado
	    System.out.print("Ingrese el segundo numero: ");
	    //System out que pide el segundo numero
	    b=sc.nextInt();
	    //b=scanner para introducir el numero con el teclado
	    menorn =(a<b)?a:b;
	    //operador ternario para cogger a o b segun a<b sea verdadera (a) o falsa(b)
	        for (nD=menorn;nD>=1;nD--) {
	        	//For que va restanto 1 a nD hasta que nD sea mayor o igal que 1 (infinitamente)
	            if (a%nD==0 && b%nD==0) {
	                MCD = nD;
	                //if que cuando el resto de a/nD y el resto de b/ND sea 0 haga que el MCD sea el  nD
	                break; 
	                //Al encontrarlo, para el bucle
	            }
	        }

	        System.out.println("El máximo común divisor es: "+ MCD);
	        //System out con el MCD
	        sc.close();
	        //Cierro el scanner
	    }
	}