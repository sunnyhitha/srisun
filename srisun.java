import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.Scanner.*;
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
     int low,high;
     Scanner sc=new Scanner(System.in);
     low=sc.nextInt();
     high=sc.nextInt();
     for (int num=low+1;num<high;++num)
     {
     	int digits=0;
     	int result=0;
     	int originalNumber=num;
     	while(originalNumber!=0)
     	{
     		originalNumber/=10;
     		++digits;
     	}
     	originalNumber=num;
     	while(originalNumber!=0)
     	{
     		int remainder=originalNumber%10;
     		result+=Math.pow(remainder,digits);
     		originalNumber/=10;
     	}
     	if(result==num)
     	System.out.print(num+" ");
     }
}
}
