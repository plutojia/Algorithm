package sort;

public class Selection extends example{

	public static void sort(Comparable[] a) {
		int i,j;
		for(i=0;i<a.length;i++) {
			int min=i;
			for(j=i;j<a.length;j++) {
				if(less(a[j],a[min])) min=j;
			}
			exch(a,min,i);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer a[]= {1,5,3,2,4};
		sort(a);
		assert isSorted(a);
		show(a);
	}

}
