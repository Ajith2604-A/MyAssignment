package letCode;

public class ReturnTheLengthOfLastWord3 {

	public static void main(String[] args) {
		
		String word3="luffy is still joyboy";
		String[] split = word3.split(" ");
		String trim = word3.trim();
		int len=0;
		System.out.println("The Lenght of the word :"+trim.length());
		System.out.println("The Number of words Given :"+split.length);
		for (int i = 0; i < split.length; i++) {
			if (word3.charAt(i)==' ') {
				len=0;
			} else {
             len++;
			}
			
		}
		System.out.println("Length of the last word :"+len);

	}

}
