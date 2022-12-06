package week1.day2;

public class PrintNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String company="hexaware";
		char[] com = company.toCharArray();
		char expected='e';
		
		
		int count=0;

		
		for (int i=0; i<com.length;i++) {
			
			if (com[i]== expected) {
				count++ ;
			}
			
		}
		System.out.println(count);
	}

}
