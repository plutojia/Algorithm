package sort;

public class Quick extends example{
	public static void sort(Comparable[] a) {
		// TODO Auto-generated method stub
		sort(a,0,a.length-1);
	}

	public static void sort(Comparable[] a,int lo,int hi) {
		// TODO Auto-generated method stub
		if(lo>=hi) return;
		int l=lo,h=hi;
		Comparable tmp;
		tmp=a[lo];
		while(lo<hi) {
			while(less(tmp,a[hi])&&lo<hi) {
				hi--;
			}
			a[lo]=a[hi];
			while(less(a[lo],tmp)&&lo<hi) {
				lo++;
			}
			a[hi]=a[lo];		}
		a[lo]=tmp;
		
		sort(a,l,lo-1);
		sort(a,lo+1,h);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer a[]= {1,6,5,15,88,55,2,66,13,8,9,100,999};
		sort(a);
		assert isSorted(a);
		show(a);
	}

}
