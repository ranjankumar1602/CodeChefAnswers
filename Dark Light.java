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
		    int k = sc.nextInt();
		    if(k == 0 && n % 4 == 0) {
		        System.out.println("Off");
		    }else if(n % 4 != 0 && k == 1) {
		        System.out.println("Ambiguous");
		    }else {
		        System.out.println("On");
		    }
		    t--;
		}
	}
}
