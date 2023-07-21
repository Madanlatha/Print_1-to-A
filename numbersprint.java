package printtonumber;

import java.util.Scanner;


public class numbersprint {
	
	int count(int n) {
		 if (n==0){
	            return 0;
	        }
	            count(n-1);
	           System.out.println(n);;  
	      return 1;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		numbersprint nums=new numbersprint();
		nums.count(n);
	}

}
