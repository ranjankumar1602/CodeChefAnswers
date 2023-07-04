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
		    int N = sc.nextInt();
		    int finger[] = new int[N];
		    int sheaths[] = new int[N];
		    for(int i = 0; i < N; i++) {
		        finger[i] = sc.nextInt();
		    }
		    for(int i = 0; i < N; i++) {
		        sheaths[i] = sc.nextInt();
		    }
		    boolean front = true;
		    boolean back = true;
		    for(int i = 0; i < N; i++) {
		        if(finger[i] > sheaths[i]) {
		            front = false;
		        }
		        if(finger[i] > sheaths[N-1-i]) {
		            back = false;
		        }
		    }
		    if(front == true &&  front == back) {
		        System.out.println("both");
		    }else if(front) {
		        System.out.println("front");
		    }else if(back) {
		        System.out.println("back");
		    }else {
		        System.out.println("none");
		    }
		    t--;
		}
	}
}
