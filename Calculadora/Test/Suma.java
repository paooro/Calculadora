import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import calculadora.Calculadora;

class Suma {
    Calculadora calculadora = new Calculadora();
    
	 @Test
	    void sumar() {
	        int resultado = calculadora.sumar(5.0f, 3.0f);
	        assertEquals(8, resultado);
	    }

	    @Test
	    void sumarNegativos() {
	        int resultado = calculadora.sumar(-5.0f, -3.0f);
	        assertEquals(-8, resultado);
	    }
}