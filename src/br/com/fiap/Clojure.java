package br.com.fiap;

import java.util.function.Function;

public class Clojure {

	private static Integer a = 100;

	static Function<Integer, Integer> add100 = b -> b + a;

	public static void main(String[] args) {

		// Aplica esta fun��o ao argumento em quest�o.
		System.out.println(add100.apply(9));

		// N�o poderia permitir a mudan�a.N�o esque�a de declarar a como final
		a = 101;

		System.out.println(add100.apply(9));

	}

}
