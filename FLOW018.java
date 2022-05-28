import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner ranjan=new Scanner(System.in);
		int T=ranjan.nextInt();
		while(T>=1){
		    int N=ranjan.nextInt();
		    int fact=1;
		    if(N==0){
		        System.out.println(fact);
		    }else{
		        
		        for(int i=1;i<=N;i++){
		            fact*=i;
		        }
		        System.out.println(fact);
		    }
		    
		    T--;
		}
	}
}
