import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int T=sc.nextInt();
		while(T!=0){
		    int N=sc.nextInt();   //No of Questions
		    int X=sc.nextInt();   //X question is correct out of N
		    int P=sc.nextInt();   //P is the passing marks
		    int score=(X*3)-(N-X);
		    if(score>=P){
		        System.out.println("PASS");
		    }else{
		        System.out.println("Fail");
		    }
		    T--;
		}
	}
}
