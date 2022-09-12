package br.com.fiap;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

import org.javatuples.Pair;

/**
 * O currying � um processo usado para transformar uma fun��o n-�ria em uma
 * s�rie ou fun��es un�rias, e foi nomeado em homenagem a Haskell Curry, um
 * matem�tico americano.
 * 
 * A forma g:: x -> y -> z � a forma curry de f :: (x, y) -> z.
 * 
 * Para a raiz quadrada apresentada anteriormente, f(x,y) = x� + y�, uma vers�o
 * curry, sem o uso da BiFunction, seria usada v�rias vezes.
 * 
 * Uma �nica aplica��o de uma fun��o apenas substituiria o par�metro por um
 * valor, como vimos anteriormente.
 * 
 * O c�digo a seguir mostra como implementar uma fun��o curry de dois
 * par�metros, para n par�metros haver� n chamadas para a fun��o Function<X,Y>:
 * 
 * 
 * @need https://www.javatuples.org/
 * @need https://github.com/javatuples/javatuples
 * 
 * @download https://jar-download.com/artifacts/org.javatuples/javatuples/1.2/source-code
 *
 *
 * @author Benefrancis
 */
public class Currying {

	public static void main(String[] args) {

		// F�rmula para caldulo da Soma das Raizes
		Function<Integer, Function<Integer, Integer>> raizQuadrada = x -> y -> x * x + y * y;

		// @formatter:off
 		List<Integer> raizes = Arrays.asList(new Pair<Integer, Integer>(1, 5), new Pair<Integer, Integer>(2, 3))
				.stream()
				.map(a -> raizQuadrada.apply(a.getValue0()).apply(a.getValue1()))
				.collect(Collectors.toList());
 		// @formatter:on

		// Imprimindo os resultados das raizes
		for (Integer i : raizes) {
			System.out.print(" [" + i + "] ");
		}
	}
}
