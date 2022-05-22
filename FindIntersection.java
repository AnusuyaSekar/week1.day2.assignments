package week1.day2;

public class FindIntersection {

	public static void main(String[] args) {
		int [] firstarr = {3,2,11,4,6,7};
		int [] secondarr = {1,2,8,4,9,7};
		
		for (int i = 0; i <firstarr.length ; i++) {
			
			for (int j = 0; j < secondarr.length; j++) {
				if (firstarr[i]== secondarr[j]) {
					System.out.println(firstarr[i]);
				}
					
				
			}
			
		}
		
	}

}
