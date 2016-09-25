import java.util.*;
import java.util.Random;
public class sumavemax
{
	static Scanner s=new Scanner(System.in);
	public static void main(String[] args)
	{
	
	int total=0, ave=0,large=0;
	System.out.println("Please Enter array size ");
	int n=s.nextInt();
	int[] numbers = new int[n];     


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

	for(int i=0; i< numbers.length; i++)
	{
		if(numbers[i] > large)
			large= numbers[i];

	}

	System.out.println("Largest Number is : " + large);
	}
}
