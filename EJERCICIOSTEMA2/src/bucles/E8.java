package bucles;

import java.util.Scanner;

public class E8 {

	public static void main(String[] args) {
		int n1;
		int nU;
		int contador=1;
		int contador2=0;
		Scanner sc = new Scanner(System.in);
		System.out.print("Ingrese un numero: ");
		n1=sc.nextInt();
		do {
            System.out.print("Ingrese un numero: ");
            nU=sc.nextInt();
            if (nU > n1) {
                n1=nU;
                contador++; 
			}else{
            System.out.println("Tiene que ser mayor que el ultimo introducido.");
            System.out.print("Ingrese un numero: ");
            nU=sc.nextInt();
            contador++;
            contador2++;
            if (nU==0) {
            break;
            }
            else if (nU < n1) {
            	 System.out.println("Tiene que ser mayor que el ultimo introducido.");
            }
			}
		}while(nU!=0);
		
		System.out.println("El total de numeros introducidos es de: " + contador);
		System.out.println("El numero de fallos es de: " + contador2);
		sc.close();
		}}


