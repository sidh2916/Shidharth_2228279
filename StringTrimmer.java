package com.assignment.shid;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StringTrimmer {


	    public static void main(String[] args) {
	    	
	    	String [] arr = { "   mobile "," tcs  "," software   "," Java   "};
	        List <String> array = new ArrayList<>(Arrays.asList(arr));
	        
	        for (int i = 0; i < array.size(); i++) {
	        	array.set(i, array.get(i).trim());
	        }
	        System.out.println(array);
	   
	    }

}
