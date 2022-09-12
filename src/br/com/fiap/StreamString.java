package br.com.fiap;

import java.util.stream.Stream;

public class StreamString {

	public static void main(String[] args) {

		Stream<String> stream = Stream.of("A$B$C".split("\\$"));
		stream.forEach(System.out::println);
	}

}
