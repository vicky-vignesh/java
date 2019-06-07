package logic1;
import java.util.Scanner;
public class SeperateVowels {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter the Sentences:");
		String s=sc.nextLine();
		String v="aeiouAEIOU";
		String vowels="";
		String c="bcdfghjklmnpqrstvwxyzBCDFGHIJKLMNPQRSTVWXYZ";
		String cons="";
		String spl="";
		for(int i=0;i<s.length();i++){
			if(v.contains(String.valueOf(s.charAt(i)))){
				if(!vowels.contains(String.valueOf(s.charAt(i))))
					vowels +=s.charAt(i);
				
			}else if(c.contains(String.valueOf(s.charAt(i)))){
				if(!cons.contains(String.valueOf(s.charAt(i))))
				cons+=s.charAt(i);
			}else{
				if(!spl.contains(String.valueOf(s.charAt(i))))
					spl +=s.charAt(i);
				
			}			
		
	}
		System.out.println("Enter your choice \n 1.Upper \n 2.Lower");
		int print=sc.nextInt();
		switch(print){
		case 1:
			System.out.println("\nTo Upper:\nVowels:" +vowels.toUpperCase() +"\nConstants:"+cons.toUpperCase() +"\nSpecial Characters:"+spl);
			break;
		case 2:
			System.out.println("\nTo Lower:\nVowels:" +vowels.toLowerCase() +"\nConstants:"+cons.toLowerCase() +"\nSpecial Characters:"+spl);
            break;
		default:
			System.out.println("Invalid Choices" );
			
		}
				sc.close();
	}
	

}

