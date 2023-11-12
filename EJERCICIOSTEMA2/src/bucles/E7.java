package bucles;

import java.util.Scanner;

/*ENTRADA: 3 || ESPERADO:
1	
121
12321
 || OBTENIDO: lo mismo*/


public class E7 {

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
	    for(contador=1;contador<=n1;contador++) {
	    	//Primer for que va sumando 1 al contador hasta que sea menor o igual que el n1
            for(contador2=1; contador2<=contador;contador2++) {
                System.out.print(contador2);
                //For anidado que pone los numeros hasta el valor de contador
            }
            for(contador2=contador-1;contador2>=1;contador2--) {
                System.out.print(contador2);
                //Segundo for anidado que va poniendo los numeros desde (contador-1) hasta 1, restando 1 cada iteracion
            }
            System.out.println();
            //Al poner los numeros en cada fila, hace un salto de linea
        }

        sc.close();
        //Cierro el scanner
   

	}

}
