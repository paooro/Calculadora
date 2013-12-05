package calculadora;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import calculadora.Calculadora;



public class Main {
	

			private Calculadora calculadora;
			private  int op;
			private int num1;
			private int num2;
			private float result;

			public static void main(String[] args) throws NumberFormatException, IOException {
							
				InputStreamReader isr = new InputStreamReader(System.in);
				BufferedReader  br = new BufferedReader (isr);
				
				
				Calculadora cal= new Calculadora();
				
				System.out.println("Bienvenido a su Calculadora");
				System.out.println("Escoja la opcion que desea realizar:");
				System.out.println("1.Sumar");
				System.out.println("2.Restar");
				System.out.println("3.Dividir");
				System.out.println("4.Multiplicar");
				System.out.println("5.Salir");
				
				int op = Integer.parseInt(br.readLine());
				
				switch (op) {
				case 1:
					     System.out.println("Ingrese primer número");
					     int num1 = Integer.parseInt(br.readLine());
					     System.out.println("Ingrese segundo número");
					     int num2 = Integer.parseInt(br.readLine());
					     
					    int result= cal.sumar(num1, num2);
					     
					     System.out.println("El resultado de la suma es de: "+result);
					
					
					break;

				default:
					break;
				}
				
				
				
			}

			
		
	}
