/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    private static int count(String str) {
        int max = 0;
        int bracket = 0;
        for(int i = 0; i < str.length(); i++) {
            if(str.charAt(i)=='(') {
                bracket++;
            }else {
                bracket--;
            }
            max = Math.max(max, bracket);
        }
        return max;
    }
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t != 0) {
		    String str = sc.next();
		    int bracket =  count(str);
		    for(int i = 0; i < bracket; i++) {
		        System.out.print("(");
		    }
		    for(int i = 0; i < bracket; i++) {
		        System.out.print(")");
		    }
		    System.out.println();
		    t--;
		}
	}
}
