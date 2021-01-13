package encodedString;
import java.util.Scanner;

public class Encode
{
	
	public static void main(String[] args)
	{
		
		Scanner sc = new Scanner(System.in);
		
		if(sc.hasNextInt()) {
		    
		    int t = sc.nextInt();
		    
		    int a = 0, b = 4;
		    char c[] = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p'};
			
		    
		    
		    for(int j=0; j<t; j++) {
		    	
		    	
		    	int n = sc.nextInt();
			    int bit = n/4;		    
			    sc.nextLine();
			    String s = sc.nextLine();
			    
		    	
		    		if(bit > 1) {
		    			
		    			for(int i=0; i<bit; i++) {
		    				String str;
		    				
		    			str = s.substring(a, b);
		    			
		    			functionality(n, str ,c);
		    			
		    			a += 4;
		    			b += 4;

		    			}
		    			System.out.println();
		    		}
		    		
		    		else
		    			functionality(n, s ,c);
		    		System.out.println();
		    	}
		    
		    	sc.close();
		    }
		    
		}
		
	


	static void functionality(int n, String s, char c[]) {

    	//Main execution loop
    	for(int i=0; i<s.length(); i++) {
	    	
	    	if(s.charAt(i) == '0') {

                c = Arrays.copyOfRange(c, 0, c.length/2);
                
            }
            else {

            	c = Arrays.copyOfRange(c, c.length/2, c.length);
                
            }
            
        }
        System.out.print(String.valueOf(c));
        
    }
}
	
	