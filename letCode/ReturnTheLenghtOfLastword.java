package letCode;

public class ReturnTheLenghtOfLastword {

	public static void main(String[] args) {
		int len=0;
		String word="Hello World";
		String len1 = word.trim();

		System.out.println("length of the Given Word :"+len1.length());
		
		for (int i = 0; i < len1.length(); i++) {
			if (len1.charAt(i)==' ') {
             len=0;				
			}else {
				len++;
			}
		}
		System.out.println("Length of the Word :"+len);
	}
	

}
