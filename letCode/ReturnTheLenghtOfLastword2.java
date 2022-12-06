package letCode;

public class ReturnTheLenghtOfLastword2 {

	public static void main(String[] args) {
		String word2="fly me to the moon";
		String trim = word2.trim();
		int len =0;
		System.out.println("The lenght of the given Word :"+word2.length());
		String[] split = word2.split(" ");
		System.out.println("The number of the word given :"+split.length);
		for (int i = 0; i < trim.length(); i++) {
			if (trim.charAt(i)==' ') {
				len=0;
			}else {
				len++;
			}
			
		}
       System.out.println("Length of the lastword"+len);
	}

}
