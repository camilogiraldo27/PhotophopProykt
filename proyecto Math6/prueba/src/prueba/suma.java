package prueba;

import java.util.Scanner;

public class suma {
	 Scanner ss=new Scanner(System.in);
	static double num1,num2;
	static double resultado;
	

	public static void main(String args[]) {
		
	    suma s = new suma(num1,num2);
	    s.Sumar();
		
		
		

	}
	
	  suma(double x,double y){
		System.out.println("Ingrese nuemero: ");
			num1=x=ss.nextDouble();
		System.out.println("Ingrese nuemero: ");
			num2=y=ss.nextDouble();
			
		
	}
	
	public void Sumar(){
		
		resultado=num1+num2;
		System.out.println(resultado);
		
	}
	
	
	

}

