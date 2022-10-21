package org.ld.project.java8features;


/**
 * 
 * @author luisdiego
 *
 */
public class LambdaExample {

	public static void main(String[] args) {

		InterfaceInJava8 i1 = (s) -> System.out.println(s);
		
		i1.method1("abc");

	}

}
