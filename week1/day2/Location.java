package week1.day2;

public class Location {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String place="Amazon Development Center, Chennai";
		
		String place2 = place.toLowerCase();
		
		
		String[] split = place.split(" ");
		
	   System.out.println(split.length);
	   
	   
	   for (int i = split.length-1; i >=0; i--) {
		   System.out.print(" "+split[i]);
				
	}
		
	}

}
