package bucles;

import java.util.Scanner;

//ENTRADA: 55/10 || ESPERADO: 110 || OBTENIDO: 110

public class E5 {

	public static void main(String[] args) {
		int a;
		int b;
		//Variables para a y b
		int mayorn;
		//Variable para el mayor numero
		int mcm=1;
		//Variable para el mcm
		int nM;
		//Variable con el numero a multiplicar
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
	    mayorn =(a>b)?a:b;
	    //operador ternario para cogger a o b segun a>b sea verdadera (a) o falsa(b)
	        for (nM=mayorn;nM>=1;nM++) {
	        	//For que va sumando 1 a nM hasta que nD sea mayor o igual que 1 (infinitamente)
	            if (nM%a==0 && nM%b==0) {
	                mcm = nM;
	                //if que cuando el resto de nM/a y el resto de nM/b sea 0 haga que el mcm sea el nM
	                break; 
	                //Al encontrarlo, para el bucle
	            }
	        }

	        System.out.println("El mínimo comun multiplo es: "+ mcm);
	        //System out con el mcm
	        sc.close();
	        //Cierro el scanner
	    }
	}

	


