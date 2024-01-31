package com.SpringOrm.Entities;

import java.util.ArrayList;

import org.springframework.context.annotation.Primary;

public class Demo1 {
	
	public static void main(String[] args) {
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		arrayList.add(1);
		arrayList.add(34);
		arrayList.add(1);
		arrayList.add(34);
		arrayList.add(3);
		
		for(int i = 0 ; i<arrayList.size() ; i++) {
			for(int j = 0 ; j<arrayList.size() ; j++ )
			{
				if(arrayList.get(i) == arrayList.get(j))
				{
					System.out.println(arrayList.get(i));
				}
				else {
					//System.out.println(arrayList.get(i));
				}
			}
		}
		
	}

}
