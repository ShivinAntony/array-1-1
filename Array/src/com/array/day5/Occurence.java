package com.array.day5;

public class Occurence {
	public static void main(String[] args) {
		int [] a = {3,4,5,6,4,3,2,4,5,2,43,5,42,2,23,4,54,34,3,4,5};
		
		for(int i=0;i<a.length;i++) {
			int count = 1;
			if(a[i]!=-1) {
				for(int j=i+1;j<a.length;j++) {
					if(a[i]==a[j]) {
						count ++;
						a[j]= -1;
					}
				}
				if(count>1) {
					System.out.println("Element:"+a[i]+"Count:"+count);
				}
			}
		}
	}

}
