package test.main;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

	public static void main(String[] args) {
		System.out.println("Helow Helow");
		System.out.println(isValid("7984286257"));

	}


	public static boolean isValid(String number) {

		Pattern p = Pattern.compile("^[7-9]\\d{0,10}$");

		Matcher m = p.matcher(number);

		return (m.matches());
	}
}
