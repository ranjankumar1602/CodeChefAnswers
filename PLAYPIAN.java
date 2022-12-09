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
		    String str = sc.next();
		    boolean ans = false;
		    for(int i = 0; i < str.length()-1; i+=2) {
		        if((str.charAt(i) == 'A' && str.charAt(i+1) != 'B') || (str.charAt(i) == 'B' && str.charAt(i+1) != 'A')) {
		            ans = true;
		            break;
		        }
		    }
		    if(!ans) {
		        System.out.println("yes");
		    }else {
		        System.out.println("no");
		    }
		    t--;
		}
	}
}
