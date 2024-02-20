package com.array.day4;

public class Again {
	public static void main(String[] args) {
		
		int [] array = {2,3,4,4,3,2,1,1,4};
		
		for(int i=0;i<array.length;i++) {
		int	count =1;
			
			if(array[i]!=-1) {
				for(int j=i+1;j<array.length;j++) {
					if(array[i]==array[j]) {
						count ++;
						array[j]=-1;
					}
				}
				if(count>1) {
					System.out.println("Elements:"+array[i]+",Count:"+count);
				}
			}
		}
	}

}
