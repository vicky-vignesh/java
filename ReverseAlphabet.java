package logic2;
import java.util.Scanner;
public class ReversAlphabet {
	public static void main(String args[]){
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the Alphabet:");
		String alpha="abcdefghijklmnopqrstuvwxyz";
		String a=s.next();
		char c=a.charAt(0);
		if(Character.isUpperCase(c)){
			alpha=alpha.toUpperCase();
		}
		int i=alpha.indexOf(c);
		System.out.println(alpha.charAt(25-i));
	}

}
