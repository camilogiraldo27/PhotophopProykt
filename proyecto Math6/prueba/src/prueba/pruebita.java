package prueba;

import java.util.Scanner;

public class pruebita {
	static double numero1,numero2,resultado_suma=0;
	private static Scanner leer;

	public static void main(String[] args) {
		leer_numeros();
		System.out.println(suma(resultado_suma));

	}
	
	public static void leer_numeros(){
		leer = new Scanner(System.in);
		System.out.println("Ingrese un numero");
		numero1=leer.nextDouble();
		System.out.println("Ingrese un numero");
		numero2=leer.nextDouble();
	}
	
	public static double suma(double resultado){
		resultado=numero1+numero2;
		return resultado;
	}

}

