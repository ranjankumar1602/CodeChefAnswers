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
		    int H=sc.nextInt();
		    if(X>=H) {
		        System.out.println("YES");
		    }else {
		        System.out.println("NO");
		    }
		    T--;
		}
	}
}
