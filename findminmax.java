import java.util.*;
public class findminmax
{
	static Scanner s=new Scanner(System.in);
	public static void main(String[]args)
{
	System.out.println("enter array size ");
	int n=s.nextInt();//getting the size of array 

	int arr[]=new int[n]; // passing the array size 

	System.out.println("enter elements");
	for(int i=0;i<n;i++)
	{
		arr[i]=s.nextInt();//getting the elemet for each index inputed by the user	
	}

	int smallest = arr[0];
	int large = arr[0];
	for(int i=0; i< arr.length; i++)
	{
		if(arr[i] > large)
			large= arr[i];
		else if (arr[i] < smallest)
			smallest = arr[i];
	}




	System.out.println("Largest Number is : " + large);
	System.out.println("Smallest Number is : " + smallest);	
	
}
}
