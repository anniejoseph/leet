package Leet;

import java.util.*;

public class PlusOne {
	public int[] plusOne(int[] digits) {
      int j=digits.length-1;
      int carry=0;
      int a=digits[j]+1;
      while(j>=0) {
    	  digits[j]=a%10;
    	  carry=a/10;
    	  j--;
    	  if(j>=0) {
    		  a=digits[j]+carry;
    	  }
      }
      if(carry==1) {
    	  int[] newArr=new int[digits.length+1];
    	  newArr[0]=carry;
    	  for(int i=0;i<digits.length;i++) {
    		  newArr[i+1]=digits[i];  
    	  }
    	  return newArr;
      }
		return digits;
    }

	public static void main(String[] args) {
		PlusOne p=new PlusOne();
		int[] digits= {1,2,9};
		int[] a=p.plusOne(digits);
		System.out.println(Arrays.toString(a));
	}
}
