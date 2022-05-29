import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int N=sc.nextInt();
		if(N%4==0){
		    N++;
		}else{
		    N--;
		}
		System.out.println(N);
	}
}
