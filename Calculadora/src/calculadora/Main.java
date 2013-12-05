package calculadora;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import calculadora.Calculadora;

public class Main {

	private Calculadora calculadora;
	private static int op;
	private int num1;
	private int num2;

	private int num3;
	private int num4;

	private int num5;
	private int num6;

	private int num7;
	private int num8;

	private float result1;
	private float result2;
	private float result3;
	private float result4;

	public static void main(String[] args) throws NumberFormatException,
			IOException {

		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);

		Calculadora cal = new Calculadora();
		

		do {

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

				int result1 = cal.sumar(num1, num2);

				System.out.println("El resultado de la suma es de: " + result1);

				break;
			case 2:
				System.out.println("Ingrese primer número");
				int num3 = Integer.parseInt(br.readLine());
				System.out.println("Ingrese segundo número");
				int num4 = Integer.parseInt(br.readLine());

				int result2 = cal.restar(num3, num4);

				System.out
						.println("El resultado de la resta es de: " + result2);

				break;
			case 3:
				System.out.println("Ingrese primer número");
				int num5 = Integer.parseInt(br.readLine());
				System.out
						.println("Ingrese segundo número (Diferente de cero)");
				int num6 = Integer.parseInt(br.readLine());

				if (num6 != 0) {
					float result3 = cal.dividir(num5, num6);
					System.out.println("El resultado de la división es de: "
							+ result3);
				} else {
					System.out
							.println("La operación no se puede realizar, el segundo número es cero");
				}
				break;
			case 4:
				System.out.println("Ingrese primer número");
				int num7 = Integer.parseInt(br.readLine());
				System.out.println("Ingrese segundo número");
				int num8 = Integer.parseInt(br.readLine());

				int result4 = cal.multiplicar(num7, num8);

				System.out.println("El resultado de la multiplicación es de: "
						+ result4);

				break;

			default:
				break;
			}
		} while (op!= 5);
		

	}

}
