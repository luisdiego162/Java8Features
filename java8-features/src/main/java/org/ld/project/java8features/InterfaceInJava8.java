package org.ld.project.java8features;


/**
 * 
 * From Java 8, interfaces are enhanced to have a method with implementation. 
 * We can use default and static keyword to create interfaces with method implementation
 * 
 * @author luisdiego
 *
 */
@FunctionalInterface
public interface InterfaceInJava8{

	void method1(String str);
	
	default void log(String str){
		System.out.println("I1 logging::"+str);
	}
	
	static void print(String str){
		System.out.println("Printing "+str);
	}
	
	//trying to override Object method gives compile-time error as
	//"A default method cannot override a method from java.lang.Object"
	
//	default String toString(){
//		return "i1";
//	}
	
}