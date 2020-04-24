package com.picnic.Gayathri;

public class Question5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "REST ASSURED";
	      System.out.println(removeCharAt(str, 3));
	      System.out.println(removeCharAt(str, 2));
	      
	   }
	   public static String removeCharAt(String s, int pos) {
	      return s.substring(0, pos) + s.substring(pos + 1);
	   }
	

	}


