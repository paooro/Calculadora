import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import calculadora.Calculadora;

class Multiplicar {
	Calculadora calculadora = new Calculadora();
    @Test
    void multiplicar() {
        int resultado = calculadora.multiplicar(5.0f, 3.0f);
        assertEquals(15, resultado);
    }
    
    @Test
    void multiplicarDecimales() {
        int resultado = calculadora.multiplicar(2.5f, 1.5f);
        assertEquals(3, resultado);
    }
    @Test
    void multiplicarNegativos() {
        int resultado = calculadora.multiplicar(-5.0f, -3.0f);
        assertEquals(15, resultado);
    }
}
