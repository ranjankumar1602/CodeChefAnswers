import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t != 0) {
		    int A = sc.nextInt();
		    int B = sc.nextInt();
		    int X = sc.nextInt();
		    int Y = sc.nextInt();
		    
		    if(A == B) {
	            System.out.println("YES");
	        } else if(A > B) {
	            if((B + Y) >= A) {
	                System.out.println("YES");
	            } else{
	                System.out.println("NO");
	            }
	        } else if(A < B){
	            if((A + X) >= B){
	                System.out.println("YES");
	            }else{
	                System.out.println("NO");
	            }
	        }
		    t--;
		}
	}
}
