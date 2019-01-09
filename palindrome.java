package googleInterview;

public class palindrome {
	
	static public void threedigitpalindrome(){
		
		int numone = 999;
		int numtwo = 999;
		int iteration = 1;
		
		while(numone + numtwo > 0){
			int product = numone * numtwo;
			char[] chars = ("" + product).toCharArray();
			int i = 0;
			boolean flag = true;
			while(i < chars.length / 2){
				if(chars[i] != chars[(chars.length - 1) - i]){
					flag = true;
					break;
				}else{
					
					flag = false;
					
				}
				i++;
				
			}
			if(flag == false){
				
				System.out.println(product);
				return;
			}
			
			if(iteration % 2 == 0){
				numone--;
			}else{
				
				numtwo--;
			}
			
			iteration++;
			
			
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		threedigitpalindrome();
	}

}
