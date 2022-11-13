import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    // taking input
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		// apna test case
		while(t != 0) {
		    int n = sc.nextInt();
		    String ans = sc.next();
		    // create hasmap to store the value
		    HashMap<Character, Integer> map = new HashMap<>();
		    boolean temp = false;
		    // take temp to check false case
		    if(ans.length() % 2 != 0) {
		        System.out.println("NO");
		    }else {
		        for(int i = 0; i < ans.length(); i++) {
		            if(map.containsKey(ans.charAt(i))) {
		                map.put(ans.charAt(i), map.get(ans.charAt(i)) + 1);
		            }else {
		                map.put(ans.charAt(i), 0);
		            }
		        }
		        
		        // itetrate the values of map
		        for(int i : map.values()) {
		            if(i % 2 == 0) {
		                temp = true;
		                System.out.println("NO");
		                break;
		            }
		        }
		        if(!temp) {
		            System.out.println("YES");
		        }
		    }
		    t--;
		}
	}
}
