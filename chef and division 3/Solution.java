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
		
		if(sc.hasNextInt()) {
		int t = sc.nextInt();
		
		for(int j=0; j<t; j++) {
		    
		    int n = sc.nextInt();
		    int k = sc.nextInt();
		    int d = sc.nextInt();
		    int totalProblems = 0;
	        int arr[] = new int[n];
		
		    
		    
	    
		    //total no. of problems
		    for(int i=0; i<n; i++) {
		        arr[i] = sc.nextInt();
		    }
		    
		    for(int i=0; i<n; i++) {
		        totalProblems += arr[i];
		    }
		    //System.out.println("totalProblems = " + totalProblems);
		    
		    
		    
		    //Total problems for each contest
		    int totalContests = totalProblems / k;
		    //System.out.println("totalContests = " + totalContests);
		    
		    
		    //Days for contest
		    
		        
		    
		    int contest = totalProblems / k;
		    if(contest > d)
		        System.out.println(d);
		    else
		        System.out.println(contest);
		    
		    
		}
		} //hasNextInt
	}
}
