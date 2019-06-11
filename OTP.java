package logic4;
import java.util.Scanner;
public class OTP {
	static String otp="";
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter your Details here...");
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter Account Holder Name:");
		String an=sc.nextLine();
		long anum=0;
		String actype="";
		if(an.length()<=2){
			System.out.println("Error:Enter Valid Name!..");
		}
		else{
			System.out.println("Enter Account Number:");
			anum=sc.nextLong();
			if(String.valueOf(anum).length()!=11){
				System.out.println("Error:Enter Valid Account Number!..");
			}
			else{
				System.out.println("Enter Account Type [savings/current/loan]:");
				actype=sc.next();
				if(!(actype.equalsIgnoreCase("Savings")||actype.equalsIgnoreCase("Current")||actype.equalsIgnoreCase("Loan"))){
					System.out.println("Error:Enter Valid Account Type!..");
				}
			}
		}
		userMethod(an,anum,actype);
		System.out.println("Your OTP is:"+otp);
		sc.close();
	}
	public static void userMethod(String an,long anum,String actype){
		otp+=(actype.substring(0,2))+((anum/100000000)/100);
		String num=String.valueOf(anum);
		int t=0;
		for(int i=0;i<5;i++){
			t+=(Integer.parseInt(String.valueOf((num.substring(0,5)).charAt(i))));
			}
			while(String.valueOf(t).length()!=1){
				t=(t/10)+(t%10);
			}
			otp+=t;
			t=0;
			otp+=String.valueOf(an.charAt(0));
			for(int i=0;i<5;i++){
				t+=(Integer.parseInt(String.valueOf((num.substring(5,10)).charAt(i))));
				}
			while(String.valueOf(t).length()!=1){
				t=((t/10)+(t%10));}
			otp+=t+String.valueOf(an.charAt(an.length()-1))+anum%10;
			}
	}

