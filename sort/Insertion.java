package sort;

public class Insertion extends example{

	public static void sort(Comparable[] a) {
		int i,j;
		for(i=1;i<a.length;i++) {
			Comparable tmp=a[i];
			for(j=i;j>0&&less(tmp,a[j-1]);j--) {
				a[j]=a[j-1];
			}
			a[j]=tmp;
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
