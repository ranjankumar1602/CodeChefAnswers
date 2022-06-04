import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int T=sc.nextInt();
		while(T!=0) {
		    int X=sc.nextInt();
		    int Y=sc.nextInt();
		    if(X>Y) {
		        System.out.println(X-Y);
		    }else if(X<Y) {
		        System.out.println(Y-X);
		    }else{
		        System.out.println(X-Y);
		    }
		    
		    T--;
		}
	}
}
