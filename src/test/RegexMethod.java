package test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexMethod {
	public boolean checkMobileNumber(String mobile) {
		Pattern pattern=Pattern.compile("[7-9]\\d{9}");
		Matcher matcher=pattern.matcher(mobile);
		return matcher.find();
	}
	public boolean checkAlphaNumeric(String alpha) {
		Pattern pattern=Pattern.compile("\\p{Alnum}");
		Matcher matcher=pattern.matcher(alpha);
		return matcher.find();
	}
}
