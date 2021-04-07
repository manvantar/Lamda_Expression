package com.assignment;

import java.util.regex.*;
@FunctionalInterface
interface Lamda{
	Boolean eval(String value);
}
public class LamdaExpression {

	public static void main(String[] args) {
	
		Lamda checkString=(String value) -> Pattern.matches("^[A-Z a-z]{3,25}$",value);
		System.out.println(checkString.eval("Man"));
	}
	


}
