package bucles;

import java.util.Scanner;

//ENTRADA: 131 || ESPERADO: Capicua || OBTENIDO: Capicua
//ENTRADA: 4923 || ESPERADO: No capicua || OBTENIDO: No capicua

public class E10 {

	public static void main(String[] args) {
		  	int n1;
		  	//Variable del numero a introducir
		  	int nI=0;
		  	//Variable del numero inverso
		  	int resto;
		  	//Variable para el resto
		  	int nO;
		  	//Variable con el numero original
		  	Scanner sc = new Scanner(System.in);
		  	//Abro el scanner
	        System.out.println("Introduzca un numero: ");
	        //System out preguntando por el numero
	        n1=sc.nextInt();
	        //n1=scanner para introducir el numero con el teclado
	        nO=n1;
	        //le doy el valor a n0 de n1

	        while (n1>0) {
	        	//while hasta que el n1 sea mayor que 0
                resto=n1%10;
                //El resto del número para dejar el numero como la ultima unidad
                nI=nI*10+resto;
                // invierto el numero en  NI
                n1=n1/10;
                /*Utilizo nI como placeholder, dandole el valor de el numero introducido 
				entre 10 para coger el numero sin el ultimo numero*/
            }

            if (nO==nI) {
                System.out.println("Es capicua.");
                //Si el numero original es igual al numero inverso es capicua
            }else{
                System.out.println("No es capicua.");
                //Si no, no es capicua
            }
    sc.close();
    //Cierro el scanner
	}
	
	}


