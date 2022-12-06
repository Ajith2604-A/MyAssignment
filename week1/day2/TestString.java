package week1.day2;

public class TestString {

	public static void main(String[] args) {
		
		String test="changename";
		
		char[] charArray = test.toCharArray();
		for (int i = 0; i < charArray.length; i++) {
			if (i%2==0) {
				char case1 = Character.toUpperCase(charArray[i]);
				System.out.print(case1);
			}else {
					System.out.print(charArray[i]);
				}
				
			}
			
		}
		// TODO Auto-generated method stub

}
