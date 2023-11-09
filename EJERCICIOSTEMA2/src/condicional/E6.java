package condicional;

import java.util.Scanner;
//ENTRADA: respuesta (correcta) || ESPERADO:"RESULTADO CORRECTO"  || OBTENIDO: "RESULTADO CORRECTO"   
//ENTRADA: respuesta (incorrecta) || ESPERADO: "RESULTADO INCORRECTO" || OBTENIDO: "RESULTADO INCORRECTO"

public class E6 {

	public static void main(String[] args) {
		int numeror;
		int numeror2;
		//Variables de los numeros random
		int respuesta;
		//Variable de la respuesta del usuario
		int resultado;
		//Variable para la operacion
		Scanner sc = new Scanner(System.in);
		//Abro el scanner
		numeror=(int)(Math.random()*99+1);
		numeror2=(int)(Math.random()*99+1);
		//Math random para hacer los numeros randoms entre 99 y 1
		System.out.println("Introduzca el resultado de la suma: " + numeror + " + " + numeror2);
		//System out que pregunta por el resultado de la suma
		respuesta=sc.nextInt();
		//Respuesta=scanner para introducir la respuesta con el teclado
		resultado=numeror+numeror2;
		//Operacion para la suma
		
		
		if (resultado==respuesta) {
			System.out.println("El resultado de la suma introducido es correcto");
		//If para que cuando la operacion del resultado sea igual al numnero introducido, haga el system out diciendo que es correcto
		}else {
			System.out.println("El resultado de la suma introducido es incorrecto");
		//Else que cuando la operacion del resultado no sea igual al numnero introducido, haga el system out diciendo que es incorrecto
		
		}
		sc.close();
		//Cierro el scanner
	}

}
