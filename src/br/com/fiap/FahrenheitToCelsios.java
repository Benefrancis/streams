package br.com.fiap;

import java.util.OptionalDouble;
import java.util.stream.IntStream;

public class FahrenheitToCelsios {

	public static void main(String[] args) {

		// Convertendo as temperaturas em Celsios para Fahrenheit e devolvendo a m�dia
		OptionalDouble resultado = IntStream.of(70, 75, 80, 90).map(x -> (x - 32) * 5 / 9).average();

		// Imprimindo a m�dia
		System.out.println(resultado);

	}

}

