package week1.day2;

public class ReverseString {

	public static void main(String[] args) {

		String name="Automation";

		char[] CharArray = name.toCharArray();

		for (int i = CharArray.length-1; i >=0; i--) {

			System.out.println(CharArray[i]);

		}
	}

}
