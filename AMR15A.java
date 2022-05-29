import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner ranjan= new Scanner(System.in);
		int N=ranjan.nextInt();
		int arr[]=new int[N];
		for(int i=0;i<N;i++){
		    arr[i]=ranjan.nextInt();
		}
		int lucky=0, unLucky=0;
		for(int i=0;i<N;i++){
		    if(arr[i]%2==0){
		        lucky++;
		    }else{
		        unLucky++;
		    }
		}
		if(lucky>unLucky){
		    System.out.println("READY FOR BATTLE");
		}else{
		    System.out.println("NOT READY");
		}
	}
}
