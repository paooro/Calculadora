package calculadora;

public class Calculadora {

	private String op;
	private Float num1;
	private Float num2;
	private Float result;

	public Calculadora() {

	}

	public int sumar(float a, float b) {
		int c;
		c = (int) (a + b);
		return c;
	}

	public int restar(float a, float b) {
		int c;
		c = (int) (a - b);
		return c;
	}

	public float dividir(float a, float b) {
		float c;

		c = a / b;
		return c;
	}

	public int multiplicar(float a, float b) {
		int c;
		c = (int) (a * b);
		return c;
	}

	public String getOp() {
		return op;
	}

	public void setOp(String op) {
		this.op = op;
	}

	public Float getNum1() {
		return num1;
	}

	public void setNum1(Float num1) {
		this.num1 = num1;
	}

	public Float getNum2() {
		return num2;
	}

	public void setNum2(Float num2) {
		this.num2 = num2;
	}

	public Float getResult() {
		return result;
	}

	public void setResult(Float result) {
		this.result = result;
	}

}