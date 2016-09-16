import java.util.*;
import java.util.Random;
public class Arrayinput
{
	
	public static void main(String[] args)
	{
		int total=0,maxnum=0;
	    Scanner s=new Scanner(System.in);
		System.out.println("["+1+"] user input array\n"+"["+2+"]"+" array Random numbers\n"+"Please choose option obove:\t");
		int userschoise=s.nextInt();

		if (userschoise==1)

		{

			System.out.println("enter array size ");

			int n=s.nextInt();//getting the size of array 

			int arr[]=new int[n]; // passing the array size 
			System.out.println("enter elements");
			for(int i=0;i<n;i++)
			{
				
				arr[i]=s.nextInt();//getting the elemet for each index
				                   //inputed by the user
				
			}

			for(int j=0;j<arr.length;j++)
			{ 
				
				//System.out.println(arr[j]+",");
				total = total + arr[j];//getting the summ of all element
			} 
			System.out.println("total = " +total);//print the sum of all array ... 
                      
		   	
		}
                    for (int c=0; c<arr.length;c++)
			{
				if (arr[c] > maxnum)
					maxnum=arr[c];
			}

			System.out.println("Max number is = "+ maxnum);
			
		}

	

		
         if(userschoise==2)
		{
			System.out.println("Please Enter array size ");
			int n=s.nextInt();
			int[] numbers = new int[n];       
			System.out.println("Enter thr range of array");
			int b=s.nextInt();
			for(int i = 0; i < numbers.length; i++)		{
				numbers[i] = (int)(Math.random()*b + 1);
				//Generates 10 Random Numbers in the range 1 -20
			}
			System.out.println("Numbers Generated: " + Arrays.toString(numbers));
			
			
			for(int j=0;j<numbers.length;j++)
			{ 

				//System.out.println(arr[j]+",");
				total = total + numbers[j];//getting the summ of all element
			} 
			System.out.println("total = " +total);//print the sum of all array ... 
			
			for (int c=0; c<numbers.length;c++)
			{
				if (numbers[c] > maxnum)
				   maxnum=numbers[c];
			}
			
			System.out.println("Max number is = "+ maxnum);

		}
		else 
		{
			System.out.println("wrong input \n");
		}
	}
	
		
		
  }
