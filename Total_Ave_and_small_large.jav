import java.util.*;
import java.util.Random;
public class Total_Ave_and_small_large
{
    static Scanner s=new Scanner(System.in);
	
	
	public void userinput()
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
	
	
	
	
	public void randomarray()
	{
		int total=0, ave=0;
		System.out.println("Please Enter array size ");
		int n=s.nextInt();
		int[] numbers = new int[n];     
        
		
		//System.out.println("Enter thr range of array");
		//int b=s.nextInt();

		for(int i = 0; i < numbers.length; i++)		
		{
			numbers[i] = (int)(Math.random()*1000 + 1);//Generates 10 Random Numbers in the range 1 -20
		}
		System.out.println("Numbers Generated: " + Arrays.toString(numbers));


		for(int j=0;j<numbers.length;j++)
		{
			total = total + numbers[j];//getting the summ of all element
		} 
		System.out.println("total = " +total);//print the sum of all array ... 

		ave = total/numbers.length;

		System.out.println("Average = "+ ave);	
		
		}
	public void choise()
	{
		System.out.println("["+1+"] smallest ang largest number\n"+"["+2+"]"+" Total and Average\n"+"Please choose option obove:\t");
		
	}
	
	public static void main(String[] args)
	{
		Total_Ave_and_small_large lol = new Total_Ave_and_small_large (); 
		
		 lol.choise();
		int userschoise=s.nextInt();
		
		if (userschoise==1)
		{
			lol.userinput();	
	    }	
         else if(userschoise==2)
		{
			lol.randomarray();
		}
		else 
		{
			System.out.println("wrong input \n");
			lol.choise();
		}
	}
	
}
