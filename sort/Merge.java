package sort;

public class Merge extends example{
	public static void sort(Comparable[] a) {
		sort(a,0,a.length-1);
	}
	public static void sort(Comparable[] a,int lo,int hi) {
		if(lo>=hi) return;
		int mid=lo+(hi-lo)/2;
		sort(a,lo,mid);
		sort(a,mid+1,hi);
		merge(a,lo,mid,hi);
	}
	public static void merge(Comparable[] a,int lo,int mid,int hi) {
		Comparable[] aux=new Comparable[a.length];	//auxiliary 
		int i,j,k;
		for(i=lo;i<=hi;i++) {
			aux[i]=a[i];
		}
		i=lo;j=mid+1;k=lo;
		while(i<=mid&&j<=hi) {
			if(less(aux[i],aux[j])) a[k++]=aux[i++];
			if(less(aux[j],aux[i])) a[k++]=aux[j++];
		}
		while(i<=mid) a[k++]=aux[i++];
		while(j<=hi) a[k++]=aux[j++];
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer b[]= {1,6,13,15,114,2,5,8,9,100};
		merge(b,0,4,9);
		show(b);
		
		Integer a[]= {1,6,5,15,88,55,2,66,13,8,9,100,999};
		sort(a);
		assert isSorted(a);
		show(a);
	}

}
