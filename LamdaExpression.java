package com.assignment;

import java.util.regex.*;
@FunctionalInterface
interface Lamda{
	Boolean eval(String value);
}
public class LamdaExpression {

	public static void main(String[] args) {
	
		Lamda checkName=(String value) -> Pattern.matches("^[A-Z a-z]{3,25}$",value);
		System.out.println("Checking name "+checkName.eval("Man"));
		Lamda checkEmail=(String value) -> Pattern.matches("^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$",value);
		System.out.println("Checking email "+checkEmail.eval("manukvshetty@gmail.com"));
		Lamda checkMobileNum=(String value) -> Pattern.matches("[0-9]{2,3}[ ]{1}[0-9]{10}+$",value);
		System.out.println("Checking mobileNumber "+ checkMobileNum.eval("912 9663393660"));
		Lamda checkPassword=(String value) -> Pattern.matches("^(?=.*[A-Z])(?=.*[0-9])(?=.*[@$!%*?&])[a-zA-Z\\d@$!%*?&]{8,}",value);
		System.out.println("checking Password "+ checkPassword.eval("nwWw4@ewe"));
	}
	


}
