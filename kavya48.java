/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*; 
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();
        int count=0;
        while(number > 0)
        {
          number=number/10;
          count=count+1;
          System.out.println(count);
       }
	}
}
