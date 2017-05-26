package com.samuelmartingc.algorithms.binarysearch;

import java.util.Arrays;
public class BinarySearch {
	
	public boolean search(int[] items, int searchItem){
		Arrays.sort(items); //order the elements
		return (rank(searchItem,items) >= 0);
	}
	
	private int rank(int searchItem, int [] items){
		int lo = 0;
		int hi = items.length - 1;
		System.out.println("item to search=" + searchItem);
		while (lo <= hi){
			int mid = lo + (hi - lo) / 2;
			System.out.println("hi="+hi+",lo="+lo+",mid="+mid);
			if (searchItem < items[mid]){				
				hi = mid - 1;
			} else if (searchItem > items[mid]){
				lo = mid + 1;
			} else {
				return mid;
			}
		}
		return -1;
	}
}
