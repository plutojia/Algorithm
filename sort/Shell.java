package sort;

public class Shell extends example{
	public static void sort(Comparable[] a) {
		int i,j;
		int h=1;
		while(h<a.length/3) h=3*h+1;
		while(h>=1) {
			for(i=h;i<a.length;i++) {
				Comparable tmp=a[i];
				for(j=i;j>=h&&less(tmp,a[j-h]);j-=h) {
					a[j]=a[j-h];
				}
				
				a[j]=tmp;
			}
			h=h/3;
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
