package lazyApproach;

/**
 * @author mojtaba
 * the order of  growth in this solution for find connectivity is O(lg n)
 * the order of growth for make a connection and union function for n nodes is O(lg N)
 * for initiation also is O(n) 
 */

public class WeightedQuickUnion implements IUnion {
	protected int[] unionArray;
	protected int[] unionSize;
	public void initialize(int n){
		try {
			unionArray = new int[n];
			unionSize = new int[n];
			for(int i = 0;i < unionArray.length; i++){
				unionArray[i] = i;
				unionSize[i] = 1;
			}
		} catch (Exception e) {
			System.out.println("QuickUnion--> initialize method"+e.getMessage());
		}
	}
	public boolean connected(int p, int q){
		return root(p) == root(q);
	}
	public int root(int p){
		try {
			while (p != unionArray[p]) {
				p = unionArray[p];
			}
		} catch (Exception e) {
			System.out.println("QuickUnion--> root method"+e.getMessage());
		}
		return p;
	}
	public void union(int p, int q){
		try {
			int i = root(p);
			int j = root(q);
			if( i == j) return;
			if(unionSize[i] < unionSize[j]){
				unionArray[i] = j;
				unionSize[j] += unionSize[i];
			}else{
				unionArray[j] = i;
				unionSize[i] += unionSize[j];
			}
		} catch (Exception e) {
			System.out.println("QuickUnion--> union method"+e.getMessage());
		}

	}
}
