package org.ld.project.java8features;


import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

/**
 * 
 * A new java.util.stream has been added in Java 8 to perform filter/map/reduce like operations with the collection.
 *  Stream API will allow sequential as well as parallel execution.
 * 
 * 
 * @author luisdiego
 *
 */
public class StreamExample {

	public static void main(String[] args) {
		
		List<Integer> myList = new ArrayList<>();
		for(int i=0; i<100; i++) myList.add(i);
		
		//sequential stream > Not Sort
		Stream<Integer> sequentialStream = myList.stream();
		
		//parallel stream > Sort the Number
		Stream<Integer> parallelStream = myList.parallelStream();
		
		//using lambda with Stream API, filter example
		Stream<Integer> highNums = parallelStream.filter(p -> p > 90);
		//using lambda in forEach
		highNums.forEach(p -> System.out.println("High Nums parallel="+p));
		
		Stream<Integer> highNumsSeq = sequentialStream.filter(p -> p > 90);
		highNumsSeq.forEach(p -> System.out.println("High Nums sequential="+p));

	}

}