package com.array.day4;

public class Count {
	
	public static void main(String[] args) {
		
		//int [] array = {1,2,3,4,2,5,6,1,3,7,8,9,5,1,1,3,5,2};
		int [] array = {3,2,3,1,2,1};
		
		for(int i=0;i<array.length;i++) {
			int count =1;
			if(array[i]!=-1) {
				for(int j=i+1;j<array.length;j++) {
					if(array[i]==array[j]) {
						count ++;
						array[j]=-1;
					}
				}
				if(count>1) {
					System.out.println("Element:"+array[i]+ ",Count:"+count);
				}
			}
			
		}
	}

}
