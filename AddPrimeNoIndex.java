package logic4;
import java.util.*;
public class AddPrimeNoIndex {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value N:");
		int n = sc .nextInt();
		int arr[] = new int[n];
		System.out.println("enter  values :");
		for (int i = 0; i < n ; i++) {
			arr[i]=sc.nextInt();
		}
		//toFindPrime
		int count =0;
		int np=0;
		int sum=0;
		int index=0;
		int p [] = new int[n-1];
		for(int j=2 ; j<=n-1 ; j++ ){
		for(int i=2 ; i<j-1 ; i++){
			if(j%i == 0){
				count =1;
			}
		}
		if(count==0){
			if(j!=0){	
				p[index]=j;
				index++;
			count=0;
			}
		}else{
			count=0;
		}
	 }
		 for (int i = 0; i < p.length; i++) {
			if(p[i]!=0) {
				np++;
			}
		}
		 int d [] = new int[np];
		 for (int i = 0; i < d.length; i++) {
			d[i]=p[i];
		}
		 //checkSum
		 for (int i = 0; i < d.length; i++) {
			sum +=arr[d[i]];
			}
		 System.out.println("Answer = "+sum);
		sc.close();
	}

}
