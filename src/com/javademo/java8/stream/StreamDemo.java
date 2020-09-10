package com.javademo.java8.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamDemo {
	public static void main (String args[]) {
		
		//Stream.of
		Stream <Integer> of = Stream.of(1,2,3,4,5,6,7,8,9);
		of.forEach(p->System.out.print(p));
		
		System.out.println();
		
		//Stream.ofArray
		Stream <Integer> ofArray = Stream.of( new Integer[] {1,2,3,4,5,6,7,8,9} );
		ofArray.forEach(p->System.out.print(p));
		
		System.out.println();
		
		//List.stream()
		List <Integer> list = new ArrayList<>();
		
		for (int i=1; i<10; i++)
			list.add(i);
		
		Stream<Integer> streamList = list.stream();
		streamList.forEach(p->System.out.print(p));
		
		System.out.println();
		
		//Stream.generate Stream.iterate
		Stream <Integer> randomNumbers = Stream.generate(() -> (new Random().nextInt(100)));
		randomNumbers.limit(20).forEach(System.out::println);
		
		System.out.println();
		
		//Stream of String characters
		IntStream charStream = "12345_abcdefg".chars();
		charStream.forEach(p -> System.out.print(p));
		
		System.out.println();
		
		//Collect elements to list
		streamList = list.stream();
		List <Integer> evenListStream = streamList.filter(i->i%2==0).collect(Collectors.toList());
		System.out.print(evenListStream);
		
		System.out.println();
		
		//Collect elements to array
		streamList = list.stream();
		Integer [] evenNumberArr = streamList.filter(i -> (i%2 == 0)).toArray(Integer[]::new);
		System.out.print(evenNumberArr);
		
		System.out.println();

		//Filter
		List <String> memberNames = new ArrayList<>();
		memberNames.add("Amitabh");
		memberNames.add("Shekhar");
		memberNames.add("Aman");
		memberNames.add("Rahul");
		memberNames.add("Shahrukh");
		memberNames.add("Salman");
		memberNames.add("Yana");
		memberNames.add("Lokesh");
		
		memberNames.stream().filter((s)->s.startsWith("A")).forEach(System.out::println);
		
		System.out.println();
		
		//Map
		memberNames.stream().filter((s)->s.startsWith("A"))
		.map(String::toUpperCase)
		.forEach(System.out::println);
		
		//Sorted
		memberNames.stream().sorted()
        .map(String::toUpperCase)
        .forEach(System.out::println);
		
		//Match
		boolean matchedResult = memberNames.stream()
		        .anyMatch((s) -> s.startsWith("A"));
		 
		System.out.println(matchedResult);
		 
		matchedResult = memberNames.stream()
		        .allMatch((s) -> s.startsWith("A"));
		 
		System.out.println(matchedResult);
		 
		matchedResult = memberNames.stream()
		        .noneMatch((s) -> s.startsWith("A"));
		 
		System.out.println(matchedResult);
		
		//Count
		long totalMatched = memberNames.stream()
			    .filter((s) -> s.startsWith("A"))
			    .count();
			 
		System.out.println(totalMatched);
		
		Optional<String> reduced = memberNames.stream()
		        .reduce((s1,s2) -> s1 + "#" + s2);
		 
		reduced.ifPresent(System.out::println);
		
		
	}
}
