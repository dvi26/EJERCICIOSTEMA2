package bucles;

import java.util.Scanner;

//ENTRADA: 12:59:59 +1 || ESPERADO: 13:0:0  || OBTENIDO: 13:0:0 

public class E1 {

	public static void main(String[] args) {
		int horas;
		//Variable de las horas
		int minutos;
		//Variable de los minutos
		int segundos;
		//Variable de los segundos
		int incremento;
		//Variable para el incremento
		int contador=0;
		//Variable para el contador
		Scanner sc = new Scanner(System.in);
		// Abro el scanner
		System.out.println("Introduzca las horas:");
		// System out para preguntar por las horas
		horas = sc.nextInt();
		// horas = scanner para introducir el numero con el teclado
		System.out.println("Introduzca los minutos:");
		// System out para preguntar por los minutos
		minutos = sc.nextInt();
		// minutos = scanner para introducir el numero con el teclado
		System.out.println("Introduzca los segundos:");
		// System out para preguntar por los segundos
		segundos = sc.nextInt();
		// segundos = scanner para introducir el numero con el teclado
		System.out.println("Introduzca los segundos a incrementar:");
		// System out para preguntar por el incremento
		incremento=sc.nextInt();
		// incremento = scanner para introducir el numero con el teclado
		for (contador=0; contador<incremento;contador++) {
            segundos++;
            //For hasta que el contador sea mayor que el incremento, va sumando 1 al contador
            if (segundos==60) {
                minutos++;
                segundos=0;
                //Si los segundos llegan a 60, se suma un minuto y se ponen los segundo a 0
            if (minutos==60) {
                    horas++;
                    minutos=0;
                    //Si los minutos llegan a 60, se suma una hora y los minutos se ponen a 0
            }}}
        System.out.printf("La hora sera: " + horas + ":" + minutos + ":" + segundos);
        //System out con la hora
        sc.close();
        //Cierro el scanner
    }
}
			
				
	
