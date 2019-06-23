import java.io.*;
import java.util.*;

class GFG {
    static void permutation(ArrayList<Character> arr2,int i,int p)
	{
	 static int count;
	 int j;
	 if(i==p)
	 {
	  count++;
	  System.out.print(count);
	  System.out.print(arr2);
	 }
	 else
	 {
	  for(j=i;j<=p;j++)
	  {
	   char temp=arr2.get(j);
       arr2.set(j, arr2.get(i));
       arr2.set(i, temp);
	   permutation(arr2,i+1,p);
	   char temp1=arr2.get(j);
       arr2.set(j, arr2.get(i));
       arr2.set(i, temp1);
	  	   
	      
	  }
	 }
	}
	public static void main (String[] args) {
	String arr="ABC";
	char arr1[]=arr.toCharArray();
	ArrayList<Character> arr2=new ArrayList<Character>();
	for(int i=0;i<arr1.length;i++)
	{
    arr2.add(arr1[i]);
	}
	//arr2.add('a');
	//System.out.println(arr2);
	//Collections.sort(arr2);
	//System.out.println(arr2);
	permutation(arr2,0,2);
	
}

}