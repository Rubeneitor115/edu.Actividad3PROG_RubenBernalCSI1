/***
 * Ruben Bernal Ramos, CSI1
 */

package controladores;

import java.util.Scanner;

/**
 * Clase controladora de la aplicación
 * @author rbr - 291025
 *
 */
public class Inicio {

	/*No la declaro como public puesto que java por defecto al no especificarlo 
	 * la declara como private lo que me interesa para que no se pueda acceder a 
	 * la variable constante desde cualquier parte del código
	 */
	static final double PI = 3.1416;
	
	/**
	 * Método de entrada de la aplicación
	 * @author rbr - 291025
	 * @param args
	 */
	public static void main(String[] args) {
		
		//Variables
		double radio, area;
		Scanner sc = new Scanner(System.in);
		
		//Pido al usuario la medida del radio y la guardo en su variable asignada
		System.out.println("Introduzca la medida del radio: ");
		radio = sc.nextDouble();
		
		//Calculo la medida del área
		area = PI * Math.pow(radio, 2);
		
		//Muestro el resultado por pantalla
		System.out.println("El área de la circinferencia es: " + area);
	
		//Cierro la variable Scanner
		sc.close();
	}

}

