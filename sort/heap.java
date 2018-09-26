package sort;

public class heap<Key extends Comparable<Key>>{
	private Key[] hp;
	int N=0;
	
	public heap(int maxN) {
		hp=(Key[])new Comparable[maxN+1];
	}
	
	public boolean isEmpty() {
		return N==0;
	}
	public int size() {
		return N;
	}
	public boolean less(int i,int j) {
		return hp[i].compareTo(hp[j])<0;
	}
	public void exch(int i,int j) {
		Key tmp=hp[i];
		hp[i]=hp[j];
		hp[j]=tmp;
	}
	private void swim(int i) {
		while(i>1&&less(i/2,i)) {
			exch(i/2,i);
			i=i/2;
		}
	}
	private void sink(int i) {
		while(i<=N/2) {
			int j=2*i;
			if(j+1<=N&&less(j,j+1)) j=j+1;
			if(!less(i,j)) break;
			exch(i,j);
			i=j;
		}
	}
	public void insert(Key v) {
		hp[++N]=v;
		swim(N);
	}
	public Key delMax() {
		Key Max=hp[1];
		exch(1,N--);
		hp[N+1]=null;
		sink(1);
		return Max;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
