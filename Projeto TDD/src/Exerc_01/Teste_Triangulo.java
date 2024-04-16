package Exerc_01;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class Teste_Triangulo {
	public static void main(String[] args) {
	
	}
    
    @Test
    public void testTrianguloEscaleno() {
        assertEquals("Triângulo escaleno.", Verifica_Triangulo.classificarTriangulo(3, 4, 5));
    }


    @Test
    public void testTrianguloEquilatero() {
        assertEquals("Triângulo equilátero.", Verifica_Triangulo.classificarTriangulo(6, 6, 6));
    }

    @Test
    public void testTrianguloIsosceles() {
        assertEquals("Triângulo isósceles.", Verifica_Triangulo.classificarTriangulo(5, 5, 7));
    }



    @Test
    public void testValorZero() {
        assertEquals("Não é um triângulo.", Verifica_Triangulo.classificarTriangulo(0, 4, 5));
    }

    @Test
    public void testValorNegativo() {
        assertEquals("Não é um triângulo.", Verifica_Triangulo.classificarTriangulo(-3, 4, 5));
    }

    @Test
    public void testSomaLadosIgualTerceiro() {
        assertEquals("Não é um triângulo.", Verifica_Triangulo.classificarTriangulo(2, 2, 4));
    }

    @Test
    public void testSomaLadosMenorTerceiro() {
        assertEquals("Não é um triângulo.", Verifica_Triangulo.classificarTriangulo(1, 1, 3));
    }
}
