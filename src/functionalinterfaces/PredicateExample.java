package functionalinterfaces;

import java.util.function.Predicate;

public class PredicateExample {
	
	static Predicate<Integer> p1 = (i) ->   i%2==0; 
	static Predicate<Integer> p2 = (i) ->   i%5==0; 
	
	public static void displayAnd() {
		System.out.println("And :" + p1.and(p2).test(10));
	}
	
	public static void displayOr() {
		System.out.println("OR :" + p1.or(p2).negate().test(6));
	}
	
	public static void main(String[] args) {
		
//		Predicate<Integer> p = (i) -> { return i%2==0; };
		Predicate<Integer> p = (i) ->   i%2==0; 
		System.out.println(p.test(10));
		 displayAnd();
		 displayOr();
}
}
