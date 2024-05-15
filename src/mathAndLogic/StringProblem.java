package mathAndLogic;

import java.util.regex.Pattern;

public class StringProblem {

	public static void main(String[] args) {
		System.out.println(isValid("passWord123!!!"));
		System.out.println(isValid("turkey90AAA="));
	}

	public static boolean isValid(String str) {

		if (str.length() < 8 || str.length() > 30) {
			return false;
		}

		if (str.toLowerCase().contains("password")) {
			return false;
		}

		String regex = "^(?=.*[A-Z])(?=.*\\d)(?=.*[!@#$%^&*()_+\\-=\\[\\]{};':\"\\\\|,.<>\\/?]).*$";
		Pattern pattern = Pattern.compile(regex);
		return pattern.matcher(str).matches();
	}

}
