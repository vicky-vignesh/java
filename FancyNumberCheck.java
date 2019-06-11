package logic4;
import java.util.*;
public class FancyNumberCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your Phone Number :\n ");
		String phno = sc.next();
		int s=0 , count =0;
		int c=0;
		for(int i=0; i<phno.length();i++) {
			if(!Character.isDigit(phno.charAt(i))) {
				System.out.println("Number Must Be in 10 Digits Only!...\n\n");
				break;
			}
		}
		if(phno.length()==10 ){
			for (int i = 0; i < phno.length()-3; i++) {
				if((phno.charAt(i)==(phno.charAt(i+1))) && (phno.charAt(i+1)==(phno.charAt(i+2)))) {
					c=1;
				}
			}
			for (int i = 0; i < phno.length()-3; i++) {
				if((phno.charAt(i+1)==(phno.charAt(i)+1)) && (phno.charAt(i+2)==(phno.charAt(i)+2)) || (phno.charAt(i+1)==(phno.charAt(i)-1)) && (phno.charAt(i+2)==(phno.charAt(i)-2))) {
					c=1;
				}
			}
			for (int i = 0; i < phno.length(); i++) {
				s =phno.charAt(i);
				for (int j = 0; j < phno.length(); j++) {
					if(s==phno.charAt(j)) {
						count++;
					}
				}
				if(count>=4) {
					c=1;
					break;
				} else {
					count=0;
				}
			}
			if (c==1) {
				System.out.println("Your Number is a Fancy Number!..");
			}else {
				System.out.println("Your Number is Not a Fancy Number");
			}
		}else {
			System.out.println("Number Must Be in 10 Digits Only!...\n\n");
			main(new String[] {});
			sc.close();
		}
	}

}
