import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import calculadora.Calculadora;

class Dividir {
	Calculadora calculadora = new Calculadora();
	@Test
    void dividir() {
        float resultado = calculadora.dividir(6.0f, 3.0f);
        assertEquals(2.0f, resultado, 0.0001); 
    }

    @Test
    void dividirCero() {
        float resultado = calculadora.dividir(6.0f, 0.0f);
        assertTrue(Float.isInfinite(resultado)); 
    }
    
    @Test
    void dividirDecimales() {
        float resultado = calculadora.dividir(4.5f, 1.5f);
        assertEquals(3.0f, resultado, 0.0001);
    }

    @Test
    void dividirNegativos() {
        float resultado = calculadora.dividir(-6.0f, -3.0f);
        assertEquals(2.0f, resultado, 0.0001);
    }
}
