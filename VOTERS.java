/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		int n3 = sc.nextInt();
		Map<Integer, Integer> map = new HashMap<>();
		for(int i = 0; i < n1; i++) {
		    int ip = sc.nextInt();
		    map.put(ip,map.getOrDefault(ip, 0) + 1);
		}
		for(int i = 0; i < n2; i++) {
		    int ip = sc.nextInt();
		    map.put(ip, map.getOrDefault(ip, 0) + 1);
		}
		for(int i = 0; i < n3; i++) {
		    int ip = sc.nextInt();
		    map.put(ip, map.getOrDefault(ip, 0) + 1);
		}
		ArrayList<Integer> list = new ArrayList<>();
		for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
		    int key = entry.getKey();
		    int value = entry.getValue();
		    if(value >= 2) {
		        list.add(key);
		    }
		}
		Collections.sort(list);
		System.out.println(list.size());
		for(int i : list) {
		    System.out.println(i);
		}
	}
}
