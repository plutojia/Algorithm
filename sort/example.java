package sort;

import java.util.*;
import java.lang.*;;
public class example{
	public static void sort(Comparable[] a) {
	
	}
	public static boolean less(Comparable v,Comparable w) {
		return v.compareTo(w)<0;
	}
	
	protected static void exch(Comparable[] a,int i,int j) {
		Comparable t=a[i];
		a[i]=a[j];
		a[j]=t;
	}
	public static void show(Comparable[] a) {
		for(Comparable i : a) {
			System.out.print(i+" ");
		}
		System.out.println();
	}
	public static boolean isSorted(Comparable[] a) {
		for(int i=1;i<a.length;i++) {
			if(less(a[i],a[i-1])) return false;
		}
		return true;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer a[]= {1,2,3,4,5};
		sort(a);
		assert isSorted(a);
		show(a);
	}

}
