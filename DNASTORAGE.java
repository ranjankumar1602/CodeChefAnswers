/* package codechef; // don't place package name! */

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
		    int n = sc.nextInt();
		    String str = sc.next();
		    String ans = "";
		    for(int i = 0; i < str.length(); i+=2) {
		        if(str.substring(i,i+2).equals("00")) {
		            ans += 'A'+"";
		        }else if(str.substring(i,i+2).equals("01")) {
		            ans+='T'+"";
		        }else if(str.substring(i,i+2).equals("10")) {
		            ans += 'C'+"";
		        }else if(str.substring(i,i+2).equals("11")) {
		            ans += 'G' + "";
		        }
		    }
		    System.out.println(ans);
		    t--;
		}
	}
}
