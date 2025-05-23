package com.java17.switchpattern;

public class PatternMatchingSwitch {

	public static void main(String[] args) {

		Object o=new Object();
		pattern(o);
	}
	
	public static void pattern(Object o)
	{
		switch (o)
		{
		case Integer i-> System.out.println("Integer");
		
		case String n when n.length() > 5  -> System.out.println("long string");	
		
		case String s-> System.out.println("String");
		
		
		case null -> System.out.println("null");
		
		default -> System.out.println("unknown type");
		}
	}

	static String process(Object obj) {
	    return switch (obj) {
	        case Integer i -> "Integer value: " + i;
	        case Double d -> "Double value: " + d;
	        case String s when s.length() > 5 -> "Long String: " + s;
	        case String s -> "Short String: " + s;
	        case null -> "Null value";
	        default -> "Unknown type";
	    };
	}
}
