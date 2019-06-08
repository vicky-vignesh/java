package example;
import java.util.*;
public class PrimeNoWithArray {
	public static void main(String[] args) {
		Scanner d=new Scanner(System.in);
		System.out.println("Starting Number:");
		int n=d.nextInt();
		System.out.println("Ending Number");
		int e=d.nextInt();
		int arr[]=new int[e];
		int index=0;
		int np=0;
		int i , number ,count; 
		System.out.println("Prime Numbers from 1 to "+ n +" are : ");	
		for(number = n; number <e; number++)
		{
			count = 0;
		    for (i = 2; i <= number/2; i++)
		    {
		    	if(number % i == 0)
		    	{
		    		count++;
		    	}
		    }
		    if(count == 0 && number != 1 )
		    {
		    	arr[index]=number;
		    	if(number!=0){
		    		np++;
		    	}
		    	index++;
		    	
		    }  
		}
		int ar[]=new int[np];
		for(i=0;i<np;i++){
			ar[i]=arr[i];
			System.out.println(ar[i]);
		}
		}
	}
