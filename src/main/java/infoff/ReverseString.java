package infoff;

public class ReverseString {

	public static void main(String[] args) {
		
		
		//1st method.

		String ss = "Ramanan";
		StringBuilder vv = new StringBuilder(ss);

		System.out.println(vv.reverse());
		
		//2nd Method.
		
		String name ="Ramanan";
		String[] cc = name.split("");
		
		for(int i =cc.length-1 ; i>=0; i--) {

			
			
			System.out.print(cc[i]);

			
		}
		
		
		

	}

}
