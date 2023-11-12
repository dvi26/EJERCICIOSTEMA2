package bucles;

import java.util.Scanner;

/*ENTRADA: 3 || ESPERADO:
1
22
333 || OBTENIDO: lo mismo*/



public class E6 {

	public static void main(String[] args) {
		int n1;
		//Variable para el numero
		int contador;
		int contador2;
		//Variable para los contadores
		Scanner sc = new Scanner(System.in);
		//Abro el scanner
	    System.out.print("Ingrese el numero: ");
	    //System out que pide el numero
	    n1=sc.nextInt();
	    //n1=scanner para introducir el numero con el teclado
	    if (n1>20 || n1<0) {
	    	System.out.print("Numero incorreccto");
	    	//if para establecer el rango, si este fuera de rango hace el system out
	    }else {
	    	 for(contador=1;contador<=n1;contador++) {
	    		 //Primer for que va sumando al contador hasta el numero introducido
	                for(contador2=0;contador2<contador;contador2++) {
	                	//for anidado que introduce el numero tantas veces como su valor
	                    System.out.print(contador);
	                    
	    }
	                System.out.println();
	                //printLN para saltar de linea entre cada segundo for

	}}
	sc.close();   
	//Cierro el scanner
	}}


