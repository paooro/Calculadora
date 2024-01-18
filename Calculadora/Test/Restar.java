import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import calculadora.Calculadora;

class Restar {
	Calculadora calculadora = new Calculadora();
    @Test
    void restar() {
        int resultado = calculadora.restar(5.0f, 3.0f);
        assertEquals(2, resultado);
    }
    
    @Test
    void restarNegativos() {
        int resultado = calculadora.restar(-5.0f, -3.0f);
        assertEquals(-2, resultado);
    }
}
