import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import calculadora.Calculadora;

class NumerosGrandes {
	Calculadora calculadora = new Calculadora();
	@Test
	void testOperacionesConNumerosGrandes() {
	    
	    int resultadoSuma = calculadora.sumar(100000000.0f, 200000000.0f);
	    assertEquals(300000000, resultadoSuma);

	    int resultadoResta = calculadora.restar(3000000000.0f, 2000000000.0f);
	    assertEquals(1000000000, resultadoResta);

	    int resultadoMultiplicacion = calculadora.multiplicar(50000.0f, 20000.0f);
	    assertEquals(1000000000, resultadoMultiplicacion);

	    float resultadoDivision = calculadora.dividir(3000000000.0f, 1500000000.0f);
	    assertEquals(2.0f, resultadoDivision, 0.0001);
	}
}
