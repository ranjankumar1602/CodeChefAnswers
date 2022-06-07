import java.util.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int T=sc.nextInt();
		while(T!=0){
		    int X=sc.nextInt();
		    int Y=sc.nextInt();
		    
		        if(Y>=X){
		            System.out.println(Y-X);
		        }else{
		            if((X-Y)%2==0){
		                System.out.println((X-Y)/2);
		            }else{
		                System.out.println(((X-Y+1)/2)+1);
		            }
		        } 
		    
		    T--;
		}
	}
}
