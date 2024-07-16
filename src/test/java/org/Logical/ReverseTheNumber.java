package org.Logical;

public class ReverseTheNumber {
	public static void main(String[] args) {
		int a = 123,rev=0;
		while(a!=0) {
			int lastDigit = a%10;
			rev=(rev*10)+lastDigit;
			a/=10;
		}
		System.out.println(rev);
	}

}
