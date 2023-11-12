package bucles;

import java.util.Scanner;

/*ENTRADA: 100 || ESPERADO: 
   	*
   * * 
  * * * 
 * * * * 
* * * * *   || OBTENIDO: lo mismo*/

public class E3 {

	public static void main(String[] args) {
	        int n1;
	        //Variabe del numero a introducir
	        int contador;
	        int contador2;
	        int contador3;
	        //Variables de los contadores
	        Scanner sc = new Scanner(System.in);
	        //Abro el scanner
	        System.out.println("Introduzca un numero: ");
	        //System out que pregunta por el numero
	        n1 = sc.nextInt();
	        //n1=scanner para introducir el numero con el tecclado

	        for(contador=0;contador<=n1;contador++) {
	        	//Primer for para el numero de filas, hasta que el contador sea menor o igual que n1
	            for(contador2=contador;contador2<n1;contador2++) {
	                System.out.print(" ");
	              //For anidado  para los espacios antes de los asteriscos, teniendo en cuenta hasta que c2 menor que n1
	            }
	         for (contador3=1;contador3<=contador;contador3++) {
	             System.out.print("* ");
	              //For que va añadiendo los asteriscos, hasta que el c3 sea menor o igual que el contador
	            }
	            System.out.println();
	            //printLN para pasar a la siguiente linea
	        }
	        sc.close();
	        //Cierro el scanner
	    }
	}
