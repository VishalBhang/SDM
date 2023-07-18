package com.app;

public class ReverseString {
	 public static void main(String[] args) {
	        String input = "Infoway Technologies";
	        String reversed = reversestring(input);
	        System.out.println(reversed);
	    }

	    public static String reversestring(String input) {
	        char[] ch = input.toCharArray();
	        int left = 0;
	        int right = ch.length - 1;

	        while (left < right) {
	            char temp = ch[left];
	            ch[left] = ch[right];
	            ch[right] = temp;

	            left++;
	            right--;
	        }
	        return new String(ch);
	    }
	
}
