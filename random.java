package com.assignment.shid;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class random {

	public static void main(String[] args) {
		
		String [] arr = {"hello","hiii","shid"};
		List <String> array = new ArrayList <>(Arrays.asList(arr));
		
		Collections.shuffle(array);
		
		System.out.println(array);
		
        
        array.stream().forEach(System.out::println);
        

        for (String arg : array) {
            System.out.println(arg);
        }

	}

}
