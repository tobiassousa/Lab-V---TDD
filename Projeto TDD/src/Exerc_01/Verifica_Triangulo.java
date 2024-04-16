package Exerc_01;

public class Verifica_Triangulo {

	public static String classificarTriangulo(int lado1, int lado2, int lado3) {
	    if (lado1 + lado2 <= lado3 || lado1 + lado3 <= lado2 || lado2 + lado3 <= lado1) {
	        return "Não é um triângulo.";
	    }

	    if (lado1 == lado2 && lado2 == lado3) {
	        return "Triângulo equilátero.";
	    }

	    if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
	        return "Triângulo isósceles.";
	    }
	    if (lado1 != lado2 || lado1 != lado3  || lado2 != lado3 ) {
	        return "Triângulo escaleno.";
	    }

	    return "Triângulo escaleno.";
	}

	}

